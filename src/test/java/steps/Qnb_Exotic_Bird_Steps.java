package steps;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Qnb_Exotic_Bird;

public class Qnb_Exotic_Bird_Steps {

    Qnb_Exotic_Bird qnbBird = new Qnb_Exotic_Bird(DriverFactory.getDriver());

    @When("User enters pet name and click on continue button")
    public void user_enters_pet_name_and_click_on_continue_button() {
        qnbBird.enterPetName();
    }

    @When("User upload picture of pet and clicks on upload button")
    public void user_upload_picture_of_pet_and_clicks_on_upload_button() {
        qnbBird.enterPicOfPet();
    }

    @When("User selects breed of exotic product and clicks on continue button")
    public void user_selects_breed_of_exotic_product_and_clicks_on_continue_button() {
        qnbBird.selectBreedOfPet();
    }
    @When("User enters details of pet clients and fills all details")
    public void user_enters_details_of_pet_clients_and_fills_all_details() {
     qnbBird.enterSpeciesOfPet();
    }

    @Then("Policy will generate in to th system")
    public void policy_will_generate_in_to_th_system() {

    }

    @When("User selects species of bird")
    public void user_selects_species_of_bird() {
       //qnbBird.selectSpeciesOfPet();
    }

}
