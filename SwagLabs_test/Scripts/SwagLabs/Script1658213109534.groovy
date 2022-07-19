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
import com.reusableComponents.HighlightElement

WebUI.openBrowser('https://www.saucedemo.com/')

WebUI.setText(findTestObject('Object Repository/Username'), 'standard_user')

WebUI.sendKeys(findTestObject('Object Repository/Password'), 'secret_sauce')

WebUI.click(findTestObject('Object Repository/button_login'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/SauceLabs_Backpack'))

WebUI.click(findTestObject('Object Repository/Button_Add_To_Cart_Backpack'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Button_Cart'))

WebUI.click(findTestObject('Object Repository/Button_CheckOut'))

WebUI.setText(findTestObject('Object Repository/CheckOut_FistName'), 'test')

WebUI.setText(findTestObject('Object Repository/CheckOut_LastName'), 'Swag')

WebUI.setText(findTestObject('Object Repository/CheckOut_ZIP'), '1122')

WebUI.click(findTestObject('Object Repository/CheckOut_Continue'))

