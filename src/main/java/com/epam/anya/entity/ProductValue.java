
package com.epam.anya.entity;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for productValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="productValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="protein" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="fat" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="carbohydrates" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productValue", namespace = "http://example.com/products", propOrder = {
    "protein",
    "fat",
    "carbohydrates"
})
public class ProductValue {

    @XmlElement(required = true)
    protected BigDecimal protein;
    @XmlElement(required = true)
    protected BigDecimal fat;
    @XmlElement(required = true)
    protected BigDecimal carbohydrates;

    /**
     * Gets the value of the protein property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProtein() {
        return protein;
    }

    /**
     * Sets the value of the protein property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProtein(BigDecimal value) {
        this.protein = value;
    }

    /**
     * Gets the value of the fat property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFat() {
        return fat;
    }

    /**
     * Sets the value of the fat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFat(BigDecimal value) {
        this.fat = value;
    }

    /**
     * Gets the value of the carbohydrates property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCarbohydrates() {
        return carbohydrates;
    }

    /**
     * Sets the value of the carbohydrates property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCarbohydrates(BigDecimal value) {
        this.carbohydrates = value;
    }

}
