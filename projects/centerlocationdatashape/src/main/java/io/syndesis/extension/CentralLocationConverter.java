package io.syndesis.extension;

import org.apache.camel.Body;
import org.apache.camel.Handler;

import com.redhat.Location;

import io.syndesis.integration.runtime.api.SyndesisExtensionAction;


@SyndesisExtensionAction(
	    id = "centerlocationdatashaper",
	    name = "center-location-datashaper",
	    description = "Shapes the Data from Broker - center location",
	    inputDataShape = "java:com.redhat.Location",
	    outputDataShape = "java:com.redhat.Location"
	)


public class CentralLocationConverter {

	
	 @Handler
	 public com.redhat.Location convert(@Body Location location) {
	       
	        System.out.println("input--->"+location);

	        return location;
	    }
}
