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

WebUI.click(findTestObject('Spesific/MenuSub', [('subMenu') : 'Hybrid Customer']))

WebUI.click(findTestObject('Spesific/MenuSub', [('subMenu') : 'Hybrid Registration']))

WebUI.callTestCase(findTestCase('Reused TC/4. Hybrid Registration/1. Contact Customer Page'), [('title') : title, ('givenName') : givenName
        , ('familyName') : familyName, ('email') : email, ('dateOfBirth') : dateOfBirth, ('dobSplit') : [], ('KK') : KK, ('buildingName') : buildingName
        , ('streetName') : streetName, ('province') : province, ('city') : city, ('postCode') : postCode, ('companyName') : companyName
        , ('streetNumber') : streetNumber, ('homePhone') : homePhone, ('identificationID') : identificationID, ('issuingAuthority') : issuingAuthority
        , ('validTill') : validTill, ('splitValidCardIDDate') : [], ('isWNA') : false, ('issuingType') : issuingType], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Reused TC/4. Hybrid Registration/2. Select Price Plan page'), [('isESIM') : isESIM, ('mainContractAO') : mainContractAO], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Reused TC/4. Hybrid Registration/3.a Select Resource page - USIM'), [('msisdn') : msisdn
        , ('iccid') : iccid], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Reused TC/4. Hybrid Registration/3.c Select Payment Method page'), [('payerName') : payerName
        , ('paymentType') : paymentType, ('payerEmail') : payerEmail, ('payerPhoneNumber') : payerPhoneNumber, ('financialAccountName') : financialAccountName
        , ('billingAccountName') : billingAccountName, ('cycleCode') : cycleCode], FailureHandling.STOP_ON_FAILURE)

