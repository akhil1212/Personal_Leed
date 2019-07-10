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

class ERM_VerifyUploadedFiles {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User has to see the table of uploaded files on refrigerant equipment schedule")
	public void user_has_to_see_the_table_of_uploaded_files_on_refrigerant_equipment_schedule() {
	     
		WebUI.callTestCase(findTestCase('Test Cases/EnhancedRefrigerantManagement/TC_ERM_Navigation'), null, FailureHandling.STOP_ON_FAILURE)
		
		WebUI.scrollToElement(findTestObject('Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/AddFile_refrigerant_equi/Table_refrigerant_equi'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/AddFile_refrigerant_equi/Table_refrigerant_equi'), 30)
	}
	
	@Then("User verifies the file name uploaded with the file name present in the table of refrigerant equipment schedule")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_of_refrigerant_equipment_schedule() {
	     
		String tableRow = "Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/AddFile_refrigerant_equi/tbody_Table_refrigerant_equi"
		String tableId = ERM_Entities.tableId_Xpath_commercial_RefrigUpload
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,ERM_Entities.iframe)
	}
	
	@Given("User has to see the table of uploaded files on special circumstances in ERM Form")
	public void user_has_to_see_the_table_of_uploaded_files_on_special_circumstances_in_ERM_Form() {
		 
		WebUI.scrollToElement(findTestObject('Object Repository/EnhancedRefrigerantManagement/Special Circumstances/AddFile_additionalDoc/Table_additionalDoc'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/EnhancedRefrigerantManagement/Special Circumstances/AddFile_additionalDoc/Table_additionalDoc'), 30)
	}
	
	@Then("User verifies the file name uploaded with the file name present in the table of special circumstances in ERM Form")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_of_special_circumstances_in_ERM_Form() {
		 
		String tableRow = "Object Repository/EnhancedRefrigerantManagement/Special Circumstances/AddFile_additionalDoc/tbody_Table_additionalDoc"
		String tableId = ERM_Entities.tableId_Xpath_splCircumstances
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,ERM_Entities.iframe)
	}
	

}