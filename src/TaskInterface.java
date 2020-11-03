/**
 * Author @Group 7
 * Interface for all tasks
 */
public interface TaskInterface {

    /**
     * Changes name of task
     *
     * @param s is the name changed to
     */
    void changeName(String s);

    /**
     * Changes description of task
     *
     * @param s is the description changed to
     */
    void changeDescription(String s);

    /**
     * Changes priority of task
     *
     * @param s is the priority type changed to
     */
    void changePriority(String s);

    /**
     * Changes start date of task
     *
     * @param d is the date changed to
     */
    void changeStart(double d);

    /**
     * Changes end date of task
     *
     * @param d is the date changed to
     */
    void changeEnd(double d);

    /**
     * Changes status of task
     *
     * @param b is the status changed to
     */
    void changeStatus(boolean b);

}
