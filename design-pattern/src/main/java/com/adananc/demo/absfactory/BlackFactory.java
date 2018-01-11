package com.adananc.demo.absfactory;

/**
 * Created by Feagle on 2018/1/9.
 */
public class BlackFactory implements IPersonFactory {
    @Override
    public IMan getMan() {
        return new BlackMan();
    }

    @Override
    public IWomen getWomen() {
        return new BlackWomen();
    }
}
