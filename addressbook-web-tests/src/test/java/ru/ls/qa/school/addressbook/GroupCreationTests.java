package ru.ls.qa.school.addressbook;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GroupCreationTests {

  @BeforeEach
  public void setUp() {
    open("http://localhost:8080/addressbook/");
    Configuration.browserSize = "1920x1080";
    login("admin", "secret");
  }

  @AfterEach
  public void tearDown() {
    logoutSite();
  }

  @Test
  public void groupCreationTest() {
    goToGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("test1", "test2", "test3"));
    submitGroupCreation();
    returnToGroupPage();
  }

  private void returnToGroupPage() {
    $(By.linkText("group page")).click();
  }

  private void submitGroupCreation() {
    $(By.name("submit")).click();
  }

  private void fillGroupForm(GroupData groupData) {
    $(By.name("group_name")).click();
    $(By.name("group_name")).sendKeys(groupData.getName());
    $(By.name("group_header")).click();
    $(By.name("group_header")).sendKeys(groupData.getHeader());
    $(By.name("group_footer")).click();
    $(By.name("group_footer")).sendKeys(groupData.getName());
  }

  private void initGroupCreation() {
    $(By.name("new")).click();
  }

  private void goToGroupPage() {
    $(By.linkText("groups")).click();
  }

  private void login(String userName, String password) {
    $(By.name("user")).sendKeys(userName);
    $(By.name("pass")).click();
    $(By.name("pass")).sendKeys(password);
    $(By.cssSelector("input:nth-child(7)")).click();
  }

  private void logoutSite() {
    $(By.linkText("Logout"))
            .click();
  }

}
