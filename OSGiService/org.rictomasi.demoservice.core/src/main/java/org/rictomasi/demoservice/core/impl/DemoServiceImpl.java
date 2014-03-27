/**
 * Test
 */
package org.rictomasi.demoservice.core.impl;

import org.osgi.service.component.ComponentContext;
import org.rictomasi.demoservice.core.api.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemoServiceImpl implements DemoService {
	
	private static final Logger LOG = LoggerFactory.getLogger( DemoServiceImpl.class );
	
	
	protected void activate(ComponentContext context){
		LOG.debug("DemoServiceImpl activate:" + context);
		
	}

	protected void deactivate(ComponentContext context){
		LOG.debug("DemoServiceImpl activate:" + context);
	}



}
