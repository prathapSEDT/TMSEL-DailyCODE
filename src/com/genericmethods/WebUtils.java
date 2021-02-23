package com.genericmethods;

public class WebUtils {
    /*
    @method_name:launchBrowser
    @purpose:this method will helps the user to launch ff,chrome,edge browser
    @inputParam:browser,url
     */
    public void launchBrowser(String browser,String url){
        switch (browser.toLowerCase()){
            case "ff":
                System.out.println("Launching ff browser");
                break;
            case "chrome":
                System.out.println("Launching chrome browser");
                break;

        }
    }
    /*
    @method_name:clickElement
    @purpose:this method will helps the user to clcik on the element on any page
    @inputParam:String elementName,String page,String element
     */
    public void clickElement(String elementName,String page,String element){
        System.out.println("Clicking element "+elementName+" on the page "+page);
    }

    /*
    @method_name:sendData
    @purpose:this method will helps the user to enter data into any textbox on any page
    @inputParam:String elementName,String page,String element,String data
     */
    public void sendData(String elementName,String page,String element,String data){
        System.out.println("sending data to the element "+elementName+" on the page "+page);
    }

    /*
    @method_name:waitForElement
    @purpose:this method will helps the user to till the element is visible on the page
    @inputParam:String elementName,String page,String element
     */
    public void waitForElement(String elementName,String page,String element){
        System.out.println("Waiting for the element "+elementName+" on the page "+page);
    }

    /*
    @method_name:selectOption
    @purpose:this method will helps the user to select option from the dropdown
    @inputParam:String elementName,String page,String element,String option
     */
    public void selectOption(String elementName,String page,String element,String option){
        System.out.println("Select the dropdown element "+elementName+"with the option"+option+" on the page "+page);
    }
}
