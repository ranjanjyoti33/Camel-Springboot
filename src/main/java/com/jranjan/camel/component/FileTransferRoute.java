package com.jranjan.camel.component;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FileTransferRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		from("file:/Users/jyotiranjan/Desktop/camel/input?filename=input.rtf")
		.routeId("FILE-TRANSFER-ROUTE")
		.to("file:/Users/jyotiranjan/Desktop/camel/output?filename=output.rtf");
		
	}

}
