package ProjectPackage;

import java.util.*;

/**
 * Command Invoker Class
 * Used tutorial: https://www.tutorialspoint.com/design_pattern/command_pattern.htm
 */
public class TaskListInvoker {

    private ArrayList<CommandListTask> task = new ArrayList<>();

    /**
     * Adding tasks
     * @param t is the task to be added
     */
    public void addTask(CommandListTask t)
    {
        task.add(t);
    }

    /**
     * Presenting the tasks in an arrayList
     */
    public void showTasks()
    {
        for(CommandListTask t : task)
        {
            t.listAll();
        }

        task.clear();
    }

}
