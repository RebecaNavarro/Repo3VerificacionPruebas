package todoist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.todoist.ProjectLeftSection;

import java.util.Date;

public class CreateProjectTest extends BaseTestTodoist{

    ProjectLeftSection projectLeftSection = new ProjectLeftSection();
    @Test
    public void createProject(){
        mainPage.iniciarSesionButton.click();
        loginSection.login("rebecanavarros1@upb.edu","Hola1234");
        loginSection.loginButton.click();
        projectLeftSection.addProjectButton.click();
        projectLeftSection.projectButton.click();
        String nameProject = "Prueba";
        projectLeftSection.projectName.setText(nameProject);
        projectLeftSection.anadirButton.click();
//        Assertions.assertEquals(nameProject,projectLeftSection.getProjectLabel(nameProject).getText(),
//                "ERROR the project was not created");

    }

}
