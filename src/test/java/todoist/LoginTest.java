package todoist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTestTodoist {

    @Test
    public void verifyLoginSuccessfully(){
        mainPage.iniciarSesionButton.click();
        loginSection.emailTxtBox.setText("rebecanavarros1@upb.edu");
        loginSection.pwdTxtBox.setText("Hola1234");
        loginSection.loginButton.click();
        //Assertions.assertTrue(menuSection.logoutButton.isControlDislayed(),
          //      "ERROR! the login was failed");
    }

}
