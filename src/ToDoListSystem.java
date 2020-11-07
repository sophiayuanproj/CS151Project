import javax.swing.*;
import java.awt.*;

//manages and stores taskManager objects
//Isla
public class ToDoListSystem extends JFrame {

    public static void main(String[] args) throws InterruptedException{

        JFrame frame = new JFrame("To-Do List");
        Task task = new Task("a", "a","a",1,2,true);
        JButton taskButton = new JButton(task.toString());

        //taskButton.setBackground(Color.WHITE);
        taskButton.setBounds(50,100,700,100);

        frame.add(taskButton);
        frame.setSize(900,800);
        frame.getContentPane().setBackground(Color.pink);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
