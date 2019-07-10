package enhancedRefrigerantManagement
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
import com.testautomationguru.utility.PDFUtil

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

class EnhancedRefrigerantManagement_Form {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User can see Enhanced Refrigerant Management under Energy and Atmosphere")
	public void user_can_see_Enhanced_Refrigerant_Management_under_Energy_and_Atmosphere() {

		WebUI.scrollToElement(findTestObject('Object Repository/EnhancedRefrigerantManagement/ERM_Navigation/div_Enhanced Refrigerant Management'), 10)
		boolean formNamePresent = WebUI.verifyElementPresent(findTestObject('Object Repository/EnhancedRefrigerantManagement/ERM_Navigation/div_Enhanced Refrigerant Management'), 30)
		if (formNamePresent == true){
			println "Form Present"
		}
		else{
			println "Form Not Present"
		}
	}

	@Given("User has to select the status to Attempted for Enhanced Refrigerant Management")
	public void user_has_to_select_the_status_to_Attempted_for_Enhanced_Refrigerant_Management() {

		String status =	WebUI.getText(findTestObject('Object Repository/EnhancedRefrigerantManagement/ERM_Navigation/h3_Status'))
		println "######################### h3" + status
		String divval = WebUI.getText(findTestObject('Object Repository/EnhancedRefrigerantManagement/ERM_Navigation/divval'))
		println "######################### dival" + divval

		if (status == "READY FOR REVIEW") {
			println "Inside the if"
			WebUI.click(findTestObject('Object Repository/EnhancedRefrigerantManagement/ERM_Navigation/a_MarkReadyForReview'))
			WebUI.delay(5)
		}
		String changedStatus =	WebUI.getText(findTestObject('Object Repository/EnhancedRefrigerantManagement/ERM_Navigation/h3_Status'))
		println "The changed Status is "+changedStatus
	}

	@When("User clicks on Enhanced Refrigerant Management")
	public void user_clicks_on_Enhanced_Refrigerant_Management() {

		WebUI.click(findTestObject('Object Repository/EnhancedRefrigerantManagement/ERM_Navigation/div_Enhanced Refrigerant Management'))
	}

	@When("User has to click on FormV01 button of Enhanced Refrigerant Management")
	public void user_has_to_click_on_FormV_button_of_Enhanced_Refrigerant_Management() {

		WebUI.delay(3);
		WebUI.click(findTestObject('Object Repository/EnhancedRefrigerantManagement/ERM_Navigation/span_(V01)'))
	}

	@Then("User should be able to see the Enhanced Refrigerant Management form")
	public void user_should_be_able_to_see_the_Enhanced_Refrigerant_Management_form() {

		println "Finsihed"
		boolean insideForm = WebUI.verifyElementPresent(findTestObject('Object Repository/EnhancedRefrigerantManagement/ERM_Navigation/div_EnhancedRefrigerantManagement_Credit'), 30)
		if (insideForm == true){
			println "Inside the Enhanced Refrigerant Management form"
		}
		else {
			println "Not inside the Enhanced Refrigerant Management form"
		}
	}

	/**
	 *  No Refrigerants (option 1)
	 */

	@Given("User should see the radio button option No Refrigerants or Low-Impact Refrigerants")
	public void user_should_see_the_radio_button_option_No_Refrigerants_or_Low_Impact_Refrigerants() {

		WebUI.callTestCase(findTestCase('Test Cases/EnhancedRefrigerantManagement/TC_ERM_Navigation'), null, FailureHandling.STOP_ON_FAILURE)

		boolean chk_project = WebUI.verifyElementPresent(findTestObject("Object Repository/EnhancedRefrigerantManagement/No_Refrigerants_Opt1/input_No_Refrigerants"), 30)
		if (chk_project == true){
			println "option for the project team in ERM is present"
		}
		else{
			println "option for the project team in ERM is not present"
		}
	}

	@When("User clicks on No Refrigerants or Low-Impact Refrigerants option")
	public void user_clicks_on_No_Refrigerants_or_Low_Impact_Refrigerants_option() {
		WebUI.delay(3)
		WebUI.check(findTestObject("Object Repository/EnhancedRefrigerantManagement/No_Refrigerants_Opt1/input_No_Refrigerants"))
		WebUI.delay(3)
	}

	@Then("User should see the contents for No Refrigerants or Low-Impact Refrigerants option")
	public void user_should_see_the_contents_for_No_Refrigerants_or_Low_Impact_Refrigerants_option() {

		WebUI.switchToFrame(findTestObject("Object Repository/EnhancedRefrigerantManagement/iframe"), 30)
		WebUI.verifyTextPresent("Option 1. No Refrigerants or Low-Impact Refrigerants.", false)
		WebUI.switchToDefaultContent()
	}


	@Given("User should see the editor for low-impact refrigerants for Low-Impact Refrigerants in ERM Form")
	public void user_should_see_the_editor_for_low_impact_refrigerants_for_Low_Impact_Refrigerants_in_ERM_Form() {

		WebUI.scrollToElement(findTestObject('Object Repository/EnhancedRefrigerantManagement/No_Refrigerants_Opt1/Editor_low_impact_refrigerants/p_low_impact_refrigerants'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/EnhancedRefrigerantManagement/No_Refrigerants_Opt1/Editor_low_impact_refrigerants/p_low_impact_refrigerants'), 5)
	}

	@When("User feeds long narrative text for low-impact refrigerants text box for Low-Impact Refrigerants in ERM Form")
	public void user_feeds_long_narrative_text_for_low_impact_refrigerants_text_box_for_Low_Impact_Refrigerants_in_ERM_Form() {

		println "##############"+ ERM_Entities.txt_narrativeText
		WebUI.setText(findTestObject('Object Repository/EnhancedRefrigerantManagement/No_Refrigerants_Opt1/Editor_low_impact_refrigerants/body_low_impact'),ERM_Entities.txt_narrativeText)

		WebUI.delay(3)
	}

	@Then("User should see the narrative text persist on low-impact refrigerants text box for Low-Impact Refrigerants in ERM Form")
	public void user_should_see_the_narrative_text_persist_on_low_impact_refrigerants_text_box_for_Low_Impact_Refrigerants_in_ERM_Form() {

		String procedureDetails = WebUI.getText(findTestObject('Object Repository/EnhancedRefrigerantManagement/No_Refrigerants_Opt1/Editor_low_impact_refrigerants/body_low_impact'))
		println "##############"+ procedureDetails
		WebUI.verifyMatch(procedureDetails, ERM_Entities.txt_narrativeText , false, FailureHandling.STOP_ON_FAILURE)
	}

	@Given("User should be able to see the Add File button for additional documentation audit in ERM Form")
	public void user_should_be_able_to_see_the_Add_File_button_for_additional_documentation_audit_in_ERM_Form() {

		WebUI.scrollToElement(findTestObject('Object Repository/EnhancedRefrigerantManagement/Special Circumstances/AddFile_additionalDoc/p_Upload any additional documentation'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/EnhancedRefrigerantManagement/Special Circumstances/AddFile_additionalDoc/p_Upload any additional documentation'), 30)
	}

	@Then("User uploads file for additional documentation in ERM Form")
	public void user_uploads_file_for_additional_documentation_in_ERM_Form() {

		String uploadButton = "Object Repository/EnhancedRefrigerantManagement/Special Circumstances/AddFile_additionalDoc/Button_additionalDoc"
		String inputUploadFile = "Object Repository/EnhancedRefrigerantManagement/Special Circumstances/AddFile_additionalDoc/input_additionalDoc"

		new projectKeywords().uploadMultipleFiles(uploadButton,inputUploadFile)
	}


	@Given("User should see the editor for Special Circumstances in ERM Form")
	public void user_should_see_the_editor_for_Special_Circumstances_in_ERM_Form() {

		WebUI.scrollToElement(findTestObject('Object Repository/EnhancedRefrigerantManagement/Special Circumstances/EditorBox_splCircum/p_EditorBox'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/EnhancedRefrigerantManagement/Special Circumstances/EditorBox_splCircum/p_EditorBox'), 5)
	}

	@When("User feeds long narrative text for Special Circumstances text box in ERM Form")
	public void user_feeds_long_narrative_text_for_Special_Circumstances_text_box_in_ERM_Form() {

		println "##############"+ ERM_Entities.txt_narrativeText
		WebUI.setText(findTestObject('Object Repository/EnhancedRefrigerantManagement/Special Circumstances/EditorBox_splCircum/body_splCircum'),ERM_Entities.txt_narrativeText )

		WebUI.delay(3)
	}

	@Then("User should see the narrative text persist on Special Circumstances text box in ERM Form")
	public void user_should_see_the_narrative_text_persist_on_Special_Circumstances_text_box_in_ERM_Form() {

		String Special_Circumstances = WebUI.getText(findTestObject('Object Repository/EnhancedRefrigerantManagement/Special Circumstances/EditorBox_splCircum/body_splCircum'))
		println "##############"+ Special_Circumstances
		WebUI.verifyMatch(Special_Circumstances, ERM_Entities.txt_narrativeText , false, FailureHandling.STOP_ON_FAILURE)
	}


	@Given("User can see the save button in ERM Form")
	public void user_can_see_the_save_button_in_ERM_Form() {

		WebUI.delay(10)
		WebUI.scrollToElement(findTestObject('Object Repository/EnhancedRefrigerantManagement/button_Save'), 30)
		WebUI.verifyElementVisible(findTestObject('Object Repository/EnhancedRefrigerantManagement/button_Save'))
	}

	@When("User clicks on save button in ERM Form")
	public void user_clicks_on_save_button_in_ERM_Form() {

		WebUI.click(findTestObject('Object Repository/EnhancedRefrigerantManagement/button_Save'))
	}

	@Then("User should see Form data saved successfully message in ERM Form")
	public void user_should_see_Form_data_saved_successfully_message_in_ERM_Form() {

		WebUI.delay(2)
		boolean str =	WebUI.verifyTextPresent("Form data saved successfully.", false)
		println "###########" + str
	}

	String Qunit_IP,Rc_IP
	@Given("User checks the unit type of Qunit, Rc in ERM Form")
	public void user_checks_the_unit_type_of_Qunit_Rc_in_ERM_Form() {

		Qunit_IP=WebUI.getText(findTestObject('Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/Table_MechanicalCooling/Qunit(tr)'))
		println "#############Qunit_IP : " +Qunit_IP
		WebUI.delay(2)
		Rc_IP=WebUI.getText(findTestObject('Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/Table_MechanicalCooling/Rc(tr)'))
		println "#############Rc_IP : " +Rc_IP
	}

	@When("User changes Units from IP to SI")
	public void user_changes_Units_from_IP_to_SI() {

		String formname="Object Repository/EnhancedRefrigerantManagement/ERM_Navigation/div_Enhanced Refrigerant Management"
		String spanV01="Object Repository/EnhancedRefrigerantManagement/ERM_Navigation/span_(V01)"
		String unitType="SI"
		new projectKeywords().changeTheUnits(unitType,formname,spanV01)
	}
	String Qunit_SI,Rc_SI
	@Then("User again checks the unit type of Qunit, Rc in ERM Form")
	public void user_again_checks_the_unit_type_of_Qunit_Rc_in_ERM_Form() {

		Qunit_SI=WebUI.getText(findTestObject('Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/Table_MechanicalCooling/Qunit(tr)'))
		println "#############Qunit_SI : " +Qunit_SI
		WebUI.delay(2)
		Rc_SI=WebUI.getText(findTestObject('Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/Table_MechanicalCooling/Rc(tr)'))
		println "#############Rc_SI : " +Rc_SI
	}

	@Then("User should be able to see the change in the unit type in ERM Form")
	public void user_should_be_able_to_see_the_change_in_the_unit_type_in_ERM_Form() {

		WebUI.verifyNotMatch(Qunit_IP, Qunit_SI, false)
		WebUI.verifyNotMatch(Rc_IP, Rc_SI, false)
	}

	@Then("User changes Units to IP")
	public void user_changes_Units_to_IP() {

		String formname="Object Repository/EnhancedRefrigerantManagement/ERM_Navigation/div_Enhanced Refrigerant Management"
		String spanV01="Object Repository/EnhancedRefrigerantManagement/ERM_Navigation/span_(V01)"
		String unitType="IP"
		new projectKeywords().changeTheUnits(unitType,formname,spanV01)
	}

	@Given("User can see the generate pdf icon on the top of the ERM Form")
	public void user_can_see_the_generate_pdf_icon_on_the_top_of_the_ERM_Form() {

		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/EnhancedRefrigerantManagement/icon_pdf'), 5)
		WebUI.verifyElementPresent(findTestObject('Object Repository/EnhancedRefrigerantManagement/icon_pdf'), 30)
	}

	@When("User clicks on generate pdf icon to download the file in ERM Form")
	public void user_clicks_on_generate_pdf_icon_to_download_the_file_in_ERM_Form() {

		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/EnhancedRefrigerantManagement/icon_pdf'))
		WebUI.delay(10)
	}

	@Then("User has to verify the low-impact refrigerants html editor with downloaded pdf file in ERM Form")
	public void user_has_to_verify_the_low_impact_refrigerants_html_editor_with_downloaded_pdf_file_in_ERM_Form() {

		String Editorpath='Object Repository/EnhancedRefrigerantManagement/No_Refrigerants_Opt1/Editor_low_impact_refrigerants/body_low_impact'
		String scroll='Object Repository/EnhancedRefrigerantManagement/No_Refrigerants_Opt1/Editor_low_impact_refrigerants/p_low_impact_refrigerants'
		new projectKeywords().compareNarrativeDataWithPDF(scroll,Editorpath)
		WebUI.switchToDefaultContent()
		WebUI.delay(2)
	}

	@Then("User has to verify the Special Circumstances html editor with downloaded pdf file in ERM Form")
	public void user_has_to_verify_the_Special_Circumstances_html_editor_with_downloaded_pdf_file_in_ERM_Form() {

		String Editorpath='Object Repository/EnhancedRefrigerantManagement/Special Circumstances/EditorBox_splCircum/body_splCircum'
		String scroll='Object Repository/EnhancedRefrigerantManagement/Special Circumstances/EditorBox_splCircum/p_EditorBox'
		new projectKeywords().compareNarrativeDataWithPDF(scroll,Editorpath)
		WebUI.switchToDefaultContent()
		WebUI.delay(2)
	}

	@Then("User has to verify Uploaded additional documentation with downloaded pdf file in ERM Form")
	public void user_has_to_verify_Uploaded_additional_documentation_with_downloaded_pdf_file_in_ERM_Form() {

		String xpathid="Object Repository/EnhancedRefrigerantManagement/Special Circumstances/AddFile_additionalDoc/tbody_Table_additionalDoc"
		String scroll1='Object Repository/EnhancedRefrigerantManagement/Special Circumstances/AddFile_additionalDoc/p_Upload any additional documentation'
		new projectKeywords().compareUploadedFileWithPDF1(xpathid,scroll1,ERM_Entities.iframe)

		WebUI.delay(2)
	}


	@Then("User verifies the narrative text of low-impact refrigerants html editor box for ERM form")
	public void user_verifies_the_narrative_text_of_low_impact_refrigerants_html_editor_box_for_ERM_form() {

		String lowimpact = WebUI.getText(findTestObject('Object Repository/EnhancedRefrigerantManagement/No_Refrigerants_Opt1/Editor_low_impact_refrigerants/body_low_impact'))
		println "##############"+ lowimpact
		WebUI.verifyMatch(lowimpact, ERM_Entities.txt_narrativeText, false, FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User verifies the narrative text of Special Circumstances html editor box for ERM form")
	public void user_verifies_the_narrative_text_of_Special_Circumstances_html_editor_box_for_ERM_form() {

		String Special_Circum = WebUI.getText(findTestObject('Object Repository/EnhancedRefrigerantManagement/Special Circumstances/EditorBox_splCircum/body_splCircum'))
		println "##############"+ Special_Circum
		WebUI.verifyMatch(Special_Circum, ERM_Entities.txt_narrativeText, false, FailureHandling.STOP_ON_FAILURE)
	}

	/**
	 * Calculation of Refrigerant Impact (Option 2)
	 */

	@Given("User should see the radio button option Calculation of Refrigerant Impact")
	public void user_should_see_the_radio_button_option_Calculation_of_Refrigerant_Impact() {

		WebUI.callTestCase(findTestCase('Test Cases/EnhancedRefrigerantManagement/TC_ERM_Navigation'), null, FailureHandling.STOP_ON_FAILURE)

		boolean chk_project = WebUI.verifyElementPresent(findTestObject("Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/input_Calc_Refrigerant_Impact"), 30)
		if (chk_project == true){
			println "option for the project team in ERM is present"
		}
		else{
			println "option for the project team in ERM is not present"
		}
	}

	@When("User clicks on Calculation of Refrigerant Impact option")
	public void user_clicks_on_Calculation_of_Refrigerant_Impact_option() {

		WebUI.delay(3)
		WebUI.check(findTestObject("Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/input_Calc_Refrigerant_Impact"))
		WebUI.delay(3)
	}

	@Then("User should see the contents for Calculation of Refrigerant Impact option")
	public void user_should_see_the_contents_for_Calculation_of_Refrigerant_Impact_option() {

		WebUI.switchToFrame(findTestObject("Object Repository/EnhancedRefrigerantManagement/iframe"), 30)
		WebUI.verifyTextPresent("Option 2. Calculation of Refrigerant Impact.", false)
		WebUI.switchToDefaultContent()
	}


	@Given("User can see the Table Mechanical Cooling and Refrigeration Equipment of Refrigerant Impact")
	public void user_can_see_the_Table_Mechanical_Cooling_and_Refrigeration_Equipment_of_Refrigerant_Impact() {

		WebUI.scrollToElement(findTestObject('Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/Table_MechanicalCooling/Table_MechanicalCooling'), 5)
		WebUI.verifyElementPresent(findTestObject('Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/Table_MechanicalCooling/Table_MechanicalCooling'), 30)
	}

	int i
	TestObject EquipmentType, Units, Qunit,Refrigerant,Rc,Life,addRow

	@When("User enters the details of Equipment Type, Units,Qunit,Refrigerant,Rc,Life")
	public void user_enters_the_details_of_Equipment_Type_Units_Qunit_Refrigerant_Rc_Life() {

		WebUI.selectOptionByValue(findTestObject('Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/Table_MechanicalCooling/select_EquipmentType'), "Split AC or heat pump", false)

		WebUI.clearText(findTestObject('Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/Table_MechanicalCooling/Units'))
		WebUI.setText(findTestObject('Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/Table_MechanicalCooling/Units'), '55')

		WebUI.clearText(findTestObject('Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/Table_MechanicalCooling/Qunit'))
		WebUI.setText(findTestObject('Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/Table_MechanicalCooling/Qunit'), '56')

		WebUI.selectOptionByValue(findTestObject('Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/Table_MechanicalCooling/select_Refrigerant'), "R-12", false)

		WebUI.delay(2)

		WebUI.clearText(findTestObject('Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/Table_MechanicalCooling/RC'))
		WebUI.setText(findTestObject('Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/Table_MechanicalCooling/RC'), '57')

		WebUI.clearText(findTestObject('Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/Table_MechanicalCooling/Life'))
		WebUI.setText(findTestObject('Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/Table_MechanicalCooling/Life'), '57')

		WebUI.click(findTestObject('Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/Table_MechanicalCooling/i_plus_Button'))

		for(def row=1; row <=findTestData("ERM_TableData").getRowNumbers() ; row++){

			i = row + 1
			println "Value :"+i
			WebUI.switchToFrame(findTestObject('Object Repository/EnhancedRefrigerantManagement/iframe'), 5)
			EquipmentType = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="refrigerantTable"]/tbody/tr['+i+']/td[1]/select', true)
			Units = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="refrigerantTable"]/tbody/tr['+i+']/td[2]/input', true)
			Qunit = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="refrigerantTable"]/tbody/tr['+i+']/td[3]/input', true)
			Refrigerant = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="refrigerantTable"]/tbody/tr['+i+']/td[4]/select', true)
			Rc = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="refrigerantTable"]/tbody/tr['+i+']/td[7]/input', true)
			Life = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="refrigerantTable"]/tbody/tr['+i+']/td[8]/input', true)

			WebUI.selectOptionByValue(EquipmentType,findTestData("ERM_TableData").getValue("EquipmentType", row), true)
			WebUI.setText(Units, findTestData("ERM_TableData").getValue("Units", row))
			WebUI.setText(Qunit, findTestData("ERM_TableData").getValue("Qunit", row))
			WebUI.selectOptionByValue(Refrigerant,findTestData("ERM_TableData").getValue("Refrigerant", row), true)
			WebUI.delay(3)
			WebUI.setText(Rc, findTestData("ERM_TableData").getValue("Rc", row))
			WebUI.setText(Life, findTestData("ERM_TableData").getValue("Life", row))


			WebUI.switchToDefaultContent()

			addRow = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="refrigerantTable"]/tbody/tr['+i+']/td[15]/a/i', true)
			WebUI.delay(1)
			if(row !=findTestData("ERM_TableData").getRowNumbers()) {
				WebUI.switchToFrame(findTestObject('Object Repository/EnhancedRefrigerantManagement/iframe'), 5)
				WebUI.click(addRow)
				WebUI.switchToDefaultContent()
			}
		}
	}

	@Then("User can see the calculated value of GWPr,ODPr,Lr,Mr,LCGWP,LCODP,Impact,ImpactTotal in the Table Mechanical Cooling of Refrigerant Impact")
	public void user_can_see_the_calculated_value_of_GWPr_ODPr_Lr_Mr_LCGWP_LCODP_Impact_ImpactTotal_in_the_Table_Mechanical_Cooling_of_Refrigerant_Impact() {

		String GWPr = WebUI.getText(findTestObject('Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/Table_MechanicalCooling/GWPr'))
		println "############### GWPr " + GWPr

		String ODPr = WebUI.getText(findTestObject('Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/Table_MechanicalCooling/ODPr'))
		println "############### ODPr " + ODPr

		String Lr = WebUI.getText(findTestObject('Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/Table_MechanicalCooling/Lr'))
		println "############### Lr " + Lr

		String Mr = WebUI.getText(findTestObject('Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/Table_MechanicalCooling/Mr'))
		println "############### Mr " + Mr

		String LCGWP = WebUI.getText(findTestObject('Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/Table_MechanicalCooling/LCGWP'))
		println "############### LCGWP " + LCGWP

		String LCODP = WebUI.getText(findTestObject('Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/Table_MechanicalCooling/LCODP'))
		println "############### LCODP " + LCODP

		String Impact = WebUI.getText(findTestObject('Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/Table_MechanicalCooling/Impact'))
		println "############### Impact " + Impact

		String ImpactTotal = WebUI.getText(findTestObject('Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/Table_MechanicalCooling/ImpactTotal'))
		println "############### ImpactTotal " + ImpactTotal
	}


	@Given("User should see the radio button option GreenChill’s silver-level certification")
	public void user_should_see_the_radio_button_option_GreenChill_s_silver_level_certification() {

		WebUI.scrollToElement(findTestObject('Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/select_one_radio/GreenChills_silver_level'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/select_one_radio/GreenChills_silver_level'), 30)
	}

	@Then("User clicks on GreenChill’s silver-level certification option")
	public void user_clicks_on_GreenChill_s_silver_level_certification_option() {

		WebUI.check(findTestObject('Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/select_one_radio/GreenChills_silver_level'))
	}


	@Given("User should see the radio button option project requirements")
	public void user_should_see_the_radio_button_option_project_requirements() {

		WebUI.scrollToElement(findTestObject('Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/select_one_radio/Project_requirements'), 30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/select_one_radio/Project_requirements'), 30)
	}

	@Then("User clicks on project requirements option")
	public void user_clicks_on_project_requirements_option() {

		WebUI.check(findTestObject('Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/select_one_radio/Project_requirements'))
	}

	@Given("User should be able to see the Add File button for refrigerant equipment in ERM Form")
	public void user_should_be_able_to_see_the_Add_File_button_for_refrigerant_equipment_in_ERM_Form() {

		WebUI.scrollToElement(findTestObject('Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/AddFile_refrigerant_equi/p_refrigerant_equi'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/AddFile_refrigerant_equi/p_refrigerant_equi'), 30)
	}

	@Then("User uploads file for refrigerant equipment in ERM Form")
	public void user_uploads_file_for_refrigerant_equipment_in_ERM_Form() {

		String uploadButton = "Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/AddFile_refrigerant_equi/Button_refrigerant_equi"
		String inputUploadFile = "Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/AddFile_refrigerant_equi/input_refrigerant_equi"

		new projectKeywords().uploadMultipleFiles(uploadButton,inputUploadFile)
	}


	@Then("User verifies the data present in the table Mechanical Cooling and Refrigeration Equipment with the entered data")
	public void user_verifies_the_data_present_in_the_table_Mechanical_Cooling_and_Refrigeration_Equipment_with_the_entered_data() {

		for(def row=1; row <=findTestData("ERM_TableData").getRowNumbers() ; row++){

			def EquipmentType_ExcelData =  findTestData("ERM_TableData").getValue("EquipmentType", row)
			def Units_ExcelData = findTestData("ERM_TableData").getValue("Units", row)
			def Qunit_ExcelData = findTestData("ERM_TableData").getValue("Qunit", row)
			def Refrigerant_ExcelData = findTestData("ERM_TableData").getValue("Refrigerant", row)
			def Rc_ExcelData = findTestData("ERM_TableData").getValue("Rc", row)
			def Life_ExcelData = findTestData("ERM_TableData").getValue("Life", row)

			println "The EquipmentType in excel is :" + EquipmentType_ExcelData
			println "The Units in excel is :" + Units_ExcelData
			println "The Qunit in excel is :" + Qunit_ExcelData
			println "The Refrigerant in excel is :" + Refrigerant_ExcelData
			println "The Rc in excel is :" + Rc_ExcelData
			println "The Life in excel is :" + Life_ExcelData

			i = row + 1

			WebUI.switchToFrame(findTestObject('Object Repository/EnhancedRefrigerantManagement/iframe'), 5)
			EquipmentType = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="refrigerantTable"]/tbody/tr['+i+']/td[1]/select', true)
			Units = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="refrigerantTable"]/tbody/tr['+i+']/td[2]/input', true)
			Qunit = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="refrigerantTable"]/tbody/tr['+i+']/td[3]/input', true)
			Refrigerant = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="refrigerantTable"]/tbody/tr['+i+']/td[4]/select', true)
			Rc = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="refrigerantTable"]/tbody/tr['+i+']/td[7]/input', true)
			Life = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="refrigerantTable"]/tbody/tr['+i+']/td[8]/input', true)

			def EquipmentType_FormData = WebUI.getAttribute((EquipmentType), 'value')
			def Units_FormData = WebUI.getAttribute((Units), 'value')
			def Qunit_FormData = WebUI.getAttribute((Qunit), 'value')
			def Refrigerant_FormData = WebUI.getAttribute((Refrigerant), 'value')
			def Rc_FormData = WebUI.getAttribute((Rc), 'value')
			def Life_FormData = WebUI.getAttribute((Life), 'value')

			WebUI.switchToDefaultContent()
			println "The EquipmentType in form is :" + EquipmentType_FormData
			println "The Units in form is :" + Units_FormData
			println "The Qunit in form is :" + Qunit_FormData
			println "The Refrigerant in form is :" + Refrigerant_FormData
			println "The Rc in form is :" + Rc_FormData
			println "The Life in form is :" + Life_FormData

			WebUI.verifyMatch(EquipmentType_ExcelData, EquipmentType_FormData, false)
			WebUI.verifyMatch(Units_ExcelData, Units_FormData, false)
			WebUI.verifyMatch(Qunit_ExcelData, Qunit_FormData, false)
			WebUI.verifyMatch(Refrigerant_ExcelData, Refrigerant_FormData, false)
			WebUI.verifyMatch(Rc_ExcelData, Rc_FormData, false)
			WebUI.verifyMatch(Life_ExcelData, Life_FormData, false)
		}
	}


	@Then("User has to verify the Mechanical Cooling and Refrigeration Equipment table with downloaded pdf file")
	public void user_has_to_verify_the_Mechanical_Cooling_and_Refrigeration_Equipment_table_with_downloaded_pdf_file() {

		WebUI.scrollToElement(findTestObject('Object Repository/EnhancedRefrigerantManagement/iframe'), 10)
		String EquipmentType = WebUI.getAttribute(findTestObject('Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/Table_MechanicalCooling/select_EquipmentType'), 'value')
		String Units = WebUI.getAttribute(findTestObject('Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/Table_MechanicalCooling/Units'), 'value')
		String Qunit = WebUI.getAttribute(findTestObject('Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/Table_MechanicalCooling/Qunit'), 'value')
		String Refrigerant = WebUI.getText(findTestObject('Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/Table_MechanicalCooling/select_Refrigerant'))
		String Rc = WebUI.getAttribute(findTestObject('Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/Table_MechanicalCooling/RC'), 'value')
		String Life = WebUI.getText(findTestObject('Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/Table_MechanicalCooling/Life'))
		String ImpactTotal = WebUI.getText(findTestObject('Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/Table_MechanicalCooling/ImpactTotal'))

		println "################" + ImpactTotal
		PDFUtil pdfUtil1 = new PDFUtil();
		String path = RunConfiguration.getProjectDir() + '/Include/TestData/DownloadedFiles/creditForm.pdf'
		String file = pdfUtil1.getText(path,1)
		WebUI.delay(2)
		println(file)
		if (file.contains(EquipmentType)){
			println("The content in the downloaded pdf matches with the Table Data Content -->  EquipmentType Found")
		}
		else {
			println("The content in the downloaded pdf does not match with the Table Data Content --> EquipmentType Not Found")
		}
		if (file.contains(Units)){
			println("The content in the downloaded pdf matches with the Table Data Content -->  Units Found")
		}
		else {
			println("The content in the downloaded pdf does not match with the Table Data Content --> Units Not Found")
		}
		if (file.contains(Qunit)){
			println("The content in the downloaded pdf matches with the Table Data Content -->  Qunit Found")
		}
		else {
			println("The content in the downloaded pdf does not match with the Table Data Content --> Qunit Not Found")
		}
		if (file.contains(Refrigerant)){
			println("The content in the downloaded pdf matches with the Table Data Content -->  Refrigerant Found")
		}
		else {
			println("The content in the downloaded pdf does not match with the Table Data Content --> Refrigerant Not Found")
		}
		if (file.contains(Rc)){
			println("The content in the downloaded pdf matches with the Table Data Content -->  Rc Found")
		}
		else {
			println("The content in the downloaded pdf does not match with the Table Data Content --> Rc  Not Found")
		}
		if (file.contains(Life)){
			println("The content in the downloaded pdf matches with the Table Data Content -->  Life Found")
		}
		else {
			println("The content in the downloaded pdf does not match with the Table Data Content --> Life  Not Found")
		}
	}

	@Then("User has to verify Uploaded refrigerant equipment with downloaded pdf file")
	public void user_has_to_verify_Uploaded_refrigerant_equipment_with_downloaded_pdf_file() {

		String xpathid="Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/AddFile_refrigerant_equi/tbody_Table_refrigerant_equi"
		String scroll1='Object Repository/EnhancedRefrigerantManagement/Calc_Refrigerant_Impact_Opt2/AddFile_refrigerant_equi/p_refrigerant_equi'

		new projectKeywords().compareUploadedFileWithPDF1(xpathid,scroll1,ERM_Entities.iframe)

		WebUI.delay(2)
	}

	@Then("User changes the status to ready for review for the ERM form")
	public void user_changes_the_status_to_ready_for_review_for_the_ERM_form() {

		WebUI.delay(2)
		println "Form refreshed and waited for the delay"
		WebUI.back()
		println "Back to previous page"
		WebUI.delay(2)
		println "Back to previous page and given delay"

		String status =	WebUI.getText(findTestObject("Object Repository/EnhancedRefrigerantManagement/ERM_Navigation/h3_Status"))

		if (status == "ATTEMPTED"){
			println "Inside the if"
			WebUI.click(findTestObject("Object Repository/EnhancedRefrigerantManagement/ERM_Navigation/a_MarkReadyForReview"))

			WebUI.delay(5)
		}

		String changed_Status =	WebUI.getText(findTestObject("Object Repository/EnhancedRefrigerantManagement/ERM_Navigation/h3_Status"))
		println "######################### changed_Status " + changed_Status
	}
}





























