public class Task implements TaskInterface {
    private String theName;
    private String theDescription;
    private String thePriority;
    private int startDate;
    private int endDate;
    private boolean theStatus;
    //sophia yuan
    public Task(String name, String description, String priority, int start, int end, boolean status) {
        theName = name;
        theDescription = description;
        thePriority = priority;
        startDate = start;
        endDate = end;
        theStatus = status;
    }
    //add get methods

    public void changeName(String s) {

    }

    public void changeDescription(String s) {

    }

    public void changePriority(String s) {

    }

    public void changeStart(double d) {

    }

    public void changeEnd(double d) {

    }

    public boolean changeStatus(boolean b) {

    }

}
