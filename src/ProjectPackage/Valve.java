package ProjectPackage;

/**
 * Command interface with Valve
 */
public interface Valve {

    /**
     * ValveResponse
     *
     * @param message to be executed
     * @return message
     */
    public ValveResponse execute(Message message);
}
