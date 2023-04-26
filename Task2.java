package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        ChromeOptions co=new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(co);
        driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
        
        WebElement fname=driver.findElement(By.id("input-firstname"));
        fname.sendKeys("Kamalesh");
        
        WebElement lname=driver.findElement(By.id("input-lastname"));
        lname.sendKeys("G");
        
        WebElement email=driver.findElement(By.id("input-email"));
        email.sendKeys("kamaleshj.com");
        
        WebElement pwd=driver.findElement(By.id("input-password"));
        pwd.sendKeys("@unique03");
        
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)","");
        WebElement nbutton=driver.findElement(By.id("input-newsletter-no"));
        nbutton.click();
	}


}
