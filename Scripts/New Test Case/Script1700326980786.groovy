import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(GlobalVariable.baseUrl)
WebUI.maximizeWindow()

// check enter username page
if(WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Signin/btn_back'))) 
{
	WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Signin/frame_signin'), 2, FailureHandling.STOP_ON_FAILURE)
	WebUI.sendKeys(findTestObject('Object Repository/Page_Signin/input_username'), GlobalVariable.username_src)
	WebUI.click(findTestObject('Object Repository/Page_Signin/btn_next'))
} 
else 
{
	println("Enter username page is wrong!")
}

// wait enter password page loaded
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Signin/btn_signin'), 10)
WebUI.waitForPageLoad(5)

//check enter password page
if (WebUI.getText(findTestObject('Object Repository/Page_Signin/txt_titleEnterPassword')).contains('Enter Password')) 
{
	WebUI.waitForPageLoad(5)
	WebUI.refresh()
	WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Signin/btn_signin'), 2, FailureHandling.STOP_ON_FAILURE)
	WebUI.setEncryptedText(findTestObject('Object Repository/Page_Signin/input_password'), GlobalVariable.password_src)
	WebUI.click(findTestObject('Object Repository/Page_Signin/btn_signin'))
	
} 
//else if (WebUI.getText(findTestObject('Object Repository/Page_Signin/txt_titleEnterPassword')).contains('Trying to sign you in')) 
//{
//	println("Trying to sign you in page is displayed")
//	println(WebUI.getText(findTestObject('Object Repository/Page_Signin/txt_titleEnterPassword')))
//	WebUI.waitForPageLoad(5)
//	WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Signin/btn_signin'), 2, FailureHandling.STOP_ON_FAILURE)
//	WebUI.setEncryptedText(findTestObject('Object Repository/Page_Signin/input_password'), GlobalVariable.password_src)
//	WebUI.click(findTestObject('Object Repository/Page_Signin/btn_signin'))
//}  
//else 
//{
//	println("++++++++++++ERROR+++++++++++++")
//	println(WebUI.getText(findTestObject('Object Repository/Page_Signin/txt_titleEnterPassword')))
//	WebUI.waitForPageLoad(5)
//	WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Signin/btn_signin'), 2, FailureHandling.STOP_ON_FAILURE)
//	WebUI.setEncryptedText(findTestObject('Object Repository/Page_Signin/input_password'), GlobalVariable.password_src)
//	WebUI.click(findTestObject('Object Repository/Page_Signin/btn_signin'))
//}

