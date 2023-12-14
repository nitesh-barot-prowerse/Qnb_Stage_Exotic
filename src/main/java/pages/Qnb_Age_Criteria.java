package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Log;

import java.time.Duration;

public class Qnb_Age_Criteria {

    private WebDriver driver;

    //Logger logger = LogManager.getLogger(AtcStampDuty.class);

    Logger logger = LogManager.getLogger(Qnb_Exotic_Bird.class);

    public Qnb_Age_Criteria(WebDriver driver) {
        this.driver = driver;
    }

    String errorDOB="";

    String speciesType="";

    private By petName = By.cssSelector("input[name='petname']");

    private By continueButton = By.cssSelector("button[id='button-addon2']");

    private By imageUploadButton = By.xpath("//div[@class='row justify-content-end']/div/button");


    private By speciesDropDownForBird=By.xpath("//div[@class='dropdown dselect-wrapper form-control rounded-5 findus']/button");

    private By optionOfSpeciesDropDownForBird=By.xpath("//div[@class='dropdown dselect-wrapper form-control rounded-5 findus']/div/div/div/button[1]");

    private By speciesContinueButton = By.cssSelector("button[class='btn btn-primary rounded-5']");

    private By selectSpeciesDropDown = By.xpath("//div[@class='dropdown dselect-wrapper form-control rounded-5 findus']/button");
    private By selectSpeciesFromDD=By.xpath("//div[@class='dropdown dselect-wrapper form-control rounded-5 findus']/div/div/div/button[2]");

    private By continueSearchButton = By.cssSelector("button[class='btn btn-primary rounded-5']");

    //client and pet information page

    private By petGenderRadio=By.cssSelector("input[id='male']");

    private By petDateOfBirth=By.cssSelector("input[id='hatchedborn1']");

    private By petPrice=By.cssSelector("input[id='payforpet']");

    private By clientDevision=By.cssSelector("h2[class='greytextcolor m-0 collapse-arrow collapsed']");

    private By clientFirstName=By.cssSelector("input[id='firstname']");

    private By clientLastName= By.cssSelector("input[id='lastname']");

    private By clientEmailId=By.cssSelector("input[id='emailaddress']");

    private By clientNumber=By.cssSelector("input[id='Phonenumber']");

    private By clientDOB=By.cssSelector("input[id='DOB']");

    private By addressPostCode=By.cssSelector("input[id='Address1']");

    private By selectAddressFromDD=By.xpath("//div[@id='cc_c2a']/ul/li[1]/div");


    private By insuranceNommine=By.cssSelector("input[id='insuranceNo']");

    private By extraInfoDevision=By.cssSelector("h2[class='greytextcolor collapse-arrow collapsed']");

    private By keepInTouchRadio=By.cssSelector("input[id='keepIntouchno']");

    private By continueButtonToGoNext=By.cssSelector("button[class='btn btn-primary rounded-5']");

    //Mammals Age
    private By optionOfSpeciesDropDownForMammals=By.xpath("//div[@class='dropdown dselect-wrapper form-control rounded-5 findus']/div/div/div/button[3]");

    //Mammals Age
    private By optionOfSpeciesDropDownForReptile=By.xpath("//div[@class='dropdown dselect-wrapper form-control rounded-5 findus']/div/div/div/button[4]");
    private By mammalsAgeSaveButton=By.xpath("//div[@class='modal-footer']/button");
    //Tortoise Age
    private By optionOfSpeciesDropDownForTortoise=By.xpath("//div[@class='dropdown dselect-wrapper form-control rounded-5 findus']/div/div/div/button[5]");



    //Erro Message
    private By errorMessageDOB=By.xpath("//div[@id='collapseAboutPet']/div[3]/p");

    private By dateOfBirthMammals=By.id("tortoisage");

    private By clientDateErrorMessage=By.xpath("//div[@id='collapseOwnsPet']/div[6]/p");


    //User should not allowed to go further if age of any bird species under product is less than 12
    public void enterPetName() {
        Log.info("To Verify Under Age Of Pet Feature Starts Here" );
        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(petName).sendKeys("Chiggy");
        Log.info("User Has Entered Name Of Pet" );
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(continueButton).click();
        Log.info("User Has Clicked On Continue Button To Move On Picture Upload Page" );
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
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
        Log.info("User Has Clicked On Upload Picture Button To Move On Select Product Page" );
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
        driver.findElement(speciesDropDownForBird).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        speciesType=driver.findElement(optionOfSpeciesDropDownForBird).getText();
        Log.info("User Has Selected Breed Product =="+ speciesType );
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Species TYpe Is====" +speciesType);
        driver.findElement(optionOfSpeciesDropDownForBird).click();
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

    public void selectSpeciesOfProduct(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(selectSpeciesDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Log.info("User Has Selected Species =="+ driver.findElement(selectSpeciesFromDD).getText() );
       driver.findElement(selectSpeciesFromDD).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(continueSearchButton).click();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String enterClientAndPetDetails() {


        //enter Client And pet information page
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(petGenderRadio).click();
        Log.info("User Has Selected Pet Gender" );
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//        WebElement dateOFBirth = driver.findElement(By.cssSelector("input[id='hatchedborn1']"));
//        JavascriptExecutor executor9 = (JavascriptExecutor) driver;
//        executor9.executeScript("arguments[0].click();", dateOFBirth);
       if (speciesType.equalsIgnoreCase("Bird")) {
           driver.findElement(petDateOfBirth).sendKeys("12/12/2023");
           Log.info("User Has Entered Pet Date Of Birth" );
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }
       else if(speciesType.equalsIgnoreCase("Mammal")){
           driver.findElement(dateOfBirthMammals).sendKeys("12/12/2023");
           Log.info("User Has Entered Pet Date Of Birth" );
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }
       else if(speciesType.equalsIgnoreCase("Reptile")){
           driver.findElement(petDateOfBirth).sendKeys("12/12/2023");
           Log.info("User Has Entered Pet Date Of Birth" );
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }
       else if(speciesType.equalsIgnoreCase("Tortoise & Turtle")){
           driver.findElement(petDateOfBirth).sendKeys("12/12/2023");
           Log.info("User Has Entered Pet Date Of Birth" );
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }
        driver.findElement(petPrice).sendKeys("500");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement devision = driver.findElement(By.cssSelector("h2[class='greytextcolor m-0 collapse-arrow collapsed']"));
        JavascriptExecutor executor1 = (JavascriptExecutor) driver;
        executor1.executeScript("arguments[0].click();", devision);
        Log.info("User Has Clicked On Client Detail Section" );
        // driver.findElement(clientDevision).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(clientFirstName).sendKeys("Nitesh Test");
        Log.info("User Has Entered On Client First Name" );
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(clientLastName).sendKeys("Barot Test");
        Log.info("User Has Entered Client Last Name" );
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(clientEmailId).sendKeys("Nitesh.Barot@mail.com");
        Log.info("User Has Entered  Client Email Id" );
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(clientNumber).sendKeys("9090909090");
        Log.info("User Has Entered  Client Mobile Number" );
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(clientDOB).sendKeys("12/09/1988");
        Log.info("User Has Entered  Client Date Of Birth" );
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
        driver.findElement(addressPostCode).sendKeys("Rm8 2te");
        Log.info("User Has Entered Client Postcode" );
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
        Log.info("User Has Entered Submit Button" );

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        errorDOB=driver.findElement(errorMessageDOB).getText();
        Log.info("Error Message" +errorDOB );
        return errorDOB;

        //driver.findElement(continueButtonToGoNext);

    }
    public String currentUrl(){
        return driver.getCurrentUrl();
    }


    //User should not allowed to go further if age of any reptile species under product is less than 8

    public void selectMammalsOptionASPet() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(speciesDropDownForBird).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        speciesType=driver.findElement(optionOfSpeciesDropDownForMammals).getText();
        Log.info("User Has Selected Breed Product =="+ speciesType );
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Species TYpe Is====" +speciesType);
        //driver.findElement(optionOfSpeciesDropDownForBird).click();
        driver.findElement(optionOfSpeciesDropDownForMammals).click();
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

    //User should not allowed to go further if age of any reptile species under product is less than 12

    public void selectReptilesOptionASPet() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(speciesDropDownForBird).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        speciesType=driver.findElement(optionOfSpeciesDropDownForReptile).getText();
        Log.info("User Has Selected Breed Product =="+ speciesType );
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Species TYpe Is====" +speciesType);
        //driver.findElement(optionOfSpeciesDropDownForBird).click();
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

    //User does not allowed to go further if age of any tortoise species  is less than 12

    public void selectTortoiseOptionASPet() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(speciesDropDownForBird).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        speciesType=driver.findElement(optionOfSpeciesDropDownForTortoise).getText();
        Log.info("User Has Selected Breed Product =="+ speciesType );
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Species TYpe Is====" +speciesType);
        //driver.findElement(optionOfSpeciesDropDownForBird).click();
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

    //User does not allowed to go further if age of any bird species is more than 5

    public String enterUnderAgeClientAndPetDetails() {


        //enter Client And pet information page
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
//        WebElement dateOFBirth = driver.findElement(By.cssSelector("input[id='hatchedborn1']"));
//        JavascriptExecutor executor9 = (JavascriptExecutor) driver;
//        executor9.executeScript("arguments[0].click();", dateOFBirth);
        if (speciesType.equalsIgnoreCase("Bird")) {
            driver.findElement(petDateOfBirth).sendKeys("12/02/2022");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        else if(speciesType.equalsIgnoreCase("Mammal")){
            driver.findElement(dateOfBirthMammals).sendKeys("12/02/2022");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        else if(speciesType.equalsIgnoreCase("Reptile")){
            driver.findElement(petDateOfBirth).sendKeys("12/02/2022");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        else if(speciesType.equalsIgnoreCase("Tortoise & Turtle")){
            driver.findElement(petDateOfBirth).sendKeys("12/02/2022");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        driver.findElement(petPrice).sendKeys("500");
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
        driver.findElement(clientFirstName).sendKeys("Nitesh Test");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(clientLastName).sendKeys("Barot Test");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(clientEmailId).sendKeys("Nitesh.Barot@mail.com");
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
        driver.findElement(clientDOB).sendKeys("12/09/2022");
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
        driver.findElement(addressPostCode).sendKeys("Rm8 2te");
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

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement devision11 = driver.findElement(By.cssSelector("h2[class='greytextcolor m-0 collapse-arrow collapsed']"));
        JavascriptExecutor executor7 = (JavascriptExecutor) driver;
        executor7.executeScript("arguments[0].click();", devision11);
        // driver.findElement(clientDevision).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        String clientDOB=driver.findElement(clientDateErrorMessage).getText();
        return clientDOB;



    }

    //User does not allowed to go further if age of any bird species is more than 5

    public String enterClientAndPetDetailsForMaxAgeCriteria() {


        //enter Client And pet information page
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(petGenderRadio).click();
        Log.info("User Has Selected Pet Gender" );
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//        WebElement dateOFBirth = driver.findElement(By.cssSelector("input[id='hatchedborn1']"));
//        JavascriptExecutor executor9 = (JavascriptExecutor) driver;
//        executor9.executeScript("arguments[0].click();", dateOFBirth);
        if (speciesType.equalsIgnoreCase("Bird")) {
            driver.findElement(petDateOfBirth).sendKeys("12/12/2009");
            Log.info("User Has Entered Pet Date Of Birth" );
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        else if(speciesType.equalsIgnoreCase("Mammal")){
            driver.findElement(dateOfBirthMammals).sendKeys("12/12/2015");
            Log.info("User Has Entered Pet Date Of Birth" );
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        else if(speciesType.equalsIgnoreCase("Reptile")){
            driver.findElement(petDateOfBirth).sendKeys("12/12/2009");
            Log.info("User Has Entered Pet Date Of Birth" );
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        else if(speciesType.equalsIgnoreCase("Tortoise & Turtle")){
            driver.findElement(petDateOfBirth).sendKeys("12/12/1960");
            Log.info("User Has Entered Pet Date Of Birth" );
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        driver.findElement(petPrice).sendKeys("500");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement devision = driver.findElement(By.cssSelector("h2[class='greytextcolor m-0 collapse-arrow collapsed']"));
        JavascriptExecutor executor1 = (JavascriptExecutor) driver;
        executor1.executeScript("arguments[0].click();", devision);
        Log.info("User Has Clicked On Client Detail Section" );
        // driver.findElement(clientDevision).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(clientFirstName).sendKeys("Nitesh Test");
        Log.info("User Has Entered On Client First Name" );
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(clientLastName).sendKeys("Barot Test");
        Log.info("User Has Entered Client Last Name" );
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(clientEmailId).sendKeys("Nitesh.Barot@mail.com");
        Log.info("User Has Entered  Client Email Id" );
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(clientNumber).sendKeys("9090909090");
        Log.info("User Has Entered  Client Mobile Number" );
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(clientDOB).sendKeys("12/09/1988");
        Log.info("User Has Entered  Client Date Of Birth" );
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
        driver.findElement(addressPostCode).sendKeys("Rm8 2te");
        Log.info("User Has Entered Client Postcode" );
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
        Log.info("User Has Entered Submit Button" );

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        errorDOB=driver.findElement(errorMessageDOB).getText();
        Log.info("Error Message" +errorDOB );
        return errorDOB;

        //driver.findElement(continueButtonToGoNext);

    }




}
