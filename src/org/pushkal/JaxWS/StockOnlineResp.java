//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.11 at 09:09:43 PM IST 
//


package org.pushkal.JaxWS;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;




public class StockOnlineResp  {

    protected BigInteger codResp;
    protected String msgResp;
    protected String descArt;
    protected String descLocal;
    protected BigInteger sku;
    protected BigInteger ean;
    protected List<Stock> stock;
    
    public void setStock(List<StockOnlineResp.Stock> stock) {
		this.stock = stock;
	}



	public StockOnlineResp() {
    	/*
        if (stock == null) {
            stock = new ArrayList<Stock>();
        }*/
     }

    

    /**
     * Gets the value of the codResp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCodResp() {
        return codResp;
    }

    /**
     * Sets the value of the codResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCodResp(BigInteger value) {
        this.codResp = value;
    }

    /**
     * Gets the value of the msgResp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgResp() {
        return msgResp;
    }

    /**
     * Sets the value of the msgResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgResp(String value) {
        this.msgResp = value;
    }

    /**
     * Gets the value of the descArt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescArt() {
        return descArt;
    }

    /**
     * Sets the value of the descArt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescArt(String value) {
        this.descArt = value;
    }

    /**
     * Gets the value of the descLocal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescLocal() {
        return descLocal;
    }

    /**
     * Sets the value of the descLocal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescLocal(String value) {
        this.descLocal = value;
    }

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
     * Gets the value of the ean property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEan() {
        return ean;
    }

    /**
     * Sets the value of the ean property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEan(BigInteger value) {
        this.ean = value;
    }

    /**
     * Gets the value of the stock property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stock property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStock().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StockOnlineResp.Stock }
     * 
     * 
     */
    public List<StockOnlineResp.Stock> getStock() {
        if (stock == null) {
            stock = new ArrayList<StockOnlineResp.Stock>();
        }
        return this.stock;
    }

    


    public static class Stock {

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