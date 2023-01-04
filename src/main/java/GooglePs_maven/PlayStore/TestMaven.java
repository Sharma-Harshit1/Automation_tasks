package GooglePs_maven.PlayStore;

import java.util.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v107.log.Log;
import org.testng.annotations.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestMaven {
	private static final Logger log = LogManager.getLogger(TestMaven.class);
	ChromeDriver driver = new ChromeDriver();
	@BeforeTest
	public void Launch_Browser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\harshit.sharma\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver.get("https://play.google.com/store/games");
		driver.manage().window().maximize();
	}
	@Test
	public void Top_Movies() {
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[span[text()='Movies']]")).click();
//		List<WebElement> Harshit =driver.findElements(By.xpath("//div[div[div[@aria-label='Rated 4.5 stars out of five stars'] and child::span[text()='₹50.00']]]//div[1]//child::span[1]"));
//		//List<WebElement> Harshit =driver.findElements(By.xpath("//div[contains(@aria-label, 'Rated 4.1 stars out of five stars')] and child::span[text()='₹50.00']]]//div[1]//child::span[1]"));
//		for (WebElement WE:Harshit) {
//			String name=WE.getText();
//			if (name.contains("4.5"))
//			{
//				System.out.println("");
//			}
//			else {
//				System.out.println(name);
//				log.info("Movies:"+ name);
//			}
//		}
	}
	@AfterTest
			public void terminateBrowser(){
			driver.close();
			}
	
//	driver.findElement(By.xpath("//span[text()='Top movies']")).click();
//	List<WebElement> Movies= driver.findElements(By.xpath("//div[@aria-label=\"Rated 4.5 stars out of five stars\" and @style='display: inline-flex; align-items: center;']//parent::div//preceding-sibling::div//span[@class='DdYX5']")) ;
//	System.out.println(Movies.size());
//	
//	for(WebElement WE:Movies)
//	{
//		String name=WE.getText();
//		System.out.println(name);
//	}
	
	//WebElement TopChart= driver.findElement(By.xpath("//div[div[div[@aria-label='Rated 4.5 stars out of five stars'] and child::span[text()='₹50.00']]]"));
	//String finaal= TopChart.findElement(By.xpath("//div[1]//child::span[1]")).getText();
	//System.out.println(TopChart);
	//String Mo= driver.findElement(By.xpath("//div[@aria-label='Rated 4.5 stars out of five stars' and @style='display: inline-flex; align-items: center;']")).toRightof(By.xpath("//following::span[text()='₹50.00']"));
	//List<WebElement> Movies1 = Movies2;
	//System.out.println(Movies1);
	//List<WebElement> Movies=driver.findElements(By.xpath("//div[@aria-label=\"Rated 4.5 stars out of five stars\" and @style='display: inline-flex; align-items: center;']//parent::div//preceding-sibling::div//span"));
//	List<WebElement> Harshit =driver.findElements(By.xpath("//div[div[div[@aria-label='Rated 4.5 stars out of five stars'] and child::span[text()='₹50.00']]]//div[1]//child::span[1]"));
//	for (WebElement WE:Harshit) {
//		String name=WE.getText();
//		if (name.contains("4.5"))
//		{
//			System.out.println(" ");
//		}
//		else {
//			System.out.println(name);
//		}
	

}