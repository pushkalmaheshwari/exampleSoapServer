package org.pushkal.JaxWS;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Category {

	
	 public int CategoryId;
	    public String Name;
	    public String Description;
	    protected List<Category.Stock> Stocks;
	    
	    public Category(){}
	    

	    public Category(int categoryId, String name, String description,  List<Stock> stocks) {
	    	Stocks = new ArrayList<Stock>();
	    	
	        CategoryId = categoryId;
	        Name = name;
	        Description = description;
	        for ( Stock stock : stocks)
	        {
	        	Stocks.add(stock);
	        }
	    }
	    private static class Stock {

	        protected BigInteger sku;
	        protected BigInteger stockAnt;
	        protected BigInteger ventas;
	        protected BigInteger notaCredito;
	        protected BigInteger stockAct;
	        protected BigInteger mesAntiguedad;
	        protected String talla;
	        protected String color;

	        /**
	         * Gets the value of the sku property.
	         * 
	         * @return
	         *     possible object is
	         *     {@link BigInteger }
	         *     
	         */
	        public BigInteger getSku() {
	            return sku;
	        }

	        /**
	         * Sets the value of the sku property.
	         * 
	         * @param value
	         *     allowed object is
	         *     {@link BigInteger }
	         *     
	         */
	        public void setSku(BigInteger value) {
	            this.sku = value;
	        }

	        /**
	         * Gets the value of the stockAnt property.
	         * 
	         * @return
	         *     possible object is
	         *     {@link BigInteger }
	         *     
	         */
	        public BigInteger getStockAnt() {
	            return stockAnt;
	        }

	        /**
	         * Sets the value of the stockAnt property.
	         * 
	         * @param value
	         *     allowed object is
	         *     {@link BigInteger }
	         *     
	         */
	        public void setStockAnt(BigInteger value) {
	            this.stockAnt = value;
	        }

	        /**
	         * Gets the value of the ventas property.
	         * 
	         * @return
	         *     possible object is
	         *     {@link BigInteger }
	         *     
	         */
	        public BigInteger getVentas() {
	            return ventas;
	        }

	        /**
	         * Sets the value of the ventas property.
	         * 
	         * @param value
	         *     allowed object is
	         *     {@link BigInteger }
	         *     
	         */
	        public void setVentas(BigInteger value) {
	            this.ventas = value;
	        }

	        /**
	         * Gets the value of the notaCredito property.
	         * 
	         * @return
	         *     possible object is
	         *     {@link BigInteger }
	         *     
	         */
	        public BigInteger getNotaCredito() {
	            return notaCredito;
	        }

	        /**
	         * Sets the value of the notaCredito property.
	         * 
	         * @param value
	         *     allowed object is
	         *     {@link BigInteger }
	         *     
	         */
	        public void setNotaCredito(BigInteger value) {
	            this.notaCredito = value;
	        }

	        /**
	         * Gets the value of the stockAct property.
	         * 
	         * @return
	         *     possible object is
	         *     {@link BigInteger }
	         *     
	         */
	        public BigInteger getStockAct() {
	            return stockAct;
	        }

	        /**
	         * Sets the value of the stockAct property.
	         * 
	         * @param value
	         *     allowed object is
	         *     {@link BigInteger }
	         *     
	         */
	        public void setStockAct(BigInteger value) {
	            this.stockAct = value;
	        }

	        /**
	         * Gets the value of the mesAntiguedad property.
	         * 
	         * @return
	         *     possible object is
	         *     {@link BigInteger }
	         *     
	         */
	        public BigInteger getMesAntiguedad() {
	            return mesAntiguedad;
	        }

	        /**
	         * Sets the value of the mesAntiguedad property.
	         * 
	         * @param value
	         *     allowed object is
	         *     {@link BigInteger }
	         *     
	         */
	        public void setMesAntiguedad(BigInteger value) {
	            this.mesAntiguedad = value;
	        }

	        /**
	         * Gets the value of the talla property.
	         * 
	         * @return
	         *     possible object is
	         *     {@link String }
	         *     
	         */
	        public String getTalla() {
	            return talla;
	        }

	        /**
	         * Sets the value of the talla property.
	         * 
	         * @param value
	         *     allowed object is
	         *     {@link String }
	         *     
	         */
	        public void setTalla(String value) {
	            this.talla = value;
	        }

	        /**
	         * Gets the value of the color property.
	         * 
	         * @return
	         *     possible object is
	         *     {@link String }
	         *     
	         */
	        public String getColor() {
	            return color;
	        }

	        /**
	         * Sets the value of the color property.
	         * 
	         * @param value
	         *     allowed object is
	         *     {@link String }
	         *     
	         */
	        public void setColor(String value) {
	            this.color = value;
	        }

	    }
}
