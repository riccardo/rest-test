/**
 * Test
 */
package org.rictomasi.demoservice.core.activator;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Activator implements BundleActivator{
	
	private static final Logger LOG = LoggerFactory.getLogger( Activator.class );

	@Override
	public void start(BundleContext arg0) throws Exception {
		 LOG.debug("start " + arg0);
		
	}

	@Override
	public void stop(BundleContext arg0) throws Exception {
		 LOG.debug("stop " + arg0);
		
	}

}
