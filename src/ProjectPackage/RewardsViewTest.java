package ProjectPackage;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * JUnit test for RewardsViewTest
 */
public class RewardsViewTest {
        @Test
        public void filterTest() {
            RewardsView rv;
            Task task1 = new Task("Normal Task", "buy food", "important", 1.2, 1.3, "Current");
            Task task2 = new Task("Workout", "outdoor walking", "important", 3.2, 4.3, "Finished");
            Task task3 = new Task("Spending Plan", "rent", "important", 4.5, 4.9, "Current");
            Task task4 = new Task("Workout", "outdoor running", "important", 8.2, 8.3, "Current");
            ArrayList<Task> tasks = new ArrayList<>();
            tasks.add(task1);
            tasks.add(task2);
            tasks.add(task3);
            tasks.add(task4);

            rv = new RewardsView(tasks);

            assertEquals(task2.toString(), rv.filter(tasks));
        }

    }
