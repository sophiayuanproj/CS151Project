package ProjectPackage;

/**
 * Reminder class that inherits Task
 * Author @Team 7
 */

public class Reminder extends Task {

    private Double reminderDate;

    /**
     * Constructor for reminder
     */
    public Reminder() {
        this.reminderDate = reminderDate;
    }

    /**
     * Constructor for reminder
     *
     * @param reminder1          is the reminder
     * @param to_remind_you_here is a reminder
     * @param s                  is the string
     * @param v                  is a double
     * @param v1                 is the double
     * @param incomplete         is incomplete status
     * @param v2                 is double
     */
    public Reminder(String reminder1, String to_remind_you_here, String s, double v, double v1, String incomplete, double v2) {
    }

    /**
     * Gets the reminder date
     *
     * @return the reminder date
     */
    public Double getReminderDate() {
        return this.getReminderDate();
    }

    /**
     * Changes the reminder date
     *
     * @param newDate the new set reminder date
     */
    public void changeReminderDate(double newDate) {
        reminderDate = newDate;
    }

    @Override
    public String toString() {
        String s = "Name: " + this.getName() + "  Description: " + this.getDescription() + "  Priority: " + this.getPriority()
                + "  Start Date: " + this.getStart() + "  End Date: " + this.getEnd() + "  Status: " + this.getStatus()
                + " Reminder Date: " + this.getReminderDate();

        return s;
    }
}