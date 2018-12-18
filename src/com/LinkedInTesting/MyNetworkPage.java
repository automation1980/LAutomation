package com.LinkedInTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyNetworkPage  extends LinkedInBase
	{
		
		
		public void click() throws InterruptedException
			{
				driver.findElement(By.id("mynetwork-tab-icon")).click();
				Thread.sleep(2000);
			
				driver.findElement(By.xpath("//*[@id=\"feed-tab-icon\"]")).click();
			}

	}
