package hw8;
import java.util.*;

public class Event {
	private int Eventnumber ;
	private int Eventdata ;
	
public Event(int Eventnumber, int Eventdata) {
	this.Eventnumber = Eventnumber ;
	this.Eventdata = Eventdata ;
}

public int GetEventdata() {
	return Eventdata ;
}

public int GetEventnumber() {
	return Eventnumber ;
}
}
