package com.epam.properyreaders.yandexpropery;

import ru.qatools.properties.Property;
import ru.qatools.properties.Resource;

/**
 * Created by Olha_Yeremenko on 29.11.2015.
 */
@Resource.Classpath(YandexReader.PROPERTY_PATH)
public interface YandexConfigurator {
    @Property("electronics")
    String getElectronics() ;

    @Property("category.computer")
    String getCategoryComputer() ;
}
