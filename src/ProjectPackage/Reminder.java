package ProjectPackage;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Reminder extends Task{    //Isla

    private Double reminderDate;

    public Reminder(){
        this.reminderDate = reminderDate;
    }

    public Reminder(String reminder1, String to_remind_you_here, String s, double v, double v1, String incomplete, double v2) {
    }

    /**
     * Gets the reminder date
     *
     * @return the reminder date
     */
    public Double getReminderDate(){
        return this.getReminderDate();
    }

    /**
     * Changes the reminder date
     *
     * @param newDate the new set reminder date
     */
    public void changeReminderDate(double newDate){
        reminderDate = newDate;
    }

    @Override
    public String toString(){
        String s = "Name: " + this.getName() + "  Description: " + this.getDescription() + "  Priority: " + this.getPriority()
                + "  Start Date: " + this.getStart() + "  End Date: " + this.getEnd() + "  Status: " + this.getStatus()
                + " Reminder Date: " + this.getReminderDate();

        return s;
    }
}