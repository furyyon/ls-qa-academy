package ru.ls.qa.school.addressbook.appmanager;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class NavigetionHelper {
  private final HelperBase helperBase = new HelperBase();

  public void goToGroupPage() {
    helperBase.click(By.linkText("groups"));
  }

  public HelperBase getHelperBase() {
    return helperBase;
  }
}
