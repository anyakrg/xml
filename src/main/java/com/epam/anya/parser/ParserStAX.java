package com.epam.anya.parser;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ParserStAX implements ParserFactory {

    @Override
    public void getDatas() throws IOException, SAXException, ParserConfigurationException {
        try {
            XMLInputFactory inputFactory = XMLInputFactory.newInstance();
            InputStream input = new FileInputStream("src/main/resources/xsd-xml/Delivery.xml");
            XMLStreamReader streamReader = inputFactory.createXMLStreamReader(input);
            while (streamReader.hasNext()) {
                int type = streamReader.next();
                switch (type) {
                    case XMLStreamConstants.START_DOCUMENT:
                        startDocument();
                        break;
                    case XMLStreamConstants.START_ELEMENT:
                        startElement(streamReader);
                        break;
                    case XMLStreamConstants.CHARACTERS:
                        characters(streamReader);
                        break;
                    case XMLStreamConstants.END_ELEMENT:
                        break;
                    case XMLStreamConstants.END_DOCUMENT:
                        endDocument();
                        break;
                }

            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        } catch (XMLStreamException exception) {
            System.out.println(exception.getMessage());
        }
    }

    private void characters(XMLStreamReader streamReader) {
        System.out.println(streamReader.getText().trim());
    }

    private void startElement(XMLStreamReader streamReader) throws XMLStreamException {
        System.out.print(streamReader.getLocalName().trim() + ":");
    }

    private void startDocument() throws SAXException {
        System.out.println("Document starts");
    }

    private void endDocument() throws SAXException {
        System.out.println("Document end");
    }


}
