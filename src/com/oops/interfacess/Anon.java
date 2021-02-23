package com.oops.interfacess;

public class Anon {
    public static void main(String[] args) {
        WebApps ref=new WebApps() {
            @Override
            public void launchBrowser() {
                System.out.println("Launching browser");
            }
        };
        ref.launchBrowser();
    }


}
