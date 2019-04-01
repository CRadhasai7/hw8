package hw8;

public class Runhw8 {

	public static void main(String[] args) {
		publisherimplementation ru = new publisherimplementation();
		
		observer subodds = new subscriberodds();
		observer subevens = new subscriberevens();
		observer subthrees = new subscriberthrees();
		
		ru.registerobserver(subodds);
		ru.registerobserver(subevens);
		ru.registerobserver(subthrees);
		
		ru.runsimulation();

	}

}
