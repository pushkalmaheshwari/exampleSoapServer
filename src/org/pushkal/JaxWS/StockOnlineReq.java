//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.11 at 09:12:37 PM IST 
//


package org.pushkal.JaxWS;

import java.math.BigInteger;
public class StockOnlineReq {

    protected BigInteger localConsulta;
    protected String lector;
    protected BigInteger skuEan;

    /**
     * Gets the value of the localConsulta property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLocalConsulta() {
        return localConsulta;
    }

    /**
     * Sets the value of the localConsulta property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLocalConsulta(BigInteger value) {
        this.localConsulta = value;
    }

    /**
     * Gets the value of the lector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLector() {
        return lector;
    }

    /**
     * Sets the value of the lector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLector(String value) {
        this.lector = value;
    }

    /**
     * Gets the value of the skuEan property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSkuEan() {
        return skuEan;
    }

    /**
     * Sets the value of the skuEan property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSkuEan(BigInteger value) {
        this.skuEan = value;
    }

}