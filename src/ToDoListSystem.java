import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//manages and stores taskManager objects
//Isla
public class ToDoListSystem extends JFrame {
    public static void main(String[] args) throws InterruptedException {

        JFrame frame = new JFrame("To-Do List");
        Task task = new Task("a", "a", "a", 1, 2, true);
        JButton taskButton = new JButton(task.toString());
        JButton sortView = new JButton("Sort View");
        JButton rewards = new JButton("Rewards");
        JButton editTask = new JButton("Add/Edit");
        JButton tasks = new JButton("Tasks");

        //taskButton.setBackground(Color.WHITE);
        taskButton.setBounds(50, 100, 700, 100);
        sortView.setBounds(550, 20, 100, 50);
        rewards.setBounds(650, 20, 100, 50);
        editTask.setBounds(750, 20, 100, 50);
        tasks.setBounds(50, 50, 150, 50);
        tasks.setFont(new Font("Arial", Font.PLAIN, 28));

        frame.add(taskButton);
        frame.add(sortView);
        frame.add(rewards);
        frame.add(editTask);
        frame.add(tasks);

        frame.setSize(900, 800);
        frame.getContentPane().setBackground(Color.pink);
        frame.setLayout(null);
        frame.setVisible(true);

        rewards.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame rewards = new JFrame("Rewards");

                JButton history = new JButton("History");
                JButton back = new JButton("Back");
                JButton reward = new JButton("Rwards");

                history.setBounds(550, 20, 100, 50);
                back.setBounds(650, 20, 100, 50);
                reward.setBounds(50, 50, 150, 50);
                reward.setFont(new Font("Arial", Font.PLAIN, 28));

                rewards.add(history);
                rewards.add(back);
                rewards.add(reward);

                rewards.setSize(900, 800);
                rewards.getContentPane().setBackground(Color.pink);
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
    }
}
