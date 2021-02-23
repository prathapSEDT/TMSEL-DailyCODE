package com.testcases;

import com.webfunctions.WebLibrary;

public class Tc_02 {
    public static void main(String[] args) {
        WebLibrary webLibrary=new WebLibrary();
        webLibrary.launchBrowser();
        webLibrary.registerUser();
        webLibrary.verify("Regsiter");

    }
}
