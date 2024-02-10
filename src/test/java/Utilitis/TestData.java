package Utilitis;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "testDataSet")
    public Object[][] testDataProvider() {
        Object[][] testDate = {
                {"Ahmet", "Candir", "can@gmail.com", "123", 25},// name, lastname, email, password,age
                {"Hamza", "Gokce", "hamza@gmail.com", "abc", 18},// name, lastname, email, password,age
                {"Hanna", "Kvitko", "hanna@gmail.com", "12as", 17},// name, lastname, email, password,age
                {"Aliye", "Can", "aliye@gmail.com", "123d", 8},// name, lastname, email, password,age
                {"Aziza", "Khon", "aziza@gmail.com", "123d", 15}// name, lastname, email, password,age
        };
        return testDate;
    }

    @DataProvider(name = "loginPositiveData")
    public Object[][] loginTestData() {
        Object[][] testDate = {
                {"Admin", "Admin123"}// email, password
        };
        return testDate;// needs create always a new to create  account
    }

    @DataProvider(name = "createAccountAutomationExercise")
    public Object [][] createAccount(){
        Object[][] testDate = {
                {"Aliye","aliye@gmail.com","1234","Aliye","Candir","GermanIT","Munich","Canada","Munich","Munich","1234","1234"},
                {"Aziza","aziza@gmail.com","1234","Aziza","Khu","Apple","NW","United States","NW","NW","1234","1234"},
                {"Hamza","hamza@gmail.com","1234","hamza","Gokce","Siemens","Tokyo","Canada","Tokyo","Tokyo","1234","1234"},
                {"Hanna","hanna@gmail.com","1234","Hanna","Kvitko","Philips","WDC","United States","WDC","WDC","1234","1234"},
                {"Ogulcan","ogulcan@gmail.com","1234","Ogulcan","Erdem","Samsung","Sydney","Canada","Sydney","Sydney","1234","1234"},
                {"Oguzhan","oguzhan@gmail.com","1234","Oguzhan","Erdem","Samsung","Sydney","United States","Sydney","Sydney","1234","1234"},
                {"Sahin","sahin@gmail.com","1234","Sahin","Kaya","Nokia","Helsinki","Canada","Helsinki","Helsinki","1234","1234"},
                {"Tetiana","tetiana@gmail.com","1234","Tetiana","Khok","Apple","NW","United States","NW","NW","1234","1234"},
                {"Polina","polina@gmail.com","1234","Polina","Khus","Apple","NW","United States","NW","NW","1234","1234"},
                {"Khalid","khalid@gmail.com","1234","Khalid","Ahmed","Apple","NW","United States","NW","NW","1234","1234"},
        };
        return testDate ;
    }
}
