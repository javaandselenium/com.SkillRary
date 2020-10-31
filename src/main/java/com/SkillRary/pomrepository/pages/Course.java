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
public class Course {
	/**
	 * element reprository of course
	 */
	@FindBy(xpath="//a[.=' Assessment on  selenium']")
	private WebElement seleniumCourse;
	
	public Course(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void seleniumAssignment()
	{
		seleniumCourse.click();
	}

}
