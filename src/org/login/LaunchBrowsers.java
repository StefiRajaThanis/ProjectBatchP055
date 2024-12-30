package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowsers {

	public static void main(String[] args) {

		// To configure browser
		WebDriver driver = new ChromeDriver();

		// To launch url
		driver.get("https://www.facebook.com/");

		// To maximize the windows
		driver.manage().window().maximize();

		WebElement findElement = driver.findElement(By.linkText("Forgotten password?"));
		findElement.click();
	}

}
