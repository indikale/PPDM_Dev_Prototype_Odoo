package rafiapplication;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class democlass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://localhost:8069/web#action=441&model=ppdmmodule.websitestable&view_type=list&cids=1&menu_id=312");   
        driver.manage().window().maximize();
        driver.findElement(By.id("login")).sendKeys("mohammedrafi.shaik@leelaconsultancy.co.uk"); 
        driver.findElement(By.id("password")).sendKeys("Furqaan$1314"); 
        driver.findElement(By.xpath("//*[@id=\"wrapwrap\"]/main/div/form/div[3]/button")).click();
        		Thread.sleep(1000);
        driver.getTitle();
	    driver.close();
	
	}

}
 