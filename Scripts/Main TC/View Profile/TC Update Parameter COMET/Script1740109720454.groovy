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

WebUI.callTestCase(findTestCase('Reused TC/2. Credential/Login'), [('username') : user, ('encriptPassword') : pass], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Spesific/MenuMain', [('mainMenu') : 'Customer Support']))

WebUI.click(findTestObject('Spesific/MenuSub', [('subMenu') : 'View Profile']))

WebUI.setText(findTestObject('General/obj', [('obj') : 'input', ('attr') : '@formcontrolname', ('val') : 'searchValue']), 
    msisdn)

WebUI.click(findTestObject('General/obj contains', [('obj') : 'button', ('attr') : 'text()', ('val') : 'Search']))

WebUI.takeScreenshot()

WebUI.click(findTestObject('General/obj contains', [('obj') : 'button', ('attr') : 'text()', ('val') : 'Parameter']))

WebUI.setText(findTestObject('General/obj', [('obj') : 'input', ('attr') : '@class', ('val') : 'default-input']), 'ROMINT')

WebUI.click(findTestObject('General/obj contains', [('obj') : 'button', ('attr') : 'text()', ('val') : 'Edit']))

WebUI.click(findTestObject('General/obj', [('obj') : 'p-dropdown', ('attr') : '@ng-reflect-name', ('val') : 'ROMINT']))

WebUI.click(findTestObject('Spesific/p-dropdownitem', [('optionName') : newValueParam]))

WebUI.takeScreenshot()

WebUI.click(findTestObject('General/obj contains', [('obj') : 'button', ('attr') : 'text()', ('val') : 'Submit']))