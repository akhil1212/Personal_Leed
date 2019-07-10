import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext

import leedOnlineKeywords.projectKeywords
import org.openqa.selenium.remote.HttpCommandExecutor
import org.openqa.selenium.remote.RemoteWebDriver
import org.openqa.selenium.remote.SessionId

class LeedOnlineProjectListeners {
	/**
	 * Executes before every test case starts.
	 * @param testCaseContext related information of the executed test case.
	 */
	@BeforeTestCase
	def sampleBeforeTestCase(TestCaseContext testCaseContext) {
		WebUI.openBrowser("")
		
		RemoteWebDriver driver = DriverFactory.getWebDriver()
		println "The driver is ########### " + driver
		
		//String downloadPath = "/opt/jenkins_node/workspace/LeedOnline_ScoreCard/Usgbc_LeedOnline_ScoreCard/Include/TestData/DownloadedFiles"
		//String downloadPath = "/opt/jenkins_node/workspace/Usgbc_LEED/Usgbc_LeedOnline_ScoreCard/Include/TestData/DownloadedFiles"
		//String downloadPath = "/var/lib/jenkins/workspace/LeedOnline_ScoreCard/Usgbc_LeedOnline_ScoreCard/Include/TestData/DownloadedFiles"
		//String downloadPath = "G:\\Sabareesh\\MyGitRepos\\Usgbc_LeedOnline_ScoreCard\\Usgbc_LeedOnline_ScoreCard\\Include\\TestData\\DownloadedFiles"
		//String downloadPath = "H:\\Git Projects\\Usgbc_LeedOnline_ScoreCard\\Usgbc_LeedOnline_ScoreCard\\Include\\TestData\\DownloadedFiles"

		//String downloadPath = "/var/lib/jenkins/workspace/USGBC_LEED_ScoreCard/Usgbc_LeedOnline_ScoreCard/Include/TestData/DownloadedFiles"
		String downloadPath = "/var/lib/jenkins/workspace/Local_Check_SCard/Usgbc_LeedOnline_ScoreCard/Include/TestData/DownloadedFiles"
		new projectKeywords().sendCommandForDownloadChromeHeadLess((HttpCommandExecutor)driver.getCommandExecutor(),driver.getSessionId(), downloadPath )
	}

	/**
	 * Executes after every test case ends.
	 * @param testCaseContext related information of the executed test case.
	 */
	@AfterTestCase
	def sampleAfterTestCase(TestCaseContext testCaseContext) {
		
		WebUI.closeBrowser()
	}
}
