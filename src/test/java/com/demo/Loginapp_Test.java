package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginapp_Test {

	WebDriver driver;

	@Test
	public void f() {
		driver.get("http://demowebshop.tricentis.com/login");
		WebElement Username = driver.findElement(By.id("Email"));
		Username.sendKeys("hariharansekar2397@gmail.com");
		WebElement Password = driver.findElement(By.id("Password"));
		Password.sendKeys("Qwerty@123");
		WebElement btnlogin = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
		btnlogin.click();
		//String a = driver.findElement(By.linkText("hariharansekar2397@gmail.com")).getText();
		//String expected = "hariharansekar2397@gmail.com";
		// Assert.assertEquals(a,expected);
		// System.out.println(a);

	}

	@Test
	public void Logout() {
		driver.findElement(By.linkText("Log out")).click();

	}

	@BeforeClass
	public void beforeClass() {
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.get("http://demowebshop.tricentis.com/login");
	}

	@AfterClass
	public void afterClass() {
		driver.close();
		System.out.println("Success");

	}

}
