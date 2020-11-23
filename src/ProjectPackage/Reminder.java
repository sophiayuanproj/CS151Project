package ProjectPackage;

public class Reminder extends Task{
    //Isla

    private Double reminderDate;

    public Reminder(){
        this.reminderDate = reminderDate;
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