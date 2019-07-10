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

class In_DeleteFiles {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	
	String iframe="Object Repository/Innovation/iframe"
	
	@When("User deletes the uploaded files of LEED Accredited Professional in Innovation Form")
	public void user_deletes_the_uploaded_files_of_LEED_Accredited_Professional_in_Innovation_Form() {
	     
		String tableRow ="Object Repository/Innovation/AddFile_LEED_Accredited/tbody_Table_LEED_Accredited"
		String tableId = Innovation_Entities.tableId_Xpath_leedApDocs_files
		String scrollTo = "Object Repository/Innovation/AddFile_LEED_Accredited/p_LEED_Accredited"

		new projectKeywords().deleteUploadedFiles(tableRow, tableId, scrollTo, iframe)
	}
	
	@Then("User can see all the LEED Accredited Professional in Innovation Form are deleted")
	public void user_can_see_all_the_LEED_Accredited_Professional_in_Innovation_Form_are_deleted() {
	     
		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/Innovation/AddFile_LEED_Accredited/Table_LEED_Accredited'), 30)
	}
	
	@When("User deletes the uploaded files of required documentation in Innovation Form")
	public void user_deletes_the_uploaded_files_of_required_documentation_in_Innovation_Form() {
		 
		String tableRow ="Object Repository/Innovation/Pilot_Credit_Opt2/AddFile_required_doc/tbody_Table_required_doc"
		String tableId = Innovation_Entities.tableId_Xpath_RequiredDocs_files
		String scrollTo = "Object Repository/Innovation/Pilot_Credit_Opt2/AddFile_required_doc/p_required_doc"

		new projectKeywords().deleteUploadedFiles(tableRow, tableId, scrollTo, iframe)
	}
	
	@Then("User can see all the required documentaion in Innovation Form are deleted")
	public void user_can_see_all_the_required_documentaion_in_Innovation_Form_are_deleted() {
		 
		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/Innovation/Pilot_Credit_Opt2/AddFile_required_doc/Table_required_doc'), 30)
	}

	
	
	@When("User deletes the uploaded files of additional documentation in Innovation Form")
	public void user_deletes_the_uploaded_files_of_additional_documentation_in_Innovation_Form() {
	     
		String tableRow ="Object Repository/Innovation/Special Circumstances/AddFile_additionalDoc/tbody_Table_additionalDoc"
		String tableId = Innovation_Entities.tableId_Xpath_splCircumstancesDocs_files
		String scrollTo = "Object Repository/Innovation/Special Circumstances/AddFile_additionalDoc/p_Upload any additional documentation"

		new projectKeywords().deleteUploadedFiles(tableRow, tableId, scrollTo, iframe)
	}
	
	@Then("User can see all the supporting additional in Innovation Form are deleted")
	public void user_can_see_all_the_supporting_additional_in_Innovation_Form_are_deleted() {
	     
		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/Innovation/Special Circumstances/AddFile_additionalDoc/Table_additionalDoc'), 30)
	}
	
	
	@When("User deletes the uploaded files of supporting documentation in Innovation Form")
	public void user_deletes_the_uploaded_files_of_supporting_documentation_in_Innovation_Form() {
	     
		String tableRow ="Object Repository/Innovation/Innovation_Strategy_Opt1/AddFile_supporting_doc/tbody_Table_supporting_doc"
		String tableId = Innovation_Entities.tableId_Xpath_SupportingDocs_files
		String scrollTo = "Object Repository/Innovation/Innovation_Strategy_Opt1/AddFile_supporting_doc/p_supporting_doc"

		new projectKeywords().deleteUploadedFiles(tableRow, tableId, scrollTo, iframe)
	}
	
	@Then("User can see all the supporting documentation in Innovation Form are deleted")
	public void user_can_see_all_the_supporting_documentation_in_Innovation_Form_are_deleted() {
	 
		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/Innovation/Innovation_Strategy_Opt1/AddFile_supporting_doc/Table_supporting_doc'), 30)
	}

}