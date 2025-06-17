package ru.ls.qa.school.addressbook.appmanager;

import org.openqa.selenium.By;
import ru.ls.qa.school.addressbook.model.ContactData;

public class ContactHelper {
  protected final HelperBase helperBase = new HelperBase();

  public void addPersonalData(ContactData contactData) {
    helperBase.type(By.name("firstname"), contactData.getMiddlename());
    helperBase.type(By.name("middlename"), contactData.getMiddlename());
    helperBase.type(By.name("lastname"), contactData.getMiddlename());
  }
}
