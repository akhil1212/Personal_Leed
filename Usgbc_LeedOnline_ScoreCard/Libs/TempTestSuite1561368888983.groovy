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


suiteProperties.put('id', 'Test Suites/LPR_SmokeTest')

suiteProperties.put('name', 'LPR_SmokeTest')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("G:\\Sabareesh\\MyGitRepos\\Usgbc_LeedOnline_ScoreCard\\Usgbc_LeedOnline_ScoreCard\\Reports\\LPR_SmokeTest\\20190624_150448\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/LPR_SmokeTest', suiteProperties, [new TestCaseBinding('Test Cases/LightPollutionReduction/TC_LPR_FixtureSheildingForm', 'Test Cases/LightPollutionReduction/TC_LPR_FixtureSheildingForm',  null), new TestCaseBinding('Test Cases/LightPollutionReduction/TC_VerifyLPR', 'Test Cases/LightPollutionReduction/TC_VerifyLPR',  null), new TestCaseBinding('Test Cases/LightPollutionReduction/TC_DownloadLPR', 'Test Cases/LightPollutionReduction/TC_DownloadLPR',  null), new TestCaseBinding('Test Cases/LightPollutionReduction/TC_LPR_PerimeterMeasurements', 'Test Cases/LightPollutionReduction/TC_LPR_PerimeterMeasurements',  null), new TestCaseBinding('Test Cases/LightPollutionReduction/TC_DeleteLPR', 'Test Cases/LightPollutionReduction/TC_DeleteLPR',  null), new TestCaseBinding('Test Cases/LightPollutionReduction/TC_DeleteTableData', 'Test Cases/LightPollutionReduction/TC_DeleteTableData',  null)])
