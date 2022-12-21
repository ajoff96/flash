package com.base;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.io.FileHandler;

public class BaseClassCuc {

	public static WebDriver d;// variable---null

	// Browser Launch
	public static void browserLaunch(String name) throws InterruptedException {

		if (name.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\CHROME DRIVER\\chromedriver.exe");
			d = new ChromeDriver();

		} else if (name.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "D:\\Firefox\\geckodriver.exe");
			d = new FirefoxDriver();

		} else if (name.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "D:\\Edge Driver\\msedgedriver.exe");
			d = new EdgeDriver();

		}
	}
	// setProperty
	public static WebDriver setProperty() {
		System.setProperty("webdriver.chrome.driver","D:\\CHROME DRIVER\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().window().maximize();
		return d;

	}

	// getdriver
	public static WebDriver getdriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\CHROME DRIVER\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().window().maximize();
		return d;
	}

	// geturl
	public static WebDriver get() {

		d.get("http://www.brm.tremplintech.in/web_pages/login.aspx");
		return d;

	}

	// get
	public static void geturl(String url) {
		d.get(url);

	}

	// Sendkeys
	public static void send(WebElement element, String value) {

		element.sendKeys(value);

	}

	// Click
	public static void clk(WebElement element) {
		element.click();

	}

	// Wait
	public static void wait(int w) throws InterruptedException {
		Thread.sleep(w);
	}

	// clear
	public static void clr(WebElement element) {
		element.clear();

	}

	// close
	public static WebDriver cls() {
		d.close();
		return d;

	}

	// quit
	public static void quit() {
		d.quit();
	}

	// Dropdown
	public static void DropDown(WebElement element, String options, String value) {
		Select s = new Select(element);
		if (options.equalsIgnoreCase("Index")) {
			s.selectByIndex(Integer.parseInt(value));// string into Integer
		} else if (options.equalsIgnoreCase("visibletext")) {
			s.selectByVisibleText(value);
		} else if (options.equalsIgnoreCase("value")) {
			s.selectByValue(value);

		}

	}

	// Frames
	public static void frameMethods(String frametype, String id, WebElement element, int index) {
		if (frametype.equalsIgnoreCase("id")) {
			d.switchTo().frame(id);
		} else if (frametype.equalsIgnoreCase("Webelement")) {
			d.switchTo().frame(element);
		} else if (frametype.equalsIgnoreCase("index")) {
			d.switchTo().frame(index);
		} else if (frametype.equalsIgnoreCase("parentframe")) {
			d.switchTo().parentFrame();
		} else if (frametype.equalsIgnoreCase("DefaultContent")) {
			d.switchTo().defaultContent();
		}

	}

	// Alert
	public static void alrt(String alert) {
		if (alert.equalsIgnoreCase("accept")) {
			d.switchTo().alert().accept();
		} else if (alert.equalsIgnoreCase("dismiss")) {
			d.switchTo().alert().dismiss();
		} else if (alert.equalsIgnoreCase("gettext")) {
			d.switchTo().alert().getText();
		}
	}

	// WebDriver Methods
	public static void webdrivermethods(String method) {
		if (method.equalsIgnoreCase("currenturl")) {
			System.out.println(d.getCurrentUrl());
		} else if (method.equalsIgnoreCase("title")) {
			String title = d.getTitle();
			System.out.println(title);
		}
	}

	// Actions
	public static void action(WebElement element, String option) {
		Actions a = new Actions(d);
		if (option.equalsIgnoreCase("perform")) {
			a.moveToElement(element).perform();
		} else if (option.equalsIgnoreCase("build")) {
			a.moveToElement(element).build().perform();
		} else if (option.equalsIgnoreCase("click")) {
			a.moveToElement(element).click().build().perform();
		}
	}

	public static void draganddrop(WebElement draggable, WebElement droppable) {
		Actions a = new Actions(d);
		a.dragAndDrop(draggable, droppable).build().perform();
	}

	// radio
	public static void radio(WebElement element) {
		element.click();

	}

	// check
	public static void checkbox(WebElement element) {
		element.click();

	}

	// screenshot
	public static void screenshot(String path) throws IOException {
		TakesScreenshot ss = (TakesScreenshot) d;
		File src = ss.getScreenshotAs(OutputType.FILE);
		File target = new File(path);
		//FileUtils.copyFile(src, target);
		 FileHandler.copy(src, target);
	}

	// Scroll
	public static void scroll(int s1, int s2) {

		int sr1 = s1;
		int sr2 = s2;
		JavascriptExecutor js = (JavascriptExecutor) d;

		js.executeScript("window.scrollBy(" + sr1 + "," + sr2 + ")");
	}

	// Url
	public static void url(String url) {
		d.get(url);

	}

	// Get Url
	public static void get(String url) {
		d.get("http://www.brm.tremplintech.in/web_pages/login.aspx");

	}

	// Navigate URL
	public static void nurl(String url) {

		d.navigate().to(url);
	}

	// navigate methods
	public static void navigate(String method) {
		if (method.equalsIgnoreCase("refresh")) {
			d.navigate().refresh();
		} else if (method.equalsIgnoreCase("back")) {
			d.navigate().back();
		} else if (method.equalsIgnoreCase("forward")) {
			d.navigate().forward();
		}

	}

	// get Attribute
	public static void getAttribute(WebElement element, String value) {
		element.getAttribute(value);
	}

}
