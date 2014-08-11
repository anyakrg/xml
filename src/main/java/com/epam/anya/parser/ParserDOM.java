package com.epam.anya.parser;

import java.io.File;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class ParserDOM implements ParserFactory {

    @Override
    public void getDatas() {
        try
        {
            File xmlFile = new File("src/main/resources/xsd-xml/Delivery.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();

            System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("product");
            for(int temp = 0; temp < nodeList.getLength(); temp++)
            {
                Node node = nodeList.item(temp);
                if(node.getNodeType() == Node.ELEMENT_NODE)
                {
                    Element element = (Element)node;
                    System.out.println("Candy:");
                    System.out.println("Name: " + element.getElementsByTagName("name").item(0).getTextContent());
                    System.out.println("Energy: " + element.getElementsByTagName("energy").item(0).getTextContent());
                    System.out.println("Type: " + element.getElementsByTagName("type").item(0).getTextContent());
                    System.out.println("Ingredients: ");
                    System.out.println("Water: " + element.getElementsByTagName("water").item(0).getTextContent());
                    System.out.println("Sugar: " + element.getElementsByTagName("sugar").item(0).getTextContent());
                    System.out.println("Fruit: " + element.getElementsByTagName("fruit").item(0).getTextContent());
                    System.out.println("Chocolate: " + element.getElementsByTagName("chocolate").item(0).getTextContent());
                    System.out.println("Vanilla: " + element.getElementsByTagName("vanilla").item(0).getTextContent());
                    System.out.println("Value: ");
                    System.out.println("Protein: " + element.getElementsByTagName("protein").item(0).getTextContent());
                    System.out.println("Fat: " + element.getElementsByTagName("fat").item(0).getTextContent());
                    System.out.println("Carbohydrates: " + element.getElementsByTagName("carbohydrates").item(0).getTextContent());
                    System.out.println("Production: " + element.getElementsByTagName("production").item(0).getTextContent());
                    System.out.println("-------------------");
                }
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
        }

    }


}
