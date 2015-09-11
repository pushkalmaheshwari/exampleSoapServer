package org.pushkal.JaxWS;
import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;

import javax.jws.WebService;

import org.pushkal.JaxWS.Category.Stock;

@WebService(endpointInterface="org.pushkal.JaxWS.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String helloWorld(String name) {
		return "Hello world from "+name;  
		
	}

	@Override
	public Category GetCategoryById(Category c) {

		List <Stock> stList = new ArrayList<Stock>();
		
		Stock st = new Category.Stock();
		st.setColor("Black");
		st.setMesAntiguedad(  BigInteger.valueOf(10));
		st.setNotaCredito(BigInteger.valueOf(10));
		st.setSku(BigInteger.valueOf(10));
		st.setStockAct(BigInteger.valueOf(10));
		st.setStockAnt(BigInteger.valueOf(10));
		st.setTalla("Talla");
		st.setVentas(BigInteger.valueOf(10));
		stList.add(st);
		
		
		Stock st1 = new Category.Stock();
		st1.setColor("Black");
		st1.setMesAntiguedad(BigInteger.valueOf(10));
		st1.setNotaCredito(BigInteger.valueOf(10));
		st1.setSku(BigInteger.valueOf(10));
		st1.setStockAct(BigInteger.valueOf(10));
		st1.setStockAnt(BigInteger.valueOf(10));
		st1.setTalla("Talla");
		st1.setVentas(BigInteger.valueOf(10));
		
		stList.add(st1);
		
		Category c2dm = new Category(10,"happy now " ,"Anthony gonsalvis",stList);
		
		return c2dm;
	}

	@Override
	public Category[] getAllCategories() {
		Category[] categories = new Category[2];
		
		Category c2dm = new Category();
		c2dm.CategoryId = 10;
		c2dm.Description = "happy now ";
		c2dm.Name = "Anthony gonsalvis";
		
		
		
		categories[0] = c2dm;
		
		Category c2dm1 = new Category();
		c2dm1.CategoryId = 20;
		c2dm1.Description = "not happy now ";
		c2dm1.Name = "pushkal";
		
		categories[1] = c2dm1;
		
		return categories;
	}

}
