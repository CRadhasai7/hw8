package hw8;

public class subscriberodds implements observer {
	public boolean notifyobserver(Event e) {
		if (e.GetEventdata()%2 != 0) {
			String message = String.format("Event %d is odd: %d", e.GetEventnumber(), e.GetEventdata());
			System.out.println(message);
			return true;
			
		}
		else return false;
	}

}
