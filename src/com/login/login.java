package com.login;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class login  {

public void login() {
	WebDriver driver=new ChromeDriver();
System.setProperty("webdriver.chrome.driver", "C:\\Users\\bvuttur\\Downloads\\chromedriver_win32\\chromedriver.exe");

driver.manage().window().maximize();
driver.get("http://automationpractice.com/index.php");
WebElement username=driver.findElement(By.id("email_ID"));
WebElement password=driver.findElement(By.id("password"));
WebElement login=driver.findElement(By.name("commit"));
username.sendKeys("abc@gmail.com");
password.sendKeys("your_password");
login.click();


}
}