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


    }
}
