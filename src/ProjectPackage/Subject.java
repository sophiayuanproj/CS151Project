package ProjectPackage;

import java.util.ArrayList;

public interface Subject {
    public void attach(Observer o);
    public void notifyAllObservers(ArrayList<Task> tasks);
}
