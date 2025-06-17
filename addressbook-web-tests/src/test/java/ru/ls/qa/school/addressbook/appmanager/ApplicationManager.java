package ru.ls.qa.school.addressbook.appmanager;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ApplicationManager {
  private final GroupHelper groupHelper = new GroupHelper();
  private final NavigetionHelper navigetionHelper = new NavigetionHelper();
  public final SessionHelper sessionHelper = new SessionHelper();
  private final String baseURL = "http://localhost:8080/addressbook/";
  private final String browserSize = "1920x1080";

  public void init() {
    open(baseURL);
    Configuration.browserSize =browserSize;
    sessionHelper.login("admin", "secret");
  }

  public SessionHelper getSessionHelper(){return sessionHelper;}

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public NavigetionHelper getNavigetionHelper() {
    return navigetionHelper;
  }
}
