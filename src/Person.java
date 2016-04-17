import java.util.ArrayList;

public class Person {
	String name;
	ArrayList<DramaEvent> history;
	
	public Person(String name){
		this.name = name;
		history = new ArrayList<>();
	}
	public void addEvent(DramaEvent d){
		history.add(d);
	}
	public String getName(){
		return name;
	}
}
