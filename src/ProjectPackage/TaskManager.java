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
    public ArrayList<Task> prioritySort() {
        //I need TaskPriority to be finished to do this
        return list;
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

    //Added by Isla
    /**
     * Converts date decimal format into a String
     *
     * @param date in Double format
     * @return a String with the actual date name
     */
    public String dateConverter(double date){
        // parse Date, number before decimal is the month #
        // number after decimal is day #
        String[] split = Double.toString(date).split(".");
        int month = Integer.parseInt(split[0]);
        String day = split[1];

        String monthString;

        // Convert month numbers into actual date names
        switch (month) {
            case 1:  monthString = "January";
                break;
            case 2:  monthString = "February";
                break;
            case 3:  monthString = "March";
                break;
            case 4:  monthString = "April";
                break;
            case 5:  monthString = "May";
                break;
            case 6:  monthString = "June";
                break;
            case 7:  monthString = "July";
                break;
            case 8:  monthString = "August";
                break;
            case 9:  monthString = "September";
                break;
            case 10: monthString = "October";
                break;
            case 11: monthString = "November";
                break;
            case 12: monthString = "December";
                break;
            default: monthString = "Invalid month";
                break;
        }
        return month + " " + day;
    }

    /**
     * Task type will be declared in the "Name: ," text field, will sort by that
     */
/*    public ArrayList<Task> typeSort(){

    }*/

}
