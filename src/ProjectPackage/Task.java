package ProjectPackage;

import javax.swing.*;

/**
 * Task class that models a task
 * Author @Team 7
 */

public class Task extends JComponent {
    private String theName;
    private String theDescription;
    private String thePriority;
    private double startDate;
    private double endDate;
    private String theStatus;
    private String theReward;

    /**
     * Task object is created here
     *
     * @param name        is the name of the task
     * @param description is the description of the task
     * @param priority    is the priority of the task
     * @param start       is the start date for the task
     * @param end         is the end date for the task
     * @param status      is the status of the task
     */

    /**
     * Created for Isla
     */
    public Task()
    {}

    public Task(String name, String description, String priority, double start, double end, String status, String reward) {
        theName = name;
        theDescription = description;
        thePriority = priority;
        startDate = start;
        endDate = end;
        theStatus = status;
        theReward = reward;
    }

    /**
     * Gets the name of the task
     *
     * @return the name of the task
     */
    public String getName() {
        return this.theName;
    }

    /**
     * Changes the name of the task
     *
     * @param s is the name to change to
     */
    public void changeName(String s) {
        theName = s;
    }

    /**
     * Gets description of task
     *
     * @return description of task
     */
    public String getDescription() {
        return this.theDescription;
    }

    /**
     * Changes the description of task
     *
     * @param s is the description to change to
     */
    public void changeDescription(String s) {
        theDescription = s;
    }

    /**
     * Gets the priority of the task
     *
     * @return the priority type
     */
    public String getPriority() {
        return this.thePriority;
    }

    /**
     * Changes the priority of the task
     *
     * @param s is the what the priority changes to
     */
    public void changePriority(String s) {
        thePriority = s;
    }

    /**
     * Gets the start of the date
     *
     * @return the start of the date
     */
    public double getStart() {
        return this.startDate;
    }

    /**
     * Changes the start of the date
     *
     * @param d is what the start date changes to
     */
    public void changeStart(double d) {
        startDate = d;
    }

    /**
     * Gets the end date
     *
     * @return the end date
     */
    public double getEnd() {
        return this.endDate;
    }

    /**
     * Changes the end date
     *
     * @param d is what the end date changes to
     */
    public void changeEnd(double d) {
        endDate = d;
    }

    /**
     * Gets the status of the task
     *
     * @return the status of the task
     */
    public String getStatus() {
        return this.theStatus;
    }

    /**
     * Changes the status of the task. TaskDateDecorator is used to decorate Task.
     *
     * @param s is what the task changes to
     */
    public void changeStatus(String s) {
        theStatus = s;
    }

    /**
     * Get the reward
     * @return the reward
     */
    public String getReward()
    {
        return theReward;
    }

    /**
     * Setting new reward
     * @param s the reward
     */
    public void changeReward(String s)
    {
        theReward = s;
    }

    @Override
    public String toString()
    {
        TaskDateDecorator td = new TaskDateDecorator(this);

        String s = "Name: " + theName + "  Description: " + theDescription + "  Priority: " + thePriority
                + "  Start Date: " + td.dateConverter(startDate) + "  End Date: " + td.dateConverter(endDate) + "  Status: " + theStatus + " Reward: " + theReward;
        return s;
    }

}
