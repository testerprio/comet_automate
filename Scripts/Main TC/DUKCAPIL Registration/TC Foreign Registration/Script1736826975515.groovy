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

WebUI.callTestCase(findTestCase('Reused TC/2. Credential/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Spesific/MenuMain', [('mainMenu') : 'Customer Registration']))

WebUI.click(findTestObject('Spesific/MenuSub', [('subMenu') : 'DUKCAPIL Registration']))

WebUI.click(findTestObject('Spesific/MenuSub', [('subMenu') : 'Foreign Registration']))

WebUI.setText(findTestObject('General/obj', [('obj') : 'input', ('attr') : '@formcontrolname', ('val') : 'MSISDN']), MSISDN)

WebUI.callTestCase(findTestCase('Reused TC/1. General/Select dropdown by Value'), [('selectName') : 'IDType', ('valueofOption') : IDType], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('General/obj', [('obj') : 'input', ('attr') : '@formcontrolname', ('val') : 'IDNumber']), IDNumber)

WebUI.setText(findTestObject('General/obj', [('obj') : 'input', ('attr') : '@formcontrolname', ('val') : 'name']), name)

WebUI.setText(findTestObject('General/obj', [('obj') : 'textarea', ('attr') : '@formcontrolname', ('val') : 'address']), 
    address)

splitbirthDate = WebUI.callTestCase(findTestCase('Library/LIB002 Split date to Array'), [('date') : birthDate, ('splitDate') : []], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Reused TC/1. General/Select Date'), [('calendarName') : 'birthDate', ('yyyy') : splitbirthDate[
        2], ('mm') : splitbirthDate[0], ('dd') : splitbirthDate[1]], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('General/obj', [('obj') : 'input', ('attr') : '@formcontrolname', ('val') : 'birthPlace']), 
    birthPlace)

WebUI.setText(findTestObject('General/obj', [('obj') : 'input', ('attr') : '@formcontrolname', ('val') : 'puk']), puk)

WebUI.callTestCase(findTestCase('Reused TC/1. General/Select dropdown by Value'), [('selectName') : 'nationality', ('valueofOption') : nationality], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('General/obj contains', [('obj') : 'button', ('attr') : 'text()', ('val') : 'Submit']))

WebUI.takeScreenshot()

WebUI.click(findTestObject('General/obj contains', [('obj') : 'button', ('attr') : 'text()', ('val') : 'YES']))

WebUI.waitForAlert(3)

WebUI.takeScreenshot()

WebUI.callTestCase(findTestCase('Reused TC/2. Credential/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

