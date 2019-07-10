package enhancedRefrigerantManagement
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

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

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

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

import leedOnlineKeywords.projectKeywords
import java.text.DateFormat
import java.text.SimpleDateFormat

class ERM_DeleteTableData {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	
	DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss a");
	int count,x,k
	@Given("User should be in Calculation of Refrigerant Impact")
	public void user_should_be_in_Calculation_of_Refrigerant_Impact() {
	     
		WebUI.callTestCase(findTestCase('Test Cases/EnhancedRefrigerantManagement/TC_ERM_Navigation'), null, FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject("Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/input_Calc_Refrigerant_Impact"))
	}
	
	@When("User deletes the rows for Mechanical Cooling and Refrigeration Equipment except mandatory fields")
	public void user_deletes_the_rows_for_Mechanical_Cooling_and_Refrigeration_Equipment_except_mandatory_fields() {
	     
		count = findTestData("ERM_TableData").getRowNumbers()
		WebUI.delay(2)

		x = count+1

		WebUI.switchToFrame(findTestObject('Object Repository/EnhancedRefrigerantManagement/iframe'), 5)
		Date MechanicalCooling  = new Date()
		String MechanicalCoolingStart= dateFormat.format(MechanicalCooling)
		println "Deleteing Mechanical Cooling and Refrigeration Equipment Table starting : "+MechanicalCoolingStart

		for(def row=x; row > 1 ; row--) {
			WebUI.delay(1)
			k=row

			TestObject minus = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="refrigerantTable"]/tbody/tr['+k+']/td[15]/a[2]/i', true)
			WebUI.scrollToElement(minus, 30)  												
			WebUI.click(minus)
			WebUI.delay(2)
		}
		WebUI.switchToDefaultContent()

		Date dateMechanicalCooling  = new Date()
		String MechanicalCoolingEnd= dateFormat.format(MechanicalCooling)
		println "Deleteing Mechanical Cooling Table end : "+MechanicalCoolingEnd
	}
	
	@Then("User can see all the rows are deleted except the mandatory fields in Mechanical Cooling and Refrigeration Equipment")
	public void user_can_see_all_the_rows_are_deleted_except_the_mandatory_fields_in_Mechanical_Cooling_and_Refrigeration_Equipment() {
	     
		WebUI.switchToFrame(findTestObject('Object Repository/EnhancedRefrigerantManagement/iframe'), 5)
		TestObject EquipmentType = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="refrigerantTable"]/tbody/tr[2]/td[1]/select', true)
		WebUI.verifyElementNotPresent((EquipmentType), 30)
		WebUI.switchToDefaultContent()

		WebUI.verifyElementPresent(findTestObject('Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/Table_MechanicalCooling/select_EquipmentType'), 30)
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/EnhancedRefrigerantManagement/button_Save'),30)

		WebUI.click(findTestObject('Object Repository/EnhancedRefrigerantManagement/button_Save'))

	}
	
}