package ru.ls.qa.school.addressbook.appmanager;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class NavigetionHelper extends HelperBase {
  public void goToGroupPage() {
    click(By.linkText("groups"));
  }
}
