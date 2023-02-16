package com.Neostox.Utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.Neostox.Base.BasePage;

public final class ScreenshotUtil extends BasePage{
	
	public static String getBase64img(WebDriver webdriver, String fileWithPath) throws Exception{
		ScreenshotUtil.driver = webdriver;
		 return ((TakesScreenshot)webdriver).getScreenshotAs(OutputType.BASE64);
	}

}
