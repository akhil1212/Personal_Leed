package purchasingPolicy
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
import purchasingPolicy.PP_Entities

class PP_Verify_UploadedFiles {
	/**
	 *  Verifying the uploaded files present in the form with the files uploaded -- Started
	 */

	@Given("User has to see the table of uploaded files on five most purchased product categories in EPP")
	public void user_has_to_see_the_table_of_uploaded_files_on_five_most_purchased_product_categories_in_EPP() {

		WebUI.callTestCase(findTestCase('Test Cases/PurchasingPolicy/TC_NavigateToPP'), null, FailureHandling.STOP_ON_FAILURE)

		WebUI.scrollToElement(findTestObject('Object Repository/PurchasingPolicy/AddFile_EPP_Purchased/p_AddFile_EPP_Purchased'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/PurchasingPolicy/AddFile_EPP_Purchased/p_AddFile_EPP_Purchased'), 5)
	}

	@Then("User verifies the file name uploaded with the file name present in the table of five most purchased product categories in EPP")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_of_five_most_purchased_product_categories_in_EPP() {

		String tableRow = 'Object Repository/PurchasingPolicy/AddFile_EPP_Purchased/tbody_Table_EPP_Purchased'
		String tableId = PP_Entities.tableId_EPP_Purchased
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,PP_Entities.iframe)
	}


	@Given("User has to see the table of uploaded files on Paper, toner cartridges and desk accessories in EPP")
	public void user_has_to_see_the_table_of_uploaded_files_on_Paper_toner_cartridges_and_desk_accessories_in_EPP() {

		WebUI.scrollToElement(findTestObject('Object Repository/PurchasingPolicy/AddFile_EPP_Desk/p_AddFile_EPP_Desk'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/PurchasingPolicy/AddFile_EPP_Desk/p_AddFile_EPP_Desk'), 5)
	}

	@Then("User verifies the file name uploaded with the file name present in the table of Paper, toner cartridges and desk accessories in EPP")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_of_Paper_toner_cartridges_and_desk_accessories_in_EPP() {

		String tableRow = 'Object Repository/PurchasingPolicy/AddFile_EPP_Desk/tbody_Table_EPP_Desk'
		String tableId = PP_Entities.tableId_EPP_Desk
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,PP_Entities.iframe)
	}


	@Given("User has to see the table of uploaded files on Lamps in EPP")
	public void user_has_to_see_the_table_of_uploaded_files_on_Lamps_in_EPP() {

		WebUI.scrollToElement(findTestObject('Object Repository/PurchasingPolicy/AddFile_EPP_Lamps/p_AddFile_EPP_Lamps'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/PurchasingPolicy/AddFile_EPP_Lamps/p_AddFile_EPP_Lamps'), 5)
	}

	@Then("User verifies the file name uploaded with the file name present in the table of Lamps in EPP")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_of_Lamps_in_EPP() {

		String tableRow = 'Object Repository/PurchasingPolicy/AddFile_EPP_Lamps/tbody_Table_EPP_Lamps'
		String tableId = PP_Entities.tableId_EPP_Lamps
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,PP_Entities.iframe)
	}


	@Given("User has to see the table of uploaded files on Office equipment, appliances and audiovisual equipment in EPP")
	public void user_has_to_see_the_table_of_uploaded_files_on_Office_equipment_appliances_and_audiovisual_equipment_in_EPP() {

		WebUI.scrollToElement(findTestObject('Object Repository/PurchasingPolicy/AddFile_EPP_Office/p_AddFile_EPP_Office'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/PurchasingPolicy/AddFile_EPP_Office/p_AddFile_EPP_Office'), 5)
	}

	@Then("User verifies the file name uploaded with the file name present in the table of Office equipment, appliances and audiovisual equipment in EPP")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_of_Office_equipment_appliances_and_audiovisual_equipment_in_EPP() {

		String tableRow = 'Object Repository/PurchasingPolicy/AddFile_EPP_Office/tbody_Table_EPP_Office'
		String tableId = PP_Entities.tableId_EPP_Office
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,PP_Entities.iframe)
	}

	@Given("User has to see the table of uploaded files on Electric powered equipment in EPP")
	public void user_has_to_see_the_table_of_uploaded_files_on_Electric_powered_equipment_in_EPP() {

		WebUI.scrollToElement(findTestObject('Object Repository/PurchasingPolicy/AddFile_EPP_Electric/p_AddFile_EPP_Electric'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/PurchasingPolicy/AddFile_EPP_Electric/p_AddFile_EPP_Electric'), 5)
	}

	@Then("User verifies the file name uploaded with the file name present in the table of Electric powered equipment in EPP")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_of_Electric_powered_equipment_in_EPP() {

		String tableRow = 'Object Repository/PurchasingPolicy/AddFile_EPP_Electric/tbody_Table_EPP_Electric'
		String tableId = PP_Entities.tableId_EPP_Electric
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,PP_Entities.iframe)
	}

	@Given("User has to see the table of uploaded files on five most purchased product categories in SWM")
	public void user_has_to_see_the_table_of_uploaded_files_on_five_most_purchased_product_categories_in_SWM() {

		WebUI.scrollToElement(findTestObject('Object Repository/PurchasingPolicy/AddFile_SWM_Purchased/p_AddFile_SWM_Purchased'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/PurchasingPolicy/AddFile_SWM_Purchased/p_AddFile_SWM_Purchased'), 5)
	}

	@Then("User verifies the file name uploaded with the file name present in the table of five most purchased product categories in SWM")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_of_five_most_purchased_product_categories_in_SWM() {

		String tableRow = 'Object Repository/PurchasingPolicy/AddFile_SWM_Purchased/tbody_Table_SWM_Purchased'
		String tableId = PP_Entities.tableId_SWM_Purchased
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,PP_Entities.iframe)
	}


	@Given("User has to see the table of uploaded files on Office equipment, appliances and audiovisual equipment in SWM")
	public void user_has_to_see_the_table_of_uploaded_files_on_Office_equipment_appliances_and_audiovisual_equipment_in_SWM() {

		WebUI.scrollToElement(findTestObject('Object Repository/PurchasingPolicy/AddFile_SWM_Office/p_AddFile_SWM_Office'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/PurchasingPolicy/AddFile_SWM_Office/p_AddFile_SWM_Office'), 5)
	}

	@Then("User verifies the file name uploaded with the file name present in the table of Office equipment, appliances and audiovisual equipment in SWM")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_of_Office_equipment_appliances_and_audiovisual_equipment_in_SWM() {

		String tableRow = 'Object Repository/PurchasingPolicy/AddFile_SWM_Office/tbody_Table_SWM_Office'
		String tableId = PP_Entities.tableId_SWM_Office
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,PP_Entities.iframe)
	}

	@Given("User has to see the table of uploaded files on Electric powered equipment in SWM")
	public void user_has_to_see_the_table_of_uploaded_files_on_Electric_powered_equipment_SWM() {

		WebUI.scrollToElement(findTestObject('Object Repository/PurchasingPolicy/AddFile_SWM_Electric/p_AddFile_SWM_Electric'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/PurchasingPolicy/AddFile_SWM_Electric/p_AddFile_SWM_Electric'), 5)
	}

	@Then("User verifies the file name uploaded with the file name present in the table of Electric powered equipment in SWM")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_of_Electric_powered_equipment_SWM() {

		String tableRow = 'Object Repository/PurchasingPolicy/AddFile_SWM_Electric/tbody_Table_SWM_Electric'
		String tableId = PP_Entities.tableId_SWM_Electric
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,PP_Entities.iframe)
	}

	@Given("User has to see the table of uploaded files on disposal of batteries and lamps in SWM")
	public void user_has_to_see_the_table_of_uploaded_files_on_disposal_of_batteries_and_lamps_SWM() {

		WebUI.scrollToElement(findTestObject('Object Repository/PurchasingPolicy/AddFile_SWM_Lamps/p_AddFile_SWM_Lamps'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/PurchasingPolicy/AddFile_SWM_Lamps/p_AddFile_SWM_Lamps'), 5)
	}

	@Then("User verifies the file name uploaded with the file name present in the table of disposal of batteries and lamps in SWM")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_of_disposal_of_batteries_and_lamps_SWM() {

		String tableRow = 'Object Repository/PurchasingPolicy/AddFile_SWM_Lamps/tbody_Table_SWM_Lamps'
		String tableId = PP_Entities.tableId_SWM_Lamps
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,PP_Entities.iframe)
	}


	@Given("User has to see the table of uploaded files on special circumstances for Purchasing Policy")
	public void user_has_to_see_the_table_of_uploaded_files_on_special_circumstances_for_Purchasing_Policy() {

		WebUI.scrollToElement(findTestObject('Object Repository/PurchasingPolicy/AddFile_SpecialCircum/p_AddFile_SplCircum'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/PurchasingPolicy/AddFile_SpecialCircum/p_AddFile_SplCircum'), 5)
	}

	@Then("User verifies the file name uploaded with the file name present in the table of special circumstances for Purchasing Policy")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_of_special_circumstances_for_Purchasing_Policy() {

		String tableRow = 'Object Repository/PurchasingPolicy/AddFile_SpecialCircum/tbody_Table_SplCircum'
		String tableId = PP_Entities.tableId_SpecialCircumstances
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,PP_Entities.iframe)
	}
	/**
	 *  Verifying the uploaded files present in the form with the files uploaded -- Ended
	 */
}