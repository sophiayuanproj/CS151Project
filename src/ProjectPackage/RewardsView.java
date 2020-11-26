package ProjectPackage;

import org.junit.Test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import static org.junit.Assert.*;

//Daniela
public class RewardsView extends JFrame {
    private int counter = 120;
    private JFrame rewards;
    private ArrayList<Task> list;

    public RewardsView(ArrayList<Task> list) {

        this.list = list;
        rewards = new JFrame("Rewards");
        JButton history = new JButton("History");
        JButton back = new JButton("Back");
        JLabel reward = new JLabel("Reward");

        //history.setBounds(550, 20, 100, 50);
        back.setBounds(650, 20, 100, 50);
        reward.setBounds(50, 50, 150, 50);
        reward.setFont(new Font("Arial", Font.PLAIN, 28));

        // rewards.add(history);
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

        filter(list);
    }

    public String filter(ArrayList<Task> list) {
        ArrayList<Task> finished = new ArrayList<>();
        for (Task task : list) {
            if (task.getStatus() == "Finished") {
                JButton button = new JButton("Name: " + task.getName() + " " + "Description: " + task.getDescription() + " " +
                        "Owned Date: " + task.getEnd() + " " + "Great job!");
                button.setBounds(50, counter, 700, 100);
                //System.out.println("THIS IS THE TASK TO UPDATE: " + task.toString());
                rewards.add(button);
                counter += 120;
                finished.add(task);
            }
        }
        String task = null;
        for (Task t : finished) {
            task = t.toString();
        }
        return task;
    }
}


