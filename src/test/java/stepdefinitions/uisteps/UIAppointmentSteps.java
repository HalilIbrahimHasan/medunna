package stepdefinitions.uisteps;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AppointmentPage;
import pojos.Appointment;
import utilities.Driver;

import static utilities.DateUtils.getDate;
import static utilities.WriteToTxt.saveAppointData;

public class UIAppointmentSteps {

    AppointmentPage appointmentPage = new AppointmentPage();
    Faker faker = new Faker();
    Appointment appointment = new Appointment();

    @Given("user clicks on make an appointment")
    public void user_clicks_on_make_an_appointment() {

        Driver.waitAndClick(appointmentPage.MakeAnAppointmentButton);


    }
    @Given("user provides the appoinment name {string}")
    public void user_provides_the_appoinment_name(String firstname) {
        firstname = faker.name().firstName();
        appointment.setFirstname(firstname);

        Driver.waitAndSendText(appointmentPage.firstnameTextbox, firstname);

    }
    @Given("user provides the appointment lastname {string}")
    public void user_provides_the_appointment_lastname(String lastname) {
        lastname = faker.name().lastName();
        appointment.setLastname(lastname);
        Driver.waitAndSendText(appointmentPage.lastnameTextbox, lastname);

    }
    @Given("user provides ssn and email {string} and {string}")
    public void user_provides_ssn_and_email_and(String ssn, String email) {
        ssn = faker.idNumber().ssnValid();
        email = faker.internet().emailAddress();
        appointment.setSsn(ssn);
        appointment.setEmail(email);


        Driver.waitAndSendText(appointmentPage.ssnTextbox, ssn);
        Driver.waitAndSendText(appointmentPage.emailTextbox, email);





    }
    @When("user provides the phone number {string}")
    public void user_provides_the_phone_number(String phoneNumber) {
        phoneNumber = faker.phoneNumber().cellPhone();
        appointment.setPhoneNumber(phoneNumber);

        Driver.waitAndSendText(appointmentPage.phoneTextbox, phoneNumber);
    }
    @When("user provides the date {string}")
    public void user_provides_the_date(String date) {
        //05-04-2022
//        date = getDate();
        appointment.setDate(date);

        Driver.waitAndSendText(appointmentPage.dateTextbox, date+ Keys.ENTER);

    }
    @Then("user requests appointment and verifies the success message")
    public void user_requests_appointment_and_verifies_the_success_message() {

        Driver.waitAndClick(appointmentPage.requestButton);
        saveAppointData(appointment);

        Assert.assertTrue(Driver.waitForVisibility(appointmentPage.successMessageToastContainer, 5).isDisplayed());
    }

}
