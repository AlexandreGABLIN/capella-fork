package org.polarsys.capella.core.preferences.transferer;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = Messages.class.getPackageName() + ".messages"; //$NON-NLS-1$
	public static String WizardPreferencesTransfererExportPage_0;
	public static String WizardPreferencesTransfererExportPage_1;
	public static String WizardPreferencesTransfererExportPage_2;
	public static String WizardPreferencesTransfererExportPage_3;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
