package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Test;
import org.junit.Test;

public class TestCase13 {
	
@Test
	
	public void test () throws InterruptedException
	{
		
	 //	System.setProperty("webdriver.chrome.driver","C:\\Users\\GaneshPalani\\eclipse-workspace\\ElearnAssignment\\Browser\\chromedriver.exe");
	// WebDriver driver ;
	   
	System.setProperty("webdriver.gecko.driver","C:\\Users\\GaneshPalani\\eclipse-workspace\\ElearnAssignment\\Browser\\geckodriver.exe");
	
	WebDriver driver=new FirefoxDriver();
		
		driver= new ChromeDriver();
		
		driver.get("http://elearning.upskills.in/");
		
		driver.manage().window().maximize();
		
		//System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys("rk_student");
			
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("student");
		
		driver.findElement(By.xpath("//*[@id=\"formLogin_submitAuth\"]")).click();
		
		
		
		if(	driver.findElement(By.xpath("//*[@id=\"course_block\"]/div[1]/h4/a")).isEnabled()||driver.findElement(By.xpath("//*[@id=\"course_block\"]/div[1]/h4/a")).isDisplayed())
		{
			
			System.out.println("Entering IF Block");
			
			//driver.findElement(By.xpath("//*[@id=\"course_block\"]/div[1]/h4/a")).click();
			
			driver.findElement(By.xpath("//*[@id=\"courseCollapse\"]/div/ul/li[3]/a")).click();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//*[@id=\"content-section\"]/div/div[2]/div[1]/div/div/div[1]/form/div/input")).sendKeys("selenium");
			
			driver.findElement(By.xpath("//*[@id=\"content-section\"]/div/div[2]/div[1]/div/div/div[1]/form/div/div/button")).click();
			
	
				
		}
		
		else
		{
			System.out.println("Entering Else Block");
			
			driver.findElement(By.xpath("//*[@id=\"homepage-course\"]/div/a\r\n")).click();
			
			driver.findElement(By.xpath("//*[@id=\"content-section\"]/div/div[2]/div[1]/div/div/div[1]/form/div/input")).sendKeys("Java");
			
			driver.findElement(By.xpath("//*[@id=\"content-section\"]/div/div[2]/div[1]/div/div/div[1]/form/div/div/button")).click();
			
			driver.findElement(By.xpath("//*[@id=\"content-section\"]/div/div[2]/div[2]/div/div[1]/div/div[2]/div[4]/div[2]/div/a")).click();
		}
		
		
		if (driver.findElement(By.xpath("//*[@id=\"register\"]")).isDisplayed())
			
			
		{
			System.out.println("Already Subscribed");
			
			driver.findElement(By.xpath("//*[@id=\"content-section\"]/div/div[2]/div[2]/div/div[2]/div/div[2]/div[4]/div[2]/div/a")).click();
			
			driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
			
			String Output =driver.findElement(By.xpath("//*[@id=\"content-section\"]/div/div[2]")).getText();
			
			System.out.print(Output);
		}
		
		else
		{
			System.out.println("New Subscribe");
			
			driver.findElement(By.xpath("//*[@id=\"content-section\"]/div/div[2]/div[2]/div/div[1]/div/div[2]/div[4]/div[2]/div/a")).click();
			
			driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
			
			String Output =driver.findElement(By.xpath("//*[@id=\"content-section\"]/div/div[2]")).getText();
			
			System.out.print(Output);
		}
		
		
		
		
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		
	//	Thread.sleep(600);
		
		driver.quit();
		
	
		
		
	}

}
