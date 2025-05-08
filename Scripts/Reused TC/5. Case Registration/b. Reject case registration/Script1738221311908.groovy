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

WebUI.click(findTestObject('General/obj contains', [('obj') : 'button', ('attr') : 'text()', ('val') : 'Reject']))

WebUI.click(findTestObject('General/obj', [('obj') : 'p-dropdown', ('attr') : '@placeholder', ('val') : 'Reject Reason']))

WebUI.click(findTestObject('General/obj', [('obj') : 'li', ('attr') : '@aria-label', ('val') : 'BUKAN KTP ASLI KTP SCAN']))

WebUI.click(findTestObject('General/obj', [('obj') : 'p-dropdown', ('attr') : '@placeholder', ('val') : 'Reject Reason']))

WebUI.click(findTestObject('General/obj', [('obj') : 'li', ('attr') : '@aria-label', ('val') : 'Close Request by Subscriber']))

WebUI.takeScreenshot()

WebUI.click(findTestObject('General/obj', [('obj') : 'button', ('attr') : '@class', ('val') : 'common-button btn-danger']))

WebUI.waitForPageLoad(5)

WebUI.waitForAlert(5)

WebUI.takeScreenshot()

