package com.bookit.pages;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import com.bookit.utilities.Driver;


public class TeamPage {
  public TeamPage() {
    PageFactory.initElements(Driver.getDriver(), this);
  }


  
  @FindBy(xpath="//p[.='name']/preceding-sibling::p[@class='title is-6']")
    public List<WebElement> teamMemberNames;

    @FindBy(xpath="//p[.='role']/preceding-sibling::p[@class='title is-6']")
    public List<WebElement> teamMemberRoles;
}
