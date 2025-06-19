package ru.ls.qa.school.addressbook.appmanager;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static ru.ls.qa.school.addressbook.appmanager.HelperBase.click;
import static ru.ls.qa.school.addressbook.appmanager.HelperBase.type;

public class SessionHelper {

  public void login(String userName, String password) {
    type(By.name("user"), userName);
    type(By.name("pass"), password);
    click(By.cssSelector("input:nth-child(7)"));
  }

  public void logoutSite() {
    $(By.linkText("Logout"))
            .click();
  }
}

