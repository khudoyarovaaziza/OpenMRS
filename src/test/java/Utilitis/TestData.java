package Utilitis;

import org.testng.annotations.DataProvider;

public class TestData {


    @DataProvider(name = "loginPositiveData")
    public Object[][] loginTestData() {
        Object[][] testDate = {
                {"Admin", "Admin123"}// email, password
        };
        return testDate;
    }

}
