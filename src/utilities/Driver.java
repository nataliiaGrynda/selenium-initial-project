package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
  private Driver(){// default constructor

  }
  private static WebDriver driver;// instant variables

  public static WebDriver getDriver(){// setting up driver
    if(driver == null){
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\roman\\IdeaProjects\\selenium_initial_project\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    return driver;
  }

  public static void quitDriver() throws InterruptedException {
    try{
      Thread.sleep(3000);
    }
    catch (Exception e){
      e.printStackTrace();
    }
    if(driver != null){
      driver.manage().deleteAllCookies();
      driver.quit();
      driver = null;
    }
  }




}
