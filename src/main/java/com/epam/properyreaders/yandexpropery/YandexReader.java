package com.epam.properyreaders.yandexpropery;

import ru.qatools.properties.PropertyLoader;

/**
 * Created by Olha_Yeremenko on 29.11.2015.
 */
public class YandexReader {

    public static final String PROPERTY_PATH = "yandex.properties";

    public static YandexConfigurator load(){
        return PropertyLoader.newInstance().populate(YandexConfigurator.class);
    }
}
