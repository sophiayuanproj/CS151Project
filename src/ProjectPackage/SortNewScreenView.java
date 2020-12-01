package ProjectPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.concurrent.BlockingQueue;

/**
 * Sorting screen for program
 */
public class SortNewScreenView extends JFrame {

    private ArrayList<Task> sortingList;

    private BlockingQueue<Message> queue;

    //private TaskManager t;

    private ToDoListView toDo = new ToDoListView();

    /**
     * Initialize queue
     *
     * @param queue is blockingqueue to be initialized
     * @return new sort screen
     */
    public static SortNewScreenView init(BlockingQueue<Message> queue) {
        return new SortNewScreenView(queue, null);
    }

    /**
     * Sorting the lists in a new view
     *
     * @param queue is the blocking queue
     * @param list  is a list to be sorted
     */
    public SortNewScreenView(BlockingQueue<Message> queue, ToDoListView list) {
        this.queue = queue;
        sortingList = list.getCurrentList();

        JFrame sortView = new JFrame();
        //Header, button Back, sort by priority, date, status, type
        JLabel sortingType = new JLabel("Sort View");
        //JButton back = new JButton("Back");
        JButton byPriority = new JButton("By Priority");
        JButton byDate = new JButton("By Date");
        JButton byStatus = new JButton("By Status");
        JButton byType = new JButton("By Type");

        //back.setBounds(650, 20, 100, 50);
        byPriority.setBounds(200, 150, 500, 50);
        byDate.setBounds(200, 220, 500, 50);
        byStatus.setBounds(200, 290, 500, 50);


        byType.setBounds(200, 360, 500, 50);
        sortingType.setBounds(50, 50, 150, 50);
        sortingType.setFont(new Font("Arial", Font.PLAIN, 28));

        sortView.add(sortingType);
        //sortView.add(back);
        sortView.add(byPriority);
        sortView.add(byDate);
        sortView.add(byStatus);
        sortView.add(byType);

        sortView.setSize(800, 700);
        //sortView.getContentPane().setBackground(Color.pink);
        sortView.setLayout(null);
        sortView.setVisible(true);

        /**
         * Sorting by priority
         */
        byPriority.addActionListener(event ->
        {
            try {
                this.queue.put(new SelectMessage());
            } catch (Exception e) {
                e.printStackTrace();
            }

            try {
                ArrayList<Task> currentList = new TaskManager(sortingList).prioritySort("3");
                toDo.updateView(currentList);
                throw new NullPointerException();
            } catch (NullPointerException e) {
                final JFrame frame = new JFrame();
                frame.setSize(400, 200);
                frame.setLayout(null);
                frame.setVisible(true);
                JLabel errorText = new JLabel("Cannot Sort With Empty Field");
                System.out.println("One or more of your fields are empty");
                errorText.setBounds(100, 50, 400, 50);
                errorText.setFont(new Font("Arial", Font.PLAIN, 15));
                frame.add(errorText);
            }
        });

        /**
         * Sorting by date
         */
        byDate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    //t = new TaskManager(sortingList);
                    ArrayList<Task> currentList = new TaskManager(sortingList).dateSort("Current");
                    toDo.updateView(currentList);
                    throw new NullPointerException();
                } catch (NullPointerException exception) {
                    final JFrame frame = new JFrame();
                    frame.setSize(400, 200);
                    frame.setLayout(null);
                    frame.setVisible(true);
                    JLabel errorText = new JLabel("Cannot Sort With Empty Field");
                    System.out.println("One or more of your fields are empty");
                    errorText.setBounds(100, 50, 400, 50);
                    errorText.setFont(new Font("Arial", Font.PLAIN, 15));
                    frame.add(errorText);
                }
            }
        });

        /**
         * Sorting by status
         */
        byStatus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //testing
                //System.out.println("This is the current list:" + sortingList.get(0) );

                //t = new TaskManager(sortingList);

                try {
                    ArrayList<Task> currentList = new TaskManager(sortingList).statusSort("Current");
                    //t.statusSort("Current");
                    toDo.updateView(currentList);
                    throw new NullPointerException();
                } catch (NullPointerException exception) {
                    final JFrame frame = new JFrame();
                    frame.setSize(400, 200);
                    frame.setLayout(null);
                    frame.setVisible(true);
                    JLabel errorText = new JLabel("Cannot Sort With Empty Field");
                    System.out.println("One or more of your fields are empty");
                    errorText.setBounds(100, 50, 400, 50);
                    errorText.setFont(new Font("Arial", Font.PLAIN, 15));
                    frame.add(errorText);
                }
            }
        });

        /**
         * Sorting by type: normal, spending, then workout
         */
        byType.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //t = new TaskManager(sortingList);

                try {
                    ArrayList<Task> currentList = new TaskManager(sortingList).typeSort("Normal Task");
                    toDo.updateView(currentList);
                    throw new NullPointerException();
                } catch (NullPointerException exception) {
                    final JFrame frame = new JFrame();
                    frame.setSize(400, 200);
                    frame.setLayout(null);
                    frame.setVisible(true);
                    JLabel errorText = new JLabel("Cannot Sort With Empty Field");
                    System.out.println("One or more of your fields are empty");
                    errorText.setBounds(100, 50, 400, 50);
                    errorText.setFont(new Font("Arial", Font.PLAIN, 15));
                    frame.add(errorText);
                }
            }
        });
    }

}
