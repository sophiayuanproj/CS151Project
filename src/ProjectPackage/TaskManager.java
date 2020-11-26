package ProjectPackage;

import javax.swing.*;
import java.util.*;

/**
 * Manages and sorts tasks
 */
public class TaskManager extends JFrame {
    private ArrayList<Task> list;
    private ToDoListView t;

    public TaskManager(ArrayList<Task> list) {
        this.list = list;

    }

    /**
     * Printing the sequence of the list
     */
    public void printArrayList() {
        System.out.println("TEST: TASK MANAGER: PRINT ARRAY LIST WORKS");
        for (Task t : list) {
            System.out.println(t);
        }
    }

    /**
     * Sorting task by importance
     *
     * @return a new task list
     */
    public ArrayList<Task> prioritySort(String s) {
        ArrayList<Task> finalList = new ArrayList<Task>();

        return finalList;

    }

    /**
     * Sorts tasks by date and creates a new list
     * Used code from https://www.geeksforgeeks.org/selection-sort/
     *
     * @param s is start
     * @return return the tasks by date, sorted
     */
    public ArrayList<Task> dateSort(String s) {
        ArrayList<Task> start = new ArrayList<Task>();

        if (s.equals("Current")) {
            int n = list.size();
            for (int i = 0; i < n - 1; i++) {
                int min = i;
                for (int j = i + 1; j < n; j++)
                    if (list.get(j).getStart() < list.get(min).getStart())
                        min = j;

                Task temp = list.get(min);
                Task increment = list.get(i);
                list.set(min, increment);
                list.set(i, temp);
            }
            for (Task t : list) {
                System.out.println("Sorting by date: " + t);

            }
            start = list;

        }
        return start;
    }

    /**
     * Sorts by status
     *
     * @param s status type
     * @return a new status list
     */
    public ArrayList<Task> statusSort(String s) {
        ArrayList<Task> currentList = new ArrayList<>();
        ArrayList<Task> finishedList = new ArrayList<>();

        ArrayList<Task> finalList = new ArrayList<>();
            for (Task t : list) {
                if (t.getStatus().equals("Current")) {
                    currentList.add(t);

                    //testing
                    //System.out.println("This is being added" + t);
                }
            }
        for (Task t : list) {
            if (t.getStatus().equals("Finished")) {
                finishedList.add(t);
            }
        }
        finalList.addAll(currentList);
        finalList.addAll(finishedList);
        //System.out.println("Final List: " + finalList);
        return finalList;
    }

    /**
     * Task type will be declared in the "Name: ," text field, will sort by that
     * Sorts by first normal task, spending plan, then workout
     */
    public ArrayList<Task> typeSort(String s){
        ArrayList<Task> finalList = new ArrayList<Task>();
        if(s.equals("Normal Task"))
        {
            for(Task t : list)
            {
                if(t.getName().equals("Normal Task"))
                {
                    finalList.add(t);
                }
            }
            for(Task t : list)
            {
                if(t.getName().equals("Spending Plan"))
                {
                    finalList.add(t);
                }
            }

            for(Task t : list)
            {
                if(t.getName().equals("Workout"))
                {
                    finalList.add(t);
                }
            }
        }
        return finalList;
    }

}
