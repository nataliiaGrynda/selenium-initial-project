package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;;

public class TestCase1 {
  public static void main(String[] args) throws InterruptedException {

    /*
    Test Case 1: Validate ComfyElite Contact Us Page heading sectionGiven user navigates to “https://comfyelite.com/”
When user clicks on “CONTACT US” link in the header
Then user should be navigated to “CONTACT US” page
And user should be able to see ComfyElite logo
And user should be able to see heading2 as “High quality comfy pillows and accessories for
travel, office and home.” */
    WebDriver driver = Driver.getDriver();
    driver.get("https://comfyelite.com/");// navigates to the website

    WebElement contactUsButton = driver.findElement(By.xpath("(//a[text()='Contact Us'])[1]"));// finds contact us button
    if(contactUsButton.isDisplayed() && contactUsButton.isEnabled()) System.out.println("The contact button validation Passed");
    else System.out.println("The contact button validation is Failed");

  contactUsButton.click();// clicks on the button

  String expectedTitle = "Contact Us | COMFY ELITE";// validation if the actual title meets the expected title
  String actualTitle = Driver.getDriver().getTitle();

    if(expectedTitle.equals(actualTitle)) System.out.println("Expected title Validation is True");
    else System.out.println("Expected title validation is False");

    WebElement comfyEliteLogo = driver.findElement(By.id("n-48560"));// if the logo is displayed
    System.out.println(comfyEliteLogo.isDisplayed() ? "True" : "False");

    WebElement heading2Logo = driver.findElement(By.id("dynamic-tagline-48605"));//if second logo is displayed

   if(heading2Logo.isDisplayed()) System.out.println("The heading2 logo test PASSED");
  else System.out.println("The heading2 logo test FAILED");


  driver.quit();




  }
}
