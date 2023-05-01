package tp2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ce2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver drive=new ChromeDriver();	
		drive.get("https://jqueryui.com/droppable/");
		drive.manage().window().maximize();
		drive.switchTo().frame(0);
		Actions a=new Actions(drive);
		WebElement source=drive.findElement(By.id("draggable"));
		WebElement destination=drive.findElement(By.id("droppable"));
		a.dragAndDrop(source,destination).build().perform();		
		drive.close();
	}

}
