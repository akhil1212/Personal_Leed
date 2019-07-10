package greenCleaningForm
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


class GC_NegativeCases {

	/**
	 *  Custodial effectiveness assessment (Option 1)
	 */

	@Given("User should be in Custodial effectiveness assessment option")
	public void user_should_be_in_Custodial_effectiveness_assessment_option() {

		WebUI.callTestCase(findTestCase('Test Cases/GreenCleaning/TC_GC_Navigate'), null, FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/input_SelectOption'))
		WebUI.delay(2)
	}

	@When("User clicks on save button without entering any data in GC")
	public void user_clicks_on_save_button_without_entering_any_data_in_GC() {

		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Green_Cleaning/button_Save'))
	}

	@Given("User should be able to see the Add File button of custodial effectiveness audit in Green Cleaning")
	public void user_should_be_able_to_see_the_Add_File_button_of_custodial_effectiveness_audit_in_Green_Cleaning() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/AddFile_UploadCustodialEffectivenessAudit/p_Custodial Effectiveness'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/AddFile_UploadCustodialEffectivenessAudit/p_Custodial Effectiveness'), 30)
	}

	@When("User uploads a file which is greater than 100mb of custodial effectiveness audit (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_custodial_effectiveness_audit(String custodial_effectiveness) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+custodial_effectiveness
		println ("######################"+ myPdffilePath)

		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/AddFile_UploadCustodialEffectivenessAudit/p_Custodial Effectiveness'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/AddFile_UploadCustodialEffectivenessAudit/input_custodial'), myPdffilePath)
	}

	@When("User uploads a file of custodial effectiveness audit (.*)")
	public void user_uploads_a_file_of_custodial_effectiveness_audit(String custodial_effectiveness) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+custodial_effectiveness
		println ("######################"+ myPdffilePath)

		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/AddFile_UploadCustodialEffectivenessAudit/p_Custodial Effectiveness'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/AddFile_UploadCustodialEffectivenessAudit/input_custodial'), myPdffilePath)
	}

	@Then("User clicks on save while the file is uploading in GC")
	public void user_clicks_on_save_while_the_file_is_uploading_in_GC() {

		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/button_Save'), 30)
		WebUI.click(findTestObject('Object Repository/Green_Cleaning/button_Save'))
	}

	String Overall_Score
	@When("User can enter the values for Overall score facility(.*)")
	public void user_can_enter_the_values_for_Overall_score_facility(Overall_Score){
		
		WebUI.setText(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/input_Overall score'), Overall_Score)
	}

	@Then("User can see the entered value and the value present in the text box is not same")
	public void user_can_see_the_entered_value_and_the_value_present_in_the_text_box_is_not_same(){
		
		String enterdValue = WebUI.getAttribute(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/input_Overall score'), 'value')
		println "The entered Value is "+ enterdValue
		println "The Overall Score is " + Overall_Score
		WebUI.verifyNotMatch(Overall_Score, enterdValue, false)
		
	}

	@Given("User should be able to see the Add File button of additional doc in Green Cleaning")
	public void user_should_be_able_to_see_the_Add_File_button_of_additional_doc_in_Green_Cleaning() {


		WebUI.verifyElementPresent(findTestObject('Object Repository/Green_Cleaning/SpecialCircumstances/AddFile_additionalDoc_Sc/p_SC_additionalDoc'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/SpecialCircumstances/AddFile_additionalDoc_Sc/p_SC_additionalDoc'), 30)
	}

	@When("User uploads a file which is greater than 100mb of additional doc (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_additional_doc(String additional_doc) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+additional_doc
		println ("######################"+ myPdffilePath)

		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/SpecialCircumstances/AddFile_additionalDoc_Sc/p_SC_additionalDoc'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/Green_Cleaning/SpecialCircumstances/AddFile_additionalDoc_Sc/input_SCAddFile'), myPdffilePath)
	}

	@When("User uploads a file of additional doc (.*)")
	public void user_uploads_a_file_of_additional_doc_MBfile_doc(String additional_doc) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+additional_doc
		println ("######################"+ myPdffilePath)

		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/SpecialCircumstances/AddFile_additionalDoc_Sc/p_SC_additionalDoc'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/Green_Cleaning/SpecialCircumstances/AddFile_additionalDoc_Sc/input_SCAddFile'), myPdffilePath)
	}

	/**
	 * Entryway systems (Option 2)
	 */


	@Given("User should be in Entryway systems option")
	public void user_should_be_in_Entryway_systems_option() {

		WebUI.callTestCase(findTestCase('Test Cases/GreenCleaning/TC_GC_Navigate'), null, FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Object Repository/Green_Cleaning/Entryway_systems_Opt2/input_option2'))
		WebUI.delay(2)
	}

	@Given("User should be able to see the Add File button of photos for Entryway systems in Green Cleaning")
	public void user_should_be_able_to_see_the_Add_File_button_of_photos_for_Entryway_systems_in_Green_Cleaning() {


		WebUI.verifyElementPresent(findTestObject('Object Repository/Green_Cleaning/Entryway_systems_Opt2/AddFile_Uploadphotos/p_Upload photos'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/Entryway_systems_Opt2/AddFile_Uploadphotos/p_Upload photos'), 30)
	}

	@When("User uploads a file which is greater than 100mb of photos for Entryway systems (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_photos_for_Entryway_systems_MBfile_pdf(String photos) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+photos
		println ("######################"+ myPdffilePath)

		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/Entryway_systems_Opt2/AddFile_Uploadphotos/p_Upload photos'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/Green_Cleaning/Entryway_systems_Opt2/AddFile_Uploadphotos/input_permanent'), myPdffilePath)
	}

	@When("User uploads a file of photos (.*)")
	public void user_uploads_a_file_of_photos_MBfile_doc(String photos) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+photos
		println ("######################"+ myPdffilePath)

		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/Entryway_systems_Opt2/AddFile_Uploadphotos/p_Upload photos'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/Green_Cleaning/Entryway_systems_Opt2/AddFile_Uploadphotos/input_permanent'), myPdffilePath)
	}


	/**
	 * Powered cleaning equipment (Option 3)
	 * 
	 */


	@Given("User should be in Powered cleaning equipment option")
	public void user_should_be_in_Powered_cleaning_equipment_option() {

		WebUI.callTestCase(findTestCase('Test Cases/GreenCleaning/TC_GC_Navigate'), null, FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Object Repository/Green_Cleaning/Powered_Cleaning_Opt3/input_option3'))
		WebUI.delay(2)
	}

	@Given("User should be able to see the Add File button of Green Cleaning Calculator for Powered cleaning equipment in Green Cleaning")
	public void user_should_be_able_to_see_the_Add_File_button_of_Green_Cleaning_Calculator_for_Powered_cleaning_equipment_in_Green_Cleaning() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/Green_Cleaning/Powered_Cleaning_Opt3/AddFile_UploadGC_Calc/p_GC_calculator'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/Powered_Cleaning_Opt3/AddFile_UploadGC_Calc/p_GC_calculator'), 30)
	}

	@When("User uploads a file which is greater than 100mb of Green Cleaning Calculator for Powered cleaning equipment (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_Green_Cleaning_Calculator_for_Powered_cleaning_equipment_MBfile_pdf(String Green_Cleaning_Calc) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+Green_Cleaning_Calc
		println ("######################"+ myPdffilePath)

		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/Powered_Cleaning_Opt3/AddFile_UploadGC_Calc/p_GC_calculator'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/Green_Cleaning/Powered_Cleaning_Opt3/AddFile_UploadGC_Calc/input_GC_Calc'), myPdffilePath)
	}


	@When("User uploads a file of Green Cleaning Calculator (.*)")
	public void user_uploads_a_file_of_Green_Cleaning_Calculator(String Green_Cleaning_Calc) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+Green_Cleaning_Calc
		println ("######################"+ myPdffilePath)

		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/Powered_Cleaning_Opt3/AddFile_UploadGC_Calc/p_GC_calculator'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/Green_Cleaning/Powered_Cleaning_Opt3/AddFile_UploadGC_Calc/input_GC_Calc'), myPdffilePath)
	}

	@Given("User should be able to see the textbox for powered janitorial equipment  in green cleaning")
	public void user_should_be_able_to_see_the_textbox_for_powered_janitorial_equipment_in_green_cleaning() {
		
		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/Powered_Cleaning_Opt3/input_Percent by cost'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Green_Cleaning/Powered_Cleaning_Opt3/input_Percent by cost'), 30)
	}
	
	String powered_janitorial
	@When("User can enter the values for powered janitorial equipment (.*)")
	public void user_can_enter_the_values_for_powered_janitorial_equipment(powered_janitorial) {
		
		WebUI.setText(findTestObject('Object Repository/Green_Cleaning/Powered_Cleaning_Opt3/input_Percent by cost'), powered_janitorial)
		
	}
	
	@Then("User can see the entered value and the value present in the powered janitorial equipment is not same")
	public void user_can_see_the_entered_value_and_the_value_present_in_the_powered_janitorial_equipment_is_not_same() {
		
		String enterdValue = WebUI.getText(findTestObject('Object Repository/Green_Cleaning/Powered_Cleaning_Opt3/input_Percent by cost'))
		//WebUI.getAttribute(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/input_Overall score'), 'value')
		println "The entered Value is "+ enterdValue
		println "The Overall Score is " + powered_janitorial
		WebUI.verifyNotMatch(powered_janitorial, enterdValue, false)
		
		
	}

	/**
	 *  Cleaning products and materials(Option 4)
	 *
	 */


	@Given("User should be in Cleaning products and materials option")
	public void user_should_be_in_Cleaning_products_and_materials_option() {

		WebUI.callTestCase(findTestCase('Test Cases/GreenCleaning/TC_GC_Navigate'), null, FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/input_option4'))
		WebUI.delay(2)
	}

	@Given("User should be able to see the Add File button of Green Cleaning Calculator for Cleaning products in Green Cleaning")
	public void user_should_be_able_to_see_the_Add_File_button_of_Green_Cleaning_Calculator_for_Cleaning_products_in_Green_Cleaning() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/Green_Cleaning/Powered_Cleaning_Opt3/AddFile_UploadGC_Calc/p_GC_calculator'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/Powered_Cleaning_Opt3/AddFile_UploadGC_Calc/p_GC_calculator'), 30)
	}

	@When("User uploads a file which is greater than 100mb of Green Cleaning Calculator for Cleaning products (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_Green_Cleaning_Calculator_for_Cleaning_products(String Green_Cleaning_Calc) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+Green_Cleaning_Calc
		println ("######################"+ myPdffilePath)

		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/Powered_Cleaning_Opt3/AddFile_UploadGC_Calc/p_GC_calculator'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/Green_Cleaning/Powered_Cleaning_Opt3/AddFile_UploadGC_Calc/input_GC_Calc'), myPdffilePath)
	}


	@When("User uploads a file of Green Cleaning Calc for Cleaning products (.*)")
	public void user_uploads_a_file_of_Green_Cleaning_Calc_for_Cleaning_products(String Green_Cleaning_Calc) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+Green_Cleaning_Calc
		println ("######################"+ myPdffilePath)

		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/Powered_Cleaning_Opt3/AddFile_UploadGC_Calc/p_GC_calculator'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/Green_Cleaning/Powered_Cleaning_Opt3/AddFile_UploadGC_Calc/input_GC_Calc'), myPdffilePath)
	}

	@Given("User should be able to see the Add File button of executed contract for Cleaning products in Green Cleaning")
	public void user_should_be_able_to_see_the_Add_File_button_of_executed_contract_for_Cleaning_products_in_Green_Cleaning() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/AddFile_Upload_executedContract/p_executedContract'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/AddFile_Upload_executedContract/p_executedContract'), 30)
	}

	@When("User uploads a file which is greater than 100mb of executed contract for Cleaning products (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_executed_contract_for_Cleaning_products(String executed_contract) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+executed_contract
		println ("######################"+ myPdffilePath)

		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/AddFile_Upload_executedContract/p_executedContract'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/AddFile_Upload_executedContract/input_executedContract'), myPdffilePath)
	}

	@When("User uploads a file of executed contract (.*)")
	public void user_uploads_a_file_of_executed_contract(String executed_contract) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+executed_contract
		println ("######################"+ myPdffilePath)

		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/AddFile_Upload_executedContract/p_executedContract'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/AddFile_Upload_executedContract/input_executedContract'), myPdffilePath)
	}

	@Given("User should be able to see the Add File button of MSDS sheets for Cleaning products in Green Cleaning")
	public void user_should_be_able_to_see_the_Add_File_button_of_MSDS_sheets_for_Cleaning_products_in_Green_Cleaning() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/AddFile_Upload_MSDS/p_msds'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/AddFile_Upload_MSDS/p_msds'), 30)
	}

	@When("User uploads a file which is greater than 100mb of MSDS sheets for Cleaning products (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_MSDS_sheets_for_Cleaning_products(String MSDS_sheets) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+MSDS_sheets
		println ("######################"+ myPdffilePath)

		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/AddFile_Upload_MSDS/p_msds'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/AddFile_Upload_MSDS/input_MSDS'), myPdffilePath)
	}

	@When("User uploads a file of MSDS sheets (.*)")
	public void user_uploads_a_file_of_MSDS_sheets_MBfile_doc(String MSDS_sheets) {

		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+MSDS_sheets
		println ("######################"+ myPdffilePath)

		WebUI.scrollToElement(findTestObject('Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/AddFile_Upload_MSDS/p_msds'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/AddFile_Upload_MSDS/input_MSDS'), myPdffilePath)
	}
	
	String cleaning_products
	@When("User can enter the values for cleaning products (.*)")
	public void user_can_enter_the_values_for_cleaning_products(cleaning_products){
		
		WebUI.setText(findTestObject('Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/input_percentbycost'), cleaning_products)
	}
	
	
	@Then ("User can see the entered value and the value present in the cleaning products is not same")
	public void user_can_see_the_entered_value_and_the_value_present_in_the_cleaning_products_is_not_same(){
		
		String enterdValue = WebUI.getText(findTestObject('Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/input_percentbycost'))
		//WebUI.getAttribute(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/input_Overall score'), 'value')
		println "The entered Value is "+ enterdValue
		println "The Overall Score is " + cleaning_products
		WebUI.verifyNotMatch(cleaning_products, enterdValue, false)
	}
	
	String Percent_cleaning
	@When("User can enter the values for Percent of cleaning products (.*)")
	public void user_can_enter_the_values_for_Percent_of_cleaning_products(Percent_cleaning){
		
		WebUI.setText(findTestObject('Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/input_percentbycost'), Percent_cleaning)
	}
	
	
	@Then ("User can see the entered value and the value present in the Percent of cleaning products is not same")
	public void user_can_see_the_entered_value_and_the_value_present_in_the_Percent_of_cleaning_products_is_not_same(){
		
		String enterdValue = WebUI.getText(findTestObject('Object Repository/Green_Cleaning/CleaningPrdctsMaterials_Opt4/input_percentbycost'))
		//WebUI.getAttribute(findTestObject('Object Repository/Green_Cleaning/Custodial_Effectiveness_Opt1/input_Overall score'), 'value')
		println "The entered Value is "+ enterdValue
		println "The Overall Score is " + Percent_cleaning
		WebUI.verifyNotMatch(Percent_cleaning, enterdValue, false)
	}
	
	
	
	
	
	
	
	
	
	
	
	
}