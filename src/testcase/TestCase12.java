package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Test;
import org.junit.Test;

public class TestCase12 {
	
	@ Test
	
	public void test () throws InterruptedException
	{
	
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\GaneshPalani\\eclipse-workspace\\ElearnAssignment\\Browser\\chromedriver.exe");
	
	//WebDriver driver = new ChromeDriver();
		
      System.setProperty("webdriver.gecko.driver","C:\\Users\\GaneshPalani\\git\\ElearningAssigment1\\Browser\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
	
	driver.get("http://elearning.upskills.in/");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//*[@id=\"login_block\"]/div/ul/li[2]/a")).click();
	
	driver.findElement(By.xpath("//*[@id=\"lost_password_user\"]")).sendKeys("rk_student");
	
	driver.findElement(By.name("submit")).click();
	
	String Output=driver.findElement(By.xpath("/html/body/div/section/div/div[2]/div[2]/div/div")).getText();
	
	System.out.println(Output);
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.quit();
	
	}
}
