import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.annotation.Keyword as Keyword
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.nio.file.Files as Files
import java.nio.file.Path as Path
import java.nio.file.Paths as Paths
import javax.imageio.ImageIO as ImageIO
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import ru.yandex.qatools.ashot.AShot as AShot
import ru.yandex.qatools.ashot.Screenshot as Screenshot
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider as WebDriverCoordsProvider
import ru.yandex.qatools.ashot.shooting.ShootingStrategies as ShootingStrategies

String closeC = ' '

//row = 1
xlsData = findTestData('TestData')

for (int row = 1; row <= xlsData.getRowNumbers(); row++) {
    WebUI.openBrowser('')

    WebUI.maximizeWindow()

    WebUI.navigateToUrl(xlsData.getValue('url', row))

    WebUI.waitForPageLoad(GlobalVariable.time)

    WebUI.takeScreenshot(('Screenshots/TC_01_0' + row) + '/00_WelcomePage.png')

    WebUI.click(findTestObject('btn_start'))

    closeC = xlsData.getValue('Q1', row)

    if (closeC == 'close') {
        WebUI.closeBrowser()

        closeC = ''

        continue
    }
    
    WebUI.click(findTestObject('radio_choice', [('choice') : xlsData.getValue('Q1', row), ('rowNo') : '1']))

    if (xlsData.getValue('Q1', row).equalsIgnoreCase('2')) {
        closeC = xlsData.getValue('Q1_1', row)

        if (closeC == 'close') {
            WebUI.closeBrowser()

            closeC = ''

            continue
        }
        
        WebUI.click(findTestObject('radio_choice', [('choice') : xlsData.getValue('Q1_1', row), ('rowNo') : '2']))

        if (xlsData.getValue('Q1_1', row).equalsIgnoreCase('1')) {
            closeC = xlsData.getValue('Q1_1_1', row)

            if (closeC == 'close') {
                WebUI.closeBrowser()

                closeC = ''

                continue
            }
            
            WebUI.setText(findTestObject('input_otherText1'), xlsData.getValue('Q1_1_1', row))
        }
    }
    
    closeC = xlsData.getValue('Q2', row)

    if (closeC == 'close') {
        WebUI.closeBrowser()

        closeC = ''

        continue
    }
    
    WebUI.setText(findTestObject('input_text1'), xlsData.getValue('Q2', row))

    WebUI.takeScreenshot(('Screenshots/TC_01_0' + row) + '/01_Page1.png')

    WebUI.click(findTestObject('btn_next'))

    closeC = xlsData.getValue('Q3', row)

    if (closeC == 'close') {
        WebUI.closeBrowser()

        closeC = ''

        continue
    }
    
    WebUI.click(findTestObject('votescore', [('rowNo') : '1', ('vote') : xlsData.getValue('Q3', row)]))

    closeC = xlsData.getValue('Q4', row)

    if (closeC == 'close') {
        WebUI.closeBrowser()

        closeC = ''

        continue
    }
    
    WebUI.click(findTestObject('votescore', [('rowNo') : '2', ('vote') : xlsData.getValue('Q4', row)]))

    closeC = xlsData.getValue('Q5', row)

    if (closeC == 'close') {
        WebUI.closeBrowser()

        closeC = ''

        continue
    }
    
    WebUI.click(findTestObject('votescore', [('rowNo') : '3', ('vote') : xlsData.getValue('Q5', row)]))

    closeC = xlsData.getValue('Q6', row)

    if (closeC == 'close') {
        WebUI.closeBrowser()

        closeC = ''

        continue
    }
    
    WebUI.click(findTestObject('votescore', [('rowNo') : '4', ('vote') : xlsData.getValue('Q6', row)]))

    closeC = xlsData.getValue('Q7', row)

    if (closeC == 'close') {
        WebUI.closeBrowser()

        closeC = ''

        continue
    }
    
    WebUI.click(findTestObject('votescore', [('rowNo') : '5', ('vote') : xlsData.getValue('Q7', row)]))

    WebUI.takeScreenshot(('Screenshots/TC_01_0' + row) + '/02_Page2.png')

    WebUI.click(findTestObject('btn_next'))

    closeC = xlsData.getValue('Q8', row)

    if (closeC == 'close') {
        WebUI.closeBrowser()

        closeC = ''

        continue
    }
    
    WebUI.click(findTestObject('radio_choice', [('choice') : xlsData.getValue('Q8', row), ('rowNo') : '1']))

    closeC = xlsData.getValue('Q9', row)

    if (closeC == 'close') {
        WebUI.closeBrowser()

        closeC = ''

        continue
    }
    
    WebUI.click(findTestObject('radio_choice', [('choice') : xlsData.getValue('Q9', row), ('rowNo') : '2']))

    if (xlsData.getValue('Q9', row).equalsIgnoreCase('1')) {
        closeC = xlsData.getValue('Q9_1', row)

        if (closeC == 'close') {
            WebUI.closeBrowser()

            closeC = ''

            continue
        }
        
        WebUI.setText(findTestObject('input_otherText2', [('rowNo') : '1']), xlsData.getValue('Q9_1', row))
    }
    
    if (xlsData.getValue('Q9', row).equalsIgnoreCase('2')) {
        closeC = xlsData.getValue('Q9_2', row)

        if (closeC == 'close') {
            WebUI.closeBrowser()

            closeC = ''

            continue
        }
        
        WebUI.setText(findTestObject('input_otherText2', [('rowNo') : '2']), xlsData.getValue('Q9_2', row))
    }
    
    closeC = xlsData.getValue('Q10', row)

    if (closeC == 'close') {
        WebUI.closeBrowser()

        closeC = ''

        continue
    }
    
    WebUI.setText(findTestObject('input_text2'), xlsData.getValue('Q10', row))

    WebUI.takeScreenshot(('Screenshots/TC_01_0' + row) + '/03_Page3.png')

    WebUI.click(findTestObject('btn_next'))

    WebUI.delay(3)

    WebUI.takeScreenshot(('Screenshots/TC_01_0' + row) + '/04_ThankyouPage.png')

    WebUI.closeBrowser()
}

