package com.gmans.route;

import org.apache.camel.builder.RouteBuilder;
import com.gmans.processor.MyProcessor;

public class SimpleRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		from("file:F:/ApacheCamelPractice/inputFolder?noop=true").process(new MyProcessor()).to("file:F:/ApacheCamelPractice/outputFolder");
	}

}
