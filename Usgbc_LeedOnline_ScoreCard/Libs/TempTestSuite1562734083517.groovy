import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/GH_SmokeTest')

suiteProperties.put('name', 'GH_SmokeTest')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("G:\\Sabareesh\\MyGitRepos\\Usgbc_LeedOnline_ScoreCard\\Usgbc_LeedOnline_ScoreCard\\Reports\\GH_SmokeTest\\20190710_101803\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/GH_SmokeTest', suiteProperties, [new TestCaseBinding('Test Cases/GridHarmonization/TC_GH_ResponseProgram', 'Test Cases/GridHarmonization/TC_GH_ResponseProgram',  null), new TestCaseBinding('Test Cases/GridHarmonization/TC_GH_ResponseCapable', 'Test Cases/GridHarmonization/TC_GH_ResponseCapable',  null), new TestCaseBinding('Test Cases/GridHarmonization/TC_GH_PermanentLoad', 'Test Cases/GridHarmonization/TC_GH_PermanentLoad',  null), new TestCaseBinding('Test Cases/GridHarmonization/TC_GH_VerifyUploaddFiles', 'Test Cases/GridHarmonization/TC_GH_VerifyUploaddFiles',  null), new TestCaseBinding('Test Cases/GridHarmonization/TC_GH_DownloadFiles', 'Test Cases/GridHarmonization/TC_GH_DownloadFiles',  null), new TestCaseBinding('Test Cases/GridHarmonization/TC_GH_DeleteUploadedFiles', 'Test Cases/GridHarmonization/TC_GH_DeleteUploadedFiles',  null), new TestCaseBinding('Test Cases/GridHarmonization/TC_GH_AutoSaveAsDraft', 'Test Cases/GridHarmonization/TC_GH_AutoSaveAsDraft',  null)])
