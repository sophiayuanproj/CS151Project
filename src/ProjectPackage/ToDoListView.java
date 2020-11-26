package ProjectPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

//manages and stores taskManager objects
//Isla, Sophia, Danlei (Daniela)
public class ToDoListView extends JFrame {

    //List to be used in TaskManager
    private ArrayList<Task> currentList = new ArrayList<>();
    /**
     * Counter for the space between each task's rectangle
     */
    public JFrame frame;

    public ToDoListView() {

    }

    /**
     * To get the current list to be sorted
     *
     * @return
     */
    public ArrayList<Task> getCurrentList() {
        return this.currentList;
    }

    public void drawToDoList() {
        frame = new JFrame("To-Do List");

        //Sort, Rewards, and Add buttons
        //JButton sortView = new JButton("Sort View");
        JButton rewards = new JButton("Rewards");
        JButton editTask = new JButton("Add");

        //Set Bounds
        //sortView.setBounds(550, 20, 100, 50);
        rewards.setBounds(650, 20, 100, 50);
        editTask.setBounds(750, 20, 100, 50);

        //Tasks Title
        JLabel tasks = new JLabel("Tasks");
        tasks.setBounds(50, 50, 150, 50);
        tasks.setFont(new Font("Arial", Font.PLAIN, 28));

        //Add all header buttons
        //frame.add(sortView);
        frame.add(rewards);
        frame.add(editTask);
        frame.add(tasks);

        frame.setSize(900, 800);
        //frame.getContentPane().setBackground(Color.lightGray);
        frame.setLayout(null);
        frame.setVisible(true);

        rewards.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RewardsView rv = new RewardsView(currentList);
            }
        });

        editTask.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddView ad = new AddView(frame, currentList);
            }
        });

/*        sortView.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                SortNewScreenView();
        });*/
    }

    /**
     * Updating the view for sorting
     *
     * @param t is the ArrayList to be passed in
     */
    public void updateView(ArrayList<Task> t) {

        //testing
        for (Task list : t) {
            System.out.println("This is ArrayList t: " + list);
        }
        if (t.isEmpty()) {
            System.out.println("list is empty");
        }

        System.out.println("updateView is being called");
        ToDoListView updatedFrame = new ToDoListView();

        updatedFrame.drawToDoList();

        int counter = 120;
        for (Task task : t) {
            JButton button = new JButton(task.toString());
            button.setBounds(50, counter, 700, 100);
            //System.out.println("THIS IS THE TASK TO UPDATE: " + task.toString());
            updatedFrame.frame.add(button);

            counter += 120;
        }
    }

}
