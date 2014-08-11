
package com.epam.anya.entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for productTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="productTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MILK"/>
 *     &lt;enumeration value="CHEESE"/>
 *     &lt;enumeration value="KEFIR"/>
 *     &lt;enumeration value="COTTAGECHEESE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "productTypes", namespace = "http://example.com/products")
@XmlEnum
public enum ProductTypes {

    MILK,
    CHEESE,
    KEFIR,
    COTTAGECHEESE;

    public String value() {
        return name();
    }

    public static ProductTypes fromValue(String v) {
        return valueOf(v);
    }

}
