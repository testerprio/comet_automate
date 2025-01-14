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

WebUI.callTestCase(findTestCase('Reused TC/1. General/Select dropdown by Value'), [('selectName') : 'title', ('valueofOption') : title], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('General/obj', [('obj') : 'input', ('attr') : '@formcontrolname', ('val') : 'givenName']), 
    givenName)

WebUI.setText(findTestObject('General/obj', [('obj') : 'input', ('attr') : '@formcontrolname', ('val') : 'familyName']), 
    familyName)

WebUI.setText(findTestObject('General/obj', [('obj') : 'input', ('attr') : '@formcontrolname', ('val') : 'email']), email)

dobSplit = WebUI.callTestCase(findTestCase('Library/LIB002 Split date to Array'), [('date') : dateOfBirth, ('splitDate') : ''], 
    FailureHandling.STOP_ON_FAILURE)

for (int i = 0; i < dobSplit.size(); i++) {
    WebUI.comment(dobSplit[i])
}

WebUI.callTestCase(findTestCase('Reused TC/1. General/Select Date'), [('calendarName') : 'dateOfBirth', ('yyyy') : dobSplit[
        2], ('mm') : dobSplit[0], ('dd') : dobSplit[1]], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('General/obj', [('obj') : 'input', ('attr') : '@formcontrolname', ('val') : 'buildingName']), 
    buildingName)

WebUI.setText(findTestObject('General/obj', [('obj') : 'input', ('attr') : '@formcontrolname', ('val') : 'streetName']), 
    streetName)

WebUI.callTestCase(findTestCase('Reused TC/1. General/Select dropdown by Value'), [('selectName') : 'province', ('valueofOption') : province], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Reused TC/1. General/Select dropdown by Value'), [('selectName') : 'city', ('valueofOption') : city], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('General/obj', [('obj') : 'input', ('attr') : '@formcontrolname', ('val') : 'postCode']), postCode)

WebUI.setText(findTestObject('General/obj', [('obj') : 'input', ('attr') : '@formcontrolname', ('val') : 'companyName']), 
    companyName)

WebUI.setText(findTestObject('General/obj', [('obj') : 'input', ('attr') : '@formcontrolname', ('val') : 'streetNumber']), 
    streetNumber)

WebUI.setText(findTestObject('General/obj', [('obj') : 'input', ('attr') : '@formcontrolname', ('val') : 'homePhone']), 
    homePhone)

WebUI.setText(findTestObject('General/obj', [('obj') : 'input', ('attr') : '@formcontrolname', ('val') : 'issuingAuthority']), 
    issuingAuthority)

splitValidCardIDDate = WebUI.callTestCase(findTestCase('Library/LIB002 Split date to Array'), [('date') : validTill, ('splitDate') : []], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Reused TC/1. General/Select Date'), [('calendarName') : 'validTill', ('yyyy') : splitValidCardIDDate[
        2], ('mm') : splitValidCardIDDate[0], ('dd') : splitValidCardIDDate[1]], FailureHandling.STOP_ON_FAILURE)

if (isWNA == false) {
    WebUI.setText(findTestObject('General/obj', [('obj') : 'input', ('attr') : '@formcontrolname', ('val') : 'KK']), KK)
} else {
    WebUI.check(findTestObject('General/obj', [('obj') : 'p-checkbox', ('attr') : '@formcontrolname', ('val') : 'foreignIndicator']))

	WebUI.callTestCase(findTestCase('Reused TC/1. General/Select dropdown by Value'), [('selectName') : 'issuingType', ('valueofOption') : issuingType],
		FailureHandling.STOP_ON_FAILURE)
	
}

WebUI.setText(findTestObject('General/obj', [('obj') : 'input', ('attr') : '@formcontrolname', ('val') : 'identificationID']), 
    identificationID)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('General/obj contains', [('obj') : 'button', ('attr') : 'text()', ('val') : 'Next']), FailureHandling.STOP_ON_FAILURE)
