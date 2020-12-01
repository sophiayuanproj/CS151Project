package ProjectPackage;

/**
 * Abstract decorator class implementing the TaskInterface
 */
public abstract class TaskDecorator implements TaskInterface {
    protected Task decoratedDate;

    /**
     * Constructor for TaskDecorator
     *
     * @param decoratedTask is the task to be passed in
     */
    public TaskDecorator(Task decoratedTask) {
        this.decoratedDate = decoratedDate;
    }

    /**
     * Converting the date to string
     *
     * @param d is the date
     * @return a string version of the date
     */
    public String dateToString(double d) {
        return dateToString(d);
    }
}
