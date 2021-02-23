package com.oops.interfacess;

public class TestWebApps {
    public static void main(String[] args) {
        //when we have an interface to acccess the methods of an interface
        //parent p=new child();
        //no---child c=new parent();
        WebApps webApps=new Utils();
        webApps.launchBrowser();

        webApps.launchBrowser();

    }
}
