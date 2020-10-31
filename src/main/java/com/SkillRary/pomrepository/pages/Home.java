package com.SkillRary.pomrepository.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author Bharani
 *
 */
public class Home {
	/**
	 * Element reprository of Home page
	 */
	@FindBy(name="q")
	private WebElement serachTb;
	
	@FindBy(xpath="//input[@value='go']")
	private WebElement goBtn;
	
	public Home(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void courseSerach(String course)
	{
		serachTb.sendKeys(course);
		goBtn.click();
	}

	public WebElement getSerachTb() {
		return serachTb;
	}

	public WebElement getGoBtn() {
		return goBtn;
	}
	

}
