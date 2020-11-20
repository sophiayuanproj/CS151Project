package ProjectPackage;

import javax.swing.*;
import java.util.*;

/**
 * Manages and sorts tasks
 */
public class TaskManager extends JFrame {
    public ArrayList<Task> list;

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
    public ArrayList<Task> prioritySort() {
        //I need TaskPriority to be finished to do this
        return list;
    }

    /**
     * ************Not done yet
     * Sorts tasks by date and creates a new list
     * @param s is either start or end
     * @return return the tasks by date, sorted
     */
    public ArrayList<Task> dateSort(String s) {
        ArrayList<Task> start = new ArrayList<Task>();
        ArrayList<Task> end = new ArrayList<Task>();

        if(s.equals("start")) {
            for (Task t : list)
            {
                if(t.getStart() == 3)
                {
                    start.add(t);
                }
            }
        }
        return start;
    }

    /**
     * Sorts by status
     * @param b status type
     * @return a new status list
     */
    public ArrayList<Task> statusSort( boolean b) {
        ArrayList<Task> trueList = new ArrayList<>();
        ArrayList<Task> falseList = new ArrayList<>();
        if (b == true) {
            for (Task t : list) {
                if(t.getStatus() == true) {
                    trueList.add(t);
                }
            }
            return trueList;
        }
        for(Task t : list) {
            if(t.getStatus() == false) {
                falseList.add(t);
            }
        }
        return falseList;
    }

}
