package com.miniproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ProjectDay1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\USER\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		//Enter userid and password and login
		driver.get("http://www.demo.guru99.com/V4/");
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr392792");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("zyhYjyz");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
	}

}
