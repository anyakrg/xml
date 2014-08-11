package com.epam.anya.runner;

import com.epam.anya.parser.*;
import com.epam.anya.parser.ParserDOM;
import com.epam.anya.parser.ParserFactory;
import com.epam.anya.parser.ParserSAX;
import com.epam.anya.parser.ParserStAX;
import com.sun.org.apache.xerces.internal.parsers.DOMParser;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        System.out.println("=========SAX Parser=========");
        ParserFactory saxParser = (ParserFactory) new ParserSAX();
        saxParser.getDatas();

        System.out.println("=========StAX Parser=========");
        ParserFactory staxParser = (ParserFactory) new ParserStAX();
        staxParser.getDatas();

        System.out.println("=========DOM Parser=========");
        ParserFactory domParser = (ParserFactory) new ParserDOM();
        domParser.getDatas();

    }

}