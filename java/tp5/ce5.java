package tp5;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ce5 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver drive=new ChromeDriver(co);	
		drive.get("https://www.google.com/");
		drive.manage().window().maximize();
		
		//FirefoxOptions fo=new FirefoxOptions();
		//fo.addArguments("--remote-allow-origins=*");
		//WebDriverManager.firefoxdriver().setup();
		WebDriver drive1=new ChromeDriver(co);	
		drive1.get("https://www.google.com/");
		drive1.manage().window().maximize();
		
		//EdgeOptions ed=new EdgeOptions();
		//ed.addArguments("--remote-allow-origins=*");
		//WebDriverManager.edgedriver().setup();
		WebDriver drive2=new ChromeDriver(co);	
		drive2.get("https://www.google.com/");
		drive2.manage().window().maximize();
		
		drive.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Apple");
		Thread.sleep(3000);
		drive.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
		Thread.sleep(3000);
	    drive1.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Selenium");
	    Thread.sleep(3000);
	    drive1.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
	    Thread.sleep(3000);
	    drive2.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Cucumber");
		Thread.sleep(3000);
	    drive2.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
		Thread.sleep(3000);
		
		System.out.println(drive.getWindowHandles());
		System.out.println(drive1.getWindowHandles());
		System.out.println(drive2.getWindowHandles());
		System.out.println(drive.getTitle());
		System.out.println(drive1.getTitle());
		System.out.println(drive2.getTitle());
		drive.close();
	}

}
