package demotest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class demotest 

{

	
	public static void main(String[] args)    throws InterruptedException {
		
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		
		 // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        // creates a toggle for the given test, adds all log events under it    
        ExtentTest test1 = extent.createTest("Mylogintest", "odoo page and with login details");
		
		ChromeDriver driver = new ChromeDriver();
		
		// log(Status, details)
        //test1.log(Status.INFO, "starting my testcase)");
        
        driver.get("http://localhost:8069/web#action=441&model=ppdmmodule.websitestable&view_type=list&cids=1&menu_id=312");   
        
        driver.manage().window().maximize();
        test1.pass("Navigated to localhost odoo URL");
        driver.findElement(By.id("login")).sendKeys("mohammedrafi.shaik@leelaconsultancy.co.uk"); 
        driver.findElement(By.id("password")).sendKeys("Furqaan$1314"); 
        driver.findElement(By.xpath("//*[@id=\"wrapwrap\"]/main/div/form/div[3]/button")).click();
        		Thread.sleep(1000);
        driver.close();
        driver.quit();
        test1.pass("closed the the browser");
        test1.pass("Test completed");
        extent.flush();
	}

}

