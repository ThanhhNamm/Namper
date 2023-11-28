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



class TC_441863 {
	
	@Given("Signin to ERBS with normal account - 441863")
	def signin_to_ERBS_with_normal_account() {
		WebUI.openBrowser(GlobalVariable.baseUrl)
		WebUI.maximizeWindow()
		WebUI.refresh()
		WebUI.setText(findTestObject('Object Repository/Page_Signin/input_username'), 'helo')
		//WebUI.sendKeys(findTestObject('Object Repository/Page_Signin/input_username'), GlobalVariable.username_src)
		WebUI.click(findTestObject('Object Repository/Page_Signin/btn_next'))
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Signin/input_password'), GlobalVariable.password_src)
		WebUI.click(findTestObject('Object Repository/Page_Signin/btn_signin'))
		
	}
	
	@Then("Homepage should be displayed - 441863")
	def homepage_should_be_displayed_441863() {
		print("hello")
	}
}