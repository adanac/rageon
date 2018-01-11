package com.adananc.demo.absfactory;

/**
 * Created by Feagle on 2018/1/9.
 */
public interface IPersonFactory {

    IMan getMan();

    IWomen getWomen();
}
