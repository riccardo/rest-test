/**
 * Test
 */
package org.rictomasi.demoservice.core.impl;

import org.rictomasi.demoservice.core.api.DemoService;
import org.osgi.service.component.ComponentContext; 

public class DemoServiceImpl implements DemoService {
	
	
	protected void activate(ComponentContext context){
		System.out.println("DemoServiceImpl activate:" + context);
		
	}

	protected void deactivate(ComponentContext context){
		System.out.println("DemoServiceImpl activate:" + context);
	}



}
