package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase4 {
  public static void main(String[] args) {
 /*
 Test Case 4: Validate ComfyElite Contact Us page "SEND US A
MESSAGE" formGiven user navigates to “https://comfyelite.com/”

When user clicks on “CONTACT US” link in the header
Then user should be navigated to “CONTACT US” page
And validate "First Name" input box
And validate "Last Name" input box
And validate "Email" input box
And validate "Message" input box
NOTE: Input validation includes input being displayed and user being able send
keys to input box. It also requires validating the given labels and placeholders
  */
    WebDriver driver = Driver.getDriver();
    driver.get("https://comfyelite.com/");

    WebElement contactUsLink = driver.findElement(By.xpath("(//a[text()='Contact Us'])[1]"));
    if(contactUsLink.isDisplayed()) System.out.println("The contact us link validation is Passed");
    else System.out.println("The contact us link validation is Failed");

    contactUsLink.click();

    WebElement firstNameInputBox = driver.findElement(By.xpath("//input[@data-aid='First Name']"));
    if(firstNameInputBox.isDisplayed() ) System.out.println("The first name input box validation is Passed");
    else System.out.println("The first name input box validation is Failed");
    String expectedFirstNameTxt = "First Name*";
    String actualFirstNameTxt = driver.findElement(By.xpath("//label[text()='First Name*']")).getText();
    if(expectedFirstNameTxt.equals(actualFirstNameTxt)) System.out.println("First name test passed");
    else System.out.println("First name test failed");
    firstNameInputBox.sendKeys("Nataliia");

    WebElement lastNameInputBox = driver.findElement(By.xpath("//input[@data-aid='Last Name']"));
    if(lastNameInputBox.isDisplayed()) System.out.println("The last name input box validation is Passed");
    else System.out.println("The last name input box validation is Failed");
    String expectedLastNameTxt = "Last Name*";
    String actualLastNameTxt = driver.findElement(By.xpath("//label[text()='Last Name*']")).getText();
    if(expectedLastNameTxt.equals(actualLastNameTxt)) System.out.println("Last name test passed");
    else System.out.println("Last name test failed");
    lastNameInputBox.sendKeys("Grynda");

    WebElement emailInputBox = driver.findElement(By.cssSelector("input[data-aid='CONTACT_FORM_EMAIL']"));
    if(emailInputBox.isDisplayed()) System.out.println("The email input box validation is Passed");
    else System.out.println("The email input box validation is Failed");
    String expectedEmailTxt = "Email*";
    String actualEmailTxt = driver.findElement(By.xpath("//label[text()='Email*']")).getText();
    if(expectedEmailTxt.equals(actualEmailTxt)) System.out.println("Email test passed");
    else System.out.println("Email test failed");
    emailInputBox.sendKeys("Nataliiagrynda@gmail.com");

    WebElement messageInputBox = driver.findElement(By.xpath("//textarea[@data-aid='CONTACT_FORM_MESSAGE']"));
    if(messageInputBox.isDisplayed()) System.out.println("The message input box validation is Passed");
    else System.out.println("The message input box validation is Failed");
    WebElement messageInputBox1 = driver.findElement(By.xpath("//textarea[@role='textbox']"));
    System.out.println(messageInputBox1.getAttribute("placeholder").equals("Message*")? "Message validation is passed": "Message validation is failed");
    messageInputBox.sendKeys("love this website");



  driver.quit();


  }
}
