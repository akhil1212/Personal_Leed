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

class PI_Download_Files {
	/**
	 * Downloading the uploaded files present in the form and verifying with the files  -- Started
	 */

	@When("User downloads the uploaded files of a site plan identifying the LEED project boundary")
	public void user_downloads_the_uploaded_files_of_a_site_plan_identifying_the_LEED_project_boundary() {

		String tableRow = 'Object Repository/ProjectInformation/AddFile_SitePlan/tbody_Table_SitePlan'
		String tableId = PI_Entities.tableId_SitePlan
		String scrollTo = "Object Repository/ProjectInformation/AddFile_SitePlan/p_AddFile_SitePlan"
		new projectKeywords().downloadUploadedFiles(tableRow,tableId,scrollTo,PI_Entities.iframe)
	}

	@Then("User can see the downloaded files of a site plan identifying the LEED project boundary")
	public void user_can_see_the_downloaded_files_of_a_site_plan_identifying_the_LEED_project_boundary() {

		new projectKeywords().verifyDownloadedFiles()
	}

	@When("User downloads the uploaded files of the representative floor plans for the project")
	public void user_downloads_the_uploaded_files_of_the_representative_floor_plans_for_the_project() {

		String tableRow = 'Object Repository/ProjectInformation/AddFile_FloorPlans/tbody_Table_FloorPlans'
		String tableId = PI_Entities.tableId_FloorPlans
		String scrollTo = "Object Repository/ProjectInformation/AddFile_FloorPlans/p_AddFile_FloorPlans"
		new projectKeywords().downloadUploadedFiles(tableRow,tableId,scrollTo,PI_Entities.iframe)
	}

	@Then("User can see the downloaded files of the representative floor plans for the project")
	public void user_can_see_the_downloaded_files_of_the_representative_floor_plans_for_the_project() {

		new projectKeywords().verifyDownloadedFiles()
	}

	@When("User downloads the uploaded files of the mechanical schedules and plans and or drawings")
	public void user_downloads_the_uploaded_files_of_the_mechanical_schedules_and_plans_and_or_drawings() {

		String tableRow = 'Object Repository/ProjectInformation/AddFile_MechanicalPlans/tbody_Table_MechanicalPlans'
		String tableId = PI_Entities.tableId_MechanicalPlans
		String scrollTo = "Object Repository/ProjectInformation/AddFile_MechanicalPlans/p_AddFile_MechanicalPlans"
		new projectKeywords().downloadUploadedFiles(tableRow,tableId,scrollTo,PI_Entities.iframe)
	}

	@Then("User can see the downloaded files of the mechanical schedules and plans and or drawings")
	public void user_can_see_the_downloaded_files_of_the_mechanical_schedules_and_plans_and_or_drawings() {

		new projectKeywords().verifyDownloadedFiles()
	}

	@When("User downloads the uploaded files of the photos or a video walkthrough of the project")
	public void user_downloads_the_uploaded_files_of_the_photos_or_a_video_walkthrough_of_the_project() {

		String tableRow = 'Object Repository/ProjectInformation/AddFile_ProjectGraphics/tbody_Table_ProjectGraphics'
		String tableId = PI_Entities.tableId_Projectgraphics
		String scrollTo = "Object Repository/ProjectInformation/AddFile_ProjectGraphics/p_AddFile_ProjectGraphics"
		new projectKeywords().downloadUploadedFiles(tableRow,tableId,scrollTo,PI_Entities.iframe)
	}

	@Then("User can see the downloaded files of the photos or a video walkthrough of the project")
	public void user_can_see_the_downloaded_files_of_the_photos_or_a_video_walkthrough_of_the_project() {

		new projectKeywords().verifyDownloadedFiles()
	}


	@When("User downloads the uploaded files of the completed Performance Periods Table")
	public void user_downloads_the_uploaded_files_of_the_completed_Performance_Periods_Table() {

		String tableRow = 'Object Repository/ProjectInformation/AddFile_PerformancePeriods/tbody_Table_PerformancePeriods'
		String tableId = PI_Entities.tableId_PerformancePeriods
		String scrollTo = "Object Repository/ProjectInformation/AddFile_PerformancePeriods/p_AddFile_PerformancePeriods"
		new projectKeywords().downloadUploadedFiles(tableRow,tableId,scrollTo,PI_Entities.iframe)
	}

	@Then("User can see the downloaded files of the completed Performance Periods Table")
	public void user_can_see_the_downloaded_files_of_the_completed_Performance_Periods_Table() {

		new projectKeywords().verifyDownloadedFiles()
	}

	@When("User downloads the uploaded files of special circumstances for Project Information")
	public void user_downloads_the_uploaded_files_of_special_circumstances_for_Project_Information() {

		String tableRow = 'Object Repository/ProjectInformation/AddFile_SpecialCircum/tbody_Table_SplCircum'
		String tableId = PI_Entities.tableId_SpecialCircumstances
		String scrollTo = "Object Repository/ProjectInformation/AddFile_SpecialCircum/p_AddFile_SplCircum"
		new projectKeywords().downloadUploadedFiles(tableRow,tableId,scrollTo,PI_Entities.iframe)
	}

	@Then("User can see the downloaded files of special circumstances for Project Information")
	public void user_can_see_the_downloaded_files_of_special_circumstances_for_Project_Information() {

		new projectKeywords().verifyDownloadedFiles()
	}
	/**
	 * Downloading the uploaded files present in the form and verifying with the files  -- Ended
	 */
}