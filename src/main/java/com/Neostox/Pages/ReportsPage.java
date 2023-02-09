package com.Neostox.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Neostox.Base.BasePage;

public class ReportsPage extends BasePage{
	
   WebDriver driver;
	
	public ReportsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]")
	public WebElement labelMarginUsed;
	
	@FindBy(xpath="//div[@id='reportsdropdown']")
	public WebElement ReportsDropdown;
		
	
	@FindBy(xpath="//a[@id='lnk_userdashboard']")
	public WebElement ButtonDashboard ;
	
	
	@FindBy(xpath="(//td[contains(text(),'Running Trades')])[1]")
	public WebElement labelRunningTrades;
	
	@FindBy(xpath="//body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[3]/td[1]")
	public WebElement labelPendingOrders;
	
	@FindBy(xpath="//td[text()='Completed Trades']")
	public WebElement labelCompletedTrades;

    @FindBy(xpath="//a[@id='lnk_tradehistory']")
    public WebElement TradeHistory;

    @FindBy(xpath="//a[@id='lnk_tradehistory']")
    public WebElement LabelTradeHistory;



}
