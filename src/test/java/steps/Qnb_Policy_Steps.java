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

    // Generate policy for bird of pray species of exotic breed

    @When("User selects bird of pray breed of exotic product and clicks on continue button for bird product")
    public void user_selects_bird_of_pray_breed_of_exotic_product_and_clicks_on_continue_button_for_bird_product() {
       qnbPolicy.selectBirdOfPrayBreed();
    }

    //Generate policy for Mammal  species of exotic breed
    @When("User selects Mammal breed of exotic product and clicks on continue button for bird product")
    public void user_selects_mammal_breed_of_exotic_product_and_clicks_on_continue_button_for_bird_product() {
       qnbPolicy. selectMammalBreed();
    }


    //Generate policy for Reptile species of exotic breed
    @When("User selects Reptile breed of exotic product and clicks on continue button for Reptile product")
    public void user_selects_reptile_breed_of_exotic_product_and_clicks_on_continue_button_for_reptile_product() {
       qnbPolicy.selectReptileBreed();
    }

   //Generate policy for Tortoise and Turtle species of exotic breed
    @When("User selects Tortoise and Turtle breed of exotic product and clicks on continue button for Tortoise and Turtle product")
    public void user_selects_tortoise_and_turtle_breed_of_exotic_product_and_clicks_on_continue_button_for_tortoise_and_turtle_product() {
       qnbPolicy.selectTortoiseBreed();
    }
}
