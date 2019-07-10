package purchasingPolicy
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

import leedOnlineKeywords.projectKeywords
import purchasingPolicy.PP_Entities

class PP_NegativeCases {
	/**
	 * Checking the negative test cases for the uploads in Project Information and saving the form without any data ---- Started
	 */
	
	
	@When("User uploads a file which is greater than 100mb for five most purchased product categories in EPP (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_for_five_most_purchased_product_categories_in_EPP_MBfile_pdf(String FileName) {
		
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/PurchasingPolicy/AddFile_EPP_Purchased/input_AddFile'), myPdffilePath)
	}
	
	@Given("User should be able to see the Add File button in five most purchased product categories in EPP")
	public void user_should_be_able_to_see_the_Add_File_button_in_five_most_purchased_product_categories_in_EPP() {
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/PurchasingPolicy/AddFile_EPP_Purchased/p_AddFile_EPP_Purchased'), 5)
	}
	
	@When("User uploads a file for five most purchased product categories in EPP (.*)")
	public void user_uploads_a_file_for_five_most_purchased_product_categories_in_EPP_MBfile_doc(String FileName) {
		
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/PurchasingPolicy/AddFile_EPP_Purchased/input_AddFile'), myPdffilePath)
	}
	
	@When("User uploads a file which is greater than 100mb for Paper, toner cartridges and desk accessories in EPP (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_for_Paper_toner_cartridges_and_desk_accessories_in_EPP_MBfile_doc(String FileName) {
		
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/PurchasingPolicy/AddFile_EPP_Desk/input_AddFile'), myPdffilePath)
	}
	
	@When("User uploads a file for for Paper, toner cartridges and desk accessories in EPP (.*)")
	public void user_uploads_a_file_for_for_Paper_toner_cartridges_and_desk_accessories_in_EPP_MBfile_doc(String FileName) {
		
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/PurchasingPolicy/AddFile_EPP_Desk/input_AddFile'), myPdffilePath)
	}
	
	@When("User uploads a file which is greater than 100mb for Lamps in EPP (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_for_Lamps_in_EPP_MBfile_doc(String FileName) {
		
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/PurchasingPolicy/AddFile_EPP_Lamps/input_AddFile'), myPdffilePath)
	}
	
	@When("User uploads a file for Lamps in EPP (.*)")
	public void user_uploads_a_file_for_Lamps_in_EPP_MBfile_doc(String FileName) {
		
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/PurchasingPolicy/AddFile_EPP_Lamps/input_AddFile'), myPdffilePath)
	}
	
	@When("User uploads a file which is greater than 100mb for Office equipment, appliances and audiovisual equipment in EPP (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_for_Office_equipment_appliances_and_audiovisual_equipment_in_EPP_MBfile_doc(String FileName) {
		
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/PurchasingPolicy/AddFile_EPP_Office/input_AddFile'), myPdffilePath)
	}
	
	@When("User uploads a file for Office equipment, appliances and audiovisual equipment in EPP (.*)")
	public void user_uploads_a_file_for_Office_equipment_appliances_and_audiovisual_equipment_in_EPP_MBfile_doc(String FileName) {
		
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/PurchasingPolicy/AddFile_EPP_Office/input_AddFile'), myPdffilePath)
	}
	
	@When("User uploads a file which is greater than 100mb for Electric powered equipment in EPP (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_for_Electric_powered_equipment_in_EPP_MBfile_doc(String FileName) {
		
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/PurchasingPolicy/AddFile_EPP_Electric/input_AddFile'), myPdffilePath)
	}
	
	@When("User uploads a file for Electric powered equipment in EPP (.*)")
	public void user_uploads_a_file_for_Electric_powered_equipment_in_EPP_MBfile_doc(String FileName) {
		
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/PurchasingPolicy/AddFile_EPP_Electric/input_AddFile'), myPdffilePath)
	}
	
	@When("User uploads a file which is greater than 100mb for five most purchased product categories in SWM (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_for_five_most_purchased_product_categories_in_SWM_MBfile_doc(String FileName) {
		
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/PurchasingPolicy/AddFile_SWM_Purchased/input_AddFile'), myPdffilePath)
	}
	
	@When("User uploads a file for five most purchased product categories in SWM (.*)")
	public void user_uploads_a_file_for_five_most_purchased_product_categories_in_SWM_MBfile_doc(String FileName) {
		
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/PurchasingPolicy/AddFile_SWM_Purchased/input_AddFile'), myPdffilePath)
	}
	
	@When("User uploads a file which is greater than 100mb for Office equipment, appliances and audiovisual equipment in SWM (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_for_Office_equipment_appliances_and_audiovisual_equipment_in_SWM_MBfile_doc(String FileName) {
		
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/PurchasingPolicy/AddFile_SWM_Office/input_AddFile'), myPdffilePath)
	}
	
	
	
	@When("User uploads a file for Office equipment, appliances and audiovisual equipment in SWM (.*)")
	public void user_uploads_a_file_for_Office_equipment__in_SWM_MBfile_doc(String FileName) {
		
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/PurchasingPolicy/AddFile_SWM_Office/input_AddFile'), myPdffilePath)
		
	}
	
	@When("User uploads a file which is greater than 100mb for Electric powered equipment in SWM (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_for_Electric_powered_equipment_in_SWM_MBfile_doc(String FileName) {
		
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/PurchasingPolicy/AddFile_SWM_Electric/input_AddFile'), myPdffilePath)
	}
	
	@When("User uploads a file for Electric powered equipment in SWM (.*)")
	public void user_uploads_a_file_for_Electric_powered_equipment_in_SWM_MBfile_doc(String FileName) {
		
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/PurchasingPolicy/AddFile_SWM_Electric/input_AddFile'), myPdffilePath)
	}
	
	@When("User uploads a file which is greater than 100mb for Safe disposal of batteries and lamps in SWM (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_for_Safe_disposal_of_batteries_and_lamps_in_SWM_MBfile_doc(String FileName) {
		
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/PurchasingPolicy/AddFile_SWM_Lamps/input_AddFile'), myPdffilePath)
		
	}
	
	
	@When("User uploads a file for Safe disposal of batteries and lamps in SWM (.*)")
	public void user_uploads_a_file_for_Safe_disposal_of_batteries_and_lamps_in_SWM_MBfile_doc(String FileName) {
		
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/PurchasingPolicy/AddFile_SWM_Lamps/input_AddFile'), myPdffilePath)
	}
	
	@When("User uploads a file which is greater than 100mb of special circumstances in Purchasing Policy (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_special_circumstances_in_Purchasing_Policy_MBfile_doc(String FileName) {
		
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/PurchasingPolicy/AddFile_SpecialCircum/input_AddFile'), myPdffilePath)
	}
	
	@When("User uploads a file for special circumstances in Purchasing Policy (.*)")
	public void user_uploads_a_file_for_special_circumstances_in_Purchasing_Policy_MBfile_doc(String FileName) {
		
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+FileName
		println ("######################"+ myPdffilePath)
		WebUI.uploadFile(findTestObject('Object Repository/PurchasingPolicy/AddFile_SpecialCircum/input_AddFile'), myPdffilePath)
	}
	
	
	@Given("User should be on Purchasing Policy form")
	public void user_should_be_on_Purchasing_Policy_form() {
		
		boolean insideForm = WebUI.verifyElementPresent(findTestObject("Object Repository/PurchasingPolicy/Navigation/div_PurchasingPolicy_Form"), 30)
		if (insideForm == true){
			println "Inside the Purchasing Policy form"
		}
		else {
			println "Not inside the Purchasing Policy form"
		}
	}
	
	@When("User clicks on save button without entering any data in Purchasing Policy form")
	public void user_clicks_on_save_button_without_entering_any_data_in_Purchasing_Policy_form() {
		
		WebUI.scrollToElement(findTestObject("Object Repository/PurchasingPolicy/btn_Save"), 30)
		WebUI.click(findTestObject("Object Repository/PurchasingPolicy/btn_Save"))
	}
	
}