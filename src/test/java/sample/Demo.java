package sample;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Demo {
	public static void main(String[] args) throws Exception {
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\prasanth\\eclipse-workspace\\startLevelSam\\target\\driver\\msedgedriver.exe");
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		String url ="https://demo.guru99.com/test/drag_drop.html";
		driver.get(url);
		driver.manage().window().maximize();
		
//WebElement src = driver.findElement(By.xpath("//a[contains(text(),' BANK ')]"));
//WebElement target = driver.findElement(By.xpath("//li[@class='placeholder']"));
//
//WebElement sc1 =driver.findElement(By.xpath("//*[@id='fourth']/a"));
//WebElement target1=driver.findElement(By.xpath("//*[@id='amt7']/li"));
//
//WebElement sc2 =driver.findElement(By.xpath("//*[@id='credit1']/a"));
//WebElement target2=driver.findElement(By.xpath("//*[@id='loan']/li"));
//
//WebElement sc3 =driver.findElement(By.xpath("//*[@id='fourth'][2]/a"));
//WebElement target3=driver.findElement(By.xpath("//*[@id='amt8']/li"));
//
//
//Actions ac = new Actions(driver);
//ac.dragAndDrop(src, target).perform();
//ac.dragAndDrop(sc1, target1).perform();
//ac.dragAndDrop(sc2, target2).perform();
//ac.dragAndDrop(sc3, target3).perform();
//
//TakesScreenshot tksc = (TakesScreenshot)driver;
//File scs2 = tksc.getScreenshotAs(OutputType.FILE);
//File fl2 = new File("C:\\Users\\prasanth\\eclipse-workspace\\startLevelSam\\src\\test\\resources.png");
//FileUtils.copyFile(scs2, fl2);
//
//	}
//	

}}
