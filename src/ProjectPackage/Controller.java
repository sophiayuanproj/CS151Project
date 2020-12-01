package ProjectPackage;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.BlockingQueue;

public class Controller {

    private BlockingQueue queue;
    private TaskManager manager;
    private AddView view;

    private List<Valve> valves = new LinkedList<Valve>();

    public Controller(BlockingQueue q, TaskManager t, AddView v){
        queue = q;
        manager = t;
        view = v;
        valves.add(new DoNewValve());
        valves.add(new DoNewSelectValve());
    }

    public void mainLoop(){
        ValveResponse response = ValveResponse.EXECUTED;
        Message message = null;

        while(response != ValveResponse.FINISH){
            try{
                message = (Message) queue.take();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for(Valve v : valves)
            {
                response = v.execute(message);

                if(response != ValveResponse.MISS)
                {
                    break;
                }
            }
        }
    }
}
