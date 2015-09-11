package org.pushkal.JaxWS;

import javax.jws.WebMethod;  
import javax.jws.WebService; 

@WebService
public interface HelloWorld {
	 @WebMethod public String helloWorld(String name);  
	 @WebMethod public Category GetCategoryById(Category c);
	 @WebMethod public Category[] getAllCategories();
}
