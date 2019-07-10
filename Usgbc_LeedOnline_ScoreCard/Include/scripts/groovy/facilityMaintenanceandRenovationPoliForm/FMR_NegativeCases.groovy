package facilityMaintenanceandRenovationPoliForm
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


class FMR_NegativeCases {
	
	@Given ("User should be in Facility Maintenance and Renovation policy form")
	 public void user_should_be_in_Facility_Maintenance_and_Renovation_policy_form(){
		
		 WebUI.callTestCase(findTestCase('Test Cases/FacilityMaintenanceandRenovationPolicy/TC_FMR_Navigation'), null, FailureHandling.STOP_ON_FAILURE)
		 
		 boolean insideForm = WebUI.verifyElementPresent(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/FMR_Navigation/div_Facility Maintenance and Renovation Poli1000160337'), 30)
		 if (insideForm == true){
			 println "Inside the FMR form"
		 }
		 else {
			 println "Not inside the FMR form"
		 }
	}
	
	@When("User clicks on save button without entering any data in FMR")
	public void user_clicks_on_save_button_without_entering_any_data_in_FMR() {
		
		WebUI.scrollToElement(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/button_Save'), 30)
		WebUI.click(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/button_Save'))
	}
	
	@Given ("User should see the Add File button for Base building in FMR Form")
	public void user_should_see_the_Add_File_button_for_Base_building_in_FMR_Form()
	{
		WebUI.verifyElementPresent(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Base building/p_Upload the Base building element'), 30)
		WebUI.scrollToElement(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Base building/p_Upload the Base building element'), 30)
	}
	
	@When("User uploads a file which is greater than 100mb of Base building in FMR Form (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_Base_building_in_FMR_Form_MBfile_pdf(String Base_building) {
		
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+Base_building
		println ("######################"+ myPdffilePath)
		
		WebUI.scrollToElement(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Base building/p_Upload the Base building element'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Base building/input'), myPdffilePath)
		
	}
	
	@When("User uploads a file of Base building in FMR Form (.*)")
	public void user_uploads_a_file_of_Base_building_in_FMR_Form_MBfile_doc(String Base_building) {
		
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+Base_building
		println ("######################"+ myPdffilePath)
		
		WebUI.delay(2)
		WebUI.uploadFile(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Base building/input'), myPdffilePath)

	}
	
	@Then("User clicks on save while the file is uploading in FMR")
	public void user_clicks_on_save_while_the_file_is_uploading_in_FMR() {
		
		WebUI.scrollToElement(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/button_Save'), 30)
		WebUI.click(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/button_Save'))
	}
	
	@When("User uploads a file which is greater than 100mb of Furniture And furnishings in FMR Form (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_Furniture_And_furnishings_in_FMR_Form_MBfile_pdf(String Furniture_And_furnishings) {
		
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+Furniture_And_furnishings
		println ("######################"+ myPdffilePath)
		
		WebUI.scrollToElement(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Furniture/p_Upload Furniture and furnishings'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Furniture/input'), myPdffilePath)
		
	}
	
	@When("User uploads a file of Furniture And furnishings in FMR Form (.*)")
	public void user_uploads_a_file_of_Furniture_And_furnishings_in_FMR_Form_MBfile_doc(String Furniture_And_furnishings) {
		
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+Furniture_And_furnishings
		println ("######################"+ myPdffilePath)
		
		WebUI.delay(2)
		WebUI.uploadFile(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Furniture/input'), myPdffilePath)

	}
	
	@When("User uploads a file which is greater than 100mb of MR Credit Purchasing in FMR Form (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_MR_Credit_Purchasing_in_FMR_Form_MBfile_pdf(String Credit_Purchasing) {
		
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+Credit_Purchasing
		println ("######################"+ myPdffilePath)
		
		WebUI.scrollToElement(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_CreditPurchasing/p_Upload Criteria in MR Credit Purchasing'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_CreditPurchasing/input'), myPdffilePath)
		
	}
	
	@When("User uploads a file of MR Credit Purchasing in FMR Form (.*)")
	public void user_uploads_a_file_of_MR_Credit_Purchasing_in_FMR_Form_MBfile_doc(String Credit_Purchasing) {
		
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+Credit_Purchasing
		println ("######################"+ myPdffilePath)
		
		WebUI.delay(2)
		WebUI.uploadFile(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_CreditPurchasing/input'), myPdffilePath)

	}
	
	@When("User uploads a file which is greater than 100mb of Information in Waste Management FMR Form (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_Information_in_Waste_Management_FMR_Form_MBfile_pdf(String InformationWM) {
		
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+InformationWM
		println ("######################"+ myPdffilePath)
		
		WebUI.scrollToElement(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_InformationWM/p_Upload the Information'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_InformationWM/input'), myPdffilePath)
		
	}
	
	@When("User uploads a file of Information in Waste Management FMR Form (.*)")
	public void user_uploads_a_file_of_Information_in_Waste_Management_FMR_Form_MBfile_doc(String InformationWM) {
		
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+InformationWM
		println ("######################"+ myPdffilePath)
		
		WebUI.delay(2)
		WebUI.uploadFile(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_InformationWM/input'), myPdffilePath)
	}
	
	@When("User uploads a file which is greater than 100mb of diversion strategies in Waste Management FMR Form (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_diversion_strategies_in_Waste_Management_FMR_Form_MBfile_pdf(String diversion_strategies) {
		
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+diversion_strategies
		println ("######################"+ myPdffilePath)
		
		WebUI.scrollToElement(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_diversion strategiesWM/p_Upload the description of the procedure diversion strategies'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_diversion strategiesWM/input'), myPdffilePath)
	}
	
	@When("User uploads a file of diversion strategies in Waste Management FMR Form (.*)")
	public void user_uploads_a_file_of_diversion_strategies_in_Waste_Management_FMR_Form_MBfile_doc(String diversion_strategies) {
		
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+diversion_strategies
		println ("######################"+ myPdffilePath)
		
		WebUI.delay(2)
		WebUI.uploadFile(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_diversion strategiesWM/input'), myPdffilePath)
		
	}
	
	@When("User uploads a file which is greater than 100mb of Recommended design in Indoor Air Quality FMR Form (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_Recommended_design_in_Indoor_Air_Quality_FMR_Form_MBfile_pdf(String Recommended_design) {
		
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+Recommended_design
		println ("######################"+ myPdffilePath)
		
		WebUI.scrollToElement(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Recommended design/p_Upload the Recommended design'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Recommended design/input'), myPdffilePath)
	}
	
	@When("User uploads a file of Recommended design in Indoor Air Quality FMR Form (.*)")
	public void user_uploads_a_file_of_Recommended_design_in_Indoor_Air_Quality_FMR_Form_MBfile_doc(String Recommended_design) {
		
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+Recommended_design
		println ("######################"+ myPdffilePath)
		
		WebUI.delay(2)
		WebUI.uploadFile(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Recommended design/input'), myPdffilePath)
	}
	
	@When("User uploads a file which is greater than 100mb of reoccupying the space in Indoor Air Quality FMR Form (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_reoccupying_the_space_in_Indoor_Air_Quality_FMR_Form_MBfile_pdf(String reoccupying) {
		
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+reoccupying
		println ("######################"+ myPdffilePath)
		
		WebUI.scrollToElement(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_reoccupying the space/p_Upload the procedure reoccupying the space'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_reoccupying the space/input'), myPdffilePath)
		
	}
	
	@When("User uploads a file of reoccupying the space in Indoor Air Quality FMR Form (.*)")
	public void user_uploads_a_file_of_reoccupying_the_space_in_Indoor_Air_Quality_FMR_Form_MBfile_doc(String reoccupying) {
		
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+reoccupying
		println ("######################"+ myPdffilePath)
		
		WebUI.delay(2)
		WebUI.uploadFile(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_reoccupying the space/input'), myPdffilePath)
	}
	
	@When("User uploads a file which is greater than 100mb of construction ends in Indoor Air Quality FMR Form (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_construction_ends_in_Indoor_Air_Quality_FMR_Form_MBfile_pdf(construction) {
		
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+construction
		println ("######################"+ myPdffilePath)
		
		WebUI.scrollToElement(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_construction ends/p_Upload constructionends'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_construction ends/input'), myPdffilePath)

	}
	
	@When("User uploads a file of construction ends in Indoor Air Quality FMR Form (.*)")
	public void user_uploads_a_file_of_construction_ends_in_Indoor_Air_Quality_FMR_Form_MBfile_doc(String construction) {
		
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+construction
		println ("######################"+ myPdffilePath)
		
		WebUI.delay(2)
		WebUI.uploadFile(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_construction ends/input'), myPdffilePath)

	}
	
	@When("User uploads a file which is greater than 100mb of additional documentation in FMR Form (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_additional_documentation_in_FMR_Form_MBfile_pdf(String additional_documentation) {
		
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+additional_documentation
		println ("######################"+ myPdffilePath)
		
		WebUI.scrollToElement(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_additional documentation/p_Upload any additional documentation'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_additional documentation/input'), myPdffilePath)

	}
	
	@When("User uploads a file of additional documentation in FMR Form (.*)")
	public void user_uploads_a_file_of_additional_documentation_in_FMR_Form_MBfile_doc(String additional_documentation) {
		
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+additional_documentation
		println ("######################"+ myPdffilePath)
		
		WebUI.delay(2)
		WebUI.uploadFile(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_additional documentation/input'), myPdffilePath)

	}
	
	
}