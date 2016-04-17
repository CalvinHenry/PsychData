
public class DramaEvent {
	enum Drama{
		NULL, LIKES, LIKED_BY, RELATIONSHIP, BREAKUP, THING_BUT_NOT_REALLY, SH_T_HAPPENED
	}
	
	String person;
	Drama d;
	int intensity;
	
	public DramaEvent(String p, Drama d, int intensity){
		person = p;
		this.d = d;
		this.intensity = intensity;
	}
	public static Drama getDrama(String s){
		if(s.equals(">"))
			return Drama.LIKES;
		else if(s.equals("<"))
			return Drama.LIKED_BY;
		else if(s.equals("<>"))
			return Drama.RELATIONSHIP;
		else if(s.equals("><"))
			return Drama.SH_T_HAPPENED;
		else
			return Drama.NULL;
		
	}
	

}
