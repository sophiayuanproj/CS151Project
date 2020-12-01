package ProjectPackage;

/**
 * Does new valve
 */
public class DoNewValve implements Valve {

    /**
     * for valve response
     * @param m is the message
     * @return is the valve response
     */
    @Override
    public ValveResponse execute(Message m) {
        if(m.getClass() != AddMessage.class)
        {
            return ValveResponse.MISS;
        }
        return ValveResponse.EXECUTED;
    }
}
