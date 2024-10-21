package pages.todoly;

import controls.Button;
import controls.Label;
import controls.TextBox;
import org.openqa.selenium.By;

public class ProfileSection {

    public TextBox fullNameInput = new TextBox(By.xpath("//input[@id='FullNameInput']"));
    public Button okProfileButton = new Button(By.xpath("//button[span[text()='Ok']]"));

    public void changeFullName(String fullName){
        this.fullNameInput.clearSetText(fullName);
        this.okProfileButton.click();
    }

}
