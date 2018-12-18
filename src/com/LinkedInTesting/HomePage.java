package com.LinkedInTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage
	{
		WebDriver driver= new ChromeDriver();
	
		public void click()
			{
				driver.findElement(By.xpath("//*[@id=\"feed-tab-icon\"]")).click();
			}

	}
