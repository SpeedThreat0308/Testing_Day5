package tp4;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ce4 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver drive=new ChromeDriver();	
		drive.get("https://www.abhibus.com/bus-ticket-booking");
		drive.manage().window().maximize();
		Thread.sleep(3000);
		WebElement leaving =drive.findElement(By.xpath("//*[@id=\"source\"]"));
		leaving.sendKeys("Chennai");
		Thread.sleep(3000);
		WebElement GoingTo=drive.findElement(By.xpath("//*[@id=\"destination\"]"));
		GoingTo.sendKeys("Goa");
		Thread.sleep(3000);
		Actions a=new Actions(drive);
		WebElement Calen=drive.findElement(By.xpath("//*[@id=\"datepicker1\"]"));
		Calen.click();
		Thread.sleep(3000);
		WebElement Dates=drive.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr[3]/td[1]/a"));
		Dates.click();
		Thread.sleep(5000);
		drive.close();
	}

}
