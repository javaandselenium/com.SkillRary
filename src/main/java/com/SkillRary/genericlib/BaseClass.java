package com.SkillRary.genericlib;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

/**
 * 
 * @author Bharani
 *
 */
public class BaseClass implements AutoConstant {
	public WebDriver driver;
	static public ExtentTest test;
	static public ExtentHtmlReporter htmlReport;
	static public ExtentReports reports;
/**
 * Reports are stored
 */
	@BeforeSuite
	public void configBS() {
		 htmlReport=new ExtentHtmlReporter(new File("./reports.html"));
		  htmlReport.config().setDocumentTitle("SkillRaryReport");
		  htmlReport.config().setTheme(Theme.DARK);
		  reports=new ExtentReports();
			
			  reports.attachReporter(htmlReport); 
			  reports.setSystemInfo("Environment","Windows"); 
			  reports.setSystemInfo("Reporter", "Bharani");
		 
}
/**
 * Launch the application
 * @throws FileNotFoundException
 * @throws IOException
 */
	@BeforeClass
	public void configBC() throws FileNotFoundException, IOException {
		System.setProperty(key, value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Propertylib.getpropertydata("url"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		 
	}

	@BeforeMethod
	public void configBM() {

	}

	@AfterMethod
	public void configAM() {

	}

	@AfterClass
	public void configAC() {
		driver.close();
	}

	/**
	 * verify and flush the report
	 * @param result
	 */
	@AfterSuite
	public void configAS(ITestResult result) {
		if(result.getStatus()==ITestResult.SUCCESS) {
		test.log(Status.PASS,result.getMethod().getMethodName()+"is passed");	
		}
		else if(result.getStatus()==ITestResult.FAILURE) {
			test.log(Status.FAIL,result.getMethod().getMethodName()+"is failure");	
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP,result.getMethod().getMethodName()+"is Skipped");
		}
		reports.flush();
		htmlReport.flush();
    
	}

}
