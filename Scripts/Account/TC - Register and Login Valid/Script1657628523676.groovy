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

Mobile.startApplication('C:\\Users\\095085\\Downloads\\FINALPROJECTS2010161213281-220627-220853\\FINAL PROJECTS\\MOBILE\\app-debug.apk', 
    true)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.Button - CREATE A PROFILE'), 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - First Name'), 'Juan', 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - Last Name'), 'Felix', 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - Country'), 'Indonesia', 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - Username'), 'wipeqy12', 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - Password'), 'Dr@gonnest12', 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - Confirm Password'), 'Dr@gonnest12', 
    0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.Button - Create Profile'), 0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.Button - ADD ACCOUNT'), 0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.Button - LOGIN'), 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - Account Name'), 'Tabungan', 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - Initial Balance (Optional)'), '10000000', 
    0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.Button - ADD'), 0)

Mobile.closeApplication()

