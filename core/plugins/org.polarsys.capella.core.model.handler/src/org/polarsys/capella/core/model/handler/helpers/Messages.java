package org.polarsys.capella.core.model.handler.helpers;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = Messages.class.getPackageName() + ".messages"; //$NON-NLS-1$
	public static String RepresentationHelper_1;
	public static String RepresentationHelper_2;
	public static String RepresentationHelper_3;
	public static String RepresentationHelper_4;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
