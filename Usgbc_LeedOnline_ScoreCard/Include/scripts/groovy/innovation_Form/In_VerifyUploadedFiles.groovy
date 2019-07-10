package innovation_Form
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

class In_VerifyUploadedFiles {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	
	String iframe="Object Repository/Innovation/iframe"
	@Given("User has to see the table of uploaded files on project team member’s LEED Accredited")
	public void user_has_to_see_the_table_of_uploaded_files_on_project_team_member_s_LEED_Accredited() {
		 
		WebUI.callTestCase(findTestCase('Test Cases/Innovation/TC_In_Navigation'), null, FailureHandling.STOP_ON_FAILURE)
		
		WebUI.scrollToElement(findTestObject('Object Repository/Innovation/AddFile_LEED_Accredited/Table_LEED_Accredited'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Innovation/AddFile_LEED_Accredited/Table_LEED_Accredited'), 30)
	}
	
	@Then("User verifies the file name uploaded with the file name present in the table of project team member’s LEED Accredited")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_of_project_team_member_s_LEED_Accredited() {
		 
		String tableRow = "Object Repository/Innovation/AddFile_LEED_Accredited/tbody_Table_LEED_Accredited"
		String tableId = Innovation_Entities.tableId_Xpath_leedApDocs_files
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,iframe)
	}
	
	@Given("User has to see the table of uploaded files on required documentation")
	public void user_has_to_see_the_table_of_uploaded_files_on_required_documentation() {
		 
		WebUI.scrollToElement(findTestObject('Object Repository/Innovation/Pilot_Credit_Opt2/AddFile_required_doc/Table_required_doc'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Innovation/Pilot_Credit_Opt2/AddFile_required_doc/Table_required_doc'), 30)
	}
	
	@Then("User verifies the file name uploaded with the file name present in the table of required documentation")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_of_required_documentation() {
		 
		String tableRow = "Object Repository/Innovation/Pilot_Credit_Opt2/AddFile_required_doc/tbody_Table_required_doc"
		String tableId = Innovation_Entities.tableId_Xpath_RequiredDocs_files
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,iframe)
	}
	
	
	@Given("User has to see the table of uploaded files on additional documentation")
	public void user_has_to_see_the_table_of_uploaded_files_on_additional_documentation() {
		 
		WebUI.scrollToElement(findTestObject('Object Repository/Innovation/Special Circumstances/AddFile_additionalDoc/Table_additionalDoc'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Innovation/Special Circumstances/AddFile_additionalDoc/Table_additionalDoc'), 30)
	}
	
	@Then("User verifies the file name uploaded with the file name present in the table of additional documentation")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_of_additional_documentation() {
		 
		String tableRow = "Object Repository/Innovation/Special Circumstances/AddFile_additionalDoc/tbody_Table_additionalDoc"
		String tableId = Innovation_Entities.tableId_Xpath_splCircumstancesDocs_files
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,iframe)
	}
	
	
	
	@Given("User has to see the table of uploaded files on supporting documentation in Innovation Strategy")
	public void user_has_to_see_the_table_of_uploaded_files_on_supporting_documentation_in_Innovation_Strategy() {
		 
		WebUI.scrollToElement(findTestObject('Object Repository/Innovation/Innovation_Strategy_Opt1/AddFile_supporting_doc/Table_supporting_doc'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Innovation/Innovation_Strategy_Opt1/AddFile_supporting_doc/Table_supporting_doc'), 30)
	}
	
	@Then("User verifies the file name uploaded with the file name present in the table of supporting documentation in Innovation Strategy")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_of_supporting_documentation_in_Innovation_Strategy() {
		 
		String tableRow = "Object Repository/Innovation/Innovation_Strategy_Opt1/AddFile_supporting_doc/tbody_Table_supporting_doc"
		String tableId = Innovation_Entities.tableId_Xpath_SupportingDocs_files
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,iframe)
	}
	
	@Then("User should see saving of draft after 10 seconds in Innovation")
	public void user_should_see_saving_of_draft_after_seconds_in_Innovation() {
		 WebUI.delay(10)
		 WebUI.verifyElementPresent(findTestObject('Object Repository/Innovation/Autosave/a_Clear draft'), 30)
	}
	
	@Then("User clicks clear draft in Innovation")
	public void user_clicks_clear_draft_in_Innovation() {
		
		WebUI.click(findTestObject('Object Repository/Innovation/Autosave/a_Clear draft'))
		WebUI.click(findTestObject('Object Repository/Innovation/Autosave/button_Yes'))
	} 
	
	
}