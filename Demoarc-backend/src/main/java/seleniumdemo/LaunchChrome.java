package seleniumdemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//LaunchChrome


public class LaunchChrome
{
static WebDriver driver;

//@Test

public static void LaunchBrowser() {
	
	
	System.setProperty("webdriver.chrome.driver" ,"C:/Selinium/chromedriver_win32/chromedriver.exe");
	WebDriver  driver = new ChromeDriver();
    driver.get("https://www.vestrata.com");
    driver.manage().window().maximize();
    String title = driver.getTitle();
    
    //verifying page title with if condition
    
    if (title.equalsIgnoreCase("Home - Vestrata"))
    	System.out.print("Matched and your test is now Passed");
    else
    	System.out.print(title);
        System.out.print("-Test failed");
}






//Main Method
public static void main(String[] args) {
	LaunchBrowser();

	//driver.quit();
	//driver.close();
}
}


;