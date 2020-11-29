package ProjectPackage;

import java.util.ArrayList;

public interface Subject {
    /**
     * Attaches the subject to the observer
     * @param o is the observer
     */
    public void attach(Observer o);

    /**
     * Notifies all the observers the list of tasks is updated
     * @param tasks is the updated list of tasks
     */
    public void notifyAllObservers(ArrayList<Task> tasks);
}
