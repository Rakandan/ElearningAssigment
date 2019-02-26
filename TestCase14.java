package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Test;
import org.junit.Test;

public class TestCase14 {
	
@Test
	
	public void test () throws InterruptedException
	{
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\GaneshPalani\\eclipse-workspace\\ElearnAssignment\\Browser\\chromedriver.exe");
		
		//WebDriver driver ;
		
	System.setProperty("webdriver.gecko.driver","C:\\Users\\GaneshPalani\\eclipse-workspace\\ElearnAssignment\\Browser\\geckodriver.exe");
	
	WebDriver driver=new FirefoxDriver();
		
		driver= new ChromeDriver();
		
		driver.get("http://elearning.upskills.in/");
		
		driver.manage().window().maximize();
		
		//System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys("rk_student");
			
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("student");
		
		driver.findElement(By.xpath("//*[@id=\"formLogin_submitAuth\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"menuone\"]/ul[1]/li[2]/a")).click();
		
				
		driver.findElement(By.xpath("//*[@id=\"page\"]/div/div[1]/div/div/div[2]/h4/a")).click();
		
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
        driver.findElement(By.xpath("//*[@id=\"toolimage_1311\"]")).click();
		
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		
		
	//	Thread.sleep(600);
		
	
		driver.quit();
		
	}




}
