package greenCleaningPolicyForm
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

class DeleteGreenCleaningPolicy {
	/**
	 *  In-house green cleaning policy (Option 1)
	 */
	String iframe='Object Repository/GreenCleaningPolicy/iframe'
	@When("User deletes the uploaded files of Green Cleaning Policy")
	public void user_deletes_the_uploaded_files_of_Green_Cleaning_Policy() {

		String tableRow ="Object Repository/GreenCleaningPolicy/Option1_GreenCleanPlcy/AddFile_UploadGreenCleaningPlcy_Option1/tbody_Table_GreenCleaningPolicy"
		String tableId = GCP_PageObjectClass.tableId_Xpath_GCP
		String scrollTo = "Object Repository/GreenCleaningPolicy/Option1_GreenCleanPlcy/AddFile_UploadGreenCleaningPlcy_Option1/p_Upload the Green Cleaning Policy"

		new projectKeywords().deleteUploadedFiles(tableRow, tableId, scrollTo, iframe)
	}

	@Then("User can see all the Green Cleaning Policy are deleted")
	public void user_can_see_all_the_Green_Cleaning_Policy_are_deleted() {

		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/GreenCleaningPolicy/Option1_GreenCleanPlcy/Table_UploadGreenCleaningPolicy'), 30)
	}

	@When("User deletes the uploaded files of special circumstances for In-house green cleaning policy in GCP")
	public void user_deletes_the_uploaded_files_of_special_circumstances_for_In_house_green_cleaning_policy_in_GCP() {


		String tableRow = "Object Repository/GreenCleaningPolicy/SpecialCircumstances/AddFile_UploadAddtionalDoc_SC/tbody_Table_SC"
		String tableId = GCP_PageObjectClass.tableId_Xpath_SplCircum_GCP
		String scrollTo = "Object Repository/GreenCleaningPolicy/SpecialCircumstances/SC_EditorBox/p_Describe the circumstances limiting the project teams"

		new projectKeywords().deleteUploadedFiles(tableRow, tableId, scrollTo,iframe)
	}

	@Then("User can see the special circumstances for In-house green cleaning policy in GCP files deleted")
	public void user_can_see_the_special_circumstances_for_In_house_green_cleaning_policy_in_GCP_files_deleted() {

		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/GreenCleaningPolicy/SpecialCircumstances/Table_SpecialCircum'), 30)
	}

	/**
	 * Certified cleaning service (Option 2)
	 */

	@When("User deletes the uploaded files of Cleaning Contract")
	public void user_deletes_the_uploaded_files_of_Cleaning_Contract() {

		String tableRow = "Object Repository/GreenCleaningPolicy/Option2_CertifiedCleanService/AddFile_UploadCleaningContract_Option2/tbody_Table_CleaningContract"
		String tableId = GCP_PageObjectClass.tableId_Xpath_GCP
		String scrollTo = "Object Repository/GreenCleaningPolicy/Option2_CertifiedCleanService/AddFile_UploadCleaningContract_Option2/p_Upload the Cleaning Contract"

		new projectKeywords().deleteUploadedFiles(tableRow, tableId, scrollTo,iframe)
	}

	@Then("User can see all the Cleaning Contract are deleted")
	public void user_can_see_all_the_Cleaning_Contract_are_deleted() {

		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/GreenCleaningPolicy/Option2_CertifiedCleanService/Table_CleaningContract'), 30)
	}

	@When("User deletes the uploaded files of special circumstances for information showing the contractor’s GS-42 for Certified cleaning service in GCP")
	public void user_deletes_the_uploaded_files_of_special_circumstances_for_information_showing_the_contractor_s_GS_for_Certified_cleaning_service_in_GCP() {

		String tableRow = "Object Repository/GreenCleaningPolicy/Option2_CertifiedCleanService/AddFile_UploadInfoShowingContract_Option2/tbody_Table_ShowingContract"
		String tableId = GCP_PageObjectClass.tableId_Xpath_information_GCP
		String scrollTo = "Object Repository/GreenCleaningPolicy/Option2_CertifiedCleanService/AddFile_UploadInfoShowingContract_Option2/p_Upload the information showing the contractors"

		new projectKeywords().deleteUploadedFiles(tableRow, tableId, scrollTo,iframe)
	}

	@Then("User can see the special circumstances for information showing the contractor’s GS-42 for Certified cleaning service in GCP files deleted")
	public void user_can_see_the_special_circumstances_for_information_showing_the_contractor_s_GS_for_Certified_cleaning_service_in_GCP_files_deleted() {

		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/GreenCleaningPolicy/Option2_CertifiedCleanService/Table_UploadInfoShowingContract'), 30)
	}
}