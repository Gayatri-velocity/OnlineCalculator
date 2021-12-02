package OnlineCalculator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalOperation {

@FindBy(xpath = "//span[text()='+']")private WebElement Addition;
@FindBy(xpath = "//span[text()='–']")private WebElement Substraction;
@FindBy(xpath = "//span[text()='×']")private WebElement Multiplication;
@FindBy(xpath = "//span[text()='/']")private WebElement Division;
@FindBy(xpath = "//span[text()='0']")private WebElement n1;
@FindBy(xpath = "//span[text()='2']")private WebElement n2;
@FindBy(xpath = "//span[text()='3']")private WebElement n3;
@FindBy(xpath = "//span[text()='4']")private WebElement n4;
@FindBy(xpath = "//span[text()='5']")private WebElement n5;
@FindBy(xpath = "//span[text()='8']")private WebElement n8;
@FindBy(xpath = "//span[text()='9']")private WebElement n9;
@FindBy(xpath = "//div[@id='sciOutPut']")private WebElement Result;
@FindBy(xpath = "//span[text()='AC']")private WebElement ClearResult;

	public CalOperation(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public boolean Mult() throws InterruptedException {
		
		n4.click();
		n2.click();
		n3.click();
		Multiplication.click();
		n5.click();
		n2.click();
		n5.click();
		String actualresult=Result.getText().trim();
		Integer ar = Integer.parseInt(actualresult);
		Thread.sleep(2000);
		int expectedresult=222075;
		boolean status = (expectedresult==ar);
		ClearResult.click();
		return status;
		
	}

	public boolean Divide() throws InterruptedException {
		// TODO Auto-generated method stub
		n4.click();
		n1.click();
		n1.click();
		n1.click();
		Division.click();
		n2.click();
		n1.click();
		n1.click();
		String actualresult=Result.getText().trim();
		Integer ar = Integer.parseInt(actualresult);
		Thread.sleep(2000);
		int expectedresult=20;
		boolean status = (expectedresult==ar);
		ClearResult.click();
		return status;
		
	}
	
	public boolean Add() throws InterruptedException {
		// TODO Auto-generated method stub
		Substraction.click();
		n2.click();
		n3.click();
		n4.click();
		n2.click();
		n3.click();
		n4.click();
		Addition.click();
		n3.click();
		n4.click();
		n5.click();
		n3.click();
		n4.click();
		n5.click();
		String actualresult=Result.getText().trim();
		Integer ar = Integer.parseInt(actualresult);
		Thread.sleep(2000);
		int expectedresult=111111;
		boolean status = (expectedresult==ar);
		ClearResult.click();
		return status;
	}

	public boolean Substract() throws InterruptedException {
		// TODO Auto-generated method stub
		n2.click();
		n3.click();
		n4.click();
		n8.click();
		n2.click();
		n3.click();
		Substraction.click();
		Substraction.click();
		n2.click();
		n3.click();
		n1.click();
		n9.click();
		n4.click();
		n8.click();
		n2.click();
		n3.click();
		String actualresult=Result.getText().trim();
		Integer ar = Integer.parseInt(actualresult);
		Thread.sleep(2000);
		int expectedresult=23329646;
		boolean status = (expectedresult==ar);
		ClearResult.click();
		return status;
	}


}
