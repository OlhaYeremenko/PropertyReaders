package com.epam.properyreaders.apacheproperty;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.PropertiesConfiguration;

/**
 * Created by Olha_Yeremenko on 29.11.2015.
 */
public class ApacheReader {
    public static final String PROPERTY_PATH = "apache.properties";

    public static String load(String property) {
        Configuration config;
        try {
             config = new PropertiesConfiguration(PROPERTY_PATH);
            return config.getString(property);
         } catch (org.apache.commons.configuration.ConfigurationException e) {
            e.printStackTrace();
        }
        return null;
    }
}
