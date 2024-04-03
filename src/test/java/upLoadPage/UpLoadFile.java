package upLoadPage;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.UploadPage;

import static org.testng.Assert.assertTrue;

public class UpLoadFile extends BaseTest {
    @Test(priority = 1)

    public void testUpLoadFile() {
        UploadPage uploadPage = homePage.clickOnUploadLink();

        uploadPage.uploadFile("C:\\Users\\Bassma Qassem\\Documents\\ui\\DIGI_Library\\AddCustomerToSalesInvoice.xaml");
        uploadPage.clickOnSubmitButton();
        String ActualResult = uploadPage.getValidationMessage();
        //System.out.println(ActualResult);
        String expectedResult= "File Uploaded!";
        assertTrue(ActualResult.contains(expectedResult));

    }}