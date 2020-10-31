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
public class TakeThisCourse {
	/**
	 * Element reporistory of Takethiscourse
	 */
	@FindBy(xpath="//a[.=' TAKE THIS COURSE ']")
	private WebElement takethisCourse;
	
	public TakeThisCourse(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void takeCourse()
	{
		takethisCourse.click();
	}

}
