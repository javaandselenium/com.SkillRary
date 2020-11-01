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
	
	@FindBy(id="countries_states")
	private WebElement countrydd;
	
	public WebElement getCountrydd() {
		return countrydd;
	}

	@FindBy(id="state")
	private WebElement statesdd;
	
	@FindBy(xpath="//input[@value='Update']")
	private WebElement sumbitbtn;
	
	public WebElement getSumbitbtn() {
		return sumbitbtn;
	}

	

	public WebElement getStatesdd() {
		return statesdd;
	}

	public TakeThisCourse(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void takeCourse()
	{
		takethisCourse.click();
	}

}
