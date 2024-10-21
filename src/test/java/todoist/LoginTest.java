package todoist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTestTodoist {

    @Test
    public void verifyLoginSuccessfully(){
        mainPage.iniciarSesionButton.click();
        loginSection.login("rebecanavarros1@upb.edu","Hola1234");
        loginSection.loginButton.click();
        menuSection.buttonWithName.click();
        Assertions.assertTrue(menuSection.buttonWithName.isControlDislayed(),
                "ERROR! the login was failed");
    }

}
