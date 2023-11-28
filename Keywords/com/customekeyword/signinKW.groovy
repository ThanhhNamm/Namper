package com.customekeyword

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class signinKW {

	@Keyword
	def openWebsite(String role) {
		WebUI.openBrowser(GlobalVariable.baseUrl)
		WebUI.maximizeWindow()
	}


	def signinWithUsernamPassword(String username, String password, String role ) {
		switch (role) {
			case "ADMIN":
				WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Signin/frame_signin'), 2, FailureHandling.STOP_ON_FAILURE)
				WebUI.sendKeys(findTestObject('Object Repository/Page_Signin/input_username'), GlobalVariable.username_src)
				WebUI.click(findTestObject('Object Repository/Page_Signin/btn_next'))
				WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Signin/btn_signin'), 2, FailureHandling.STOP_ON_FAILURE)
				WebUI.setEncryptedText(findTestObject('Object Repository/Page_Signin/input_password'), GlobalVariable.password_src)

				WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Signin/btn_signin'), 0, FailureHandling.STOP_ON_FAILURE)
				WebUI.click(findTestObject('Object Repository/Page_Signin/btn_signin'))
		}
	}
}
