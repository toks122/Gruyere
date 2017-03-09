package com.gruyere.framework.utils;

/**
 * Created by oluseunorebajo on 08/03/2017.
 */
public class NavigationFactory {
    private static NavigationUtils navigator = null;

    public static synchronized NavigationUtils getNavigator(){
        if(navigator == null){
            navigator = new NavigationUtils();
        }
        return navigator;
    }
}
