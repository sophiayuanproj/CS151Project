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
        JLabel tasksText = new JLabel("Tasks");
        tasksText.setBounds(100, 100, 100, 100);
        frame.add(tasksText);

        Task task1 = new Task("a", "a","a",1,2,true);
        JButton taskButton1 = new JButton(task1.toString());
        frame.add(taskButton1);
        taskButton1.setBounds(100, 50, 700, 100);

        frame.setSize(900,800);
        frame.getContentPane().setBackground(Color.pink);
        frame.setLayout(null);
        frame.setVisible(true);



    }
}
