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

WebUI.click(findTestObject('Spesific/MenuMain', [('mainMenu') : 'Configuration']))

WebUI.click(findTestObject('Spesific/MenuSub', [('subMenu') : 'User Management']))

WebUI.click(findTestObject('Spesific/MenuSub', [('subMenu') : 'Roles']))

WebUI.callTestCase(findTestCase('Reused TC/3. User Management - Roles/3. Create new Role User Access'), [('appType') : '', ('roleName') : ''
        , ('roleDescription') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Reused TC/3. User Management - Roles/4. Edit Permission Name for Role as Emplyee Call'), [
        ('Menu1') : 'Employee call permission for apply online ', ('Menu2') : 'Apply Online Permission For Employee Call'
        , ('Payment1') : '', ('Payment2') : 'Test Permission Employee Call', ('Prioritas1') : '', ('Prioritas2') : '', ('Prioritas3') : 'Employee call Packets'
        , ('listObject') : findTestObject('General/obj', [('obj') : 'p-dropdown', ('attr') : '@placeholder', ('val') : 'N/A'])
        , ('valueofOption') : []], FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot()

WebUI.click(findTestObject('General/obj contains', [('obj') : 'button', ('attr') : 'text()', ('val') : 'Save']))

