package ru.ls.qa.school.addressbook.appmanager;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SessionHelper {
  private final HelperBase helperBase = new HelperBase();

  public void login(String userName, String password) {
    helperBase.type(By.name("user"), userName);
    helperBase.type(By.name("pass"), password);
    helperBase.click(By.cssSelector("input:nth-child(7)"));
  }

  public void stop(ApplicationManager applicationManager) {
    applicationManager.sessionHelper.logoutSite();
  }

  public void logoutSite() {
    $(By.linkText("Logout"))
            .click();
  }

  public HelperBase getHelperBase() {
    return helperBase;
  }
}

