package org.automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;

public class AmazonAutomation extends BaseClass{
	
	@BeforeClass
	private void oneTime() {
		chromeDriverMng();
		launchUrl("https://www.amazon.in/");
		maximize();
	}
	@AfterClass
	private void tearDown() {
		System.out.println("Check it");
		driver.quit();
	}
	@Test
	private void searchIphone() {
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone");
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		driver.findElement(By.xpath("(//span[text()='New Apple iPhone 11 (64GB) - Purple'])[1]")).click();
		
		String parId = driver.getWindowHandle();
		Set <String> allwindID = driver.getWindowHandles();
		for (String eachwindId : allwindID) {
			if (!parId.equals(eachwindId)) {
				driver.switchTo().window(eachwindId);
			}
		}
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		

	}

}
