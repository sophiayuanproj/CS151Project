package ProjectPackage;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args)
    {

        //Testing
       /* Task t1 = new Task("Task 1", "a", "a", 1, 2, true);
        Task t2 = new Task("Task 2", "b", "b", 3, 4, true);*/

        ArrayList<Task> taskList = new ArrayList<>();

        ToDoListView toDoList = new ToDoListView();

        toDoList.drawToDoList();

        TaskManager t = new TaskManager(taskList);

        SortNewScreenView sortScreen = new SortNewScreenView(toDoList);

        //Observer pattern test
        ArrayList<Task> tasks = new ArrayList<>();
        Task task1 = new Task("Normal Task", "Buy food", "2", 10.2, 10.3, "Finished", "Deserved");
        Task task2 = new Task("Workout", "Outdoor walking", "1", 11.26, 11.26, "Current", "Not Deserved");
        Task task3 = new Task("Spending Plan", "Rent", "3", 11.25, 11.30, "Current", "Not Deserved");
        ArrayList<Task> empty = new ArrayList<>();
        Task task4 = new Task("null","null","0",1.1,1.1,"null", "Not Deserved");
        empty.add(task4);

        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);
        TaskManager tm = new TaskManager(empty);

        ToDoListView tdl = new ToDoListView();
        tm.attach(tdl);
        tdl.setSubject(tm);
        tm.notifyAllObservers(tasks);

    }
}
