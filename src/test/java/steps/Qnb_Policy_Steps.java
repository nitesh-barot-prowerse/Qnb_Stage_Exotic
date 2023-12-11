package steps;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Qnb_Exotic_Bird;
import pages.Qnb_Exotic_Policy;

public class Qnb_Policy_Steps {
    Qnb_Exotic_Policy qnbPolicy = new Qnb_Exotic_Policy(DriverFactory.getDriver());

    @When("User enters pet name and click on continue button for bird product")
    public void user_enters_pet_name_and_click_on_continue_button_for_bird_product() {
        qnbPolicy.enterPetName();
    }

    @When("User upload picture of pet and clicks on upload button for bird product")
    public void user_upload_picture_of_pet_and_clicks_on_upload_button_for_bird_product() {
      qnbPolicy.enterPicOfPet();
    }

    @When("User selects breed of exotic product and clicks on continue button for bird product")
    public void user_selects_breed_of_exotic_product_and_clicks_on_continue_button_for_bird_product() {
        qnbPolicy.selectBreedOfPet();
    }

    @When("User selects species of bird for bird product")
    public void user_selects_species_of_bird_for_bird_product() {
        qnbPolicy.enterSpeciesOfPet();
    }
    @When("User enters details of pet, clients and fills all additional questionnaire")
    public void user_enters_details_of_pet_clients_and_fills_all_additional_questionnaire() {
    qnbPolicy.enterClientAndPetDetails();
    }

    @When("User selects payment options")
    public void user_selects_payment_options() {

    }

    @Then("Policy will generate in to the system")
    public void policy_will_generate_in_to_the_system() {

    }
}
