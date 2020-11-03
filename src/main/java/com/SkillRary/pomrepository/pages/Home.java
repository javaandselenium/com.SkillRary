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
	
	@FindBy(xpath="//a[.='my course']")
	private WebElement myCourseBtn;
	
	public WebElement getMyCourseBtn() {
		return myCourseBtn;
	}

	public WebElement getViewgraphBtn() {
		return viewgraphBtn;
	}

	public WebElement getGenerateMygraphBtn() {
		return generateMygraphBtn;
	}

	public WebElement getCourseDetailsBtn() {
		return courseDetailsBtn;
	}

	public WebElement getRecordedCourseBtn() {
		return recordedCourseBtn;
	}

	public WebElement getHundredper() {
		return hundredper;
	}

	@FindBy(xpath="//a[.='View Graph']")
	private WebElement viewgraphBtn;
	
	@FindBy(id="loadprogress")
	private WebElement generateMygraphBtn;
	
	@FindBy(id="course_details")
	private WebElement courseDetailsBtn;
	
	@FindBy(id="Recorded courses")
	private WebElement recordedCourseBtn;
	
	@FindBy(xpath="(//div[@data-percent='100'])[1]")
	private WebElement hundredper;
	
	
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
	
	public void graph()
	{
		myCourseBtn.click();
		viewgraphBtn.click();
	}
	public void generate() throws InterruptedException
	{
		Thread.sleep(3000);
		//generateMygraphBtn.click();
		courseDetailsBtn.click();
		recordedCourseBtn.click();
	}
	

}
