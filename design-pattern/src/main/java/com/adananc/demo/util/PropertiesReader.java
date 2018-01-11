package com.adananc.demo.util;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Created by Feagle on 2018/1/8.
 */
public class PropertiesReader {
    public Map<String, String> getProperties() {
        Properties props = new Properties();
        Map<String, String> map = new HashMap<String, String>();
        try {
            // 加载方式，http://blog.csdn.net/wws921104/article/details/72637050
            InputStream in = getClass().getResourceAsStream("/hair.type.properties");
            props.load(in);
            Enumeration en = props.propertyNames();
            while (en.hasMoreElements()) {
                String key = (String) en.nextElement();
                String property = props.getProperty(key);
                map.put(key, property);
                System.out.println(key + "  " + property);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }
}
