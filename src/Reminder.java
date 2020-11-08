public class Reminder extends Task{
//Isla
    String reminderDate;

    //Ask Sophia to add blank contructor in task
    public Reminder(){
        this.reminderDate = reminderDate;
    }

    //Ignore the weird formatting text
    //I just want to make sure it works
    public String remindDueDate(){
        return "Hey get " + this.getName() + " done soon!";
    }
}

