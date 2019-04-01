package hw8;

public class subscriberthrees implements observer {
	
	public boolean notifyobserver(Event e) {
		if (e.GetEventdata()% 3 == 0) {
			String message = String.format("Event %d is divisible by three: %d", e.GetEventnumber(), e.GetEventdata());
			System.out.println(message);
			return true ;
		}
		else return false;
	}

}
