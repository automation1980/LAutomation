package com.LinkedInTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedInBase 
	{
		public static WebDriver driver;
		
		public void linkedInLogin() throws InterruptedException
			{
			
				System.setProperty("webdriver.chrome.driver","C:\\rickywork\\software\\chromedriver.exe");
				driver= new ChromeDriver();
			
				driver.get("https://www.linkedin.com/");
				driver.manage().window().maximize();
			
				driver.findElement(By.xpath("//*[@id=\"login-email\"]")).sendKeys("gaurav.ricky.sharma@gmail.com");
				Thread.sleep(2000);
						
				driver.findElement(By.xpath("//*[@id=\"login-password\"]")).sendKeys("Momdad9786");
				Thread.sleep(2000);
				
				driver.findElement(By.id("login-submit")).click();
			
				
				System.out.println("Successfuly opened the window");
			}
		
		public void linkedinobjects() throws InterruptedException
			{
				new MyNetworkPage().click();
				new JobsPage().click();
				new MessagingPage().click();
				new NotificationsPage().click();
			}
		
		protected WebElement findElement(WebElement parentControl ,String controlName) {
			WebElement control = null;
			
			
			if(parentControl == null) {
				
				control = driver.findElement(By.xpath(controlName));
				return control;
			}
			
			else {
				
				control = parentControl.findElement(By.xpath(controlName));
				return control;
			}
			
			
			/*
			
		
				control = parentControl.findElement(By.linkText(controlName));
				if(control != null)
					return control;
			
			
			
				control = parentControl.findElement(By.id(controlName));
				if(control != null)
					return control;

			
				control = parentControl.findElement(By.className(controlName));
				if(control != null)
					return control;
			
			*/
			
			
			//return control;
			
			
			
			
		}
				
				
				
			
				
	}
	
	
	