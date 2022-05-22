package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase5 {
  public static void main(String[] args) throws InterruptedException {

    /*
    Test Case 5: Validate ComfyElite Contact Us page "Sign up for our email list
for updates, promotions, and more." CheckboxGiven user navigates to “https://comfyelite.com/”

When user clicks on “CONTACT US” link in the header
Then user should be navigated to “CONTACT US” page
And validate the "Sign up for our email list for updates, promotions, and more." checkbox
Note: Checkbox validation includes checkbox being selected and deselected by
user
     */
    WebDriver driver = Driver.getDriver();
    driver.get("https://comfyelite.com/");

    WebElement contactUsLink = driver.findElement(By.xpath("(//a[text()='Contact Us'])[1]"));
    if(contactUsLink.isDisplayed()) System.out.println("The contact us link validation is Passed");
    else System.out.println("The contact us link validation is Failed");

    contactUsLink.click();

   WebElement signUpFotEmailListForUpdates = driver.findElement(By.xpath("//p[@data-ux='Text']"));
    if(signUpFotEmailListForUpdates.isDisplayed()) System.out.println("Sign up for our email list for updates, promotions, and more validation is Passed");
  else System.out.println("Sign up for our email list for updates, promotions, and more validation is Failed");

  WebElement checkBox = driver.findElement(By.xpath("//label[@data-ux='InputCheckbox']"));
   checkBox.click();
   Thread.sleep(2000);
    System.out.println(checkBox.isSelected()? "Passed" : "Failed");
  driver.quit();


  }
}
