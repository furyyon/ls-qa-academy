package ru.ls.qa.school.addressbook.appmanager;

import org.openqa.selenium.By;

import static ru.ls.qa.school.addressbook.appmanager.HelperBase.click;

public class NavigationHelper {

  public void goToGroupPage() {
    click(By.linkText("groups"));
  }
}
