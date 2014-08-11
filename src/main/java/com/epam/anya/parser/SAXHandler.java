package com.epam.anya.parser;

import com.epam.anya.entity.Product;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.LinkedList;
import java.util.List;

public class SAXHandler extends DefaultHandler {

    @Override
    public void startDocument() throws SAXException {
        System.out.println("Document starts");
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("Document end");
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        System.out.print(new String(ch, start, length));
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

        if (qName.equalsIgnoreCase("can:candyBox")) System.out.println("Start element can:candyBox");
        else System.out.print(qName + ":");
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("candy")) System.out.print("end candy");
    }

    @Override
    public void warning(SAXParseException e) throws SAXException {
        System.err.println("WARNING: line " + e.getLineNumber() + ": "
                + e.getMessage());
    }

    @Override
    public void error(SAXParseException e) throws SAXException {
        System.err.println("ERROR: line " + e.getLineNumber() + ": "
                + e.getMessage());
    }

    @Override
    public void fatalError(SAXParseException e) throws SAXException {
        System.err.println("FATAL: line " + e.getLineNumber() + ": "
                + e.getMessage());
        throw (e);
    }
}
