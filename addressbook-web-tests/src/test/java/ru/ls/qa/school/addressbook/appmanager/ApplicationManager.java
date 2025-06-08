package ru.ls.qa.school.addressbook.appmanager;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ApplicationManager {
  private final GroupHelper groupHelper = new GroupHelper();
  private final NavigetionHelper navigetionHelper = new NavigetionHelper();
  private final SessionHelper sessionHelper = new SessionHelper();

  public void init() {
    open("http://localhost:8080/addressbook/");
    Configuration.browserSize = "1920x1080";
    sessionHelper.login("admin", "secret");
  }

  public void stop() {
    logoutSite();
  }

  public void logoutSite() {
    $(By.linkText("Logout"))
            .click();
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public NavigetionHelper getNavigetionHelper() {
    return navigetionHelper;
  }
}
