package ru.ls.qa.school.addressbook;// Generated by Selenium IDE
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class NewContactCreationTest {

  @BeforeEach
  public void setUp() {
    open("http://localhost:8080/addressbook/group.php");
    Configuration.browserSize = "1920x1080";
    login("admin", "secret");
  }

  @AfterEach
  public void tearDown() {}

  @Test
  public void newContactCreation() {
    createNewContact();
    addPersonalData(new ContactData("Ivan", "Ivanov", "Ivanovich"));
    addNickname("Iva");
    addWorkCompany("LigaStavok");
    addResidentialAddress("dom pushkina ");
    saveData();
  }

  private void saveData() {
    $(By.cssSelector("input:nth-child(87)")).click();
  }

  private void addResidentialAddress(String address) {
    $(By.name("address")).click();
    $(By.name("address")).sendKeys(address);
  }

  private void addWorkCompany(String company) {
    $(By.name("company")).click();
    $(By.name("company")).sendKeys(company);
  }

  private void addNickname(String nickname) {
    $(By.name("nickname")).click();
    $(By.name("nickname")).sendKeys(nickname);
  }

  private void addPersonalData(ContactData contactData) {
    $(By.name("firstname")).click();
    $(By.name("firstname")).sendKeys(contactData.getMiddlename());
    $(By.name("middlename")).click();
    $(By.name("middlename")).sendKeys(contactData.getMiddlename());
    $(By.name("lastname")).click();
    $(By.name("lastname")).sendKeys(contactData.getMiddlename());
  }

  private void createNewContact() {
    $(By.linkText("add new")).click();
  }
  private void login(String userName, String password) {
    $(By.name("user")).sendKeys(userName);
    $(By.name("pass")).click();
    $(By.name("pass")).sendKeys(password);
    $(By.cssSelector("input:nth-child(7)")).click();
  }
}
