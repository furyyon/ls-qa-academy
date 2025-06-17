package ru.ls.qa.school.addressbook.appmanager;

import org.openqa.selenium.By;
import ru.ls.qa.school.addressbook.model.GroupData;

public class GroupHelper {

  private final ContactHelper contactHelper = new ContactHelper();

  public void returnToGroupPage() {
    contactHelper.helperBase.click(By.linkText("group page"));
  }

  public void submitGroupCreation() {
    contactHelper.helperBase.click(By.name("submit"));
  }

  public void fillGroupForm(GroupData groupData) {
    contactHelper.helperBase.type(By.name("group_name"), groupData.getName());
    contactHelper.helperBase.type(By.name("group_header"), groupData.getHeader());
    contactHelper.helperBase.type(By.name("group_footer"), groupData.getName());
  }

  public void initGroupCreation() {
    contactHelper.helperBase.click(By.name("new"));
  }

  public void saveData() {
    contactHelper.helperBase.click(By.cssSelector("input:nth-child(87)"));
  }

  public void addResidentialAddress(String address) {
    contactHelper.helperBase.type(By.name("address"), address);
  }

  public void addWorkCompany(String company) {
    contactHelper.helperBase.type(By.name("company"), company);
  }

  public void addNickname(String nickname) {
    contactHelper.helperBase.type(By.name("nickname"), nickname);
  }

  public void createNewContact() {
    contactHelper.helperBase.click(By.linkText("add new"));
  }

  public HelperBase getHelperBase() {
    return contactHelper.helperBase;
  }

  public ContactHelper getContactHelper() {
    return contactHelper;
  }
}
