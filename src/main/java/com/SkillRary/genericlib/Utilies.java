package com.SkillRary.genericlib;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * 
 * @author Bharani
 *
 */
public class Utilies {
/**
 * To handle the dropdown
 * @param element
 * @param option
 */
	public static void select(WebElement element, String option) {
		Select s = new Select(element);
		s.selectByVisibleText(option);
	}
	/**
	 * To perform the mouse action on the element
	 * @param driver
	 * @param element
	 */

	public static void action(WebDriver driver, WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}
	/**
	 * Used to wait for the element until i is visible
	 * @param driver
	 * @param element
	 */

	public static void expliciltyWait(WebDriver driver, WebElement element) {
		WebDriverWait w = new WebDriverWait(driver, 20);
		w.until(ExpectedConditions.visibilityOf(element));
	}
	/**
	 * Used to scroll to the element
	 * @param driver
	 * @param x
	 * @param y
	 */

	public static void scrollBarAction(WebDriver driver, int x, int y) {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(" + x + "," + y + ")");
	}
}
