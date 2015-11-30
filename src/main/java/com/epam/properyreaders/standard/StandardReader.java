package com.epam.properyreaders.standard;

import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Properties;

/**
 * Created by Olha_Yeremenko on 26.11.2015.
 */
public class StandardReader {
    private static final StandardReader PROPERTIES = new StandardReader();
    private static final String PROPERTY_PATH = "standard.properties";

    private static Properties properties = new Properties();

    public static StandardReader newInstance() {
        load();
        return PROPERTIES;
    }

    private static void load() {
        InputStream inputStream = StandardReader.class.getClassLoader().getResourceAsStream(PROPERTY_PATH);
        try {
            properties.load(inputStream);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static String getProperty(String propName) {
        try {
            load();
            return properties.getProperty(propName);
        } catch (NoSuchElementException ex) {
            throw new NoSuchElementException("No such property " + propName);
        }
    }


}
