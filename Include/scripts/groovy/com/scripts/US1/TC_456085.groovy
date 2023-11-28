package com.scripts.US1
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

import org.testng.Assert

class TC_456085 {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 * 
	 * Given Signin to ERBS with <Admin> account
	 Then Homepage should be displayed
	 When Click on Avatar and Select Administration option
	 Then "User Management screen" page is displayed
	 When Click on Contact Setup tab
	 Then Contact Setup page is displayed
	 When Update data of module index 1
	 | Field       | Data       |
	 | EXPERT USER | ERBS.SSO   |
	 | EXPERT USER | Stag.SSO   |
	 | EXPERT USER | Stag.SSO01 |
	 And Scroll to the top of website
	 And Click 'Save Change' button
	 And Click on 'Ok' button
	 Then 'Successfully saved' message should be displayed
	 And The module of index 1 should have user as displayed
	 | ERBS.SSO   |
	 | Stag.SSO   |
	 | Stag.SSO01 |
	 */
	@Given("Signin to ERBS with ADMIN account")
	def signin_to_ERBS_with_account() {
		WebUI.openBrowser(GlobalVariable.baseUrl)
		WebUI.maximizeWindow()
		WebUI.sendKeys(findTestObject('Object Repository/Page_Signin/input_username'), GlobalVariable.username_admin)
		WebUI.click(findTestObject('Object Repository/Page_Signin/btn_next'))
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Signin/input_password'), GlobalVariable.password_admin)
		WebUI.click(findTestObject('Object Repository/Page_Signin/btn_signin'))
	}
	@Then("Homepage should be displayed")
	def homepage_should_be_displayed() {
		//		String actualWelcome = WebUI.getText(findTestObject('Object Repository/Page_Homepage/txt_Welcome'))
		//		String expectedWelcome = "Welcome, ERBS.SSO"
		//		Assert.assertEquals(actualWelcome, expectedWelcome)
	}

	@When("Click on Avatar and Select Administration option")
	def click_avatar_and_select_administration() {
		//		WebUI.click(findTestObject('Object Repository/Page_Homepage/btn_administration'))
	}

	@Then("'User Management screen' page is displayed")
	def user_mnagement_page_should_be_displayed() {
		//		String actualTitlePage = WebUI.getText(findTestObject('Object Repository/Page_UserManagement/txt_titlePage'))
		//		String expectedTitlePage = "User Management"
		//		Assert.assertEquals(actualTitlePage, expectedTitlePage)
	}

	@When("Click on 'Contact Setup' tab")
	def click_contact_setup_tab() {
		//		WebUI.click(findTestObject('Object Repository/Page_UserManagement/btn_contactSetup'))
	}

	@Then("'Contact Setup' page should be displayed")
	def contact_setup_page_displayed() {
		//		String actualTitlePage = WebUI.getText(findTestObject('Object Repository/Page_ContactSetup/txt_titlePage'))
		//		String expectedTitlePage = "Contact Setup"
		//		Assert.assertEquals(actualTitlePage, expectedTitlePage)
	}

	@Then("Update data of module index 1")
	def update_data_module_index1() {
	}

	@And("Click 'Save Change' button")
	def click_save_change_button() {
		//		WebUI.click(findTestObject('Object Repository/Page_ContactSetup/btn_saveChange'))
	}

	@And("Click on 'Ok' button")
	def click_ok_button() {
		//		WebUI.click(findTestObject('Object Repository/Page_ContactSetup/btn_Ok'))
	}

	@Then("'Successfully saved' message should be displayed")
	def successfully_message_displayed() {
	}

	@And("The module of index 1 should have user as displayed")
	def module1_should_have_user_as_displayed() {
	}
}