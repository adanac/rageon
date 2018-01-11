package com.adananc.demo.factory;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        IHair hair =null;
        HairFactory hairFactory = new HairFactory();
        // 方式一
//        hair = new LeftHair();
        // 方式二
//        hairFactory = new HairFactory();
//        hair = hairFactory.getHair("left");
        // 方式三
//        hair = hairFactory.getHairByClassName("com.adananc.demo.factory.LeftHair");

        // 方式四
//        hair = hairFactory.getHairByClassKey("left");

        // 当新增一种类型时，可通过方式一,getHairByClassName()
//        hair = hairFactory.getHairByClassName("com.adananc.demo.factory.MiddleHair");
        // 当新增一种类型时，可通过方式二,getHairByClassKey()并配置property文件
        hair = hairFactory.getHairByClassKey("middle");
        hair.drawHair();

    }
}
