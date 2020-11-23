package ProjectPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class SortNewScreenView extends JFrame {

    private ArrayList<Task> sortingList;

    //private TaskManager t;

    private ToDoListView toDo = new ToDoListView();

    /**
     * Sorting the lists in a new view
     * @param list is a list to be sorted
     */
    public SortNewScreenView(ToDoListView list){

        sortingList = list.getCurrentList();

        JFrame sortView = new JFrame();
        //Header, button Back, sort by priority, date, status, type
        JLabel sortingType = new JLabel("Sort View");
        //JButton back = new JButton("Back");
        JButton byPriority = new JButton("By Priority");
        JButton byDate = new JButton("By Date");
        JButton byStatus = new JButton("By Status");
        JButton byType = new JButton("By Type");

        //back.setBounds(650, 20, 100, 50);
        byPriority.setBounds(200, 150, 500, 50);
        byDate.setBounds(200, 220, 500, 50);
        byStatus.setBounds(200, 290, 500, 50);


        byType.setBounds(200, 360, 500, 50);
        sortingType.setBounds(50, 50, 150, 50);
        sortingType.setFont(new Font("Arial", Font.PLAIN, 28));

        sortView.add(sortingType);
        //sortView.add(back);
        sortView.add(byPriority);
        sortView.add(byDate);
        sortView.add(byStatus);
        sortView.add(byType);

        sortView.setSize(800, 700);
        //sortView.getContentPane().setBackground(Color.pink);
        sortView.setLayout(null);
        sortView.setVisible(true);

        /**
         * Sorting by priority
         */
        byPriority.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //t = new TaskManager(sortingList);
                ArrayList<Task> currentList = new TaskManager(sortingList).prioritySort();
                toDo.updateView(currentList);
            }
        });

        /**
         * Sorting by date
         */
        byDate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //t = new TaskManager(sortingList);
                ArrayList<Task> currentList = new TaskManager(sortingList).dateSort("Current");
                toDo.updateView(currentList);
            }
        });

        /**
         * Sorting by status
         */
        byStatus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //testing
                //System.out.println("This is the current list:" + sortingList.get(0) );

                //t = new TaskManager(sortingList);
                ArrayList<Task> currentList = new TaskManager(sortingList).statusSort("Current");
                        //t.statusSort("Current");
                toDo.updateView(currentList);
            }
        });

        /**
         * Sorting by type
         */
/*        byType.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //t = new TaskManager(sortingList);
                ArrayList<Task> currentList = new TaskManager(sortingList).typeSort();
                toDo.updateView(currentList);
                toDo.drawToDoList();
            }
        });*/
    }

    }
