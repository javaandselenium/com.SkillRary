package com.SkillRary.genericlib;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/**
 * 
 * @author Bharani
 *
 */
public class Photo {
	/**
	 * To take the sceenshot of failed testcases
	 * 
	 * @param driver
	 * @param name
	 * @throws IOException
	 */
	public static String getphoto(WebDriver driver, String name) throws IOException {
		Date d = new Date();
		String date = d.toString().replaceAll(":", "-");
		String path=AutoConstant.photopath+date+name+".png";
		
		TakesScreenshot t = (TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		FileUtils.copyFile(src, dest);
		return path;
	}

}
