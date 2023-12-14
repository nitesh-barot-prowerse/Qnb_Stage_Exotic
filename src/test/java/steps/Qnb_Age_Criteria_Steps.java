package steps;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.Qnb_Age_Criteria;
import pages.Qnb_Exotic_Bird;

public class Qnb_Age_Criteria_Steps {


    Qnb_Age_Criteria qnbBird = new Qnb_Age_Criteria(DriverFactory.getDriver());

    //User should not allowed to go further if age of any bird species under product is less than 12
    @When("User enters name of pet and upload image of same")
    public void user_enters_name_of_pet_and_upload_image_of_same() {
        qnbBird.enterPetName();
        qnbBird.enterPicOfPet();
    }

    @When("User selects product and species from respected  dropdown for bird product")
    public void user_selects_product_and_species_from_respected_dropdown_for_bird_product() {
        qnbBird.selectBreedOfPet();
        qnbBird.selectSpeciesOfProduct();
    }

    @When("User enters pet date of birth less than {int} week from current date for bird product")
    public void user_enters_pet_date_of_birth_less_than_week_from_current_date_for_bird_product(Integer int1) {
        String errorMessage = qnbBird.enterClientAndPetDetails();
        Assert.assertEquals(errorMessage, "We cannot offer cover for your pet less than 12 weeks of age or over the age of 10 years");
    }

    @Then("User will come across error message and not allowed to move further on the system")
    public void user_will_come_across_error_message_and_not_allowed_to_move_further_on_the_system() {
//        String url = qnbBird.currentUrl();
//        Assert.assertEquals(url, "https://qnb-exotic-bpis.dev.petcovergroup.com/add-details/5508/");
    }

    //User should not allowed to go further if age of any mammals species under product is less than 8

    @When("User selects product and species from respected  dropdown for mammals product")
    public void user_selects_product_and_species_from_respected_dropdown_for_mammals_product() {
        qnbBird.selectMammalsOptionASPet();
        qnbBird.selectSpeciesOfProduct();
    }

    @When("User enters pet date of birth less than {int} week from current date for mammals product")
    public void user_enters_pet_date_of_birth_less_than_week_from_current_date_for_mammals_product(Integer int1) {
        String errorMessage = qnbBird.enterClientAndPetDetails();
        Assert.assertEquals(errorMessage, "We cannot offer cover for your pet less than 8 weeks of age or over the age of 5 years");
    }

    ////User should not allowed to go further if age of any reptile species under product is less than 12

    @When("User selects product and species from respected  dropdown for reptile product")
    public void user_selects_product_and_species_from_respected_dropdown_for_reptile_product() {
        qnbBird.selectReptilesOptionASPet();
        qnbBird.selectSpeciesOfProduct();
    }

    @When("User enters pet date of birth less than {int} week from current date for reptile product")
    public void user_enters_pet_date_of_birth_less_than_week_from_current_date_for_reptile_product(Integer int1) {
        String errorMessage = qnbBird.enterClientAndPetDetails();
        Assert.assertEquals(errorMessage, "We cannot offer cover for your pet less than 8 weeks of age or over the age of 10 years");
    }

    //User should not allowed to go further if age of any tortoise species  is less than 12
    @When("User selects product and species from respected  dropdown for tortoise product")
    public void user_selects_product_and_species_from_respected_dropdown_for_tortoise_product() {
        qnbBird.selectTortoiseOptionASPet();
        qnbBird.selectSpeciesOfProduct();
    }

    @When("User enters pet date of birth less than {int} week from current date for tortoise product")
    public void user_enters_pet_date_of_birth_less_than_week_from_current_date_for_tortoise_product(Integer int1) {
        String errorMessage = qnbBird.enterClientAndPetDetails();
        Assert.assertEquals(errorMessage, "We cannot offer cover for your pet less than 12 weeks of age or over the age of 50 years.");
    }

    //User does not allowed to go on the sign up page from client and page details page if age of client is under 18


    @When("User selects product and species from respected product dropdown")
    public void user_selects_product_and_species_from_respected_product_dropdown() {
        qnbBird.selectBreedOfPet();
        qnbBird.selectSpeciesOfProduct();
    }

    @When("User enters client date of birth less than {int}  from current date")
    public void user_enters_client_date_of_birth_less_than_from_current_date(Integer int1) {
        String url = qnbBird.enterUnderAgeClientAndPetDetails();
        Assert.assertEquals(url, "Unfortunately we are unable to provide insurance cover until you are 18 years of age or older.");
    }

    @Then("User will come across error message and not allowed to move log in page on the system")
    public void user_will_come_across_error_message_and_not_allowed_to_move_log_in_page_on_the_system() {

    }

    //User does not allowed to go further if age of any bird species is more than 10

    @When("User enters pet date of birth more than {int} years from current date for bird product")
    public void user_enters_pet_date_of_birth_more_than_years_from_current_date_for_bird_product(Integer int1) {
        String url = qnbBird.enterClientAndPetDetailsForMaxAgeCriteria();
        Assert.assertEquals(url, "We cannot offer cover for your pet less than 12 weeks of age or over the age of 10 years");
    }

    //User does not allowed to go further if age of any Mammals species  is more than 5

    @When("User enters pet date of birth more than {int} years from current date for mammals product")
    public void user_enters_pet_date_of_birth_more_than_years_from_current_date_for_mammals_product(Integer int1) {
        String url = qnbBird.enterClientAndPetDetailsForMaxAgeCriteria();
        Assert.assertEquals(url, "We cannot offer cover for your pet less than 8 weeks of age or over the age of 5 years");
    }

    //User does not allowed to go further if age of any reptile species is more than 10

    @When("User enters pet date of birth more than {int} years from current date for reptile product")
    public void user_enters_pet_date_of_birth_more_than_years_from_current_date_for_reptile_product(Integer int1) {
        String url = qnbBird.enterClientAndPetDetailsForMaxAgeCriteria();
        Assert.assertEquals(url, "We cannot offer cover for your pet less than 8 weeks of age or over the age of 10 years");
    }

    //User does not allowed to go further if age of any tortoise species  is more than 50

    @When("User enters pet date of birth more than {int} years from current date for tortoise product")
    public void user_enters_pet_date_of_birth_more_than_years_from_current_date_for_tortoise_product(Integer int1) {
        String url = qnbBird.enterClientAndPetDetailsForMaxAgeCriteria();
        Assert.assertEquals(url, "We cannot offer cover for your pet less than 12 weeks of age or over the age of 50 years.");
    }
}
