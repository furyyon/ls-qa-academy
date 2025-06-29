package ru.ls.qa.school.addressbook.tests;

import org.junit.jupiter.api.Test;
import ru.ls.qa.school.addressbook.model.GroupData;

public class GroupModificationTests extends TestBase {

  private final GroupData group = new GroupData ("test1", "test2", "test3");

  @Test
  public void groupModificationTests(){
    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(group);
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returnToGroupPage();
  }
}
