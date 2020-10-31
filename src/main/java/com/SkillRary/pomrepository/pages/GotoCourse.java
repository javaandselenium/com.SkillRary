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
public class GotoCourse {
	/**
	 * Element reporsitory of gotocourse
	 */
	@FindBy(xpath="//a[.='Go to Course']")
	private WebElement gotoCourse;
	
	public GotoCourse(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void gotoCourseBtn()
	{
		gotoCourse.click();
	}
	
	

}
