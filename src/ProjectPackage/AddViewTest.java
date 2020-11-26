package ProjectPackage;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * JUnit test for AddView
 */
public class AddViewTest {
    Task task1 = new Task("Normal Task", "go shopping", "regular", 1.2, 1.3, "Current");
    Task task2 = new Task("Spending Plan", "cat food", "important", 2.2, 3.3, "Current");
    ArrayList<Task> tasks = new ArrayList<>();
    @Test
    public void addTest() {
        tasks.add(task1);
        tasks.add(task2);

        ToDoListView tv = new ToDoListView();
        tv.updateView(tasks);
        AddView ad = new AddView(tv.frame, tasks);
        Assert.assertEquals(tasks, ad.getCurrentList());
    }
}