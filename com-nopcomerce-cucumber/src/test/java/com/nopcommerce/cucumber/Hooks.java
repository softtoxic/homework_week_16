package com.nopcommerce.cucumber;

import com.nopcommerce.cucumber.propertyreader.PropertyReader;
import com.nopcommerce.cucumber.utility.Utility;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Utility {
    @Before
    public void setUp(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }

    @After
    public void tearDown(){
        closeBrowser();
    }
}
