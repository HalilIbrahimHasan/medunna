package stepdefinitions.uisteps;

import com.github.javafaker.Faker;
import pojos.Registrant;

public class Dummy {

    public static void main(String[] args) {
        Registrant registrant = new Registrant();

        Registrant registrant1 = new Registrant();

        Registrant registrant2 = new Registrant();


        Registrant [] registrants = {registrant, registrant1, registrant2};

        System.out.println(registrants.length);

    }
}
