package org.polarsys.capella.core.preferences.trasferers;

import org.eclipse.osgi.util.NLS;

public class PreferencesMessages extends NLS {
	private static final String BUNDLE_NAME = PreferencesMessages.class.getPackageName() + ".messages"; //$NON-NLS-1$
	public static String WizardPreferencesTransfererExportPage_1;
	public static String WizardPreferencesTransfererExportPage_2;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, PreferencesMessages.class);
	}

	private PreferencesMessages() {
	}
}
