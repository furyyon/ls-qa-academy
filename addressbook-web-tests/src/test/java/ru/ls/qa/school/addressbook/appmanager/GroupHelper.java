package ru.ls.qa.school.addressbook.appmanager;

import org.openqa.selenium.By;
import ru.ls.qa.school.addressbook.model.ContactData;
import ru.ls.qa.school.addressbook.model.GroupData;

public class GroupHelper extends HelperBase {
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

  public void addResidentialAddress(String address) {
    type(By.name("address"), address);
  }

  public void addWorkCompany(String company) {
    type(By.name("company"), company);
  }

  public void addNickname(String nickname) {
    type(By.name("nickname"), nickname);
  }

  public void addPersonalData(ContactData contactData) {
    type(By.name("firstname"), contactData.getMiddlename());
    type(By.name("middlename"), contactData.getMiddlename());
    type(By.name("lastname"), contactData.getMiddlename());
  }

  public void createNewContact() {
    click(By.linkText("add new"));
  }
}
