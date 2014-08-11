
package com.epam.anya.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Product complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Product">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://example.com/products}productTypes"/>
 *         &lt;element name="calories" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="fat_percentage" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="value" type="{http://example.com/products}productValue"/>
 *         &lt;element name="production" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Product", namespace = "http://example.com/products", propOrder = {
    "name",
    "calories",
    "fatPercentage",
    "price",
    "value",
    "production"
})
public class Product {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ProductTypes name;
    @XmlElement(required = true)
    protected BigInteger calories;
    @XmlElement(name = "fat_percentage", required = true)
    protected BigInteger fatPercentage;
    @XmlElement(required = true)
    protected BigDecimal price;
    @XmlElement(required = true)
    protected ProductValue value;
    @XmlElement(required = true)
    protected String production;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link ProductTypes }
     *     
     */
    public ProductTypes getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductTypes }
     *     
     */
    public void setName(ProductTypes value) {
        this.name = value;
    }

    /**
     * Gets the value of the calories property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCalories() {
        return calories;
    }

    /**
     * Sets the value of the calories property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCalories(BigInteger value) {
        this.calories = value;
    }

    /**
     * Gets the value of the fatPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFatPercentage() {
        return fatPercentage;
    }

    /**
     * Sets the value of the fatPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFatPercentage(BigInteger value) {
        this.fatPercentage = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link ProductValue }
     *     
     */
    public ProductValue getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductValue }
     *     
     */
    public void setValue(ProductValue value) {
        this.value = value;
    }

    /**
     * Gets the value of the production property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduction() {
        return production;
    }

    /**
     * Sets the value of the production property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduction(String value) {
        this.production = value;
    }

}
