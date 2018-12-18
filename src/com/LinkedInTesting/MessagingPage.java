package com.LinkedInTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MessagingPage  extends LinkedInBase
	{
				
		public void click() throws InterruptedException
			{
				//driver.findElement(By.xpath("//*[@id=\"messaging-tab-icon\"]")).click();
				
				WebElement signout = super.findElement(null,"\"//*[@id=\\\"messaging-tab-icon\\\"]\"");
				Thread.sleep(2000);
			
				driver.findElement(By.xpath("//*[@id=\"feed-tab-icon\"]")).click();
			}

	}
