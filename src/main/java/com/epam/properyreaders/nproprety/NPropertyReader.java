package com.epam.properyreaders.nproprety;

import jfork.nproperty.Cfg;
import jfork.nproperty.ConfigParser;


import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Olha_Yeremenko on 29.11.2015.
 */
public class NPropertyReader {
    @Cfg
    private String electronics;

    public static final String PROPERTY_PATH = "src/main/resources/standard.properties";

    public NPropertyReader() {
        load(PROPERTY_PATH);
    }

    public String getElectronics() {
        return electronics;
    }


    private void load(String filename) {
        try {
            ConfigParser.parse(this, filename);
        } catch (InvocationTargetException | NoSuchMethodException | InstantiationException | IllegalAccessException | IOException e) {
            e.printStackTrace();
        }
    }
}
