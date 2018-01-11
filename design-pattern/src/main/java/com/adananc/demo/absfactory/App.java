package com.adananc.demo.absfactory;

/**
 * Created by Feagle on 2018/1/9.
 */
public class App {
    public static void main(String[] args) {
        IPersonFactory personFactory = new BlackFactory();
        IMan man = personFactory.getMan();
        man.createMan();

        personFactory = new WhiteFactory();
        IWomen women = personFactory.getWomen();
        women.createWomen();
    }
}
