package seleniumtest;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


//LaunchChrome


public class Seleniumtest
{
	
	

	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;


@Test (priority=1)


public static void LaunchBrowser() throws Exception {
	
	ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
	ExtentReports extent = new ExtentReports();
	extent.attachReporter(htmlReporter);
	
	
	System.setProperty("webdriver.chrome.driver" ,"C:/Selinium/chromedriver_win32/chromedriver.exe");
	WebDriver  driver = new ChromeDriver();
    driver.get("https://www.vestrata.com");
    driver.manage().window().maximize();
    String title = driver.getTitle();
    
    //verifying page title with if condition
    
    // creates a toggle for the given test, adds all log events under it    
    ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
    
    if (title.equalsIgnoreCase("Home - Vestrata"))
    	System.out.print("Matched and your test is now Passed");
    else
    	System.out.print(title);
        System.out.print("-Test failed");
        
        // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
        
        extent.flush();
}
@Test (priority=2)


public static void amazon() {
	
	
	System.setProperty("webdriver.chrome.driver" ,"C:/Selinium/chromedriver_win32/chromedriver.exe");
	WebDriver  driver = new ChromeDriver();
    driver.get("https://www.amazon.in/");
    driver.manage().window().maximize();
    String tagname = driver.getTitle();
    
    //Identifying Web element by CSS selector method

   
    tagname = driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(5)")).getText();
    System.out.print(tagname);
  
    
    
    //verifying page title with if condition
    
  
}




//Main Method
public static void main(String[] args) {
	try {
		LaunchBrowser();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	amazon();
	//driver.quit();;
	//driver.close();
	
	
	
	
}
}


;