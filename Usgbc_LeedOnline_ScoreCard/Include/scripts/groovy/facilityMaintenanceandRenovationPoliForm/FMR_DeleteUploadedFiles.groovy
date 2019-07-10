package facilityMaintenanceandRenovationPoliForm
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

class FMR_DeleteUploadedFiles {

	String iframe='Object Repository/FacilityMaintenanceandRenovationPoli/iframe'
	@When("User deletes the uploaded files of Base building in FMR Form")
	public void user_deletes_the_uploaded_files_of_Base_building_in_FMR_Form() {

		String tableRow ="Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Base building/tbody_Table_Basebuilding"
		String tableId = FMR_PageObjectClass.tableId_Xpath_Basebuilding
		String scrollTo = "Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Base building/p_Upload the Base building element"

		new projectKeywords().deleteUploadedFiles(tableRow, tableId, scrollTo, iframe)
	}

	@Then("User can see all the Base building in FMR Formt are deleted")
	public void user_can_see_all_the_Base_building_in_FMR_Formt_are_deleted() {

		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Base building/Table_Basebuilding'), 30)
	}

	@When("User deletes the uploaded files of Furniture and furnishings in FMR Form")
	public void user_deletes_the_uploaded_files_of_Furniture_and_furnishings_in_FMR_Form() {
		
		String tableRow ="Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Furniture/tbody_Table_Furniture"
		String tableId = FMR_PageObjectClass.tableId_Xpath_Furniture
		String scrollTo = "Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Furniture/p_Upload Furniture and furnishings"

		new projectKeywords().deleteUploadedFiles(tableRow, tableId, scrollTo, iframe)
	}

	@Then("User can see all the Furniture and furnishings in FMR Form are deleted")
	public void user_can_see_all_the_Furniture_and_furnishings_in_FMR_Form_are_deleted() {
		
		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Furniture/Table_Furniture'), 30)
	}

	@When("User deletes the uploaded files of MR Credit Purchasing in FMR Form")
	public void user_deletes_the_uploaded_files_of_MR_Credit_Purchasing_in_FMR_Form() {
		
		String tableRow ="Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_CreditPurchasing/tbody_Table_CreditPurchasing"
		String tableId = FMR_PageObjectClass.tableId_Xpath_CreditPurchasing
		String scrollTo = "Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_CreditPurchasing/p_Upload Criteria in MR Credit Purchasing"

		new projectKeywords().deleteUploadedFiles(tableRow, tableId, scrollTo, iframe)
	}

	@Then("User can see all the MR Credit Purchasing in FMR Form are deleted")
	public void user_can_see_all_the_MR_Credit_Purchasing_in_FMR_Form_are_deleted() {
		
		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_CreditPurchasing/Table_CreditPurchasing'), 30)
	}

	@When("User deletes the uploaded files of Information in Waste Management FMR Form")
	public void user_deletes_the_uploaded_files_of_Information_in_Waste_Management_FMR_Form() {
		
		String tableRow ="Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_InformationWM/tbody_Table_InformationWM"
		String tableId = FMR_PageObjectClass.tableId_Xpath_InformationWM
		String scrollTo = "Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_InformationWM/p_Upload the Information"

		new projectKeywords().deleteUploadedFiles(tableRow, tableId, scrollTo, iframe)
	}

	@Then("User can see all the Information in Waste Management FMR Form are deleted")
	public void user_can_see_all_the_Information_in_Waste_Management_FMR_Form_are_deleted() {
		
		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_InformationWM/Table_InformationWM'), 30)
	}

	@When("User deletes the uploaded files of diversion strategies in Waste Management FMR Form")
	public void user_deletes_the_uploaded_files_of_diversion_strategies_in_Waste_Management_FMR_Form() {
		
		String tableRow ="Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_diversion strategiesWM/tbody_Table_diversionStrategies"
		String tableId = FMR_PageObjectClass.tableId_Xpath_diversionStrategies
		String scrollTo = "Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_diversion strategiesWM/p_Upload the description of the procedure diversion strategies"

		new projectKeywords().deleteUploadedFiles(tableRow, tableId, scrollTo, iframe)
	}

	@Then("User can see all the diversion strategies in Waste Management FMR Form are deleted")
	public void user_can_see_all_the_diversion_strategies_in_Waste_Management_FMR_Form_are_deleted() {
		
		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_diversion strategiesWM/Table_diversionStrategies'), 30)
	}

	@When("User deletes the uploaded files of Recommended design in Indoor Air Quality FMR Form")
	public void user_deletes_the_uploaded_files_of_Recommended_design_in_Indoor_Air_Quality_FMR_Form() {
		
		String tableRow ="Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Recommended design/tbody_Table_RecommendedDesign"
		String tableId = FMR_PageObjectClass.tableId_Xpath_RecommendedDesign
		String scrollTo = "Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Recommended design/p_Upload the Recommended design"

		new projectKeywords().deleteUploadedFiles(tableRow, tableId, scrollTo, iframe)
	}

	@Then("User can see all the Recommended design in Indoor Air Quality FMR Form are deleted")
	public void user_can_see_all_the_Recommended_design_in_Indoor_Air_Quality_FMR_Form_are_deleted() {
		
		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Recommended design/Table_RecommendedDesign'), 30)
	}

	@When("User deletes the uploaded files of reoccupying the space in Indoor Air Quality FMR Form")
	public void user_deletes_the_uploaded_files_of_reoccupying_the_space_in_Indoor_Air_Quality_FMR_Form() {
		
		String tableRow ="Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_reoccupying the space/table_Table_Reoccupying"
		String tableId = FMR_PageObjectClass.tableId_Xpath_Reoccupying
		String scrollTo = "Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_reoccupying the space/Table_Reoccupying"

		new projectKeywords().deleteUploadedFiles(tableRow, tableId, scrollTo, iframe)
	}

	@Then("User can see all the reoccupying the space in Indoor Air Quality FMR Form are deleted")
	public void user_can_see_all_the_reoccupying_the_space_in_Indoor_Air_Quality_FMR_Form_are_deleted() {
		
		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_reoccupying the space/Table_Reoccupying'), 30)
	}

	@When("User deletes the uploaded files of construction ends in Indoor Air Quality FMR Form")
	public void user_deletes_the_uploaded_files_of_construction_ends_in_Indoor_Air_Quality_FMR_Form() {
		
		String tableRow ="Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_construction ends/tbody_Table_ConstructionEnds"
		String tableId = FMR_PageObjectClass.tableId_Xpath_ConstructionEnds
		String scrollTo = "Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_construction ends/p_Upload constructionends"

		new projectKeywords().deleteUploadedFiles(tableRow, tableId, scrollTo, iframe)
	}

	@Then("User can see all the construction ends in Indoor Air Quality FMR Form are deleted")
	public void user_can_see_all_the_construction_ends_in_Indoor_Air_Quality_FMR_Form_are_deleted() {
		
		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_construction ends/Table_ConstructionEnds'), 30)
	}

	@When("User deletes the uploaded files of additional documentation in FMR Form")
	public void user_deletes_the_uploaded_files_of_additional_documentation_in_FMR_Form() {
		
		String tableRow ="Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_additional documentation/tbody_Table_SC"
		String tableId = FMR_PageObjectClass.tableId_Xpath_SC
		String scrollTo = "Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_additional documentation/p_Upload any additional documentation"

		new projectKeywords().deleteUploadedFiles(tableRow, tableId, scrollTo, iframe)
	}

	@Then("User can see all the additional documentation in FMR Form are deleted")
	public void user_can_see_all_the_additional_documentation_in_FMR_Form_are_deleted() {
		
		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_additional documentation/Table_SC'), 30)
	}
}