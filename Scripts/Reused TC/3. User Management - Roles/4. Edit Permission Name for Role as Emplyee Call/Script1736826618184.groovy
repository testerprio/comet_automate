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

List<WebElement> arr = WebUI.findWebElements(listObject, 10)

valueofOption[0] = Menu1
valueofOption[1] = Menu2
valueofOption[2] = Payment1
valueofOption[3] = Payment2
valueofOption[4] = Prioritas1
valueofOption[5] = Prioritas2
valueofOption[6] = Prioritas3
valueofOption[7] = ''
valueofOption[8] = ''
valueofOption[9] = ''

for(int i=0; i<arr.size();i++) {

	arr[i].click()
	
	WebUI.click(findTestObject('Spesific/p-dropdownitem', [('optionName') : valueofOption[i]]))

}

