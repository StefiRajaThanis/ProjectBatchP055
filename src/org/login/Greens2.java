package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens2 {
	
	public static void main(String[] args) {
		
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium1stDay\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/");
		
		WebElement element = driver.findElement(By.xpath("/html/body/app-root/app-header/nav/div/div[2]/div[1]/a[1]"));
		element.click();
		
		WebElement element2 = driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[4]/app-menu/div/footer/a"));
		element2.click();
		
	}

}
