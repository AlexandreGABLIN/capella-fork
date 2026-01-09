/*******************************************************************************
 * Copyright (c) 2006, 2020 THALES GLOBAL SERVICES.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.core.data.fa.validation.functionalExchange;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;
import org.polarsys.capella.common.helpers.EObjectLabelProviderHelper;
import org.polarsys.capella.core.data.fa.AbstractFunction;
import org.polarsys.capella.core.data.fa.FunctionalExchange;
import org.polarsys.capella.core.data.oa.OperationalActivity;
import org.polarsys.capella.core.model.helpers.FunctionalExchangeExt;
import org.polarsys.capella.core.validation.rule.AbstractValidationRule;

public class FunctionalExchange_Delegation extends AbstractValidationRule {
  /**
   * @see org.eclipse.emf.validation.AbstractModelConstraint#validate(org.eclipse.emf.validation.IValidationContext)
   */
  @Override
  public IStatus validate(IValidationContext ctx) {
    EObject eObj = ctx.getTarget();
    EMFEventType eType = ctx.getEventType();

    if (eType == EMFEventType.NULL && eObj instanceof FunctionalExchange) {
      FunctionalExchange fe = (FunctionalExchange) eObj;
      AbstractFunction parentSource = FunctionalExchangeExt.getSourceFunction(fe);
      AbstractFunction parentTarget = FunctionalExchangeExt.getTargetFunction(fe);

      if (parentSource != null && parentTarget != null) {
        boolean bDelegatedFE = false;
        if (parentSource.getOwnedFunctions().isEmpty() && parentTarget.getOwnedFunctions().isEmpty()) {
          bDelegatedFE = true;
        }
        if (!bDelegatedFE) {
          return ctx.createFailureStatus(getSourceTargetMessage(fe));
        }
      }
    }
    return ctx.createSuccessStatus();
  }

  private String getMessageNameFor(AbstractFunction af) {
    return EObjectLabelProviderHelper.getMetaclassLabel(af, false);
  }

  private String getMessageNameFor(FunctionalExchange fe) {
    AbstractFunction srcFunc = FunctionalExchangeExt.getSourceFunction(fe);
    if (srcFunc instanceof OperationalActivity) {
      return Messages.FunctionalExchange_Delegation_0;
    }
    return EObjectLabelProviderHelper.getMetaclassLabel(fe, false);
  }

  private String getSourceTargetMessage(FunctionalExchange fe) {
    String msg = ""; //$NON-NLS-1$
    AbstractFunction srcFunc = FunctionalExchangeExt.getSourceFunction(fe);
    AbstractFunction tarFunc = FunctionalExchangeExt.getTargetFunction(fe);

    if (srcFunc.getOwnedFunctions().size() > 0 && tarFunc.getOwnedFunctions().size() > 0) {
      msg = (Messages.FunctionalExchange_Delegation_2 + EObjectLabelProviderHelper.getText(fe) + Messages.FunctionalExchange_Delegation_3 + getMessageNameFor(fe)
          + Messages.FunctionalExchange_Delegation_4 + getMessageNameFor(srcFunc));
    } else if (srcFunc.getOwnedFunctions().size() > 0) {
      msg = (Messages.FunctionalExchange_Delegation_5 + EObjectLabelProviderHelper.getText(fe) + Messages.FunctionalExchange_Delegation_6 + getMessageNameFor(fe)
          + Messages.FunctionalExchange_Delegation_7 + getMessageNameFor(srcFunc));
    } else {
      msg = (Messages.FunctionalExchange_Delegation_8 + EObjectLabelProviderHelper.getText(fe) + Messages.FunctionalExchange_Delegation_9 + getMessageNameFor(fe)
          + Messages.FunctionalExchange_Delegation_10 + getMessageNameFor(srcFunc));
    }
    return msg;
  }
}
