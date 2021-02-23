package com.testcases;

import com.webfunctions.WebLibrary;

public class Tc_01 {
    public static void main(String[] args) {
        WebLibrary webLibrary=new WebLibrary();
        webLibrary.launchBrowser();
        webLibrary. login();
        webLibrary.verify("Login");
        webLibrary.closeBrowser();
    }
}
