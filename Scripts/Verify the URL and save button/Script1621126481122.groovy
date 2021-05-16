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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://wordpress.com/me')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/URL access/Page_Log In  WordPress.com/input_Email Address or Username_usernameOrEmail'), 
    'sonibp')

WebUI.sendKeys(findTestObject('Object Repository/URL access/Page_Log In  WordPress.com/input_Email Address or Username_usernameOrEmail'), 
    Keys.chord(Keys.ENTER))

WebUI.setEncryptedText(findTestObject('Object Repository/URL access/Page_Log In  WordPress.com/input_Password_password'), 
    'wWI3MC8Qi0XZ4dY1Td/o7Q==')

WebUI.sendKeys(findTestObject('Object Repository/URL access/Page_Log In  WordPress.com/input_Password_password'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/URL access/Page_My Profile  WordPress.com/div_Verify your email'))

WebUI.click(findTestObject('Object Repository/URL access/Page_My Profile  WordPress.com/button_OK'))

WebUI.click(findTestObject('Object Repository/URL access/Page_My Profile  WordPress.com/input_Public display name_display_name'))

WebUI.setText(findTestObject('Object Repository/URL access/Page_My Profile  WordPress.com/input_First name_first_name'), 
    'bela')

WebUI.click(findTestObject('Object Repository/URL access/Page_My Profile  WordPress.com/div_Verify your emailYour profile photo is _bb306c'))

WebUI.setText(findTestObject('Object Repository/URL access/Page_My Profile  WordPress.com/input_Last name_last_name'), '')

WebUI.click(findTestObject('Object Repository/URL access/Page_My Profile  WordPress.com/div_Skip navigationsonibpLog outMy ProfileA_3ee4fd'))

WebUI.setText(findTestObject('Object Repository/URL access/Page_My Profile  WordPress.com/input_Public display name_display_name'), 
    '')

WebUI.click(findTestObject('Object Repository/URL access/Page_My Profile  WordPress.com/button_Save profile details'))

WebUI.click(findTestObject('Object Repository/URL access/Page_My Profile  WordPress.com/span_Settings saved successfully'))

WebUI.click(findTestObject('Object Repository/URL access/Page_My Profile  WordPress.com/button_Log out'))

WebUI.closeBrowser()

