
package com.epam.anya.entity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.epam.anya package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Delivery_QNAME = new QName("http://example.com/products", "delivery");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.epam.anya
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProductList }
     * 
     */
    public ProductList createProductList() {
        return new ProductList();
    }

    /**
     * Create an instance of {@link ProductValue }
     * 
     */
    public ProductValue createProductValue() {
        return new ProductValue();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example.com/products", name = "delivery")
    public JAXBElement<ProductList> createDelivery(ProductList value) {
        return new JAXBElement<ProductList>(_Delivery_QNAME, ProductList.class, null, value);
    }

}
