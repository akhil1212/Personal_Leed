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

class FMR_VerifyUploadedFiles {

	String fileName
	String iframe='Object Repository/GreenCleaningPolicy/iframe'

	@Given("User has to see the table of uploaded files on Base building in FMR Form")
	public void user_has_to_see_the_table_of_uploaded_files_on_Base_building_in_FMR_Form() {

		WebUI.callTestCase(findTestCase('Test Cases/FacilityMaintenanceandRenovationPolicy/TC_FMR_Navigation'), null, FailureHandling.STOP_ON_FAILURE)

		WebUI.scrollToElement(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Base building/Table_Basebuilding'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Base building/Table_Basebuilding'), 30)
	}

	@Then("User verifies the file name uploaded with the file name present in the table Base building in FMR Form")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_Base_building_in_FMR_Form() {

		String tableRow = "Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Base building/tbody_Table_Basebuilding"
		String tableId = FMR_PageObjectClass.tableId_Xpath_Basebuilding
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,iframe)
	}

	@Given("User has to see the table of uploaded files on Furniture and furnishings in FMR Form")
	public void user_has_to_see_the_table_of_uploaded_files_on_Furniture_and_furnishings_in_FMR_Form() {

		WebUI.scrollToElement(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Furniture/Table_Furniture'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Furniture/Table_Furniture'), 30)
	}

	@Then("User verifies the file name uploaded with the file name present in the table Furniture and furnishings in FMR Form")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_Furniture_and_furnishings_in_FMR_Form() {

		String tableRow = "Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Furniture/tbody_Table_Furniture"
		String tableId = FMR_PageObjectClass.tableId_Xpath_Furniture
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,iframe)
	}

	@Given("User has to see the table of uploaded files on MR Credit Purchasing in FMR Form")
	public void user_has_to_see_the_table_of_uploaded_files_on_MR_Credit_Purchasing_in_FMR_Form() {

		WebUI.scrollToElement(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_CreditPurchasing/Table_CreditPurchasing'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_CreditPurchasing/Table_CreditPurchasing'), 30)
	}

	@Then("User verifies the file name uploaded with the file name present in the table MR Credit Purchasing in FMR Form")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_MR_Credit_Purchasing_in_FMR_Form() {

		String tableRow = "Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_CreditPurchasing/tbody_Table_CreditPurchasing"
		String tableId = FMR_PageObjectClass.tableId_Xpath_Furniture
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,iframe)
	}

	@Given("User has to see the table of uploaded files on Information in Waste Management FMR Form")
	public void user_has_to_see_the_table_of_uploaded_files_on_Information_in_Waste_Management_FMR_Form() {

		WebUI.scrollToElement(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_InformationWM/Table_InformationWM'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_InformationWM/Table_InformationWM'), 30)
	}

	@Then("User verifies the file name uploaded with the file name present in the table Information in Waste Management FMR Form")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_Information_in_Waste_Management_FMR_Form() {

		String tableRow = "Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_InformationWM/tbody_Table_InformationWM"
		String tableId = FMR_PageObjectClass.tableId_Xpath_InformationWM
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,iframe)
	}

	@Given("User has to see the table of uploaded files on diversion strategies in Waste Management FMR Form")
	public void user_has_to_see_the_table_of_uploaded_files_on_diversion_strategies_in_Waste_Management_FMR_Form() {

		WebUI.scrollToElement(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_diversion strategiesWM/Table_diversionStrategies'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_diversion strategiesWM/Table_diversionStrategies'), 30)
	}

	@Then("User verifies the file name uploaded with the file name present in the table diversion strategies in Waste Management FMR Form")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_diversion_strategies_in_Waste_Management_FMR_Form() {

		String tableRow = "Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_diversion strategiesWM/tbody_Table_diversionStrategies"
		String tableId = FMR_PageObjectClass.tableId_Xpath_diversionStrategies
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,iframe)
	}

	@Given("User has to see the table of uploaded files on Recommended design in Indoor Air Quality FMR Form")
	public void user_has_to_see_the_table_of_uploaded_files_on_Recommended_design_in_Indoor_Air_Quality_FMR_Form() {

		WebUI.scrollToElement(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Recommended design/Table_RecommendedDesign'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Recommended design/Table_RecommendedDesign'), 30)
	}

	@Then("User verifies the file name uploaded with the file name present in the table Recommended design in Indoor Air Quality FMR Form")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_Recommended_design_in_Indoor_Air_Quality_FMR_Form() {

		String tableRow = "Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_Recommended design/tbody_Table_RecommendedDesign"
		String tableId = FMR_PageObjectClass.tableId_Xpath_RecommendedDesign
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,iframe)
	}

	@Given("User has to see the table of uploaded files on reoccupying the space in Indoor Air Quality FMR Form")
	public void user_has_to_see_the_table_of_uploaded_files_on_reoccupying_the_space_in_Indoor_Air_Quality_FMR_Form() {

		WebUI.scrollToElement(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_reoccupying the space/Table_Reoccupying'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_reoccupying the space/Table_Reoccupying'), 30)
	}

	@Then("User verifies the file name uploaded with the file name present in the table reoccupying the space in Indoor Air Quality FMR Form")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_reoccupying_the_space_in_Indoor_Air_Quality_FMR_Form() {

		String tableRow = "Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_reoccupying the space/table_Table_Reoccupying"
		String tableId = FMR_PageObjectClass.tableId_Xpath_Reoccupying
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,iframe)
	}

	@Given("User has to see the table of uploaded files on construction ends in Indoor Air Quality FMR Form")
	public void user_has_to_see_the_table_of_uploaded_files_on_construction_ends_in_Indoor_Air_Quality_FMR_Form() {

		WebUI.scrollToElement(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_construction ends/Table_ConstructionEnds'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_construction ends/Table_ConstructionEnds'), 30)
	}

	@Then("User verifies the file name uploaded with the file name present in the table construction ends in Indoor Air Quality FMR Form")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_construction_ends_in_Indoor_Air_Quality_FMR_Form() {

		String tableRow = "Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_construction ends/tbody_Table_ConstructionEnds"
		String tableId = FMR_PageObjectClass.tableId_Xpath_ConstructionEnds
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,iframe)
	}

	@Given("User has to see the table of uploaded files on additional documentation in FMR Form")
	public void user_has_to_see_the_table_of_uploaded_files_on_additional_documentation_in_FMR_Form() {

		WebUI.scrollToElement(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_additional documentation/Table_SC'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_additional documentation/Table_SC'), 30)
	}

	@Then("User verifies the file name uploaded with the file name present in the table additional documentation in FMR Form")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_additional_documentation_in_FMR_Form() {

		String tableRow = "Object Repository/FacilityMaintenanceandRenovationPoli/AddFile_Upload_additional documentation/tbody_Table_SC"
		String tableId = FMR_PageObjectClass.tableId_Xpath_SC
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,iframe)
	}
}