package ProjectPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Manages and stores taskManager objects
 * Isla, Sophia, Danlei (Daniela)
 */
public class ToDoListView extends JFrame implements Observer {

    private Subject subject;
    //List to be used in TaskManager
    private ArrayList<Task> currentList = new ArrayList<>();
    public JFrame frame;

    /**
     * Empty constructor for class
     */
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

        JScrollBar sc = new JScrollBar(JScrollBar.VERTICAL);
        sc.setBounds(860, 0, 25, 760);

        frame.add(sc);

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
                try {
                    RewardsView rv = new RewardsView(currentList);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });

        editTask.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddView ad = new AddView(null, frame, currentList);
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
            button.setBounds(50, counter, 800, 100);
            //System.out.println("THIS IS THE TASK TO UPDATE: " + task.toString());
            updatedFrame.frame.add(button);

            counter += 120;
        }
    }

    /**
     * Updating view
     *
     * @param tasks is the list of tasks needs to be updated
     */
    @Override
    public void update(ArrayList<Task> tasks) {
        System.out.println("Observer Pattern Test: ");
        for (Task t : tasks) {
            System.out.println(t.toString());
        }
        System.out.println("Test Over");
    }

    /**
     * Setting the subject
     */
    @Override
    public void setSubject(Subject sub) {
        this.subject = sub;
    }
}
