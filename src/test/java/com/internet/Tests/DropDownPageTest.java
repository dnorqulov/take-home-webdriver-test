package com.internet.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.internet.base.Baseclass;
import com.internet.pages.DropDownPage;
import com.internet.pages.TheInternetPage;

public class DropDownPageTest extends Baseclass {
	TheInternetPage internet;
	DropDownPage dropDown;

	@BeforeMethod
	public void startBorwserSession() {
		intialization();
		internet = new TheInternetPage(webdriver, true);

		dropDown = internet.clickDropDown();

	}

	@Test
	public void selectOption1Test() {
		dropDown.selectOption1();
		Assert.assertEquals(dropDown.getSelectedOptionsText(), "Option 1");
	}

	@Test
	public void selectOption2Test() {
		dropDown.selectOption2();

		Assert.assertEquals(dropDown.getSelectedOptionsText(), "Option 2");
	}

	@AfterMethod
	public void quitBrowserSession() {
		quitBrowser();
	}

}
