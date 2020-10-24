public class Task {
    private String theName;
    private String theDescription;
    private String theType;
    private int startDate;
    private int endDate;
    private boolean theStatus;

    public Task(String name, String description, String type, int start, int end, boolean status){
        theName = name;
        theDescription = description;
        theType = type;
        startDate = start;
        endDate = end;
        theStatus = status;
    }


}
