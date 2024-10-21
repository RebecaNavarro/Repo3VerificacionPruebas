package pages.todoist;

import controls.Button;
import controls.Label;
import controls.TextBox;
import org.openqa.selenium.By;

public class ProjectLeftSection {

    public Button addProjectButton = new Button(By.id(":r1:"));
    public Button projectButton = new Button(By.id(":r48e:"));
    public TextBox projectName = new TextBox(By.xpath("//*[@id='element-0']"));

    public Button anadirButton = new Button(By.xpath("//*[@id=':r5b:']/form/div[2]/footer/div/div/button[2]"));


}
