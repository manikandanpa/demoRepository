import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class IQVIA {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Hexaware\\STM Client\\Drivers\\chromedriver.exe");
		
		ChromeOptions o=new ChromeOptions();
		o.addArguments("--disable-extensions");
		o.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(o);
		driver.manage().window().maximize();
		driver.get("https://test.salesforce.com/");
		driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("Manikandan.Parthiban@iqvia.com.uat");
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("Welcome@123");
		driver.findElement(By.xpath(".//*[@id='Login']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("https://quintilesims--uat.lightning.force.com/one/one.app#/sObject/Opportunity/list?filterName=00B0t000000YkcfEAC");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//table[contains(@class,'slds-table')])[1]/tbody/tr[1]/td[2]/span/span/label/span[1]")).click();
		driver.findElement(By.xpath("(//table[contains(@class,'slds-table')])[1]/tbody/tr[2]/td[2]/span/span/label/span[1]")).click();
		driver.findElement(By.xpath("(//div[text()='Mass Edit'])[1]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//System.out.println(driver.findElement(By.xpath("//div[@class='pbBody']//table[@class='list']/tbody/tr[1]/td[4]")).getText());
		new Select(driver.findElement(By.xpath("//select[@id='calYearPicker']"))).selectByVisibleText("2020");
		try {
		Thread.sleep(100000);
		driver.get("https://quintilesims--uat.lightning.force.com/one/one.app#/sObject/Opportunity/list?filterName=00B6A000003MmhVUAS");

		
		}
		catch (Exception e) {
		}
	}


}
