/**
 * Test
 */
package org.rictomasi.demoservice.core.activator;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator{

	@Override
	public void start(BundleContext arg0) throws Exception {
		System.out.println("start " + arg0);
		
	}

	@Override
	public void stop(BundleContext arg0) throws Exception {
		System.out.println("stop " + arg0);
		
	}

}
