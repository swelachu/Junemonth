package org.demo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\SeleniumLaunch\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://norsup.nuventuretech.com/login/");
		 WebElement userName = driver.findElement(By.id("email"));
		 userName.sendKeys("Swelachu@gmail.com");
		 WebElement password = driver.findElement(By.id("pass"));
		 password.sendKeys("12345");
		 WebElement login = driver.findElement(By.name("login"));
		 login.click();
		 System.out.println("swetha");
		 System.out.println("Kaviniya");
		
		
	}

}
