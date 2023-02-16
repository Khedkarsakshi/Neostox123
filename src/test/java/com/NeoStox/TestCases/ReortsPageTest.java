package com.NeoStox.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Neostox.Base.BasePage;
import com.Neostox.Pages.ReportsPage;
import com.Neostox.Utilities.CommonActions;

public class ReortsPageTest extends BasePage{
	WebDriver driver;
	CommonActions commonactions;
	ReportsPage reportsPage;
	
	@Test()
	public void buttonDashboard () {
		commonactions = new CommonActions();
		reportsPage =new ReportsPage (driver);
		commonactions.click_on_Element(reportsPage.ReportsDropdown);
		commonactions.click_on_Element(reportsPage.ButtonDashboard);
		commonactions.click_on_Element(reportsPage.TradeHistory);
		Assert.assertTrue(reportsPage.labelMarginUsed.isDisplayed());
		Assert.assertTrue(reportsPage.labelPendingOrders.isDisplayed());
	    Assert.assertTrue(reportsPage.LabelTradeHistory.isDisplayed());
	}
	
}
