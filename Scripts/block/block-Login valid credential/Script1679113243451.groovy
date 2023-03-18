import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('02-Obj Manual/01-Homepage/btn_menu-toggle'))

WebUI.click(findTestObject('02-Obj Manual/01-Homepage/btn_menu_Login'))

WebUI.waitForElementPresent(findTestObject('02-Obj Manual/02-Login Page/txt_h2_Login'), 15)

WebUI.setText(findTestObject('02-Obj Manual/02-Login Page/txtField_username'), 'John Doe')

WebUI.setText(findTestObject('02-Obj Manual/02-Login Page/txtField_password'), 'ThisIsNotAPassword')

WebUI.click(findTestObject('02-Obj Manual/02-Login Page/btn_Login'))

WebUI.waitForElementPresent(findTestObject('02-Obj Manual/01-Homepage/txt_h1_CURA Healthcare Service'), 0)

