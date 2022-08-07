package utility;

import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;

import java.util.Locale;

public class FakeUserGenerator {

    FakeValuesService fakeValuesService;

    public FakeUserGenerator(){
         this.fakeValuesService = new FakeValuesService(
                new Locale("en-GB"), new RandomService());
    }

    public String fakeEmail(){
        String email;
        email = fakeValuesService.bothify("????##@test.com");
        return email;
    }

    public String fakeFullName(){
        String firstName;
        String lastName;
        firstName = fakeValuesService.bothify("????##");
        lastName = fakeValuesService.bothify("????##");
        return firstName + " " + lastName;
    }

    public String fakePhone(){
        String phone;
        phone = fakeValuesService.bothify("+###########");
        return phone;
    }
}
