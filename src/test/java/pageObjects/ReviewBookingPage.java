package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReviewBookingPage {

	//ExcelUtility excelwrite=new ExcelUtility();
	private By grand_total=By.xpath("//div[@class='price-breakupstyles__BreakupTitle-sc-fjdxc9-15 nxWcg f700 blueCnt']");
	
	public void GrandTotal(WebDriver driver) throws IOException {
		WebElement total_amount_msg=driver.findElement(grand_total);
		String total_price=total_amount_msg.getText();
		System.out.println("Grand Total Amount = "+total_price);
	}
	
	public void CloseBrwoser(WebDriver driver) {
		driver.quit();
	}
}