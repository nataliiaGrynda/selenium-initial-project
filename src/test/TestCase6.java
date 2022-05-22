package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase6 {
  public static void main(String[] args) {
    /*
Test Case 6: Validate ComfyElite Contact Us page "SEND" buttonGiven user navigates to “https://comfyelite.com/”
When user clicks on “CONTACT US” link in the header
Then user should be navigated to “CONTACT US” page
And validate "SEND" button is displayed and clickable
And validate button text is displayed as “SEND”
 */
    WebDriver driver = Driver.getDriver();
    driver.get("https://comfyelite.com/");

    WebElement contactUsLink = driver.findElement(By.xpath("(//a[text()='Contact Us'])[1]"));
    if(contactUsLink.isDisplayed()) System.out.println("The contact us link validation is Passed");
    else System.out.println("The contact us link validation is Failed");

    contactUsLink.click();

    WebElement sendButton = driver.findElement(By.xpath("//button[@data-aid='CONTACT_SUBMIT_BUTTON_REND']"));
    if (sendButton.isDisplayed() && sendButton.isEnabled()) System.out.println("The send button is validation PASSED");
    else System.out.println("The send button is validation Failed");



     if(sendButton.getText().equals("SEND")) System.out.println("Send button text validation is Passed");
   else System.out.println("Send button text validation is Failed");
    //String actualTxt =  Driver.getDriver().findElement(By.xpath("//button[text()='Send']")).getText();
//    String expectedTxt = "SEND";
//    if(expectedTxt.equals(actualTxt)){
//      System.out.println("Test passed");
//    }else {
//      System.out.println("Test failed");
//    }

   driver.quit();

  }
}
