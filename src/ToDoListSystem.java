import javax.swing.*;
import java.awt.*;

//manages and stores taskManager objects
//Isla
public class ToDoListSystem extends JFrame {

    public static void main(String[] args) throws InterruptedException{

        JFrame frame = new JFrame("To-Do List");
       // Task task = new Task("a", "a","a",1,2,true);
        //JButton taskButton = new JButton(task.toString());

        //taskButton.setBackground(Color.WHITE);
       // taskButton.setBounds(50,100,700,100);

        //Sort View Button
        JButton sortButton = new JButton("Sort View");
        sortButton.setBounds(400, 50, 100, 50);
        frame.add(sortButton);

        //Rewards Button
        JButton rewardsButton = new JButton("Rewards");
        rewardsButton.setBounds(550, 50, 100, 50);
        frame.add(rewardsButton);

        //Add/Edit Button
        JButton addButton = new JButton("Add/Edit");
        addButton.setBounds(700, 50, 100, 50);
        frame.add(addButton);

        //Tasks Text
        //Find a better way to display the title, make sure it's underlined
        JLabel tasksText = new JLabel("Tasks");
        tasksText.setBounds(100, 100, 100, 100);
        frame.add(tasksText);

        //Task listing 1
        Task task1 = new Task("Task 1", "a","a",1,2,true);
        JButton taskButton1 = new JButton(task1.toString());
        frame.add(taskButton1);
        taskButton1.setBounds(100, 180, 700, 100);

        //Task listing 2
        Task task2 = new Task("Task 2", "a","a",1,2,true);
        JButton taskButton2 = new JButton(task2.toString());
        frame.add(taskButton2);
        taskButton2.setBounds(100, 310, 700, 100);

        //Task listing 3
        Task task3 = new Task("Task 3", "a","a",1,2,true);
        JButton taskButton3 = new JButton(task3.toString());
        frame.add(taskButton3);
        taskButton3.setBounds(100, 440, 700, 100);

        //Task listing 4
        Task task4 = new Task("Task 3", "a","a",1,2,true);
        JButton taskButton4 = new JButton(task4.toString());
        frame.add(taskButton4);
        taskButton4.setBounds(100, 570, 700, 100);

        frame.setSize(900,800);
        frame.getContentPane().setBackground(Color.pink);
        frame.setLayout(null);
        frame.setVisible(true);



    }
}
