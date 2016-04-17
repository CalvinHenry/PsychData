import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JComponent;

public class MyGlassPane extends JComponent{
		ArrayList<Person> group;
		public MyGlassPane(ArrayList<Person> list){
			this.group = list;
		}
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D)g.create();
			for(int i = 0; i < group.size(); i ++){
				g2d.drawString(group.get(i).getName(), i * 10, i * 10);
			}
			
		}
	}