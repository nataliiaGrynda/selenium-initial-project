package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase2 {
  public static void main(String[] args) {

    /*
    Test Case 2: Validate ComfyElite Contact Us page "Connect With Us"
sectionGiven user navigates to “https://comfyelite.com/”
When user clicks on “CONTACT US” link in the header
Then user should be navigated to “CONTACT US” page
And user should be able to see heading1 as "Connect With Us"
And user should be able to see “Facebook” icon and hyperlink reference for it should be
“https://www.facebook.com/103179127717601”
And user should be able to see “Instagram” icon and hyperlink reference for it should be
“https://www.instagram.com/comfyelite”
     */

    WebDriver driver = Driver.getDriver();
    driver.get("https://comfyelite.com/");

    WebElement contactUsLink = driver.findElement(By.xpath("(//a[text()='Contact Us'])[1]"));
    if(contactUsLink.isDisplayed()) System.out.println("The contact us link validation is Passed");
    else System.out.println("The contact us link validation is Failed");

    contactUsLink.click();

    WebElement heading2ConnectWithUs = driver.findElement(By.xpath("//h1[@data-ux='SectionHeading']"));
    if(heading2ConnectWithUs.isDisplayed()) System.out.println("The heading 2 connect with us validation is Passed");
    else System.out.println("The heading 2 connect with us validation is Failed");

   WebElement facebookIcon = driver.findElement(By.xpath("//a[@aria-label='Facebook Social Link']"));
    if(facebookIcon.isDisplayed()) System.out.println("The facebook icon validation is Passed");
    else System.out.println("The facebook icon validation is Failed");

    WebElement hyperLinkForFacebook = driver.findElement(By.xpath("//a[@href=\"https://www.facebook.com/103179127717601\"]"));
   if( hyperLinkForFacebook.isDisplayed()) System.out.println("True");
   else System.out.println("false");

   WebElement instagramIcon = driver.findElement(By.xpath("//a[@aria-label='Instagram Social Link']"));
    if(instagramIcon.isDisplayed()) System.out.println("The instagram icon validation is Passed");
    else System.out.println("The instagram icon validation is Failed");

    WebElement hyperLinkForInstagram = driver.findElement(By.xpath("//a[@href=\"https://www.instagram.com/comfyelite\"]"));
    if(hyperLinkForInstagram.isDisplayed()) System.out.println("The instagram hyper link validation is Passed");
    else System.out.println("The instagram hyper link validation is Failed");


    driver.quit();


  }
}
