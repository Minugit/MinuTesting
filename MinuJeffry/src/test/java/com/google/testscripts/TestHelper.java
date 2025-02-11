package com.google.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Utilities.*;

import io.github.bonigarcia.wdm.WebDriverManager;
public class TestHelper {
	WebDriver driver;
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
	  FileUtility fu=new FileUtility();
	  System.setProperty("webdriver.edge.driver",fu.getEdgeDriverPath());
	  driver=new EdgeDriver();
	  //WebDriverManager.edgedriver().setup();
	  //driver=new EdgeDriver();
	  driver.get("https://www.google.co.in/");
	  WebElement wb=driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
	  wb.sendKeys("Apple");
	  wb.sendKeys(Keys.RETURN);
  }

  @AfterMethod
  public void afterMethod() {
  }

}
