package ru.ls.qa.school.addressbook.tests;
import org.junit.jupiter.api.Test;



public class GroupDeletionTests extends TestBase {

  @Test
  public void groupDeletionTests() {
    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroups();
    app.getGroupHelper().returnToGroupPage();
  }
}
