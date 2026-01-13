package org.polarsys.capella.core.platform.sirius.ui.app;

import org.eclipse.osgi.util.NLS;

public class JobMessages extends NLS {
	private static final String BUNDLE_NAME = JobMessages.class.getPackageName() + ".messages"; //$NON-NLS-1$

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, JobMessages.class);
	}

	private JobMessages() {
	}
}
