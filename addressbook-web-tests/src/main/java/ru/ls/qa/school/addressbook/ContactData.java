package ru.ls.qa.school.addressbook;

public class ContactData {
  public final String firstname;
  public final String middlename;
  public final String lastname ;

  public ContactData(String firstname, String middlename, String lastname) {
    this.firstname = firstname;
    this.middlename = middlename;
    this.lastname = lastname;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getMiddlename() {
    return middlename;
  }

  public String getLastname() {return lastname;}
}

