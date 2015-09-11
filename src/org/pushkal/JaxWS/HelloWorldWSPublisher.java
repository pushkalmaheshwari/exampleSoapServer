package org.pushkal.JaxWS;
import javax.xml.ws.Endpoint;  

public class HelloWorldWSPublisher {

	public static void main(String[] args) {
		  Endpoint.publish("http://192.168.1.105:8080/WS/HelloWorld",new HelloWorldImpl());  
		
	}

}
