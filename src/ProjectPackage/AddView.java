package ProjectPackage;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.BlockingQueue;

/**
 * View for add frame
 */
public class AddView {

    private BlockingQueue<Message> queue;
    private JButton t;
    private int counter = 120;
    private ArrayList<Task> currentList;
    private static final String IMG_PATH = "src/ProjectPackage/image.png";

    /**
     * Used to initialize queue
     *
     * @param queue is the blockingqueue
     * @return new addview
     */
    public static AddView init(BlockingQueue<Message> queue) {
        return new AddView(queue, null, null);
    }

    /**
     * Add or edit tasks to ToDoListView
     *
     * @param queue       is the blocking queue
     * @param frame       is the TodoListView JFrame
     * @param currentList is a list contains all the tasks
     */
    public AddView(BlockingQueue<Message> queue, Frame frame, ArrayList<Task> currentList) {
        this.queue = queue;
        this.currentList = currentList;
        JFrame editTask = new JFrame("Edit");

        //Header buttons Add/Update and Back
        JButton add = new JButton("Add");

        JButton back = new JButton("Back");
        JLabel title = new JLabel("Task View");

        add.setBounds(550, 20, 100, 50);
        back.setBounds(650, 20, 100, 50);
        title.setBounds(50, 50, 150, 50);
        title.setFont(new Font("Arial", Font.PLAIN, 28));

        editTask.add(add);
        editTask.add(back);

        //"Body" of the Panel
        //side display buttons
        JButton name = new JButton("Name");
        JButton description = new JButton("Description");
        JButton priority = new JButton("Priority");
        JButton startDate = new JButton("Start Date");
        JButton endDate = new JButton("End Date");

        //Can only be "Current" or "Finished"
        JButton status = new JButton("Status");

        JButton reward = new JButton("Reward");

        //set bounds of buttons
        name.setBounds(50, 150, 100, 50);
        description.setBounds(50, 220, 100, 50);
        priority.setBounds(50, 290, 100, 50);
        startDate.setBounds(50, 360, 100, 50);
        endDate.setBounds(50, 430, 100, 50);
        status.setBounds(50, 500, 100, 50);
        reward.setBounds(50, 570, 100, 50);

        editTask.add(name);
        editTask.add(description);
        editTask.add(priority);
        editTask.add(startDate);
        editTask.add(endDate);
        editTask.add(status);
        editTask.add(reward);

        //Instruction Labels
        JLabel priorityLabel = new JLabel("(Please enter a number between 1-3)");
        JLabel startLabel = new JLabel("(Please use the mm.dd format)");
        JLabel endLabel = new JLabel("(Please use the mm.dd format)");
        priorityLabel.setFont(new Font("Arial", Font.PLAIN, 9));
        startLabel.setFont(new Font("Arial", Font.PLAIN, 9));
        endLabel.setFont(new Font("Arial", Font.PLAIN, 9));
        priorityLabel.setBounds(720, 290, 200, 50);
        startLabel.setBounds(720, 360, 200, 50);
        endLabel.setBounds(720, 430, 200, 50);

        editTask.add(priorityLabel);
        editTask.add(startLabel);
        editTask.add(endLabel);

        //text fields
        JCheckBox c1 = new JCheckBox("Normal Task");
        JCheckBox c2 = new JCheckBox("Spending Plan");
        JCheckBox c3 = new JCheckBox("Workout");
        JTextField descriptionField = new JTextField();
        JTextField priorityField = new JTextField();
        JTextField startDateField = new JTextField();
        JTextField endDateField = new JTextField();
        JCheckBox c4 = new JCheckBox("Current");
        JCheckBox c5 = new JCheckBox("Finished");
        JCheckBox c6 = new JCheckBox("Deserved");
        JCheckBox c7 = new JCheckBox("Not Deserved");

        c1.setBounds(200, 150, 150, 50);
        c2.setBounds(400, 150, 150, 50);
        c3.setBounds(600, 150, 150, 50);
        descriptionField.setBounds(200, 220, 500, 50);
        priorityField.setBounds(200, 290, 500, 50);
        startDateField.setBounds(200, 360, 500, 50);
        endDateField.setBounds(200, 430, 500, 50);
        c4.setBounds(200, 500, 150, 50);
        c5.setBounds(400, 500, 150, 50);
        c6.setBounds(200, 570, 150, 50);
        c7.setBounds(400, 570, 150, 50);

        editTask.add(c1);
        editTask.add(c2);
        editTask.add(c3);
        editTask.add(descriptionField);
        editTask.add(priorityField);
        editTask.add(startDateField);
        editTask.add(endDateField);
        editTask.add(c4);
        editTask.add(c5);
        editTask.add(c6);
        editTask.add(c7);

        editTask.setSize(900, 800);
        //editTask.getContentPane().setBackground(Color.pink);
        editTask.setLayout(null);
        editTask.setVisible(true);

        ArrayList<JCheckBox> typeBox = new ArrayList<JCheckBox>();
        typeBox.add(c1);
        typeBox.add(c2);
        typeBox.add(c3);

        ArrayList<JCheckBox> statusBox = new ArrayList<JCheckBox>();
        statusBox.add(c4);
        statusBox.add(c5);

        ArrayList<JCheckBox> rewardBox = new ArrayList<JCheckBox>();
        rewardBox.add(c6);
        rewardBox.add(c7);

        //click on back, return to homepage
        /**
         * Adds the new tasks
         * Everytime a new one is added, the counter int will increment
         * so the task rectangles won't overlap
         */

        counter = 120 + currentList.size() * 120;
        add.addActionListener(event ->
        {

            System.out.println("Being added");
            double start;
            double end;
            String taskName = null;
            String taskStatus = null;
            String rewardField = null;

            try {
                start = Double.parseDouble(startDateField.getText());
                end = Double.parseDouble(endDateField.getText());

                for (JCheckBox j : typeBox) {
                    if (j.isSelected()) {
                        taskName = j.getText();
                    }
                }
                for (JCheckBox j : statusBox) {
                    if (j.isSelected()) {
                        taskStatus = j.getText();
                    }
                }

                for (JCheckBox j : rewardBox) {
                    if (j.isSelected()) {
                        rewardField = j.getText();
                    }
                }

                Task temp = new Task(taskName, descriptionField.getText(),
                        priorityField.getText(), start, end, taskStatus, rewardField);

                t = new JButton(temp.toString());
                t.setBounds(50, counter, 800, 100);

                frame.add(t);
                currentList.add(temp);
                counter += 120;
                //testing
                System.out.println("This task is being added:" + temp.toString());
                System.out.println("This is the current list:" + currentList.get(0));

                try {
                    this.queue.put(new AddMessage());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                /**
                 * Task can be edited by clicking itself
                 */
                t.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //System.out.println("Updated");
                        editTask.setVisible(true);
                        editTask.remove(add);
                        JButton update = new JButton("Update");
                        update.setBounds(550, 20, 100, 50);
                        editTask.add(update);
                        editTask.repaint();

                        JTextArea hint = new JTextArea("Please select one option only.");
                        JOptionPane.showMessageDialog(editTask, hint);

                        update.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                String taskName = null;
                                for (JCheckBox j : typeBox) {
                                    if (j.isSelected()) {
                                        taskName = j.getText();
                                    }
                                }
                                String taskStatus = null;
                                for (JCheckBox j : statusBox) {
                                    if (j.isSelected()) {
                                        taskStatus = j.getText();
                                    }
                                }
                                String rewardStatus = null;
                                for (JCheckBox j : rewardBox) {
                                    if (j.isSelected()) {
                                        rewardStatus = j.getText();
                                    }
                                }
                                temp.changeName(taskName);

                                temp.changeDescription(descriptionField.getText());
                                temp.changeStatus(taskStatus);
                                temp.changeReward(rewardStatus);

                                // TO-Do: try to catch it if the number isn't 1 <= x <= 3
                                try {
                                    temp.changePriority(priorityField.getText());
                                } catch (NoSuchFieldError noSuchFieldError) {
                                    JTextArea error = new JTextArea("Please enter a number in priority");
                                    JOptionPane.showMessageDialog(editTask, error);
                                }

                                try {
                                    temp.changeStart(Double.parseDouble(startDateField.getText()));
                                    temp.changeEnd(Double.parseDouble(endDateField.getText()));
                                } catch (NumberFormatException numberFormatException) {
                                    JTextArea error = new JTextArea("Please enter the date in the format mm.dd..");
                                    JOptionPane.showMessageDialog(editTask, error);
                                }
                                //When user finishes a task there will be a reward image pops out
                                if (temp.getStatus() == "Finished") {
                                    try {
                                        BufferedImage image = ImageIO.read(new File(IMG_PATH));
                                        ImageIcon icon = new ImageIcon(image);
                                        JLabel label = new JLabel(icon);
                                        JOptionPane.showMessageDialog(frame, label);
                                        temp.changeReward("Deserved");

                                    } catch (IOException exception) {
                                        exception.printStackTrace();
                                    }
                                }
                                t.setText(temp.toString());
                                t.revalidate();
                            }
                        });
                    }
                });
                TaskManager tm = new TaskManager(currentList);

                //testing TaskManager
                tm.printArrayList();
                System.out.println("Created new task");
            } catch (NumberFormatException numberFormatException) {
                JTextArea error = new JTextArea("Please enter the date in the format mm.dd..");
                JOptionPane.showMessageDialog(editTask, error);
            }

        });
        /**
         * Click the back button, JFrame Edit will be closed
         */
        back.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                editTask.dispose();
            }
        });
    }

    /**
     * Gets the current list
     *
     * @return current list
     */
    public ArrayList<Task> getCurrentList() {
        return currentList;
    }

}
