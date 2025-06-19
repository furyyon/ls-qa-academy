package ru.ls.qa.school.addressbook.tests;

import org.junit.jupiter.api.Test;
import ru.ls.qa.school.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

  private final GroupData group = new GroupData ("test1", "test2", "test3");

  @Test
  public void groupCreationTest() {
    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(group);
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
  }
}
