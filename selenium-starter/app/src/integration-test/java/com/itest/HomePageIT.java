package com.itest;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePageIT {
	
	protected WebDriver driver;
	
	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		driver.get("http://localhost:8080/web/");
	}
	
	@Test
	@Category(IntegrationTest.class)
	public void testWebTable() {
		assertEquals(driver.getCurrentUrl(), "http://localhost:8080/web/");
		assertEquals(driver.findElement(By.tagName("body")).getText(), "Hello");
    }
	
	@After
	public void tearDown() {
		driver.close();
	}
} 