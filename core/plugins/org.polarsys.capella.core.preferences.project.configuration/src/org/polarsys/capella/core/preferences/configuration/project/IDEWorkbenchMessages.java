package org.polarsys.capella.core.preferences.configuration.project;

import org.eclipse.osgi.util.NLS;

public class IDEWorkbenchMessages extends NLS {
	private static final String BUNDLE_NAME = IDEWorkbenchMessages.class.getPackageName() + ".messages"; //$NON-NLS-1$
	public static String WizardProjectCreationPage_0;
	public static String WizardProjectCreationPage_1;
	public static String WizardProjectCreationPage_2;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, IDEWorkbenchMessages.class);
	}

	private IDEWorkbenchMessages() {
	}
}
