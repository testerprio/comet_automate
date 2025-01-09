import org.openqa.selenium.interactions.Action
import org.openqa.selenium.interactions.Actions

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import java.awt.Robot;
import java.awt.event.KeyEvent;


class AdditionalGlobal {

	Random ran = new Random()
	Robot robot = new Robot()

	/**
	 * Refresh browser
	 */
	@Keyword
	def refreshBrowser() {
		KeywordUtil.logInfo("Refreshing")
		WebDriver webDriver = DriverFactory.getWebDriver()
		webDriver.navigate().refresh()
		KeywordUtil.markPassed("Refresh successfully")
	}

	/**
	 * Click element
	 * @param to Katalon test object
	 */
	@Keyword
	def clickElement(TestObject to) {
		try {
			WebElement element = WebUiBuiltInKeywords.findWebElement(to);
			KeywordUtil.logInfo("Clicking element")
			element.click()
			KeywordUtil.markPassed("Element has been clicked")
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}

	/**
	 * Get all rows of HTML table
	 * @param table Katalon test object represent for HTML table
	 * @param outerTagName outer tag name of TR tag, usually is TBODY
	 * @return All rows inside HTML table
	 */
	@Keyword
	def List<WebElement> getHtmlTableRows(TestObject table, String outerTagName) {
		WebElement mailList = WebUiBuiltInKeywords.findWebElement(table)
		List<WebElement> selectedRows = mailList.findElements(By.xpath("./" + outerTagName + "/tr"))
		return selectedRows
	}

	/**
	 * Select Randomly from list of webElement
	 * @param listElements test object which contains two or more elements
	 * @return Selected one of list
	 */
	@Keyword
	def selectObjectRandomly(TestObject to) {
		List<WebElement> dt = WebUiBuiltInKeywords.findWebElements(to, 50)
		int sizeData = dt.size()
		int selectData = ran.nextInt(sizeData)

		println('all data = '+sizeData+' dan yg terpilih data ke-'+selectData)

		dt[selectData].click()
	}


	/**
	 * Select list of webElement
	 * @param listElements test object which contains two or more elements
	 * @return Selected one of list
	 */
	@Keyword
	def selectObjectBasedonIndex(TestObject to, int idx) {
		List<WebElement> dt = WebUiBuiltInKeywords.findWebElements(to, 50)
		int sizeData = dt.size()

		println('all data = '+sizeData)

		dt[idx].click()
	}

	/**
	 * Input list into multiple column
	 * @param webElements of column
	 * @param list of text
	 * @return fill column based on size of list
	 */
	@Keyword
	def inputListIntoColumns(TestObject to, List<String> texts) {
		List<WebElement> elm = WebUiBuiltInKeywords.findWebElements(to, 50)
		for (int i=0; i < texts.size(); i++) {
			elm[i].sendKeys(texts[i])
		}
	}


	/**
	 * Input value in multiple column
	 * @param webElement testObject which presented columns name
	 * @param value 
	 * @return fill multiple column in one step
	 */
	@Keyword
	def inputValueinMultipleColumn(TestObject to, String dt) {
		List<WebElement> elm = WebUiBuiltInKeywords.findWebElements(to, 50)
		List<String> listDt = dt.split('')
		for (int i=0; i<listDt.size() ; i++) {
			println(listDt[i])
			elm[i].sendKeys(listDt[i])
		}
	}

	/**
	 * Clear value in multiple columns
	 * @param webElement testObject which presented columns name
	 */
	@Keyword
	def clearMultipleColumn(TestObject to) {
		List<WebElement> elm = WebUiBuiltInKeywords.findWebElements(to, 50)
		for (int i=0; i< elm.size(); i++) {
			elm[i].clear()
		}
	}

	/**
	 * Get text from webElements
	 * @param testobject from list WebElement
	 * @return list of text
	 */
	@Keyword
	def List<String> getTextfromList(TestObject to) {
		List<WebElement> elm = WebUiBuiltInKeywords.findWebElements(to, 50)
		List<String> values = new ArrayList<String>()
		for(int i=0; i< elm.size(); i++) {
			values[i] = elm[i].getText()
			println("---- > "+values[i])
		}
		return values
	}

	/**
	 * Allow all permission popup
	 */
	@Keyword
	def allowPermissionCameraLocation() {
		robot.delay(8000)
		robot.keyPress(KeyEvent.VK_TAB)
		robot.keyRelease(KeyEvent.VK_TAB)
		robot.keyPress(KeyEvent.VK_TAB)
		robot.keyRelease(KeyEvent.VK_TAB)
		robot.keyPress(KeyEvent.VK_ENTER)
		robot.keyRelease(KeyEvent.VK_ENTER)
	}

	/**
	 * Drawing Signature in Canvas
	 */
	@Keyword
	def drawingSignature (TestObject to) {
		WebDriver driver = DriverFactory.getWebDriver()

		Actions builder = new  Actions(driver)

		WebElement ele = WebUiBuiltInKeywords.findWebElement(to)

		Action drawAction = builder.moveToElement(ele, 50, 0).clickAndHold().moveByOffset(100, 50).release().build().perform()

		Action drawAction1 = builder.moveToElement(ele, 100, 0).clickAndHold().moveByOffset(50, 50).release().build().perform()

		Action drawAction2 = builder.moveToElement(ele, 100, 0).clickAndHold().moveByOffset(100, 50).release().build().perform()
	}

	/**
	 * Waiting until webElement visible
	 * @param to as list of WebElement
	 * @param idx as index of spesific webElement
	 * @param timeout as time to stop the waiting
	 * @return continue next code after this method
	 */
	@Keyword
	def waitElementXisVisible(TestObject to, int idx, int timeout) {
		List<WebElement> elm = WebUiBuiltInKeywords.findWebElements(to, 50)
		boolean showing = false
		int times = 0
		while(showing.FALSE || times <= timeout) {
			WebUiBuiltInKeywords.delay(3)
			showing = elm[idx].isDisplayed()
			WebUiBuiltInKeywords.comment("Element still hidden")
			times = times + 3
			if(showing.TRUE) {
				WebUiBuiltInKeywords.comment("Element has showing up")
				break
			}
		}
	}

	/**
	 * Waiting until webElement has atribute value
	 * @param to as webElement
	 * @param timeOut as time range to stop the waiting
	 * @return continue next code after this method
	 */
	@Keyword
	def waitElementHasValue(TestObject to, int timeOut) {
		int times = 0
		Boolean valueNull = true
		println('melewatin step ini gk sihhh....')
		String isiValue = ''
		while (isiValue.isEmpty() || times <= timeOut ) {
			WebUiBuiltInKeywords.delay(3)
			isiValue = WebUiBuiltInKeywords.getAttribute(to, 'value')
			times = times + 5
			println('isi value nya = '+isiValue)
			if(!isiValue.isEmpty()) {
				println('klu  kesini juga singgah gk')
				break
			}
		}
	}

	/**
	 * Return amount of list webElements
	 * @param to represent as list of webElements
	 * @return
	 */
	@Keyword
	def int getSizeofListWebelement(TestObject to) {
		List<WebElement> arrList = WebUiBuiltInKeywords.findWebElements(to, 50)
		int sizeOfList = arrList.size()
		return sizeOfList
	}
	

	
}