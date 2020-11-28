package ProjectPackage;

/**
 * Used tutorial: https://www.tutorialspoint.com/design_pattern/decorator_pattern.htm
 * Concrete decorator class extending TaskDecorator
 */
public class TaskDateDecorator extends TaskDecorator{

    public TaskDateDecorator(Task decoratedDate) {
        super(decoratedDate);
    }

    @Override
    public void changeName(String s) {
        decoratedDate.changeName(s);
    }

    @Override
    public void changeDescription(String s) {
        decoratedDate.changeDescription(s);
    }

    @Override
    public void changePriority(String s) {
        decoratedDate.changePriority(s);
    }

    @Override
    public void changeStart(double d) {
        decoratedDate.changeStart(d);
    }

    @Override
    public void changeEnd(double d) {
        decoratedDate.changeEnd(d);
    }

    @Override
    public void changeReward(String s) {
        decoratedDate.changeReward(s);
    }

    @Override
    public void changeStatus(String s) {
        decoratedDate.changeStatus(s);
    }

    //Added by Isla, edited by Sophia
    /**
     * Converts date decimal format into a String
     *  Used this for tutorial: https://stackoverflow.com/questions/24753177/how-to-split-a-double-number-by-dot-into-two-decimal-numbers-in-java
     * @param date in Double format
     * @return a String with the actual date name
     */
    public String dateConverter(double date) {
        // parse Date, number before decimal is the month #
        // number after decimal is day #

        String[] dateArray =String.valueOf(date).split("\\.");
        int[] intArr=new int[2];
        intArr[0]=Integer.parseInt(dateArray[0]); // the first number
        intArr[1]=Integer.parseInt(dateArray[1]); // the rest

        int month = intArr[0];
        int day = intArr[1];
        String monthString;

        // Convert month numbers into actual date names
        switch (month) {
            case 1:  monthString = "January";
                break;
            case 2:  monthString = "February";
                break;
            case 3:  monthString = "March";
                break;
            case 4:  monthString = "April";
                break;
            case 5:  monthString = "May";
                break;
            case 6:  monthString = "June";
                break;
            case 7:  monthString = "July";
                break;
            case 8:  monthString = "August";
                break;
            case 9:  monthString = "September";
                break;
            case 10: monthString = "October";
                break;
            case 11: monthString = "November";
                break;
            case 12: monthString = "December";
                break;
            default: monthString = "Invalid month";
                break;
        }
        return monthString + ", " + day;
    }

    /**
     * Converting the date to string
     * @param d is the date
     * @return a string version of the date
     */
    public String dateToString(double d)
    {
        return dateConverter(d);
    }

}
