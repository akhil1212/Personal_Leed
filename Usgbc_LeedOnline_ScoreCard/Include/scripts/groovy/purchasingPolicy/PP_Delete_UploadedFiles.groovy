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

class PP_Delete_UploadedFiles {
	/**
	 * Delete the uploaded files present in the form  -- Started
	 */

	@When("User deletes the uploaded files of five most purchased product categories in EPP")
	public void user_deletes_the_uploaded_files_of_five_most_purchased_product_categories_in_EPP() {

		String tableRow = 'Object Repository/PurchasingPolicy/AddFile_EPP_Purchased/tbody_Table_EPP_Purchased'
		String tableId = PP_Entities.tableId_EPP_Purchased
		String scrollTo = "Object Repository/PurchasingPolicy/AddFile_EPP_Purchased/p_AddFile_EPP_Purchased"
		new projectKeywords().deleteUploadedFiles(tableRow,tableId,scrollTo,PP_Entities.iframe)
	}

	@Then("User can see all the files of five most purchased product categories in EPP are deleted")
	public void user_can_see_all_the_files_of_five_most_purchased_product_categories_in_EPP_are_deleted() {

		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/PurchasingPolicy/AddFile_EPP_Purchased/table_EPP_Purchased'), 30)
	}

	@When("User deletes the uploaded files of Paper, toner cartridges and desk accessories in EPP")
	public void user_deletes_the_uploaded_files_of_Paper_toner_cartridges_and_desk_accessories_in_EPP() {

		String tableRow = 'Object Repository/PurchasingPolicy/AddFile_EPP_Desk/tbody_Table_EPP_Desk'
		String tableId = PP_Entities.tableId_EPP_Desk
		String scrollTo = "Object Repository/PurchasingPolicy/AddFile_EPP_Desk/p_AddFile_EPP_Desk"
		new projectKeywords().deleteUploadedFiles(tableRow,tableId,scrollTo,PP_Entities.iframe)
	}

	@Then("User can see all the files of Paper, toner cartridges and desk accessories in EPP are deleted")
	public void user_can_see_all_the_files_of_Paper_toner_cartridges_and_desk_accessories_in_EPP_are_deleted() {

		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/PurchasingPolicy/AddFile_EPP_Desk/table_EPP_Desk'), 30)
	}

	@When("User deletes the uploaded files of Lamps in EPP")
	public void user_deletes_the_uploaded_files_of_Lamps_in_EPP() {

		String tableRow = 'Object Repository/PurchasingPolicy/AddFile_EPP_Lamps/tbody_Table_EPP_Lamps'
		String tableId = PP_Entities.tableId_EPP_Lamps
		String scrollTo = "Object Repository/PurchasingPolicy/AddFile_EPP_Lamps/p_AddFile_EPP_Lamps"
		new projectKeywords().deleteUploadedFiles(tableRow,tableId,scrollTo,PP_Entities.iframe)
	}

	@Then("User can see all the files of Lamps in EPP are deleted")
	public void user_can_see_all_the_files_of_Lamps_in_EPP_are_deleted() {

		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/PurchasingPolicy/AddFile_EPP_Lamps/table_EPP_Lamps'), 30)
	}

	@When("User deletes the uploaded files of Office equipment, appliances and audiovisual equipment in EPP")
	public void user_deletes_the_uploaded_files_of_Office_equipment_appliances_and_audiovisual_equipment_in_EPP() {

		String tableRow = 'Object Repository/PurchasingPolicy/AddFile_EPP_Office/tbody_Table_EPP_Office'
		String tableId = PP_Entities.tableId_EPP_Office
		String scrollTo = "Object Repository/PurchasingPolicy/AddFile_EPP_Office/p_AddFile_EPP_Office"
		new projectKeywords().deleteUploadedFiles(tableRow,tableId,scrollTo,PP_Entities.iframe)
	}

	@Then("User can see all the files of Office equipment, appliances and audiovisual equipment in EPP are deleted")
	public void user_can_see_all_the_files_of_Office_equipment_appliances_and_audiovisual_equipment_in_EPP_are_deleted() {

		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/PurchasingPolicy/AddFile_EPP_Office/table_EPP_Office'), 30)
	}

	@When("User deletes the uploaded files of Electric powered equipment in EPP")
	public void user_deletes_the_uploaded_files_of_Electric_powered_equipment_in_EPP() {

		String tableRow = 'Object Repository/PurchasingPolicy/AddFile_EPP_Electric/tbody_Table_EPP_Electric'
		String tableId = PP_Entities.tableId_EPP_Electric
		String scrollTo = "Object Repository/PurchasingPolicy/AddFile_EPP_Electric/p_AddFile_EPP_Electric"
		new projectKeywords().deleteUploadedFiles(tableRow,tableId,scrollTo,PP_Entities.iframe)
	}

	@Then("User can see all the files of Electric powered equipment in EPP are deleted")
	public void user_can_see_all_the_files_of_Electric_powered_equipment_in_EPP_are_deleted() {

		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/PurchasingPolicy/AddFile_EPP_Electric/table_EPP_Electric'), 30)
	}

	@When("User deletes the uploaded files of five most purchased product categories in SWM")
	public void user_deletes_the_uploaded_files_of_five_most_purchased_product_categories_in_SWM() {


		String tableRow = 'Object Repository/PurchasingPolicy/AddFile_SWM_Purchased/tbody_Table_SWM_Purchased'
		String tableId = PP_Entities.tableId_SWM_Purchased
		String scrollTo = "Object Repository/PurchasingPolicy/AddFile_SWM_Purchased/p_AddFile_SWM_Purchased"
		new projectKeywords().deleteUploadedFiles(tableRow,tableId,scrollTo,PP_Entities.iframe)
	}

	@Then("User can see all the files of five most purchased product categories in SWM are deleted")
	public void user_can_see_all_the_files_of_five_most_purchased_product_categories_in_SWM_are_deleted() {

		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/PurchasingPolicy/AddFile_SWM_Purchased/table_SWM_Purchased'), 30)
	}

	@When("User deletes the uploaded files of Office equipment, appliances and audiovisual equipment in SWM")
	public void user_deletes_the_uploaded_files_of_Office_equipment_appliances_and_audiovisual_equipment_in_SWM() {

		String tableRow = 'Object Repository/PurchasingPolicy/AddFile_SWM_Office/tbody_Table_SWM_Office'
		String tableId = PP_Entities.tableId_SWM_Office
		String scrollTo = "Object Repository/PurchasingPolicy/AddFile_SWM_Office/p_AddFile_SWM_Office"
		new projectKeywords().deleteUploadedFiles(tableRow,tableId,scrollTo,PP_Entities.iframe)
	}

	@Then("User can see all the files of Office equipment, appliances and audiovisual equipment in SWM are deleted")
	public void user_can_see_all_the_files_of_Office_equipment_appliances_and_audiovisual_equipment_in_SWM_are_deleted() {

		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/PurchasingPolicy/AddFile_SWM_Office/table_SWM_Office'), 30)
	}

	@When("User deletes the uploaded files of Electric powered equipment in SWM")
	public void user_deletes_the_uploaded_files_of_Electric_powered_equipment_in_SWM() {

		String tableRow = 'Object Repository/PurchasingPolicy/AddFile_SWM_Electric/tbody_Table_SWM_Electric'
		String tableId = PP_Entities.tableId_SWM_Electric
		String scrollTo = "Object Repository/PurchasingPolicy/AddFile_SWM_Electric/p_AddFile_SWM_Electric"
		new projectKeywords().deleteUploadedFiles(tableRow,tableId,scrollTo,PP_Entities.iframe)
	}

	@Then("User can see all the files of Electric powered equipment in SWM are deleted")
	public void user_can_see_all_the_files_of_Electric_powered_equipment_in_SWM_are_deleted() {

		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/PurchasingPolicy/AddFile_SWM_Electric/table_SWM_Electric'), 30)
	}

	@When("User deletes the uploaded files of disposal of batteries and lamps in SWM")
	public void user_deletes_the_uploaded_files_of_disposal_of_batteries_and_lamps_in_SWM() {

		String tableRow = 'Object Repository/PurchasingPolicy/AddFile_SWM_Lamps/tbody_Table_SWM_Lamps'
		String tableId = PP_Entities.tableId_SWM_Lamps
		String scrollTo = "Object Repository/PurchasingPolicy/AddFile_SWM_Lamps/p_AddFile_SWM_Lamps"
		new projectKeywords().deleteUploadedFiles(tableRow,tableId,scrollTo,PP_Entities.iframe)
	}

	@Then("User can see all the files of disposal of batteries and lamps in SWM are deleted")
	public void user_can_see_all_the_files_of_disposal_of_batteries_and_lamps_in_SWM_are_deleted() {

		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/PurchasingPolicy/AddFile_SWM_Lamps/table_SWM_Lamps'), 30)
	}

	@When("User deletes the uploaded files of special circumstances for Purchasing Policy")
	public void user_deletes_the_uploaded_files_of_special_circumstances_for_Purchasing_Policy() {

		String tableRow = 'Object Repository/PurchasingPolicy/AddFile_SpecialCircum/tbody_Table_SplCircum'
		String tableId = PP_Entities.tableId_SpecialCircumstances
		String scrollTo = "Object Repository/PurchasingPolicy/AddFile_SpecialCircum/p_AddFile_SplCircum"
		new projectKeywords().deleteUploadedFiles(tableRow,tableId,scrollTo,PP_Entities.iframe)
	}

	@Then("User can see all the files of special circumstances for Purchasing Policy are deleted")
	public void user_can_see_all_the_files_of_special_circumstances_for_Purchasing_Policy_are_deleted() {

		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/PurchasingPolicy/AddFile_SpecialCircum/table_SplCircum'), 30)
	}


	/**
	 * Delete the uploaded files present in the form  -- Ended
	 */
}