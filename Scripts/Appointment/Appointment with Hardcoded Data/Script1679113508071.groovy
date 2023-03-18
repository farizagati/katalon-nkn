import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('block/block-Login valid credential'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('02-Obj Manual/03-Appointment/dd_facility'), 'Seoul CURA Healthcare Center', false)

WebUI.check(findTestObject('02-Obj Manual/03-Appointment/chk_apply hospital readmission'))

WebUI.click(findTestObject('02-Obj Manual/03-Appointment/radio_Medicaid_programs'))

WebUI.setText(findTestObject('02-Obj Manual/03-Appointment/inpt_visit_date'), '11/05/2023')

WebUI.setText(findTestObject('02-Obj Manual/03-Appointment/inpt_comment'), 'this is an automated comment')

WebUI.click(findTestObject('02-Obj Manual/03-Appointment/btn_Book Appointment'))

WebUI.waitForElementVisible(findTestObject('02-Obj Manual/04-Appointment Confirmation/h2_Appointment Confirmation'), 0)

WebUI.verifyElementVisible(findTestObject('02-Obj Manual/04-Appointment Confirmation/h2_Appointment Confirmation'))

WebUI.verifyElementVisible(findTestObject('02-Obj Manual/04-Appointment Confirmation/p_Please be informed'))

WebUI.verifyElementText(findTestObject('02-Obj Manual/04-Appointment Confirmation/lbl_facility'), 'Seoul CURA Healthcare Center')

WebUI.verifyElementText(findTestObject('02-Obj Manual/04-Appointment Confirmation/lbl_hospital readmission'), 'Yes')

WebUI.verifyElementText(findTestObject('02-Obj Manual/04-Appointment Confirmation/lbl_program'), 'Medicaid')

WebUI.verifyElementText(findTestObject('02-Obj Manual/04-Appointment Confirmation/lbl_visit_date'), '11/05/2023')

WebUI.verifyElementText(findTestObject('02-Obj Manual/04-Appointment Confirmation/lbl_comment'), 'this is an automated comment')

WebUI.click(findTestObject('02-Obj Manual/04-Appointment Confirmation/btn_Go to Homepage'))

WebUI.verifyElementVisible(findTestObject('02-Obj Manual/01-Homepage/txt_h1_CURA Healthcare Service'))

WebUI.delay(3)

WebUI.closeBrowser()

