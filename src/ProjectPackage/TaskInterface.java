package ProjectPackage;

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
     * Changes reward status
     *
     * @param s is the date changed to
     */
    void changeReward(String s);

    /**
     * Changes status of task
     *
     * @param s is the status changed to
     */
    void changeStatus(String s);

    /**
     * Converting date to string
     *
     * @param d is the double to be passed in
     * @return string version of date
     */
    String dateToString(double d);

}
