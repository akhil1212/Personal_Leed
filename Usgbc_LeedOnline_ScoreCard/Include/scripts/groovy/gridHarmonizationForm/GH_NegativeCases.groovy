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

import com.kms.katalon.core.configuration.RunConfiguration


class GH_NegativeCases {
	/**
	 *  Demand Response Program (Case 1)
	 */


	@Given("User should be in Demand Response Program option")
	public void user_should_be_in_Demand_Response_Program_option() {
		WebUI.callTestCase(findTestCase('Test Cases/GridHarmonization/TC_GH_Navigate'), null, FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Object Repository/GridHarmonization/DemandResponsePrgrm_Case1/input_SelectOption'))
		WebUI.delay(2)
	}

	@When("User clicks on save button without entering any data in GH")
	public void user_clicks_on_save_button_without_entering_any_data_in_GH() {
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/GridHarmonization/button_Save'))
		WebUI.delay(2)
	}

	/*@Then("An error message saying Please fix the highlighted errors will be displayed")
	public void an_error_message_saying_Please_fix_the_highlighted_errors_will_be_displayed() {
	}*/

	@Given("User should be able to see the Add File button of Proof of enrollement for Demand Response Capable in Grid Harmonization")
	public void user_should_be_able_to_see_the_Add_File_button_of_Proof_of_enrollement_for_Demand_Response_Capable_in_Grid_Harmonization() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/GridHarmonization/DemandResponsePrgrm_Case1/AddFile/p_Upload proof of enrollment'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/GridHarmonization/DemandResponsePrgrm_Case1/AddFile/p_Upload proof of enrollment'), 30)
	}

	@When("User uploads a file which is greater than 100 mb of Proof of enrollement for Demand Response Capable (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_Proof_of_enrollement_for_Demand_Response_Capable_MBfile_pdf(String Proof_of_enrollement) {
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+Proof_of_enrollement
		println ("######################"+ myPdffilePath)

		WebUI.scrollToElement(findTestObject('Object Repository/GridHarmonization/DemandResponsePrgrm_Case1/AddFile/p_Upload proof of enrollment'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/GridHarmonization/DemandResponsePrgrm_Case1/AddFile/input_AddFile_UploadProof'), myPdffilePath)
	}

	/*@Then("An error message saying Maximum allowed file size is 100 MB only will be displayed")
	public void an_error_message_saying_Maximum_allowed_file_size_is_MB_only_will_be_displayed() {
		WebUI.delay(2)
		boolean str =	WebUI.verifyTextPresent("Maximum allowed file size is 100 MB only.", false)
		println "###########" + str
	}*/

	@When("User uploads a file of Proof of enrollement for Demand Response Capable (.*)")
	public void user_uploads_a_file_of_Proof_of_enrollement_for_Demand_Response_Capable_MBfile_doc(String Proof_of_enrollement ) {
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+Proof_of_enrollement
		println ("######################"+ myPdffilePath)

		WebUI.scrollToElement(findTestObject('Object Repository/GridHarmonization/DemandResponsePrgrm_Case1/AddFile/p_Upload proof of enrollment'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/GridHarmonization/DemandResponsePrgrm_Case1/AddFile/input_AddFile_UploadProof'), myPdffilePath)
	}

	@Then("User clicks on save while the file is uploading in GH")
	public void user_clicks_on_save_while_the_file_is_uploading_in_GH() {
		WebUI.scrollToElement(findTestObject('Object Repository/GridHarmonization/button_Save'), 30)
		WebUI.click(findTestObject('Object Repository/GridHarmonization/button_Save'))
	}

	/*@Then("An error message saying Please wait running actions to complete will be displayed")
	public void an_error_message_saying_Please_wait_running_actions_to_complete_will_be_displayed() {
		WebUI.delay(3)
		boolean str =	WebUI.verifyTextPresent("Please wait running actions to complete.", false)
		println "###########" + str
		WebUI.delay(2)
	}*/

	@Given("User should be able to see the textbox for Electricity in Grid Harmonization")
	public void user_should_be_able_to_see_the_textbox_for_Electricity_in_Grid_Harmonization() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/GridHarmonization/DemandResponsePrgrm_Case1/input_On-peak electricity demand'),4)
	}
	String Electricity
	@When("User can enter the values for Electricity (.*)")
	public void user_can_enter_the_values_for_Electricity(Electricity ) {
		WebUI.setText(findTestObject('Object Repository/GridHarmonization/DemandResponsePrgrm_Case1/input_On-peak electricity demand'), Electricity)
	}

	@Then("User can see the entered value and the value present in the Electricity is not same")
	public void user_can_see_the_entered_value_and_the_value_present_in_the_Electricity_is_not_same() {
		String enterdValue = WebUI.getAttribute(findTestObject('Object Repository/GridHarmonization/DemandResponsePrgrm_Case1/input_On-peak electricity demand'), 'value')
		println "The entered Value is "+ enterdValue
		println "The Overall Score is " + Electricity
		WebUI.verifyNotMatch(Electricity, enterdValue, false)
	}

	@Given("User should be able to see the textbox for Demand reduction in Grid Harmonization")
	public void user_should_be_able_to_see_the_textbox_for_Demand_reduction_in_Grid_Harmonization() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/GridHarmonization/DemandResponsePrgrm_Case1/input_Planned demand'),4)
	}
	String Demand_reduction
	@When("User can enter the values for Demand reduction (.*)")
	public void user_can_enter_the_values_for_Demand_reduction(Demand_reduction) {
		WebUI.setText(findTestObject('Object Repository/GridHarmonization/DemandResponsePrgrm_Case1/input_Planned demand'), Electricity)
	}

	@Then("User can see the entered value and the value present in the Demand reduction is not same")
	public void user_can_see_the_entered_value_and_the_value_present_in_the_Demand_reduction_is_not_same() {
		String enterdValue = WebUI.getAttribute(findTestObject('Object Repository/GridHarmonization/DemandResponsePrgrm_Case1/input_Planned demand'), 'value')
		println "The entered Value is "+ enterdValue
		println "The Overall Score is " + Demand_reduction
		WebUI.verifyNotMatch(Demand_reduction, enterdValue, false)
	}


	/**
	 *  Demand Response Capable (Case 2)
	 */


	@Given("User should be in Demand Response Capable option")
	public void user_should_be_in_Demand_Response_Capable_option() {
		WebUI.callTestCase(findTestCase('Test Cases/GridHarmonization/TC_GH_Navigate'), null, FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Object Repository/GridHarmonization/DemandResponsePrgrm_Case1/input_SelectOption'))
		WebUI.delay(2)
	}
	@Given("User should be able to see the textbox for peak Electricity in Grid Harmonization")
	public void User_should_be_able_to_see_the_textbox_for_peak_Electricity_in_Grid_Harmonization(){
		WebUI.verifyElementPresent(findTestObject('Object Repository/GridHarmonization/DemandResponseCapable_Case2/input_peak electircity demand'),4)
	}
	String Peak_Electricity
	@When("User can enter the values for Peak Electricity (.*)")
	public void user_can_enter_the_values_for_Peak_Electricity() {
		WebUI.setText(findTestObject('Object Repository/GridHarmonization/DemandResponseCapable_Case2/input_peak electircity demand'), Peak_Electricity)
	}

	@Then("User can see the entered value and the value present in the Peak Electricity is not same")
	public void user_can_see_the_entered_value_and_the_value_present_in_the_Peak_Electricity_is_not_same() {
		String enterdValue = WebUI.getAttribute(findTestObject('Object Repository/GridHarmonization/DemandResponseCapable_Case2/input_peak electircity demand'), 'value')
		println "The entered Value is "+ enterdValue
		println "The Overall Score is " + Peak_Electricity
		WebUI.verifyNotMatch(Peak_Electricity, enterdValue, false)
	}
	@Given("User should be able to see the textbox for planned demand reduction in Grid Harmonization")
	public void User_should_be_able_to_see_the_textbox_for_planned_demand_reduction_in_Grid_Harmonization(){
		WebUI.verifyElementPresent(findTestObject('Object Repository/GridHarmonization/DemandResponseCapable_Case2/input_PlannedDemandReduction'),2)
	}
	String Planned_demand_reduction
	@When("User can enter the values for planned demand reduction (.*)")
	public void user_can_enter_the_values_for_planned_demand_reduction(Planned_demand_reduction) {
		WebUI.setText(findTestObject('Object Repository/GridHarmonization/DemandResponseCapable_Case2/input_PlannedDemandReduction'), Planned_demand_reduction)
	}

	@Then("User can see the entered value and the value present in the Planned demand reduction is not same")
	public void user_can_see_the_entered_value_and_the_value_present_in_the_Planned_demand_reduction_is_not_same() {
		String enterdValue = WebUI.getAttribute(findTestObject('Object Repository/GridHarmonization/DemandResponseCapable_Case2/input_PlannedDemandReduction'), 'value')
		println "The entered Value is "+ enterdValue
		println "The Overall Score is " + Planned_demand_reduction
		WebUI.verifyNotMatch(Planned_demand_reduction, enterdValue, false)
	}


	/**
	 *  Permanent Load Shifting (Case 3)
	 */




	@Given("User should be in Permanent Load Shifting option")
	public void user_should_be_in_Permanent_Load_Shifting_option() {
		WebUI.callTestCase(findTestCase('Test Cases/GridHarmonization/TC_GH_Navigate'), null, FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Object Repository/GridHarmonization/PermanentLoadShifting_Case3/input_SelectOption'))
		WebUI.delay(2)
	}

	@Given("User should be able to see the Add File button of Summary for Permanent Load Shifting in Grid Harmonization")
	public void user_should_be_able_to_see_the_Add_File_button_of_Summary_for_Permanent_Load_Shifting_in_Grid_Harmonization() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/GridHarmonization/PermanentLoadShifting_Case3/AddFile/p_Upload a summary'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/GridHarmonization/PermanentLoadShifting_Case3/AddFile/p_Upload a summary'), 30)
	}

	@When("User uploads a file which is greater than 100mb of Summary for Permanent Load Shifting (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_Summary_for_Permanent_Load_Shifting_MBfile_pdf(String Summary) {
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+Summary
		println ("######################"+ myPdffilePath)

		WebUI.scrollToElement(findTestObject('Object Repository/GridHarmonization/PermanentLoadShifting_Case3/AddFile/p_Upload a summary'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/GridHarmonization/PermanentLoadShifting_Case3/AddFile/input_AddFile_UploadSummary'), myPdffilePath)
	}

	@When("User uploads a file of Summary for Permanent Load Shifting (.*)")
	public void user_uploads_a_file_of_Summary_for_Permanent_Load_Shifting_MBfile_doc(String Summary) {
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+Summary
		println ("######################"+ myPdffilePath)

		WebUI.scrollToElement(findTestObject('Object Repository/GridHarmonization/PermanentLoadShifting_Case3/AddFile/p_Upload a summary'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/GridHarmonization/PermanentLoadShifting_Case3/AddFile/input_AddFile_UploadSummary'), myPdffilePath)
	}

	@Given("User should be able to see the textbox for On Peak Electricity in Grid Harmonization")
	public void user_should_be_able_to_see_the_textbox_for_On_Peak_Electricity_in_Grid_Harmonization() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/GridHarmonization/PermanentLoadShifting_Case3/input_PeakElectricityDemand'),5)
	}
	String On_Peak_Electricity
	@When("User can enter the values for On Peak Electricity (.*)")
	public void user_can_enter_the_values_for_On_Peak_Electricity(On_Peak_Electricity) {
		WebUI.setText(findTestObject('Object Repository/GridHarmonization/PermanentLoadShifting_Case3/input_PeakElectricityDemand'), On_Peak_Electricity)
	}

	@Then("User can see the entered value and the value present in the On Peak Electricity is not same")
	public void user_can_see_the_entered_value_and_the_value_present_in_the_On_Peak_Electricity_is_not_same() {
		String enterdValue = WebUI.getAttribute(findTestObject('Object Repository/GridHarmonization/PermanentLoadShifting_Case3/input_PeakElectricityDemand'), 'value')
		println "The entered Value is "+ enterdValue
		println "The Overall Score is " + On_Peak_Electricity
		WebUI.verifyNotMatch(On_Peak_Electricity, enterdValue, false)
	}


	@Given("User should be able to see the textbox for Planned demand in Grid Harmonization")
	public void user_should_be_able_to_see_the_textbox_for_Planned_demand_in_Grid_Harmonization() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/GridHarmonization/PermanentLoadShifting_Case3/input_PlannedDemandReduction'),3)
	}
	String Planned_demand
	@When("User can enter the values for Planned demand (.*)")
	public void user_can_enter_the_values_for_Planned_demand(Planned_demand) {
		WebUI.setText(findTestObject('Object Repository/GridHarmonization/PermanentLoadShifting_Case3/input_PlannedDemandReduction'), Planned_demand)
	}

	@Then("User can see the entered value and the value present in the Planned demand is not same")
	public void user_can_see_the_entered_value_and_the_value_present_in_the_Planned_demand_is_not_same() {
		String enterdValue = WebUI.getAttribute(findTestObject('Object Repository/GridHarmonization/PermanentLoadShifting_Case3/input_PlannedDemandReduction'), 'value')
		println "The entered Value is "+ enterdValue
		println "The Overall Score is " + Planned_demand
		WebUI.verifyNotMatch(Planned_demand, enterdValue, false)
	}
}