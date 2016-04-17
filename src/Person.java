import java.awt.Point;
import java.util.ArrayList;

public class Person {
	String name;
	ArrayList<DramaEvent> history;
	private Point loc;
	public Person(String name){
		this.name = name;
		history = new ArrayList<>();
		loc = new Point();
	}
	public void addEvent(DramaEvent d){
		history.add(d);
	}
	public String getName(){
		return name;
	}
	public void setLocation(double x, double y){
		loc.setLocation(x, y);
	}
	public double getX(){
		return loc.getX();
	}
	public double getY(){
		return loc.getY();
	}
	
}
