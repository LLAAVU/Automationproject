package com.facebbook.signup;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\laviworkspace\\selenium workspace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++)
		{
			  
		}
		
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("lavanya");

		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("lavu639dc");
		
		driver.findElement(By.xpath("//*[@id=\"u_0_b_lG\"]")).click();
		
		driver.close();
		
		
		
	}

}
