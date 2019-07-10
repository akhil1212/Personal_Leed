package projectInformation
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
import projectInformation.PI_Entities

class PI_Verify_UploadedFiles {
	/**
	 *  Verifying the uploaded files present in the form with the files uploaded -- Started
	 */

	@Given("User has to see the table of uploaded files on a site plan identifying the LEED project boundary")
	public void user_has_to_see_the_table_of_uploaded_files_on_a_site_plan_identifying_the_LEED_project_boundary() {

		WebUI.callTestCase(findTestCase('Test Cases/ProjectInformation/TC_NavigateToPI'), null, FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(2)

		WebUI.scrollToElement(findTestObject('Object Repository/ProjectInformation/AddFile_SitePlan/p_AddFile_SitePlan'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/ProjectInformation/AddFile_SitePlan/p_AddFile_SitePlan'), 30)
	}

	@Then("User verifies the file name uploaded with the file name present in the table of a site plan identifying the LEED project boundary")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_of_a_site_plan_identifying_the_LEED_project_boundary() {

		String tableRow = 'Object Repository/ProjectInformation/AddFile_SitePlan/tbody_Table_SitePlan'
		String tableId = PI_Entities.tableId_SitePlan
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,PI_Entities.iframe)
	}


	@Given("User has to see the table of uploaded files on the representative floor plans for the project")
	public void user_has_to_see_the_table_of_uploaded_files_on_the_representative_floor_plans_for_the_project() {

		WebUI.scrollToElement(findTestObject('Object Repository/ProjectInformation/AddFile_FloorPlans/p_AddFile_FloorPlans'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/ProjectInformation/AddFile_FloorPlans/p_AddFile_FloorPlans'),30)
	}

	@Then("User verifies the file name uploaded with the file name present in the table of the representative floor plans for the project")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_of_the_representative_floor_plans_for_the_project() {

		String tableRow = 'Object Repository/ProjectInformation/AddFile_FloorPlans/tbody_Table_FloorPlans'
		String tableId = PI_Entities.tableId_FloorPlans
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,PI_Entities.iframe)
	}


	@Given("User has to see the table of uploaded files on the mechanical schedules and plans and or drawings")
	public void user_has_to_see_the_table_of_uploaded_files_on_the_mechanical_schedules_and_plans_and_or_drawings() {

		WebUI.scrollToElement(findTestObject('Object Repository/ProjectInformation/AddFile_MechanicalPlans/p_AddFile_MechanicalPlans'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/ProjectInformation/AddFile_MechanicalPlans/p_AddFile_MechanicalPlans'),30)
	}

	@Then("User verifies the file name uploaded with the file name present in the table of the mechanical schedules and plans and or drawings")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_of_the_mechanical_schedules_and_plans_and_or_drawings() {

		String tableRow = 'Object Repository/ProjectInformation/AddFile_MechanicalPlans/tbody_Table_MechanicalPlans'
		String tableId = PI_Entities.tableId_MechanicalPlans
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,PI_Entities.iframe)
	}


	@Given("User has to see the table of uploaded files on the photos or a video walkthrough of the project")
	public void user_has_to_see_the_table_of_uploaded_files_on_the_photos_or_a_video_walkthrough_of_the_project() {

		WebUI.scrollToElement(findTestObject('Object Repository/ProjectInformation/AddFile_ProjectGraphics/p_AddFile_ProjectGraphics'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/ProjectInformation/AddFile_ProjectGraphics/p_AddFile_ProjectGraphics'),30)
	}

	@Then("User verifies the file name uploaded with the file name present in the table of the photos or a video walkthrough of the project")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_of_the_photos_or_a_video_walkthrough_of_the_project() {

		String tableRow = 'Object Repository/ProjectInformation/AddFile_ProjectGraphics/tbody_Table_ProjectGraphics'
		String tableId = PI_Entities.tableId_Projectgraphics
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,PI_Entities.iframe)
	}

	@Given("User has to see the table of uploaded files on the completed Performance Periods Table")
	public void user_has_to_see_the_table_of_uploaded_files_on_the_completed_Performance_Periods_Table() {

		WebUI.scrollToElement(findTestObject('Object Repository/ProjectInformation/AddFile_PerformancePeriods/p_AddFile_PerformancePeriods'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/ProjectInformation/AddFile_PerformancePeriods/p_AddFile_PerformancePeriods'),30)
	}

	@Then("User verifies the file name uploaded with the file name present in the table of the completed Performance Periods Table")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_of_the_completed_Performance_Periods_Table() {

		String tableRow = 'Object Repository/ProjectInformation/AddFile_PerformancePeriods/tbody_Table_PerformancePeriods'
		String tableId = PI_Entities.tableId_PerformancePeriods
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,PI_Entities.iframe)
	}


	@Given("User has to see the table of uploaded files on special circumstances for Project Information")
	public void user_has_to_see_the_table_of_uploaded_files_on_special_circumstances_for_Project_Information() {

		WebUI.scrollToElement(findTestObject('Object Repository/ProjectInformation/AddFile_SpecialCircum/p_AddFile_SplCircum'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/ProjectInformation/AddFile_SpecialCircum/p_AddFile_SplCircum'),30)
	}

	@Then("User verifies the file name uploaded with the file name present in the table of special circumstances for Project Information")
	public void user_verifies_the_file_name_uploaded_with_the_file_name_present_in_the_table_of_special_circumstances_for_Project_Information() {


		String tableRow = 'Object Repository/ProjectInformation/AddFile_SpecialCircum/tbody_Table_SplCircum'
		String tableId = PI_Entities.tableId_SpecialCircumstances
		new projectKeywords().verifyUploadedFiles(tableRow,tableId,PI_Entities.iframe)
	}

	/**
	 *  Verifying the uploaded files present in the form with the files uploaded -- Ended
	 */
}