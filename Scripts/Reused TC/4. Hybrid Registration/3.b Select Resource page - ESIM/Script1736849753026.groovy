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

WebUI.setText(findTestObject('General/obj', [('obj') : 'input', ('attr') : '@formcontrolname', ('val') : 'msisdn']), msisdn)

autoIccid = WebUI.getText(findTestObject('Spesific/Hybrid Registration/label iccidEsim'))

if (autoIccid == '-') {
    WebUI.check(findTestObject('General/obj', [('obj') : 'p-checkbox', ('attr') : '@formcontrolname', ('val') : 'isChecked']))

    WebUI.setText(findTestObject('General/obj', [('obj') : 'input', ('attr') : '@formcontrolname', ('val') : 'iccid']), 
        iccid)
}

WebUI.setText(findTestObject('General/obj', [('obj') : 'input', ('attr') : '@formcontrolname', ('val') : 'eid']), eid)

WebUI.callTestCase(findTestCase('Reused TC/1. General/Select dropdown by Value'), [('selectName') : 'deviceType', ('valueofOption') : deviceType], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot()

WebUI.click(findTestObject('General/obj contains', [('obj') : 'button', ('attr') : 'text()', ('val') : ' Validate Resources']))

