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
    public ArrayList<Task> currentList = new ArrayList<>();
    /**
     * Counter for the space between each task's rectangle
     */
    private int counter = 120;

    public ToDoListView() {
        JFrame frame = new JFrame("To-Do List");

        //Sort, Rewards, and Add buttons
        JButton sortView = new JButton("Sort View");
        JButton rewards = new JButton("Rewards");
        JButton editTask = new JButton("Add");

        //Set Bounds
        sortView.setBounds(550, 20, 100, 50);
        rewards.setBounds(650, 20, 100, 50);
        editTask.setBounds(750, 20, 100, 50);

        //Tasks Title
        JLabel tasks = new JLabel("Tasks");
        tasks.setBounds(50, 50, 150, 50);
        tasks.setFont(new Font("Arial", Font.PLAIN, 28));

        //Add all header buttons
        frame.add(sortView);
        frame.add(rewards);
        frame.add(editTask);
        frame.add(tasks);

        //Test Task Buttons
        /*Task task1 = new Task("Task 1", "a", "a", 1, 2, true);
        JButton taskButton1 = new JButton(task1.toString());
        taskButton1.setBounds(50, 120, 700, 100);

        Task task2 = new Task("Task 2", "a", "a", 1, 2, true);
        JButton taskButton2 = new JButton(task2.toString());
        taskButton2.setBounds(50, 240, 700, 100);

        Task task3 = new Task("Task 3", "a", "a", 1, 2, true);
        JButton taskButton3 = new JButton(task3.toString());
        taskButton3.setBounds(50, 360, 700, 100);

        Task task4 = new Task("Task 4", "a", "a", 1, 2, true);
        JButton taskButton4 = new JButton(task4.toString());
        taskButton4.setBounds(50, 480, 700, 100);

        frame.add(taskButton1);
        frame.add(taskButton2);
        frame.add(taskButton3);
        frame.add(taskButton4);*/

        frame.setSize(900, 800);
        //frame.getContentPane().setBackground(Color.lightGray);
        frame.setLayout(null);
        frame.setVisible(true);

        rewards.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame rewards = new JFrame("Rewards");

                JButton history = new JButton("History");
                JButton back = new JButton("Back");
                JLabel reward = new JLabel("Reward");

                history.setBounds(550, 20, 100, 50);
                back.setBounds(650, 20, 100, 50);
                reward.setBounds(50, 50, 150, 50);
                reward.setFont(new Font("Arial", Font.PLAIN, 28));

                rewards.add(history);
                rewards.add(back);
                rewards.add(reward);

                rewards.setSize(900, 800);
                //rewards.getContentPane().setBackground(Color.pink);
                rewards.setLayout(null);
                rewards.setVisible(true);

                back.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        rewards.dispose();
                    }
                });
            }
        });

        editTask.addActionListener(new ActionListener() {
            JButton t = new JButton();

            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame editTask = new JFrame("Edit");

                //Header buttons Add/Update and Back
                JButton addUpdate = new JButton("Add/Update");

                JButton back = new JButton("Back");
                JLabel title = new JLabel("Task View");

                addUpdate.setBounds(550, 20, 100, 50);
                back.setBounds(650, 20, 100, 50);
                title.setBounds(50, 50, 150, 50);
                title.setFont(new Font("Arial", Font.PLAIN, 28));

                editTask.add(addUpdate);
                editTask.add(back);

                //"Body" of the Panel
                //side display buttons
                JButton name = new JButton("Name");
                JButton description = new JButton("Description");
                JButton priority = new JButton("Priority");
                JButton startDate = new JButton("Start Date");
                JButton endDate = new JButton("End Date");

                //set bounds of buttons
                name.setBounds(50, 150, 100, 50);
                description.setBounds(50, 220, 100, 50);
                priority.setBounds(50, 290, 100, 50);
                startDate.setBounds(50, 360, 100, 50);
                endDate.setBounds(50, 430, 100, 50);

                editTask.add(name);
                editTask.add(description);
                editTask.add(priority);
                editTask.add(startDate);
                editTask.add(endDate);

                //text fields
                JTextField nameField = new JTextField();
                JTextField descriptionField = new JTextField();
                JTextField priorityField = new JTextField();
                JTextField startDateField = new JTextField();
                JTextField endDateField = new JTextField();

                nameField.setBounds(200, 150, 500, 50);
                descriptionField.setBounds(200, 220, 500, 50);
                priorityField.setBounds(200, 290, 500, 50);
                startDateField.setBounds(200, 360, 500, 50);
                endDateField.setBounds(200, 430, 500, 50);

                editTask.add(nameField);
                editTask.add(descriptionField);
                editTask.add(priorityField);
                editTask.add(startDateField);
                editTask.add(endDateField);


                editTask.setSize(900, 800);
                //editTask.getContentPane().setBackground(Color.pink);
                editTask.setLayout(null);
                editTask.setVisible(true);


                //click on back, return to homepage
                back.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        editTask.dispose();
                    }
                });

                /**
                 * Adds the new tasks
                 * Everytime a new one is added, the counter int will increment
                 * so the task rectangles won't overlap
                 */
                addUpdate.addActionListener(event ->
                {
                    Double start;
                    Double end;
                    try {
                        start = Double.parseDouble(startDateField.getText());
                        end = Double.parseDouble(endDateField.getText());
                        Task temp = new Task(nameField.getText(), descriptionField.getText(),
                                priorityField.getText(), start, end, true);

                        t = new JButton(temp.toString());
                        t.setBounds(50, counter, 700, 100);
                        frame.add(t);

                        currentList.add(temp);
                        TaskManager tm = new TaskManager(currentList);
                        //testing TaskManager
                        tm.printArrayList();
                        counter += 120;
                        System.out.println("Created new task");
                    } catch (NumberFormatException numberFormatException) {
                        numberFormatException.printStackTrace();
                        JFrame errorMessage = new JFrame();
                        JLabel error = new JLabel("Please enter the date in the format mm.dd.", SwingConstants.CENTER);
                        errorMessage.add(error);
                        errorMessage.setSize(500, 200);
                        errorMessage.setVisible(true);
                    }
                });
            }
        });

        sortView.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame sortView = new JFrame();

                //Header, button Back, sort by priority, date, status, type
                JLabel sortingType = new JLabel("Sort View");
                JButton back = new JButton("Back");
                JButton byPriority = new JButton("By Priority");
                JButton byDate = new JButton("By Date");
                JButton byStatus = new JButton("By Status");
                JButton byType = new JButton("By Type");

                back.setBounds(650, 20, 100, 50);
                byPriority.setBounds(200, 150, 500, 50);
                byDate.setBounds(200, 220, 500, 50);
                byStatus.setBounds(200, 290, 500, 50);
                byType.setBounds(200, 360, 500, 50);
                sortingType.setBounds(50, 50, 150, 50);
                sortingType.setFont(new Font("Arial", Font.PLAIN, 28));

                sortView.add(sortingType);
                sortView.add(back);
                sortView.add(byPriority);
                sortView.add(byDate);
                sortView.add(byStatus);
                sortView.add(byType);

                sortView.setSize(900, 800);
                //sortView.getContentPane().setBackground(Color.pink);
                sortView.setLayout(null);
                sortView.setVisible(true);

                back.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) { sortView.dispose(); }
                });
            }
        });
    }
}
