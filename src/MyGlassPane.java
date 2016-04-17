import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JComponent;

public class MyGlassPane extends JComponent{
		static final int borderSizeX = 500;
		static final int borderSizeY = 100;
		static int minX, minY, maxX, maxY;
		ArrayList<Person> group;
		Random generator;
		public MyGlassPane(ArrayList<Person> list){
			GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
			int width = gd.getDisplayMode().getWidth();
			int height = gd.getDisplayMode().getHeight();
			generator = loadNewSeed();
			minX = borderSizeX;
			minY = borderSizeY;
			maxX = width - borderSizeX;
			maxY = height - borderSizeY;
			System.out.println("MaxX: " + maxX);
			System.out.println("MaxY: " + maxY);
			this.group = list;
		}
		
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D)g.create();
			g2d.drawString("Testing testing", 500, 500);
			System.out.println("Size" + group.size());
			for(int i = 0; i < group.size(); i ++){
				int x = getRandumNumber(minX, maxX);
				int y = getRandumNumber(minY, maxY);
				System.out.println("X: " + x);
				System.out.println("Y: " + y);
				g2d.drawString(group.get(i).name, x, y);
			}
			
		}
		public int getRandumNumber(int min, int max){
			return generator.nextInt(max - min) + min;
		}
		public Random loadNewSeed(){
			long seed = System.currentTimeMillis();
			Random generator = new Random(seed);
			System.out.println("Seed: " + seed);
			return generator;
		}
	}