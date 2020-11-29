package ProjectPackage;

public class SpendingPlan extends Task {
//Daniela

    /**
     *
     * @param name is the name of the spending plan
     * @param description is the description of the spending plan
     * @param priority is the priority of the spending plan
     * @param start is the start date of the spending plan
     * @param end is the end date of the spending plan
     * @param status is the status of the spending plan
     * @param reward is the reward status of the spending plan
     */
    public SpendingPlan(String name, String description, String priority, int start, int end, String status, String reward) {
        super(name, description, priority, start, end, status, reward);
    }
}

