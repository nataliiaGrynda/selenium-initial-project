package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase3 {
  public static void main(String[] args) {

  /*
 Test Case 3: Validate ComfyElite Contact Us page "Contact Us" "SEND
US A MESSAGE" form headingsGiven
user navigates to “https://comfyelite.com/”
When user clicks on “CONTACT US” link in the header
Then user should be navigated to “CONTACT US” page
And user should be able to see heading2 as "Contact Us"
And user should be able to see heading4 as "SEND US A MESSAGE"
   */

    WebDriver driver = Driver.getDriver();
    driver.get("https://comfyelite.com/");

    WebElement contactUsLink = driver.findElement(By.xpath("(//a[text()='Contact Us'])[1]"));
    if(contactUsLink.isDisplayed()) System.out.println("The contact us link validation is Passed");
    else System.out.println("The contact us link validation is Failed");

    contactUsLink.click();

    WebElement heading2 = driver.findElement(By.xpath("//h2[@data-aid='CONTACT_SECTION_TITLE_REND']"));
    if(heading2.isDisplayed()) System.out.println("The heading 2 validation is PASSED");
    else System.out.println("The heading 2 validation is PASSED");


    WebElement heading4 = driver.findElement(By.xpath("//h4[@data-aid='CONTACT_FORM_TITLE_REND']"));
    if(heading4.isDisplayed()) System.out.println("The heading 4 validation is Passed");
    else System.out.println("The heading 4 validation validation is Failed");

   driver.quit();





  }
}
