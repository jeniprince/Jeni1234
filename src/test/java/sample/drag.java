package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

import com.sun.tools.javac.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;

public class drag {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
		
		org.openqa.selenium.WebElement drop=driver.findElement(By.xpath("//select[@id=\"first\"]"));
		Select s=new Select(drop);
		s.selectByIndex(2);
		s.selectByValue("Google");
		s.selectByVisibleText("Bing");
		
	//	List<WebElement>options=s.getOptions();
	//	for(int i=0;i<options.size();i++) {
	//		WebElement actual=options.get(i);
	//		String text=actual.getText();
	//		System.out.println(text);
			
			List<WebElement>options1=s.getOptions();
			for(int j=options.size()-1;j>=0;j--) {
				WebElement actual=options1.get(j);
				String text1=actual.getText();
				System.out.println(text1);
				
		}
				
		
		
		
	}

}
