package com.epam.properyreaders.groovyproprty;

import groovy.util.ConfigObject;
import groovy.util.ConfigSlurper;

import java.io.File;
import java.net.MalformedURLException;

/**
 * Created by Olha_Yeremenko on 29.11.2015.
 */
public class GroovyReader {
    private static final String PROPERTY_PATH = "src/main/resources/property.groovy";
    private static final String PROPERTY_FROM_FILE = System.getProperty("data", "electronics");
    private static ConfigObject config;

    private GroovyReader() {
    }

    public static String load(final String propertyName) {
        try {
            config = new ConfigSlurper(PROPERTY_FROM_FILE).parse(new File(PROPERTY_PATH).toURI().toURL());
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }
        return config.toProperties().getProperty(propertyName);
    }
}
