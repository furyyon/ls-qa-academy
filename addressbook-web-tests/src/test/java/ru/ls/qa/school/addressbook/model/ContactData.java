package ru.ls.qa.school.addressbook.model;

public class ContactData {
  public final String firstname;
  public final String middlename;
  public final String lastname ;
  private final String nickname;
  private final String company;
  private final String address;


  public ContactData(String firstname, String middlename, String lastname, String nickname, String company, String address) {
    this.firstname = firstname;
    this.middlename = middlename;
    this.lastname = lastname;
    this.nickname = nickname;
    this.company = company;
    this.address = address;
  }

  public String getFirstName() {
    return firstname;
  }

  public String getMiddleName() {
    return middlename;
  }

  public String getLastname() {
    return lastname;}

  public String getNickname() {
    return nickname;}

  public String getCompany() {
    return company;
  }

  public String getAddress() {
    return address;
  }

}

