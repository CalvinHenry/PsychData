import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JComponent;
import javax.swing.JFrame;



public class DramaMap {
	static JFrame frame;
	static ArrayList<Person> group;
	final static String menu = "Enter The Name of the person who's data your entering, or -1 to draw data";
	static Scanner scan = new Scanner(System.in);
	public static void main(String args[]) {
		group = new ArrayList<Person>();
		
		
		while(true){
			System.out.println(menu);
			String load = scan.nextLine();
			if(load.equals("-1"))
				break;
			else{
				
				group.add(getPerson(load));
			}
		}
		frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new MyGlassPane(group));
        frame.repaint();
        frame.setVisible(true);
		
	}
	public static Person getPerson(String name){
		
		Person p = new Person(name);
		System.out.println("Enter Drama Data, enter -1 to enter next person");
		while(true){
			String s = scan.nextLine();
			if(s.equals("-1")){
				break;
			}else{
				System.out.println(s);
				DramaEvent.Drama d = DramaEvent.getDrama(s.substring(0,1));
				String person = s.substring(2, s.lastIndexOf("\t"));
				int intensity = Integer.parseInt(s.substring(s.length() - 1));
				DramaEvent dra = new DramaEvent(person, d, intensity);
				p.addEvent(dra);
			}
		}
		return p;
			
		
	}
	public void initializeFrame(ArrayList<Person> group){
		frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new MyGlassPane(group));
        frame.repaint();
        frame.setVisible(true);
	}
	
	
}
