package com.LinkedInTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NotificationsPage  extends LinkedInBase
	{
		
		
		public void click() throws InterruptedException
			{
				driver.findElement(By.xpath("//*[@id=\"notifications-tab-icon\"]")).click();
				Thread.sleep(4000);
			
				driver.findElement(By.xpath("//*[@id=\"feed-tab-icon\"]")).click();
			
				WebElement divControl = this.findElement(null,"nav-settings__dropdown");
				
				divControl.click();
				
				
				
				//WebElement signout =divControl.findElement(By.linkText("Sign out"));
				
				WebElement signout = this.findElement(divControl,"Sign out");
				
				signout.click();
				
				//Select meobject = new Select (me_dropdown);
				
				//meobject.selectByIndex(6);
				//(By.xpath("//*[@id=\"nav-settings__dropdown-trigger\"]/div/span[2]/li-icon/svg/path"));
				
				
			}

	}
