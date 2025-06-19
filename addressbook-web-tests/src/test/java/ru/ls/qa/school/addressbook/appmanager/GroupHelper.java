package ru.ls.qa.school.addressbook.appmanager;

import org.openqa.selenium.By;
import ru.ls.qa.school.addressbook.model.GroupData;

import static ru.ls.qa.school.addressbook.appmanager.HelperBase.click;
import static ru.ls.qa.school.addressbook.appmanager.HelperBase.type;

public class GroupHelper {

  private final ContactHelper contactHelper = new ContactHelper();

  public void returnToGroupPage() {
    click(By.linkText("group page"));
  }

  public void submitGroupCreation() {
    click(By.name("submit"));
  }

  public void fillGroupForm(GroupData groupData) {
    type(By.name("group_name"), groupData.getName());
    type(By.name("group_header"), groupData.getHeader());
    type(By.name("group_footer"), groupData.getName());
  }

  public void initGroupCreation() {
    click(By.name("new"));
  }

  public void saveData() {
    click(By.cssSelector("input:nth-child(87)"));
  }

  public void createNewContact() {
    click(By.linkText("add new"));
  }

  public ContactHelper getContactHelper() {
    return contactHelper;
  }
}
