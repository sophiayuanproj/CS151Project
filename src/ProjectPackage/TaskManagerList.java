package ProjectPackage;

/**
 * Command pattern concrete classes
 */
public class TaskManagerList implements CommandListTask{

    private Task task;

    /**
     * Constructor for TaskManagerList
     * @param t is the task to be passed in
     */
    public TaskManagerList(Task t)
    {
        task = t;
    }

    /**
     * listing the task with user-defined toString() method
     */
    @Override
    public void listAll() {
        //Test
        System.out.println(task.toString());
    }
}
