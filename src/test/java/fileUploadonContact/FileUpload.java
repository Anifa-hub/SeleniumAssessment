package fileUploadonContact;

import base.BaseTests;
import org.testng.annotations.Test;

public class FileUpload extends BaseTests {
    @Test
    public void FileUploadTest(){
        var uploading = homePage.clickOnContact();
        uploading.setUsername("Anifa");
        uploading.setEmail("anifabazubagira@gmail.com");
        uploading.setSubject("selenium");
        uploading.setMessage("This is a test");

        uploading.setFileUpload("E:\\kepler\\Dosiye Isaba ikazi (Umuratwa Afsana).docx");
        uploading.acceptAlert();
    }
}
