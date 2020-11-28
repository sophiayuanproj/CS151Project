package ProjectPackage;

import java.util.ArrayList;

public interface Observer {
    public void update(ArrayList<Task> tasks);
    public void setSubject(Subject sub);
}
