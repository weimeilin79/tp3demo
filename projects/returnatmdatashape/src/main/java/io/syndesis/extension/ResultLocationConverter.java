package io.syndesis.extension;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.camel.Body;
import org.apache.camel.Handler;
import org.apache.camel.Header;

import com.redhat.TaskInfo;

import io.syndesis.integration.runtime.api.SyndesisExtensionAction;
 

@SyndesisExtensionAction(
	    id = "resulttaskdatashaper",
	    name = "result-task-datashaper",
	    description = "Shapes the Data from Broker - atm task",
	    inputDataShape = "string",
	    outputDataShape = "java:com.redhat.TaskInfo"
	)
public class ResultLocationConverter {

	
	 @Handler
	 public TaskInfo convert(@Header("appid") String appid, @Body String resultInput) {
	       
	        System.out.println("****************resultInput--->"+resultInput);
	        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
	        Date dateobj = new Date();
	        
	        
	        TaskInfo taskinfo = new TaskInfo();
	        taskinfo.setAppid(appid);
	        taskinfo.setTaskResult(" has requested ATM locations at "+df.format(dateobj) +" !");
	        
	        
	        return taskinfo;
	    }
}
