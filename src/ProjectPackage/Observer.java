package ProjectPackage;

import java.util.ArrayList;

/**
 * Interface for observer pattern
 */
public interface Observer {
    /**
     * Updates the list of tasks
     *
     * @param tasks is the list of tasks needs to be updated
     */
    public void update(ArrayList<Task> tasks);

    /**
     * Sets the subject of observer
     *
     * @param sub is the subject
     */
    public void setSubject(Subject sub);
}
