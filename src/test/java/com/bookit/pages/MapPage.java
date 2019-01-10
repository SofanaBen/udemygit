package com.bookit.pages;

import org.openqa.selenium.support.PageFactory;

import com.bookit.utilities.Driver;

public class MapPage extends TopNavigationBar {
	public MapPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
    
  public class TopNavigationBar {
	PageFactory.initElements(Driver.getDriver(), this);
	}  
    
}
