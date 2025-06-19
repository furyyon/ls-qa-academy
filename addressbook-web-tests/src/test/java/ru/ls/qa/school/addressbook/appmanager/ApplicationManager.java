package ru.ls.qa.school.addressbook.appmanager;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.open;

public class ApplicationManager {

  private final GroupHelper groupHelper = new GroupHelper();
  private final NavigationHelper navigationHelper = new NavigationHelper();
  private final SessionHelper sessionHelper = new SessionHelper();

  private final String baseURL = "http://localhost:8080/addressbook/";
  private final String browserSize = "1920x1080";

  public void init() {
    open(baseURL);
    Configuration.browserSize = browserSize;
    sessionHelper.login("admin", "secret");
  }

  public void stop() {
    sessionHelper.logoutSite();
  }

  public SessionHelper getSessionHelper(){return sessionHelper;}

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }
}
