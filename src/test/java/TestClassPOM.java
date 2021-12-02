

import org.testng.annotations.Test;

import OnlineCalculator.Base;
import OnlineCalculator.CalOperation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class TestClassPOM extends Base{
	
	CalOperation cal;
	WebDriver driver;
	
	
@BeforeTest
public void LaunchBrowser() {
	Reporter.log("Browser launching",true);
	driver=browserInitialize();
	cal=new CalOperation(driver);
}

  @Test(priority = 0)
  public void ToVerifyMultiplicationOperation() throws InterruptedException {
	  Reporter.log("Verify multiplicatoion operation",true);
	
	 if(cal.Mult())
	 {
		 Reporter.log("Testcase pass",true);
	 }
	 else {
		 Reporter.log("Testcase fail",true);
	 }
	
	 Thread.sleep(2000);
  }
  @Test(priority = 1)
  public void ToVerifyDivisionOperation() throws InterruptedException {
	  Reporter.log("Verify Division operation",true);
	 if(cal.Divide()) {
		 Reporter.log("Testcase pass",true);
	 }
	 else {
		 Reporter.log("Testcase fail",true);
	 }
	 
	 Thread.sleep(2000);
	 
  }

  @Test(priority = 2)
  public void ToVerifyAdditionOperation() throws InterruptedException {
	  Reporter.log("Verify Addition operation",true);
	
	 if(cal.Add()) {
		 Reporter.log("Testcase pass",true);
	 }
	 else {
		 Reporter.log("Testcase fail",true);
	 }
	 Thread.sleep(2000);
	 
	 
  }

  @Test(priority = 3)
  public void ToVerifySubstractionOperation() throws InterruptedException {
	  Reporter.log("Verify Substraction operation",true);
	
	 if(cal.Substract()) {
		 Reporter.log("Testcase pass",true); 
	 }
	 else {
		 Reporter.log("Testcase fail",true);
	 }
	 Thread.sleep(2000);
  }
  

  @AfterTest
  public void CloseBrowser() {
  	Reporter.log("Browser Closing",true);
  	driver.close();
  }


}
