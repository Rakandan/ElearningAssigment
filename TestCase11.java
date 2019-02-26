package testcase;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase11 {
	
	@Test
	
	public void test () throws InterruptedException
	{
		
			//	System.setProperty("webdriver.chrome.driver","C:\\Users\\GaneshPalani\\eclipse-workspace\\ElearnAssignment\\Browser\\chromedriver.exe");
		
			//  WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\GaneshPalani\\eclipse-workspace\\ElearnAssignment\\Browser\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
				
		driver.get("http://elearning.upskills.in/");
		
		driver.manage().window().maximize();
		
		//System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys("rk_student");
			
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("student");
		
		driver.findElement(By.xpath("//*[@id=\"formLogin_submitAuth\"]")).click();
				
		driver.findElement(By.xpath("//*[@id=\"profileCollapse\"]/div/ul/li[4]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"profile_password0\"]")).sendKeys("student");
		
		driver.findElement(By.xpath("//*[@id=\"password1\"]")).sendKeys("student");
		
		driver.findElement(By.xpath("//*[@id=\"profile_password2\"]")).sendKeys("student");
		
		//driver.findElement(By.xpath("//*[@id=\"profile_password2\"]")).sendKeys("student");
		
		driver.findElement(By.xpath("//*[@id=\"profile_apply_change\"]")).click();
		
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		
		Thread.sleep(600);
		
	
		driver.quit();
	}

}
