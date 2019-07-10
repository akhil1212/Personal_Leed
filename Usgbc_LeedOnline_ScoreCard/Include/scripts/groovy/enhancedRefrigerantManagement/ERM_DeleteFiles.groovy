package enhancedRefrigerantManagement
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

class ERM_DeleteFiles {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@When("User deletes the uploaded files of refrigerant equipment schedule in ERM Form")
	public void user_deletes_the_uploaded_files_of_refrigerant_equipment_schedule_in_ERM_Form() {

		String tableRow ="Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/AddFile_refrigerant_equi/tbody_Table_refrigerant_equi"
		String tableId = ERM_Entities.tableId_Xpath_commercial_RefrigUpload
		String scrollTo = "Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/AddFile_refrigerant_equi/p_refrigerant_equi"

		new projectKeywords().deleteUploadedFiles(tableRow, tableId, scrollTo, ERM_Entities.iframe)
	}

	@Then("User can see all the refrigerant equipment schedule in ERM Form  are deleted")
	public void user_can_see_all_the_refrigerant_equipment_schedule_in_ERM_Form_are_deleted() {

		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/AddFile_refrigerant_equi/Table_refrigerant_equi'), 30)
	}

	@When("User deletes the uploaded files of additional documentation in ERM Form")
	public void user_deletes_the_uploaded_files_of_additional_documentation_in_ERM_Form() {

		String tableRow ="Object Repository/EnhancedRefrigerantManagement/Special Circumstances/AddFile_additionalDoc/tbody_Table_additionalDoc"
		String tableId = ERM_Entities.tableId_Xpath_splCircumstances
		String scrollTo = "Object Repository/EnhancedRefrigerantManagement/Special Circumstances/AddFile_additionalDoc/p_Upload any additional documentation"

		new projectKeywords().deleteUploadedFiles(tableRow, tableId, scrollTo, ERM_Entities.iframe)
	}

	@Then("User can see all the additional documentation in ERM Form are deleted")
	public void user_can_see_all_the_additional_documentation_in_ERM_Form_are_deleted() {

		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/EnhancedRefrigerantManagement/Special Circumstances/AddFile_additionalDoc/Table_additionalDoc'), 30)
	}
}