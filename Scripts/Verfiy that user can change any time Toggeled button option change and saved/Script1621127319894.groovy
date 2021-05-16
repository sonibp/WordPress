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

WebUI.setText(findTestObject('Object Repository/Toggel button update/Page_Log In  WordPress.com/input_Email Address or Username_usernameOrEmail'), 
    'sonibp')

WebUI.sendKeys(findTestObject('Object Repository/Toggel button update/Page_Log In  WordPress.com/input_Email Address or Username_usernameOrEmail'), 
    Keys.chord(Keys.ENTER))

WebUI.setEncryptedText(findTestObject('Object Repository/Toggel button update/Page_Log In  WordPress.com/input_Password_password'), 
    'wWI3MC8Qi0XZ4dY1Td/o7Q==')

WebUI.sendKeys(findTestObject('Object Repository/Toggel button update/Page_Log In  WordPress.com/input_Password_password'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Toggel button update/Page_My Profile  WordPress.com/input_About me_inspector-toggle-control-0'))

WebUI.click(findTestObject('Object Repository/Toggel button update/Page_My Profile  WordPress.com/button_Save profile details'))

WebUI.click(findTestObject('Object Repository/Toggel button update/Page_My Profile  WordPress.com/span_Settings saved successfully'))

WebUI.click(findTestObject('Object Repository/Toggel button update/Page_My Profile  WordPress.com/button_Log out'))

WebUI.closeBrowser()

