package ru.ls.qa.school.addressbook.appmanager;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SessionHelper extends HelperBase {
  public void login(String userName, String password) {
    type(By.name("user"), userName);
    type(By.name("pass"), password);
    click(By.cssSelector("input:nth-child(7)"));
  }
}
