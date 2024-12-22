package test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest{
	@Test
	public void seleniumTest() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testpages.eviltester.com/styled/search");
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("Saksham Singla");
		Thread.sleep(10000);
		driver.close();
	}
}