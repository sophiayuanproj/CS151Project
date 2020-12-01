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

/**
 * View for rewards
 * Author @Daniela
 */
public class RewardsView extends JFrame {
    private int counter = 120;
    private JFrame rewards;
    private ArrayList<Task> list;
    private static final String IMG_PATH = "src/ProjectPackage/image02.png";

    /**
     * @param list is a list contains all the tasks in TodoList
     */
    public RewardsView(ArrayList<Task> list) throws IOException {

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

        //Users will get a special reward when they finished more than 3 tasks
        if (list.size() >= 3) {
            try {
                BufferedImage image = ImageIO.read(new File(IMG_PATH));
                ImageIcon icon = new ImageIcon(image);
                JLabel label = new JLabel(icon);
                JOptionPane.showMessageDialog(rewards, label);
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }

    /**
     * @param list is a list to be filtered
     * @return an arraylist contains all the finished tasks
     */
    public String filter(ArrayList<Task> list) {
        ArrayList<Task> finished = new ArrayList<>();
        for (Task task : list) {
            if (task.getStatus() == "Finished" && task.getReward() == "Deserved") {
                JButton button = new JButton("Reward:" + " " + "Description: " + task.getDescription() + " " +
                        "Owned Date: " + task.getEnd() + " " + "Great job!");
                button.setBounds(100, counter, 700, 100);
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


