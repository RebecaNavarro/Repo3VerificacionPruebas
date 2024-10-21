package pages.todoist;

import controls.Button;
import controls.Label;
import org.openqa.selenium.By;

public class MenuSection {
    public Button buttonWithName = new Button(By.xpath("//*[@id=':r0:']"));
    public Button logoutButton = new Button(By.xpath("//*[@id=':r48:']"));
}

