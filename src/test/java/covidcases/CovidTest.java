package covidcases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CovidTest {
	public static void main(String[] args) {
		
	
	WebDriver driver;

	//driver=new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "/Users/swath/eclipse-workspace/PageAutomation_NaveenAutomationLabs/ExternalJars/chromedriver.exe");

driver= new ChromeDriver();
driver.get("https://www.covid19india.org/");

//JavascriptExecutor js=JavascriptExecutor(driver);


WebElement stateheader=driver.findElement(By.xpath("//div[contains(text(),'State/UT')]"));
WebElement statevalue=driver.findElement(By.xpath("//div[@class='state-name fadeInUp']"));
WebElement confirmedcases=driver.findElement(By.xpath("//div[contains(text(),'Confirmed')]"));
WebElement confirmedvalues=driver.findElement(By.xpath("//div[@class='delta is-confirmed']//parent::div[@class='cell statistic']/div[2]"));

ArrayList<String> st1=new ArrayList<String>();
ArrayList<String> st2=new ArrayList<String>();


confirmedcases.click();

List<WebElement> ele=driver.findElements(By.xpath("//div[@class='delta is-confirmed']//parent::div[@class='cell statistic']/div[2]"));
for(WebElement we1: ele)
{
	st1.add(we1.getText());
	
}
System.out.println(st1);
	
	}

}
