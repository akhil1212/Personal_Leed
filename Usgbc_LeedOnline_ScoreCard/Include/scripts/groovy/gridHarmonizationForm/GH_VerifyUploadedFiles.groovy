package gridHarmonizationForm
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


class GH_VerifyUploadedFiles {

	/*  Verify Permanent Load Shifting (Case 3)
	 */
	String iframe='Object Repository/GridHarmonization/iframe'


	@Given("User has to see the table of uploaded files of summary in Grid Harmonization")
	public void user_has_to_see_the_table_of_uploaded_files_of_summary_in_Grid_Harmonization() {
		WebUI.callTestCase(findTestCase('Test Cases/GridHarmonization/TC_GH_Navigate'), null, FailureHandling.STOP_ON_FAILURE)

		WebUI.scrollToElement(findTestObject('Object Repository/GridHarmonization/PermanentLoadShifting_Case3/AddFile/Table_UploadSummary'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/GridHarmonization/PermanentLoadShifting_Case3/AddFile/Table_UploadSummary'), 30)
	}

	@Then("User verifies the file name uploaded with the file name present in the table summary in Grid Harmonization")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_summary_in_Grid_Harmonization() {
		String tableRow = "Object Repository/GridHarmonization/PermanentLoadShifting_Case3/AddFile/tbody_UploadSummary"
		String tableId = GH_Entities.tableId_Xpath_Summary
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,iframe)
	}

	@Given("User has to see the table of uploaded files of Proof of enrollement in Grid Harmonization")
	public void user_has_to_see_the_table_of_uploaded_files_of_Proof_of_enrollement_in_Grid_Harmonization() {
		
		WebUI.delay(2)
		
		WebUI.scrollToElement(findTestObject('Object Repository/GridHarmonization/DemandResponsePrgrm_Case1/input_SelectOption'), 5)
		WebUI.check(findTestObject('Object Repository/GridHarmonization/DemandResponsePrgrm_Case1/input_SelectOption'))
		WebUI.scrollToElement(findTestObject('Object Repository/GridHarmonization/DemandResponsePrgrm_Case1/AddFile/Table_UploadProof'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/GridHarmonization/DemandResponsePrgrm_Case1/AddFile/Table_UploadProof'), 30)
	}

	@Then("User verifies the file name uploaded with the file name present in the table Proof of enrollement in Grid Harmonization")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_Proof_of_enrollement_in_Grid_Harmonization() {
		
		String tableRow = "Object Repository/GridHarmonization/DemandResponsePrgrm_Case1/AddFile/tbody_UploadProof"
		String tableId = GH_Entities.tableId_Xpath_Proof_Of_Enrollement
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,iframe)
	}

	@Given("User has to see the table of uploaded files of additional documentation in Grid Harmonization")
	public void user_has_to_see_the_table_of_uploaded_files_of_additional_documentation_in_Grid_Harmonization() {
		WebUI.scrollToElement(findTestObject('Object Repository/GridHarmonization/SpecialCircumstances/SC_AddFile/Table_Sc_AddFile'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/GridHarmonization/SpecialCircumstances/SC_AddFile/Table_Sc_AddFile'), 30)
	}

	@Then("User verifies the file name uploaded with the file name present in the table additional documentation in Grid Harmonization")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_additional_documentation_in_Grid_Harmonization() {
		String tableRow = "Object Repository/GridHarmonization/SpecialCircumstances/SC_AddFile/tbody_SC_AddFile"
		String tableId = GH_Entities.tableId_Xpath_Additional_Documentation
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,iframe)
	}
	@And("User should clear the form draft by clicking on clear draft")
	public void User_should_clear_the_form_draft_by_clicking_on_clear_draft(){
		WebUI.delay(10)
		WebUI.click(findTestObject('Object Repository/GridHarmonization/Autosave/a_Clear draft'))
	}
	@And("User should click on Yes button to clear draft")
	public void User_should_click_on_Yes_button_to_clear_draft(){
		WebUI.click(findTestObject('Object Repository/GridHarmonization/button_Yes'))
	}
}
