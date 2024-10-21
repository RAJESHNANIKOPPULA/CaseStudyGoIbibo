package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.ExcelUtility;

public class ReviewBookingPage {

	//ExcelUtility excelwrite=new ExcelUtility();
	private By grand_total=By.xpath("//div[@class='price-breakupstyles__BreakupTitle-sc-fjdxc9-15 nxWcg f700 blueCnt']");
	
	public void GrandTotal(WebDriver driver) throws IOException {
		WebElement total_amount_msg=driver.findElement(grand_total);
		String total_price=total_amount_msg.getText();
		System.out.println("Grand Total Amount = "+total_price);
		
		   //Printing the grand total amonut into Excel Sheet 
		   String filepath="C:\\Users\\2271459\\eclipse-workspace\\CaseStudyGoIbiboTestCases\\src\\test\\resources\\Price.xlsx";
		   ExcelUtility.setCellData(filepath, "Sheet1", 0, 0, total_price);
		   System.out.println("EXCEL SHEET UPDATED SUCCESSFULLY !!!!");
	}
	
	public void CloseBrwoser(WebDriver driver) {
		driver.quit();
	}
}