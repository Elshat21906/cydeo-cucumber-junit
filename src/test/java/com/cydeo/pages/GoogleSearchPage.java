package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {
    //create constructor
    // initialize the driver instance and this class' instance using PageFactory.initElements

    public GoogleSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    } 
}
