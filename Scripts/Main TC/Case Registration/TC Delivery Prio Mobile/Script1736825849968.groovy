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

WebUI.click(findTestObject('Spesific/MenuSub', [('subMenu') : 'Case Registration']))

WebUI.click(findTestObject('Spesific/MenuSub', [('subMenu') : 'Delivery PRIO Mobile']))

WebUI.setText(findTestObject('General/obj', [('obj') : 'input', ('attr') : '@formcontrolname', ('val') : 'referenceId']), 
    ReferenceID)

WebUI.click(findTestObject('General/obj', [('obj') : 'button', ('attr') : '@type', ('val') : 'submit']))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Spesific/btn Opendetail'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('General/obj contains', [('obj') : 'button', ('attr') : 'text()', ('val') : 'Update Data']))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('General/obj contains', [('obj') : 'button', ('attr') : 'text()', ('val') : 'Update ICCID']))

WebUI.setText(findTestObject('General/obj', [('obj') : 'input', ('attr') : '@formcontrolname', ('val') : 'ICCID']), ICCID)

WebUI.setText(findTestObject('General/obj', [('obj') : 'input', ('attr') : '@formcontrolname', ('val') : 'retypeICCID']), 
    ICCID)

WebUI.takeScreenshot()

WebUI.click(findTestObject('General/obj', [('obj') : 'button', ('attr') : 'text()', ('val') : 'Submit']))

WebUI.setText(findTestObject('Spesific/input date', [('dateName') : 'depoToCourierDate']), DepoToCourierDate)

WebUI.sendKeys(findTestObject('Spesific/input date', [('dateName') : 'depoToCourierDate']), Keys.chord(Keys.ESCAPE))

WebUI.setText(findTestObject('Spesific/input date', [('dateName') : 'courierToCustomerDate']), CourierToCustomerDate)

WebUI.sendKeys(findTestObject('Spesific/input date', [('dateName') : 'courierToCustomerDate']), Keys.chord(Keys.ESCAPE))

WebUI.setText(findTestObject('Spesific/input date', [('dateName') : 'estimateShippingTime']), EstShipping)

WebUI.sendKeys(findTestObject('Spesific/input date', [('dateName') : 'estimateShippingTime']), Keys.chord(Keys.ESCAPE))

WebUI.click(findTestObject('General/obj', [('obj') : 'p-dropdown', ('attr') : '@formcontrolname', ('val') : 'courierPartner']))

WebUI.click(findTestObject('Spesific/p-dropdownitem', [('optionName') : courierPartner]), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('General/obj', [('obj') : 'input', ('attr') : '@formcontrolname', ('val') : 'courierName']), 
    courierName)

WebUI.setText(findTestObject('General/obj', [('obj') : 'input', ('attr') : '@formcontrolname', ('val') : 'receiptNumber']), 
    receiptNumber)

WebUI.setText(findTestObject('Spesific/input date', [('dateName') : 'pickupDate']), pickupDate)

WebUI.sendKeys(findTestObject('Spesific/input date', [('dateName') : 'pickupDate']), Keys.chord(Keys.ESCAPE))

WebUI.setText(findTestObject('Spesific/input date', [('dateName') : 'customerReceivedDate']), customerReceivedDate)

WebUI.sendKeys(findTestObject('Spesific/input date', [('dateName') : 'customerReceivedDate']), Keys.chord(Keys.ESCAPE))

WebUI.setText(findTestObject('General/obj', [('obj') : 'input', ('attr') : '@formcontrolname', ('val') : 'receiver']), receiver)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('General/obj contains', [('obj') : 'button', ('attr') : 'text()', ('val') : 'Save']))

WebUI.waitForAlert(3)

WebUI.takeScreenshot()

WebUI.callTestCase(findTestCase('Reused TC/2. Credential/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

