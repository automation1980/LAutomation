package com.LinkedInTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JobsPage extends LinkedInBase
	{
		
		
		public void click() throws InterruptedException
			{
				driver.findElement(By.xpath("//*[@id=\"jobs-tab-icon\"]")).click();
				Thread.sleep(2000);
			
				driver.findElement(By.xpath("//*[@id=\"feed-tab-icon\"]")).click();
			}

	}
