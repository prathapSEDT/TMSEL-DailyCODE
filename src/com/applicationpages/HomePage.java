package com.applicationpages;

import com.genericmethods.WebUtils;
import com.webfunctions.WebLibrary;

public class HomePage extends WebUtils {

    public void launchApplication(){
        launchBrowser("chrome","https://www.google.com");
    }

    public void signIn(){
        clickElement("Sign -In","Home Page","signinlink");
    }
}
