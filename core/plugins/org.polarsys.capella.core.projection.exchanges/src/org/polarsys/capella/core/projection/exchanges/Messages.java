package org.polarsys.capella.core.projection.exchanges;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = Messages.class.getPackageName() + ".messages"; //$NON-NLS-1$
	public static String DefaultExchangesCreator_0;
	public static String DefaultExchangesCreator_1;
	public static String PhysicalLinksCreator_0;
	public static String PhysicalLinksCreator_1;
	public static String PhysicalLinksCreator_3;
	public static String PhysicalLinksCreator_5;
	public static String PhysicalLinksCreator_7;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
