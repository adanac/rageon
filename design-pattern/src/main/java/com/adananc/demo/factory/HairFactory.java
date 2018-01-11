package com.adananc.demo.factory;

import com.adananc.demo.util.PropertiesReader;

import java.util.Map;

/**
 * 工厂
 * Created by Feagle on 2018/1/8.
 */
public class HairFactory {

    /**
     * 根据类型来创建对象
     *
     * @param key
     * @return
     */
    public IHair getHair(String key) {
        if ("left".equals(key)) {
            return new LeftHair();
        } else if ("right".equals(key)) {
            return new RightHair();
        }
        return null;
    }

    /**
     * 根据类的名称来创建对象
     *
     * @param className
     * @return hair
     */
    public IHair getHairByClassName(String className) {
        try {
            IHair hair = (IHair) Class.forName(className).newInstance();
            return hair;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 根据类的名称来生产对象
     * @param key
     * @return
     */
    public IHair getHairByClassKey(String key){
        Map<String, String> properties = new PropertiesReader().getProperties();
        try {
            IHair hair = (IHair) Class.forName(properties.get(key)).newInstance();
            return hair;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
