package innovation_Form
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.configuration.RunConfiguration
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


class In_NegativeCases {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User should be in Innovation Form")
	public void user_should_be_in_Innovation_Form() {
	    
		WebUI.callTestCase(findTestCase('Test Cases/Innovation/TC_In_Navigation'), null, FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("User clicks on save button without entering any data in Innovation Form")
	public void user_clicks_on_save_button_without_entering_any_data_in_Innovation_Form() {
	    
		WebUI.click(findTestObject('Object Repository/Innovation/btn_Save'))
	}
	
	@Given("User should be able to see the textbox for pilot credit")
	public void user_should_be_able_to_see_the_textbox_for_pilot_credit() {
		 
		WebUI.scrollToElement(findTestObject('Object Repository/Innovation/Pilot_Credit_Opt2/div_nameOfPilot'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Innovation/Pilot_Credit_Opt2/div_nameOfPilot'), 0)
	}
	
	String pilot_Credit
	@When("User enters the data more than 100 characters for pilot credit")
	public void user_enters_the_data_more_than_characters_for_pilot_credit() {
		 
		pilot_Credit = "I am trying to capture the Error that comes after entering the characters more than 100 as it allows only 100 characters"
		WebUI.setText(findTestObject("Object Repository/Innovation/Pilot_Credit_Opt2/input_nameOfPilot"), pilot_Credit)
		WebUI.delay(3)
		WebUI.setText(findTestObject("Object Repository/Innovation/Pilot_Credit_Opt2/input_numberOfPilot"), pilot_Credit)
	}
	
	String enterdValue
	@Then("User should not be able to see the complete entered value in pilot credit")
	public void user_should_not_be_able_to_see_the_complete_entered_value_in_pilot_credit() {
		 
		enterdValue = WebUI.getAttribute(findTestObject('Object Repository/Innovation/Pilot_Credit_Opt2/input_nameOfPilot'), 'value')
		println "The entered Value is "+ enterdValue
		println "The txt_PersentIncrease is " + pilot_Credit
		WebUI.verifyNotMatch(pilot_Credit, enterdValue, false)
		
		
		enterdValue = WebUI.getAttribute(findTestObject('Object Repository/Innovation/Pilot_Credit_Opt2/input_numberOfPilot'), 'value')
		println "The entered Value is "+ enterdValue
		println "The txt_PersentIncrease is " + pilot_Credit
		WebUI.verifyNotMatch(pilot_Credit, enterdValue, false)
	}
	
	
	@When("User enters the data Zero for pilot credit")
	public void user_enters_the_data_Zero_for_pilot_credit() {
		 
		pilot_Credit = "0"
		WebUI.setText(findTestObject("Object Repository/Innovation/Pilot_Credit_Opt2/input_nameOfPilot"), pilot_Credit)
		WebUI.delay(3)
		WebUI.setText(findTestObject("Object Repository/Innovation/Pilot_Credit_Opt2/input_numberOfPilot"), pilot_Credit)
	}
	
	@And("User finds the error message saying Please fix the highlighted errors will be displayed")
	public void user_finds_the_error_message_saying_please_fix_the_highlighted_errors_will_be_displayed(){

		WebUI.delay(2)
		boolean str =	WebUI.verifyTextPresent("Please fix the highlighted errors.", false)
		println "###########" + str
		WebUI.delay(2)
	}
	
	@When("User uploads a file which is greater than 100mb of LEED Accredited Professional in Innovation Form (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_LEED_Accredited_Professional_in_Innovation_Form(String Accredited_Professional) {
		 
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+Accredited_Professional
		println ("######################"+ myPdffilePath)
		WebUI.scrollToElement(findTestObject('Object Repository/Innovation/AddFile_LEED_Accredited/p_LEED_Accredited'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/Innovation/AddFile_LEED_Accredited/input_LEED_Accredited'), myPdffilePath)

	}
	
	@When("User uploads a file of LEED Accredited Professional in Innovation Form (.*)")
	public void user_uploads_a_file_of_LEED_Accredited_Professional_in_Innovation_Form(String Accredited_Professional) {
	
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+Accredited_Professional
		println ("######################"+ myPdffilePath)
		WebUI.scrollToElement(findTestObject('Object Repository/Innovation/AddFile_LEED_Accredited/p_LEED_Accredited'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/Innovation/AddFile_LEED_Accredited/input_LEED_Accredited'), myPdffilePath)
	}
	
	@Then("User clicks on save while the file is uploading in Innovation Form")
	public void user_clicks_on_save_while_the_file_is_uploading_in_Innovation_Form() {
		 
		WebUI.click(findTestObject('Object Repository/Innovation/btn_Save'))
	}
	
	@When("User uploads a file which is greater than 100mb of required documentation in Innovation Form (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_required_documentation_in_Innovation_Form(String required_documentation) {
		 
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+required_documentation
		println ("######################"+ myPdffilePath)
		WebUI.scrollToElement(findTestObject('Object Repository/Innovation/Pilot_Credit_Opt2/AddFile_required_doc/p_required_doc'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/Innovation/Pilot_Credit_Opt2/AddFile_required_doc/input_required_doc'), myPdffilePath)
	}
	
	@When("User uploads a file of required documentation in Innovation Form (.*)")
	public void user_uploads_a_file_of_required_documentation_in_Innovation_Form(String required_documentation) {
		 
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+required_documentation
		println ("######################"+ myPdffilePath)
		WebUI.scrollToElement(findTestObject('Object Repository/Innovation/Pilot_Credit_Opt2/AddFile_required_doc/p_required_doc'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/Innovation/Pilot_Credit_Opt2/AddFile_required_doc/input_required_doc'), myPdffilePath)
	}
	
	
	@When("User uploads a file which is greater than 100mb of additional documentation in Innovation Form (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_additional_documentation_in_Innovation_Form(String additional_documentation) {
		 
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+additional_documentation
		println ("######################"+ myPdffilePath)
		WebUI.scrollToElement(findTestObject('Object Repository/Innovation/Special Circumstances/AddFile_additionalDoc/p_Upload any additional documentation'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/Innovation/Special Circumstances/AddFile_additionalDoc/input_additionalDoc'), myPdffilePath)
	}
	
	@When("User uploads a file of additional documentation in Innovation Form (.*)")
	public void user_uploads_a_file_of_additional_documentation_in_Innovation_Form(String additional_documentation) {
		 
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+additional_documentation
		println ("######################"+ myPdffilePath)
		WebUI.scrollToElement(findTestObject('Object Repository/Innovation/Special Circumstances/AddFile_additionalDoc/p_Upload any additional documentation'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/Innovation/Special Circumstances/AddFile_additionalDoc/input_additionalDoc'), myPdffilePath)
	}
	
	@When("User uploads a file which is greater than 100mb of supporting documentation in Innovation Form (.*)")
	public void user_uploads_a_file_which_is_greater_than_mb_of_supporting_documentation_in_Innovation_Form(String supporting_documentation) {
		 
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+supporting_documentation
		println ("######################"+ myPdffilePath)
		WebUI.scrollToElement(findTestObject('Object Repository/Innovation/Innovation_Strategy_Opt1/AddFile_supporting_doc/input_supporting_doc'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/Innovation/Innovation_Strategy_Opt1/AddFile_supporting_doc/input_supporting_doc'), myPdffilePath)
	}
	
	@When("User uploads a file of supporting documentation in Innovation Form (.*)")
	public void user_uploads_a_file_of_supporting_documentation_in_Innovation_Form(String supporting_documentation) {
		 
		String myPdffilePath = RunConfiguration.getProjectDir() + '/Include/TestData/NegativeTestFiles/'+supporting_documentation
		println ("######################"+ myPdffilePath)
		WebUI.scrollToElement(findTestObject('Object Repository/Innovation/Innovation_Strategy_Opt1/AddFile_supporting_doc/input_supporting_doc'), 30)
		WebUI.uploadFile(findTestObject('Object Repository/Innovation/Innovation_Strategy_Opt1/AddFile_supporting_doc/input_supporting_doc'), myPdffilePath)
	}
		
}





