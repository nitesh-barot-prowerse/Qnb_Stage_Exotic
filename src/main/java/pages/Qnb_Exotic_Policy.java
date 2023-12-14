package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Log;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class Qnb_Exotic_Policy {

    private WebDriver driver;
    Logger logger = LogManager.getLogger(Qnb_Exotic_Policy.class);

    public Qnb_Exotic_Policy(WebDriver driver) {
        this.driver = driver;
    }

    String breedType = "";

    private By petName = By.cssSelector("input[name='petname']");

    private By continueButton = By.cssSelector("button[id='button-addon2']");

    private By imageUploadButton = By.xpath("//div[@class='row justify-content-end']/div/button");


    private By speciesDropDown = By.xpath("//div[@class='dropdown dselect-wrapper form-control rounded-5 findus']/button");

    private By optionOfSpeciesDropDown = By.xpath("//div[@class='dropdown dselect-wrapper form-control rounded-5 findus']/div/div/div/button[2]");

    private By optionOfSpeciesDropDownForBirdOfPray = By.xpath("//div[@class='dropdown dselect-wrapper form-control rounded-5 findus']/div/div/div/button[2]");

    private By optionOfSpeciesDropDownForMammal = By.xpath("//div[@class='dropdown dselect-wrapper form-control rounded-5 findus']/div/div/div/button[3]");

    private By optionOfSpeciesDropDownForReptile = By.xpath("//div[@class='dropdown dselect-wrapper form-control rounded-5 findus']/div/div/div/button[4]");

    private By optionOfSpeciesDropDownForTortoise = By.xpath("//div[@class='dropdown dselect-wrapper form-control rounded-5 findus']/div/div/div/button[5]");

    private By speciesContinueButton = By.cssSelector("button[class='btn btn-primary rounded-5']");

    private By selectSpeciesDropDown = By.xpath("//div[@class='dropdown dselect-wrapper form-control rounded-5 findus']/button");

    private By searchInput = By.xpath("//div[@class='dropdown-menu show']/div/input");

    private By selectSpeciesFromDD = By.xpath("//div[@class='dropdown dselect-wrapper form-control rounded-5 findus']/div/div/div/button[2]");

    private By continueSearchButton = By.cssSelector("button[class='btn btn-primary rounded-5']");

    //client and pet information page

    private By petGenderRadio = By.cssSelector("input[id='male']");

    private By petDateOfBirth = By.cssSelector("input[id='hatchedborn1']");

    private By petDateOfBirthMammal=By.cssSelector("input[id='tortoisage']");

    private By petPrice = By.cssSelector("input[id='payforpet']");

    private By clientDevision = By.cssSelector("h2[class='greytextcolor m-0 collapse-arrow collapsed']");

    private By clientFirstName = By.cssSelector("input[id='firstname']");

    private By clientLastName = By.cssSelector("input[id='lastname']");

    private By clientEmailId = By.cssSelector("input[id='emailaddress']");

    private By clientNumber = By.cssSelector("input[id='Phonenumber']");

    private By clientDOB = By.cssSelector("input[id='DOB']");

    private By addressPostCode = By.cssSelector("input[id='Address1']");

    private By selectAddressFromDD = By.xpath("//div[@id='cc_c2a']/ul/li[1]/div");


    private By insuranceNommine = By.cssSelector("input[id='insuranceNo']");

    private By extraInfoDevision = By.cssSelector("h2[class='greytextcolor collapse-arrow collapsed']");

    private By keepInTouchRadio = By.cssSelector("input[id='keepIntouchno']");

    private By continueButtonToGoNext = By.cssSelector("button[class='btn btn-primary rounded-5']");

    //Client LogIn Page

    private By clientUserName = By.cssSelector("input[id='exampleInputEmail1']");

    private By clientPassword = By.cssSelector("input[id='exampleInputPassword1']");

    private By submitButton = By.cssSelector("button[class='btn btn-primary rounded-5']");

    //Plan selection Page

    private By premiumPlan = By.cssSelector("button[name='premium']");

    private By plusPlan = By.cssSelector("button[name='plus']");

    private By valuePlan = By.cssSelector("button[name='value']");

    private By buyButton = By.cssSelector("button[class='btn btn-primary rounded-5']");

    //cover start

    private By coverStartDate = By.cssSelector("input[id='coverStartDate']");

    private By assumptionRadio = By.cssSelector("input[id='assumptionsYes']");

    private By continueButtonPage = By.cssSelector("button[id='sbmtbtn']");

    //terms and condition

    private By tc1 = By.cssSelector("input[id='tc1']");
    private By tc2 = By.cssSelector("input[id='tc2']");
    private By tc3 = By.cssSelector("input[id='tc3']");

    private By continueNext = By.cssSelector("button[class='btn btn-primary rounded-5']");

    //Payment Details

    private By yearlyRadio = By.xpath("//div[@id='paymentTypeSelection']/div[1]/input");

    private By cardHolderName = By.xpath("//div[@id='showYearly']/div[2]/input");

    private By addressConfirmation = By.xpath("//div[@id='showYearly']/div[3]/div[1]/input");

    private By cardNumber = By.xpath("//div[@id='showYearly']/div[4]/input");

    private By cvvNumber = By.xpath("//div[@id='showYearly']/div[5]/input");

    private By expireMonth = By.xpath("//div[@id='showYearly']/div[6]/input");

    private By expireYear = By.xpath("//div[@id='showYearly']/div[7]/input");

    private By continueButtonNextPage = By.xpath("//button[@id='cntnbtn']");


    public void enterPetName() {
        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(petName).sendKeys("Chiggy");
        Log.info("User Has Entered Name Of Pet");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(continueButton).click();
        Log.info("User Has Clicked On Continue Button To Move On Picture Upload Page");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void enterPicOfPet() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(250,350)");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement element = driver.findElement(By.xpath("//div[@class='row justify-content-end']/div/button"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        //driver.findElement(imageUploadButton).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void selectBreedOfPet() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(speciesDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        breedType = driver.findElement(optionOfSpeciesDropDown).getText();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfSpeciesDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(speciesContinueButton).click();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void enterSpeciesOfPet() {

        driver.findElement(selectSpeciesDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(selectSpeciesFromDD).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(continueSearchButton).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


    public void enterClientAndPetDetails() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(petGenderRadio).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (breedType.equalsIgnoreCase("Mammal")){
            driver.findElement(petDateOfBirthMammal).sendKeys("01/01/2021");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        else {
            driver.findElement(petDateOfBirth).sendKeys("01/01/2021");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        driver.findElement(petPrice).sendKeys("1100");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement devision = driver.findElement(By.cssSelector("h2[class='greytextcolor m-0 collapse-arrow collapsed']"));
        JavascriptExecutor executor1 = (JavascriptExecutor) driver;
        executor1.executeScript("arguments[0].click();", devision);
        // driver.findElement(clientDevision).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(clientFirstName).sendKeys("Test Nitesh");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(clientLastName).sendKeys("Test Barot");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(clientEmailId).sendKeys("nitesh@gmail.com");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(clientNumber).sendKeys("9090909090");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(clientDOB).sendKeys("19/09/1987");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)", "");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(addressPostCode).sendKeys("RM8 2TE");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement address = driver.findElement(By.xpath("//div[@id='cc_c2a']/ul/li[1]/div"));
        JavascriptExecutor executor2 = (JavascriptExecutor) driver;
        executor2.executeScript("arguments[0].click();", address);
        //driver.findElement(selectAddressFromDD).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement nomminne = driver.findElement(By.cssSelector("input[id='insuranceNo']"));
        JavascriptExecutor executor3 = (JavascriptExecutor) driver;
        executor3.executeScript("arguments[0].click();", nomminne);
        // driver.findElement(insuranceNommine).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,350)", "");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement devision1 = driver.findElement(By.cssSelector("h2[class='greytextcolor collapse-arrow collapsed']"));
        JavascriptExecutor executor4 = (JavascriptExecutor) driver;
        executor4.executeScript("arguments[0].click();", devision1);
        // driver.findElement(extraInfoDevision).click();
        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        JavascriptExecutor js4 = (JavascriptExecutor) driver;
        js4.executeScript("window.scrollBy(0,450)", "");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement keepInTouch = driver.findElement(By.cssSelector("input[id='keepIntouchno']"));
        JavascriptExecutor executor5 = (JavascriptExecutor) driver;
        executor5.executeScript("arguments[0].click();", keepInTouch);
        //driver.findElement(keepInTouchRadio).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement nextButton = driver.findElement(By.cssSelector("button[class='btn btn-primary rounded-5']"));
        JavascriptExecutor executor6 = (JavascriptExecutor) driver;
        executor6.executeScript("arguments[0].click();", nextButton);
        //driver.findElement(continueButtonToGoNext);

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(clientUserName).sendKeys("nitesh@prowerse.com");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(clientPassword).sendKeys("1234");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(submitButton).click();

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        JavascriptExecutor js5 = (JavascriptExecutor) driver;
        js5.executeScript("window.scrollBy(0,500)", "");

        if (breedType.equalsIgnoreCase("Bird") ||breedType.equalsIgnoreCase("Reptile")) {

            JavascriptExecutor js6 = (JavascriptExecutor) driver;
            js6.executeScript("window.scrollBy(0,500)", "");

            WebElement premierPlan = driver.findElement(By.cssSelector("button[name='premium']"));
            JavascriptExecutor executor7 = (JavascriptExecutor) driver;
            executor7.executeScript("arguments[0].click();", premierPlan);

            // driver.findElement(premiumPlan).click();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        } else if (breedType.equalsIgnoreCase("Bird of Prey")||breedType.equalsIgnoreCase("Tortoise & Turtle")) {
            JavascriptExecutor js7 = (JavascriptExecutor) driver;
            js7.executeScript("window.scrollBy(0,500)", "");

            WebElement premierPlan = driver.findElement(By.cssSelector("button[name='plus']"));
            JavascriptExecutor executor7 = (JavascriptExecutor) driver;
            executor7.executeScript("arguments[0].click();", premierPlan);

            // driver.findElement(premiumPlan).click();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } else if (breedType.equalsIgnoreCase("Mammal")) {
            JavascriptExecutor js8 = (JavascriptExecutor) driver;
            js8.executeScript("window.scrollBy(0,500)", "");

            WebElement premierPlan = driver.findElement(By.cssSelector("button[name='value']"));
            JavascriptExecutor executor7 = (JavascriptExecutor) driver;
            executor7.executeScript("arguments[0].click();", premierPlan);

            // driver.findElement(premiumPlan).click();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
//        WebElement premierPlan = driver.findElement(By.cssSelector("button[name='value']"));
//        JavascriptExecutor executor7 = (JavascriptExecutor) driver;
//        executor7.executeScript("arguments[0].click();", premierPlan);
//
//        // driver.findElement(premiumPlan).click();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        driver.findElement(buyButton).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(coverStartDate).sendKeys("01/01/2024");
        JavascriptExecutor js6 = (JavascriptExecutor) driver;
        js6.executeScript("window.scrollBy(0,700)", "");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(assumptionRadio).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(continueButtonPage).click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        JavascriptExecutor js7 = (JavascriptExecutor) driver;
        js7.executeScript("window.scrollBy(0,700)", "");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(tc1).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(tc2).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(tc3).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(continueNext).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(yearlyRadio).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(cardHolderName).sendKeys("Nitesh Barot");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(addressConfirmation).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(cardNumber).sendKeys("4929421234600821");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(cvvNumber).sendKeys("356");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(expireMonth).sendKeys("09");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(expireYear).sendKeys("2027");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement button = driver.findElement(By.xpath("//button[@id='cntnbtn']"));
        JavascriptExecutor executor8 = (JavascriptExecutor) driver;
        executor8.executeScript("arguments[0].click();", button);
        // driver.findElement(continueButtonNextPage).click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement policyNumber1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='planDetails pb-0']/ul/li[5]/span")));

        String policyNumber = policyNumber1.getText();

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement premiumValue = wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='planDetails pb-0']/ul/li[6]/span")));
        String premiumValue1 = premiumValue.getText();

        //logger.info("Client Pet and Premium Details ", firstName, lastName, birthdate, email1, address1, postcode, contact, breedName, petName1, petDOB1, petPrice1, startDate1, planValue, policyNumber, premiumValue1);
        //String PolicyNum=driver.findElement(By.xpath("//div[@class='planDetails pb-0']/ul/li[5]/span")).getText();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    //Generate policy for bird of pray species of exotic breed
    public void selectBirdOfPrayBreed() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(speciesDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        breedType = driver.findElement(optionOfSpeciesDropDownForBirdOfPray).getText();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfSpeciesDropDownForBirdOfPray).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(speciesContinueButton).click();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    ////Generate policy for Mammal  species of exotic breed

    public void selectMammalBreed() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(speciesDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        breedType = driver.findElement(optionOfSpeciesDropDownForMammal).getText();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfSpeciesDropDownForMammal).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(speciesContinueButton).click();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
//Generate policy for Reptile species of exotic breed
    public void selectReptileBreed() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(speciesDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        breedType = driver.findElement(optionOfSpeciesDropDownForReptile).getText();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfSpeciesDropDownForReptile).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(speciesContinueButton).click();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    //Generate policy for Tortoise and Turtle species of exotic breed

    public void selectTortoiseBreed() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(speciesDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        breedType = driver.findElement(optionOfSpeciesDropDownForTortoise).getText();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfSpeciesDropDownForTortoise).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(speciesContinueButton).click();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}

