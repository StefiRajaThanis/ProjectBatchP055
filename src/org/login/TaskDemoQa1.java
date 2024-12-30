package org.login;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskDemoQa1 {
	public static void main(String[] args) {
		
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium1stDay\\driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/webtables");
	
	WebElement table = driver.findElement(By.xpath("//div[@class='rt-table']"));
	List<WebElement> age = driver.findElements(By.xpath("//div[@class='rt-td'][3]"));
	
	for (int i = 0; i < age.size(); i++) {
		WebElement ages = age.get(i);
		String text = ages.getText();
		System.out.println(text);
	}
	List<Integer> li = new LinkedList<Integer>();
	li.add(39);
	li.add(45);
	li.add(29);
	System.out.println(li);
	
	TreeSet<Integer> s = new TreeSet<Integer>();
	s.addAll(li);
	System.out.println(s);
	
	System.out.println(s.first());
	System.out.println(s.last());
	Integer min =s.first();
	System.out.println("The minumum age is: "+min);
	
	WebElement minsalary = driver.findElement(By.xpath("//div[text()='29']/following-sibling::div[2]"));
	String text = minsalary.getText();
	System.out.println("The Minimum age of Salary is: "+text);
	
	
	
	

}
}