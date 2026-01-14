package org.polarsys.capella.core.transition.system.topdown.rules.cs;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = Messages.class.getPackageName() + ".messages"; //$NON-NLS-1$
	public static String PhysicalLinkRule_0;
	public static String PhysicalLinkRule_1;
	public static String PhysicalLinkRule_2;
	public static String PhysicalLinkRule_3;
	public static String PhysicalLinkRule_4;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
