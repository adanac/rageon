package com.adananc.demo.absfactory;

/**
 * Created by Feagle on 2018/1/9.
 */
public class WhiteFactory implements IPersonFactory {
    @Override
    public IMan getMan() {
        return new WhiteMan();
    }

    @Override
    public IWomen getWomen() {
        return new WhiteWomen();
    }
}
