package innovation_Form
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

class In_DownloadFiles {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	
	String iframe="Object Repository/Innovation/iframe"
	@Given("User has to see the table of uploaded files on LEED Accredited in Innovation")
	public void user_has_to_see_the_table_of_uploaded_files_on_LEED_Accredited_in_Innovation() {
		 
		WebUI.callTestCase(findTestCase('Test Cases/Innovation/TC_In_Navigation'), null, FailureHandling.STOP_ON_FAILURE)
		
		WebUI.scrollToElement(findTestObject('Object Repository/Innovation/AddFile_LEED_Accredited/Table_LEED_Accredited'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Innovation/AddFile_LEED_Accredited/Table_LEED_Accredited'), 30)
	}
	
	@When("User downloads the uploaded files of LEED Accredited in Innovation")
	public void user_downloads_the_uploaded_files_of_LEED_Accredited_in_Innovation() {
		 
		String tableRow = "Object Repository/Innovation/AddFile_LEED_Accredited/tbody_Table_LEED_Accredited"
		String tableId = Innovation_Entities.tableId_Xpath_leedApDocs_files
		String scrollTo = "Object Repository/Innovation/AddFile_LEED_Accredited/p_LEED_Accredited"
		new projectKeywords().downloadUploadedFiles(tableRow,tableId,scrollTo,iframe)
	}
	
	@Then("User can see the downloaded files of LEED Accredited Innovation successfully")
	public void user_can_see_the_downloaded_files_of_LEED_Accredited_Innovation_successfully() {
	
		new projectKeywords().verifyDownloadedFiles()
	}
	
	@Given("User has to see the table of uploaded files on required documentation in Innovation")
	public void user_has_to_see_the_table_of_uploaded_files_on_required_documentation_in_Innovation() {
	
		WebUI.scrollToElement(findTestObject('Object Repository/Innovation/Pilot_Credit_Opt2/AddFile_required_doc/Table_required_doc'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Innovation/Pilot_Credit_Opt2/AddFile_required_doc/Table_required_doc'), 30)
	}
	
	@When("User downloads the uploaded files of required documentation in Innovation")
	public void user_downloads_the_uploaded_files_of_required_documentation_in_Innovation() {
		 
		String tableRow = "Object Repository/Innovation/Pilot_Credit_Opt2/AddFile_required_doc/tbody_Table_required_doc"
		String tableId = Innovation_Entities.tableId_Xpath_RequiredDocs_files
		String scrollTo = "Object Repository/Innovation/Pilot_Credit_Opt2/AddFile_required_doc/p_required_doc"
		new projectKeywords().downloadUploadedFiles(tableRow,tableId,scrollTo,iframe)
	}
	
	@Then("User can see the downloaded file of required documentation in Innovation successfully")
	public void user_can_see_the_downloaded_file_of_required_documentation_in_Innovation_successfully() {
		 
		new projectKeywords().verifyDownloadedFiles()
	}
	
	@Given("User has to see the table of uploaded files on additional documentation in Innovation")
	public void user_has_to_see_the_table_of_uploaded_files_on_additional_documentation_in_Innovation() {
		 
		WebUI.scrollToElement(findTestObject('Object Repository/Innovation/Special Circumstances/AddFile_additionalDoc/Table_additionalDoc'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Innovation/Special Circumstances/AddFile_additionalDoc/Table_additionalDoc'), 30)
	}
	
	@When("User downloads the uploaded files of additional documentation in Innovation")
	public void user_downloads_the_uploaded_files_of_additional_documentation_in_Innovation() {
	
		String tableRow = "Object Repository/Innovation/Special Circumstances/AddFile_additionalDoc/tbody_Table_additionalDoc"
		String tableId = Innovation_Entities.tableId_Xpath_splCircumstancesDocs_files
		String scrollTo = "Object Repository/Innovation/Special Circumstances/AddFile_additionalDoc/p_Upload any additional documentation"
		new projectKeywords().downloadUploadedFiles(tableRow,tableId,scrollTo,iframe)
	}
	
	@Then("User can see the downloaded file of additional documentation in Innovation successfully")
	public void user_can_see_the_downloaded_file_of_additional_documentation_in_Innovation_successfully() {
		 
		new projectKeywords().verifyDownloadedFiles()
	}
	
	@Given("User has to see the table of uploaded files on supporting documentation in Innovation")
	public void user_has_to_see_the_table_of_uploaded_files_on_supporting_documentation_in_Innovation() {
	
		WebUI.scrollToElement(findTestObject('Object Repository/Innovation/Innovation_Strategy_Opt1/AddFile_supporting_doc/Table_supporting_doc'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Innovation/Innovation_Strategy_Opt1/AddFile_supporting_doc/Table_supporting_doc'), 30)
	}
	
	@When("User downloads the uploaded files of supporting documentation in Innovation")
	public void user_downloads_the_uploaded_files_of_supporting_documentation_in_Innovation() {
		 
		WebUI.delay(5)
		String tableRow = "Object Repository/Innovation/Innovation_Strategy_Opt1/AddFile_supporting_doc/tbody_Table_supporting_doc"
		String tableId = Innovation_Entities.tableId_Xpath_SupportingDocs_files
		String scrollTo = "Object Repository/Innovation/Innovation_Strategy_Opt1/AddFile_supporting_doc/p_supporting_doc"
		new projectKeywords().downloadUploadedFiles(tableRow,tableId,scrollTo,iframe)
	}
	
	@Then("User can see the downloaded file of supporting documentation in Innovation successfully")
	public void user_can_see_the_downloaded_file_of_supporting_documentation_in_Innovation_successfully() {
		 
		new projectKeywords().verifyDownloadedFiles()
	}
	
}