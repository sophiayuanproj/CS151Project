package ProjectPackage;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * JUnit for TaskManger class
 */
public class TaskManagerTest {
    ArrayList<Task> tasks = new ArrayList<>();
    Task task1 = new Task("Normal Task", "Buy food", "2", 10.2, 10.3, "Finished");
    Task task2 = new Task("Workout", "Outdoor walking", "1", 11.26, 11.26, "Current");
    Task task3 = new Task("Spending Plan", "Rent", "3", 11.25, 11.30, "Current");

    /**
     * Sort tasks by priority
     * @result tasks in TaskManager will be sort by priority without any error
     */
    @Test
    public void prioritySortTest() {
        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);
        TaskManager tm = new TaskManager(tasks);
        ArrayList<Task> prioritySortTest = new ArrayList<>();
        prioritySortTest.add(task3);
        prioritySortTest.add(task1);
        prioritySortTest.add(task2);
        Assert.assertEquals(tm.prioritySort("3"), prioritySortTest);
    }

    /**
     * Sort tasks by date
     * @result tasks in TaskManager will be sort by date without any error
     */
    @Test
    public void dateSortTest() {
        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);
        TaskManager tm = new TaskManager(tasks);
        ArrayList<Task> dateSortTest = new ArrayList<>();
        dateSortTest.add(task1);
        dateSortTest.add(task3);
        dateSortTest.add(task2);
        Assert.assertEquals(tm.dateSort("Current"), dateSortTest);
    }

    /**
     * Sort tasks by status
     * @result tasks in TaskManager will be sort by status without any error
     */
    @Test
    public void statusSortTest() {
        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);
        TaskManager tm = new TaskManager(tasks);
        ArrayList<Task> statusSortTest = new ArrayList<>();
        statusSortTest.add(task2);
        statusSortTest.add(task3);
        statusSortTest.add(task1);
        Assert.assertEquals(tm.statusSort("Current"), statusSortTest);
    }

    /**
     * Sort tasks by type
     * @result tasks in TaskManager will be sort by type without any error
     */
    @Test
    public void typeSortTest() {
        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);
        TaskManager tm = new TaskManager(tasks);
        ArrayList<Task> typeSortTest = new ArrayList<>();
        typeSortTest.add(task1);
        typeSortTest.add(task3);
        typeSortTest.add(task2);
        Assert.assertEquals(tm.typeSort("Normal Task"), typeSortTest);
    }
}