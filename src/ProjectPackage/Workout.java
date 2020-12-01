package ProjectPackage;

/**
 * Workout class
 * Author @Daniela
 */
public class Workout extends Task {
    /**
     * @param name        is the name of the workout
     * @param description is the description og the workout
     * @param priority    is the priority of the workout
     * @param start       is the start date of the workout
     * @param end         is the end date of the workout
     * @param status      is the status of the workout
     * @param reward      is the reward status of the workout
     */
    public Workout(String name, String description, String priority, int start, int end, String status, String reward) {
        super(name, description, priority, start, end, status, reward);
    }
}

