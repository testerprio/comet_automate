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

WebUI.callTestCase(findTestCase('Main TC/XLC Approval/XLCO001 Filter based on TicketID'), [('ApplicationID') : applicationID
        , ('serviceType') : serviceType, ('channel') : channel], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('General/obj contains', [('obj') : 'img', ('attr') : '@src', ('val') : 'eye']), 5)

WebUI.click(findTestObject('General/obj contains', [('obj') : 'img', ('attr') : '@src', ('val') : 'eye']))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('General/obj contains', [('obj') : 'button', ('attr') : 'text()', ('val') : 'Reject']))

WebUI.click(findTestObject('General/obj', [('obj') : 'p-multiselect', ('attr') : '@formcontrolname', ('val') : 'reason']))

WebUI.click(findTestObject('General/p-multiselectitem', [('idx') : 1]))

WebUI.check(findTestObject('General/p-multiselectitem', [('idx') : 3]))

WebUI.check(findTestObject('General/p-multiselectitem', [('idx') : 5]))

WebUI.click(findTestObject('General/obj', [('obj') : 'p-multiselect', ('attr') : '@formcontrolname', ('val') : 'reason']))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Spesific/btn Reject inpopup'))

WebUI.waitForElementVisible(findTestObject('General/obj', [('obj') : 'div', ('attr') : '@class', ('val') : 'topic']), 8)

WebUI.takeScreenshot()

WebUI.click(findTestObject('General/obj contains', [('obj') : 'button', ('attr') : 'text()', ('val') : 'Back']))

WebUI.takeScreenshot()

