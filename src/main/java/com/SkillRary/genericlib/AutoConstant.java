package com.SkillRary.genericlib;

/**
 * 
 * @author Bhrani
 *
 */
public interface AutoConstant {
	/**
	 * To store the constants
	 */
	String key = "webdriver.chrome.driver";
	String value = "./src/main/resources/chromedriver.exe";

	String propertyfilepath = "./src/test/resources/testdata.properties";
	String excelfilepath = "./src/test/resources/exceldata.xlsx";

	String photopath = "./src/test/resources/photo/";
	
	String reportpath="./src/test/resources/reports/";

}
