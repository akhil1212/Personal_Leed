package enhancedRefrigerantManagement
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.configuration.RunConfiguration
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


class ERM_NegativeCases {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User should be in Calculation of Refrigerant Impact option")
	public void user_should_be_in_Calculation_of_Refrigerant_Impact_option() {
	     
		WebUI.callTestCase(findTestCase('Test Cases/EnhancedRefrigerantManagement/TC_ERM_Navigation'), null, FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("User clicks on save button without entering any data in ERM Form")
	public void user_clicks_on_save_button_without_entering_any_data_in_ERM_Form() {
	    
		WebUI.scrollToElement(findTestObject('Object Repository/EnhancedRefrigerantManagement/button_Save'), 30)
		WebUI.verifyElementVisible(findTestObject('Object Repository/EnhancedRefrigerantManagement/button_Save'))
	}
	
	@When("User uploads a file which is greater than 100mb of refrigerant equipment schedule (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_refrigerant_equipment_schedule(String refrigerant_equi) {
	     
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+refrigerant_equi
		println ("######################"+ myPdffilePath)
		
		WebUI.scrollToElement(findTestObject('Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/AddFile_refrigerant_equi/p_refrigerant_equi'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/AddFile_refrigerant_equi/input_refrigerant_equi'), myPdffilePath)
	}
	
	@When("User uploads a file of refrigerant equipment schedule (.*)")
	public void user_uploads_a_file_of_refrigerant_equipment_schedule(String refrigerant_equi) {
	 
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+refrigerant_equi
		println ("######################"+ myPdffilePath)
		
		WebUI.scrollToElement(findTestObject('Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/AddFile_refrigerant_equi/p_refrigerant_equi'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/AddFile_refrigerant_equi/input_refrigerant_equi'), myPdffilePath)
	}
	
	@Then("User clicks on save while the file is uploading in ERM Form")
	public void user_clicks_on_save_while_the_file_is_uploading_in_ERM_Form() {
	     
		WebUI.scrollToElement(findTestObject('Object Repository/EnhancedRefrigerantManagement/button_Save'), 30)
		WebUI.verifyElementVisible(findTestObject('Object Repository/EnhancedRefrigerantManagement/button_Save'))
	}
}