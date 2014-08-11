package com.epam.anya.parser;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public interface ParserFactory {
    public void getDatas() throws IOException, SAXException, ParserConfigurationException;
}