package ProjectPackage;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Reminder extends Task{
    //Isla

    private Double reminderDate;

    public Reminder(){
        this.reminderDate = reminderDate;
    }

    public Reminder(String reminder1, String to_remind_you_here, String s, double v, double v1, String incomplete, double v2) {
    }

    public Double getReminderDate(){
        return this.getReminderDate();
    }

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

    public String reminderMessage(){
        return "REMINDER: do " + this.getName() + " soon!";
    }




}

//  JUnit Testing
class ReminderTester{
    //declare Reminder object
    Reminder rem;

    @Before
    public void setUp(){
        rem = new Reminder("Reminder1", "To remind you here", "1", 11.2, 11.6, "Incomplete", 11.5);
    }

    @Test
    public void testReminderMessage(){
        assertSame(rem.reminderMessage(), "REMINDER: do Reminder1 soon!");
    }

}