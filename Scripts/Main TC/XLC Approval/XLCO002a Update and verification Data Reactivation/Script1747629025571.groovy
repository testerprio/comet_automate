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

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('General/obj contains', [('obj') : 'img', ('attr') : '@src', ('val') : 'eye']), 5)

WebUI.click(findTestObject('General/obj contains', [('obj') : 'img', ('attr') : '@src', ('val') : 'eye']))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('General/obj contains', [('obj') : 'button', ('attr') : 'text()', ('val') : 'Update Data']))

WebUI.callTestCase(findTestCase('Library/LIB003 Select from Dropdown'), [('selectionName') : 'iccidCheckStatus', ('selectedOption') : iccidCheckStatus], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Library/LIB003 Select from Dropdown'), [('selectionName') : 'nikCheckStatus', ('selectedOption') : nikCheckStatus], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Library/LIB003 Select from Dropdown'), [('selectionName') : 'nameCheckStatus', ('selectedOption') : nameCheckStatus], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Library/LIB003 Select from Dropdown'), [('selectionName') : 'cardImageCheckStatus', ('selectedOption') : ValidationImage], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Library/LIB003 Select from Dropdown'), [('selectionName') : 'selfieImageCheckStatus', ('selectedOption') : ValidationImage], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Library/LIB003 Select from Dropdown'), [('selectionName') : 'iccidImageCheckStatus', ('selectedOption') : ValidationImage], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Library/LIB003 Select from Dropdown'), [('selectionName') : 'signatureCheckStatus', ('selectedOption') : ValidationImage], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('General/obj contains', [('obj') : 'button', ('attr') : 'text()', ('val') : 'Capture']))

CustomKeywords.'additionalKeyword.allowBrowserPermission'()

WebUI.click(findTestObject('Spesific/btn Capturephoto'))

WebUI.click(findTestObject('General/obj contains', [('obj') : 'button', ('attr') : 'text()', ('val') : 'Save and Exit']))

WebUI.callTestCase(findTestCase('Library/LIB003 Select from Dropdown'), [('selectionName') : 'videoCallStatus', ('selectedOption') : videoCallStatus], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('General/obj', [('obj') : 'textarea', ('attr') : '@formcontrolname', ('val') : 'note']), 'testing')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('General/obj contains', [('obj') : 'button', ('attr') : 'text()', ('val') : 'Save']))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('General/obj contains', [('obj') : 'button', ('attr') : 'text()', ('val') : 'Back']))

WebUI.takeScreenshot()

