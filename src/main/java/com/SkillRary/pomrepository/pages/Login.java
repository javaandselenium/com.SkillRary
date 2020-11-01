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
public class Login {
	/**
	 * Element repository of loginpage
	 */
	@FindBy(xpath="//a[.='Sign In']")
	private WebElement signBtn;
	
	@FindBy(id="email")
	private WebElement emaillTb;
	
	@FindBy(name="password")
	private WebElement passwordTb;
	
	@FindBy(name="captcha_type")
	private WebElement captchaBtn;
	
	@FindBy(name="captcha")
	private WebElement captchaTb;
	
	@FindBy(xpath="//button[.=' Submit ']")
	private WebElement sumbitBtn;
	
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void logincredentials(String email,String password) throws InterruptedException
	{
		signBtn.click();
		emaillTb.sendKeys(email);
		passwordTb.sendKeys(password);
		captchaBtn.click();
		Thread.sleep(10000);
		sumbitBtn.click();
		
	}

	public WebElement getSignBtn() {
		return signBtn;
	}

	public WebElement getEmaillTb() {
		return emaillTb;
	}

	public WebElement getPasswordTb() {
		return passwordTb;
	}

	public WebElement getCaptchaBtn() {
		return captchaBtn;
	}

	public WebElement getCaptchaTb() {
		return captchaTb;
	}

	public WebElement getSumbitBtn() {
		return sumbitBtn;
	}
	

}
