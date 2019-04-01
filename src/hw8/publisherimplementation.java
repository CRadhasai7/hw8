package hw8;
import java.util.*;

public class publisherimplementation implements publisherinterface {
	private List<observer> subscribers = new ArrayList<observer>();
	
	public publisherimplementation() {
	}
	public boolean notifyobserver(observer o){
		return true;
}
    public void registerobserver(observer o) {
    	subscribers.add(o);
    }
    
    public void removeobserver(observer o) {
    	subscribers.remove(o);
    }
    
    private Event generateEvent(int i) {
    	int data = (int)(Math.random()*5000);
    	Event e = new Event(i, data);
    	return e;
    }
    
    public void runsimulation() {
    	int oddcount = 0;
    	int threecount = 0;
    	Integer[] ar = { 40, 80, 120, 160, 200 };
    	List<Integer> iterationstops = Arrays.asList(ar);
    	boolean status = false;
    	
    	for(int i = 1; i < 201; i++) {
    		Event dumEvent = generateEvent(i);
    		
    		for(observer o : subscribers) {
    			status = o.notifyobserver(dumEvent);
    			
    			if(status && o.getClass() == subscriberodds.class) {
    				if (oddcount >= 20) {
    					removeobserver(o);
    					System.out.println("\t unregistered subscriberthrees: assigned to 20 events");
    					} else {
    						oddcount += 1;
    						System.out.printf("\t odd events count: %d\n", oddcount);
    					} } else if (status && o.getClass() == subscriberthrees.class) {
    						if (threecount >= 6) {
    							removeobserver(o);
    							System.out.println("\t unregistered subscriberthrees: assigned to 6 events");
    						} else {
    							threecount += 1;
    							System.out.printf("\t thress event count: %d\n",  threecount);
    						}
    					} else if(iterationstops.contains(i) && o.getClass() == subscriberevens.class) {
    						if (oddcount >= 20) {
    							registerobserver(o);
    							System.out.printf("\t event %d: subscribersodds re-registered\n", i);
    							oddcount = 0;
    						}
    						if (threecount >=6) {
    							registerobserver(o);
    							System.out.printf("\t event %d:subscriberthress re-registered\n", i);
    							threecount = 0;
    						}
    			}
    		}
    		
    	}
    }

}

