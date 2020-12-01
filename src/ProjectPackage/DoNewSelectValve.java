package ProjectPackage;

/**
 * valve for selection
 */
public class DoNewSelectValve implements Valve {

    /**
     * for valve responses
     * @param m the message
     * @return a valve response
     */
    @Override
    public ValveResponse execute(Message m) {
        if(m.getClass() != SelectMessage.class)
        {
            return ValveResponse.MISS;
        }
        return ValveResponse.EXECUTED;
    }
}
