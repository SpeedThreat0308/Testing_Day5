package tp3;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ce3 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver drive=new ChromeDriver();	
		drive.get("https://demo.guru99.com/test/delete_customer.php");
		drive.manage().window().maximize();
		Thread.sleep(3000);
		WebElement cusid=drive.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
		cusid.sendKeys("401");
		Thread.sleep(5000);
		WebElement Submit=drive.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
		Submit.click();
		Alert alert=drive.switchTo().alert();
		alert.dismiss();
		Thread.sleep(3000);
		cusid.clear();
		cusid.sendKeys("402");
		Thread.sleep(3000);
		Submit.click();
		Alert alert1=drive.switchTo().alert();
		alert1.accept();
		Alert alert2=drive.switchTo().alert();
		String txt=alert2.getText();
		alert2.accept();
		System.out.println(txt);
		drive.close();
	}

}
