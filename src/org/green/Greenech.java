package org.green;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greenech {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Greentech\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://adactinhotelapp.com/");
	
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	
	
	Robot robot = new Robot();
	
robot.keyPress(KeyEvent.VK_TAB);
robot.keyRelease(KeyEvent.VK_TAB);
robot.keyPress(KeyEvent.VK_TAB);
robot.keyRelease(KeyEvent.VK_TAB);
robot.keyPress(KeyEvent.VK_TAB);
robot.keyRelease(KeyEvent.VK_TAB);

Thread.sleep(2000);
	robot.keyPress(KeyEvent.VK_A);
	robot.keyRelease(KeyEvent.VK_A);
	robot.keyPress(KeyEvent.VK_R);
	robot.keyRelease(KeyEvent.VK_R);
	robot.keyPress(KeyEvent.VK_U);
	robot.keyRelease(KeyEvent.VK_U);
	robot.keyPress(KeyEvent.VK_N);
	robot.keyRelease(KeyEvent.VK_N);
	
	Thread.sleep(2000);
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	
	Thread.sleep(2000);
	robot.keyPress(KeyEvent.VK_1);
	robot.keyRelease(KeyEvent.VK_1);
	robot.keyPress(KeyEvent.VK_1);
	robot.keyRelease(KeyEvent.VK_1);
	robot.keyPress(KeyEvent.VK_1);
	robot.keyRelease(KeyEvent.VK_1);
	robot.keyPress(KeyEvent.VK_1);
	robot.keyRelease(KeyEvent.VK_1);
	
	Thread.sleep(2000);
	
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	
	
	
	

//	WebElement lnkcourse = driver.findElement(By.xpath("//a[contains(@id,'digital-header-nav-link-head-1')]"));
//	Actions actions = new Actions(driver);
	//actions.moveToElement(lnkcourse).perform();

	
	
//	WebElement txtpara = driver.findElement(By.xpath("//div[contains(@id,'collapse661')]"));
	//String str = txtpara.getText();
	//System.out.println(str);*/
	}

}
