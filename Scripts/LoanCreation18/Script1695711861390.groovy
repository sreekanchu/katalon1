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

WebUI.navigateToUrl('https://www.lendingclub.com/')

WebUI.setText(findTestObject('Object Repository/Page_Online Personal Loans  Full-Service Ba_ac9e03/input_Personal loans up to 40,000_currencyi_a299bf'), 
    '$30,000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Online Personal Loans  Full-Service Ba_ac9e03/select_Whats the money forCredit card refin_9ce23e'), 
    'What\'s the money for?', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Online Personal Loans  Full-Service Ba_ac9e03/select_Whats the money forCredit card refin_9ce23e'), 
    'vacation', true)

WebUI.click(findTestObject('Object Repository/Page_Online Personal Loans  Full-Service Ba_ac9e03/button_Check Your Rate'))

WebUI.click(findTestObject('Object Repository/Page_Check Your Rate  LendingClub/button_Next'))

WebUI.setText(findTestObject('Object Repository/Page_Check Your Rate  LendingClub/input_Date of Birth_dob'), '04/15/1977')

WebUI.click(findTestObject('Object Repository/Page_Check Your Rate  LendingClub/button_Next_1'))

WebUI.setText(findTestObject('Object Repository/Page_Check Your Rate  LendingClub/input__income'), '19,909,909')

WebUI.click(findTestObject('Object Repository/Page_Check Your Rate  LendingClub/div_Whats your total annual income, before _609bb3'))

WebUI.setText(findTestObject('Object Repository/Page_Check Your Rate  LendingClub/input__income'), '1,990,990')

WebUI.click(findTestObject('Object Repository/Page_Check Your Rate  LendingClub/div_Whats your total annual income, before _95614d'))

WebUI.click(findTestObject('Object Repository/Page_Check Your Rate  LendingClub/button_Next_1_2'))

WebUI.setText(findTestObject('Object Repository/Page_Check Your Rate  LendingClub/input_First Name_firstName'), 'Sreekant')

WebUI.setText(findTestObject('Object Repository/Page_Check Your Rate  LendingClub/input_Last Name_lastName'), 'Kanchumurthi')

WebUI.click(findTestObject('Object Repository/Page_Check Your Rate  LendingClub/button_Next_1_2_3'))

WebUI.setText(findTestObject('Object Repository/Page_Check Your Rate  LendingClub/input_Street Address_streetAddress'), 
    '33 St')

WebUI.click(findTestObject('Object Repository/Page_Check Your Rate  LendingClub/span_Agnes Ln, Albany, NY'))

WebUI.click(findTestObject('Object Repository/Page_Check Your Rate  LendingClub/div_Whats your home addressLets make sure w_c46af2'))

WebUI.click(findTestObject('Object Repository/Page_Check Your Rate  LendingClub/button_Next_1_2_3_4'))

WebUI.setText(findTestObject('Object Repository/Page_Check Your Rate  LendingClub/input_Phone Number_phone'), '(345) 678-7654')

WebUI.click(findTestObject('Object Repository/Page_Check Your Rate  LendingClub/button_Next_1_2_3_4_5'))

WebUI.setText(findTestObject('Object Repository/Page_Check Your Rate  LendingClub/input_Email_email'), 'sreek@lc.com')

WebUI.click(findTestObject('Object Repository/Page_Check Your Rate  LendingClub/input_By checking this box, I represent and_193d72'))

WebUI.click(findTestObject('Object Repository/Page_Check Your Rate  LendingClub/button_Next_1_2_3_4_5_6'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Check Your Rate  LendingClub/input_Password_password'), '7q1aKE1wHhStYTYBr26JbA==')

WebUI.click(findTestObject('Object Repository/Page_Check Your Rate  LendingClub/button_Get Your Rate'))

WebUI.click(findTestObject('Object Repository/Page_Check Your Rate  LendingClub/button_SHOW'))

WebUI.click(findTestObject('Object Repository/Page_Check Your Rate  LendingClub/input_Password_password_1'))

WebUI.click(findTestObject('Object Repository/Page_Check Your Rate  LendingClub/input_Password_password_1'))

WebUI.setText(findTestObject('Object Repository/Page_Check Your Rate  LendingClub/input_Password_password_1'), 'welcome1!')

WebUI.click(findTestObject('Object Repository/Page_Check Your Rate  LendingClub/button_Get Your Rate'))

WebUI.click(findTestObject('Object Repository/Page_Check Your Rate  LendingClub/button_Try Again'))

WebUI.click(findTestObject('Object Repository/Page_Check Your Rate  LendingClub/li_Home'))

WebUI.click(findTestObject('Object Repository/Page_Check Your Rate  LendingClub/a_Home'))

WebUI.closeBrowser()

