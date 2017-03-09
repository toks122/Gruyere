package com.gruyere.framework.utils;

/**
 * Created by oluseunorebajo on 08/03/2017.
 */
public enum Browsers {
    FIREFOX,
    CHROME,
    SAFARI;

    public static Browsers browserForName(String browser) throws IllegalArgumentException{
        for(Browsers b: values()){
            if(b.toString().equalsIgnoreCase(browser)){
                return b;
            }
        }
        throw browserNotFound(browser);
    }

    private static IllegalArgumentException browserNotFound(String browser) {
        return new IllegalArgumentException(("Invalid browser [" + browser + "]"));
    }
}
