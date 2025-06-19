package ru.ls.qa.school.addressbook.appmanager;

import org.openqa.selenium.By;
import ru.ls.qa.school.addressbook.model.ContactData;

import static ru.ls.qa.school.addressbook.appmanager.HelperBase.type;

public class ContactHelper {

  public void addPersonalData(ContactData contactData) {
    type(By.name("firstname"), contactData.getMiddleName());
    type(By.name("middlename"), contactData.getMiddleName());
    type(By.name("lastname"), contactData.getMiddleName());
    type(By.name("nickname"), contactData.getFirstName());
    type(By.name("address"), contactData.getFirstName());
    type(By.name("company"), contactData.getFirstName());
  }
}
