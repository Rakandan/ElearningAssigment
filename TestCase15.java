package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.Test;
import org.junit.Test;

public class TestCase15 {

	
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
		
		driver.findElement(By.xpath("//*[@id=\"menuone\"]/ul[2]/li[2]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"logout_button\"]")).click();
		
				
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Select Logout = new Select(driver.findElement(By.xpath("//*[@id=\"menuone\"]/ul[2]/li[2]/a")));
	
		//Logout.selectByValue("Logout");
		
		driver.quit();
		
	}
}
