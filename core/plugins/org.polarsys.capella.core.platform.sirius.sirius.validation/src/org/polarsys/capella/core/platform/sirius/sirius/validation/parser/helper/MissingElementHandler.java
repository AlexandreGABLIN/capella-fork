package org.polarsys.capella.core.platform.sirius.sirius.validation.parser.helper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.emf.validation.model.ConstraintStatus;
import org.eclipse.osgi.util.NLS;
import org.polarsys.capella.core.model.utils.saxparser.SaxParserHelper;
import org.polarsys.capella.core.platform.sirius.sirius.validation.ddiagram.LinkDescription;

/**
 * Create error status for each hyperlink targeting not existing capella element or diagram grouping by id
 */
public class MissingElementHandler implements ILinkParser {

  private EObject element;
  private IValidationContext ctx;
  private List<IStatus> result = new ArrayList<>();
  private List<LinkDescription> parsedLinks = new ArrayList<>();

  public MissingElementHandler(EObject element, IValidationContext ctx) {
    this.element = element;
    this.ctx = ctx;
  }

  public List<IStatus> getResult() {
    return result;
  }

  @Override
  public void handleParsedLink(LinkDescription parsedLink) {
    if (parsedLink.getTargetElement() == null && parsedLink.getHref().startsWith("hlink://")) { //$NON-NLS-1$
      String elementName = DescriptionParserHelper.getElementName(element);
      String elementId = parsedLink.getHref().replace("hlink://", ""); //$NON-NLS-1$ //$NON-NLS-2$
      if (!parsedLinks.contains(parsedLink)) {
        parsedLinks.add(parsedLink);
        String failureMessage = NLS.bind(Messages.MissingElementHandler_3, parsedLink.getName(), elementId, elementName);
        failureMessage = SaxParserHelper.unescapeSpecialCharacter(failureMessage);
        result.add(ConstraintStatus.createStatus(ctx, element, ctx.getResultLocus(), Messages.MissingElementHandler_6, failureMessage));
      } else {
        List<IStatus> updatedResult = result.stream().map(sts -> {
          if (sts.getMessage().contains(elementId)) {
            String name = DescriptionLinkParserHandler.extractName(sts.getMessage());
            String failureMessage = NLS.bind(Messages.MissingElementHandler_7, name, elementId, elementName);
            failureMessage = SaxParserHelper.unescapeSpecialCharacter(failureMessage);
            return ConstraintStatus.createStatus(ctx, element, ctx.getResultLocus(), Messages.MissingElementHandler_10, failureMessage);
          }
          return sts;
        }).collect(Collectors.toList());
        result.clear();
        result.addAll(updatedResult);
      }
    }

  }

}
