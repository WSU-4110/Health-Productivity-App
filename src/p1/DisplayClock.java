package p1;
import p1.CheckTime;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static java.lang.Math.*;
import java.awt.geom.*;
import java.time.LocalTime;


interface Clock{
	public void drawClockFace(Graphics2D g);
	public void drawHand(Graphics2D g, float angle, int radius, Color color);
}

class Dimensions {
	final float degrees06 = (float) (PI / 30);
	final float degrees30 = degrees06 * 5;
	final float degrees90 = degrees30 * 3;
	 
	int size = 200;
	int spacing = 10;
	int diameter = size - 2 * spacing;
	int cx = diameter / 2 + spacing;
	int cy = diameter / 2 + spacing;
}

class DrawClock implements Clock {
	
	Dimensions dim = new Dimensions();
	
	public void drawClockFace(Graphics2D g) {
		g.setStroke(new BasicStroke(2));
	    g.setColor(Color.white);
	    g.fillOval(dim.spacing, dim.spacing, dim.diameter, dim.diameter);
	    g.setColor(Color.black);
	    g.drawOval(dim.spacing, dim.spacing, dim.diameter, dim.diameter);
	  
	 }
	
	public void drawHand(Graphics2D g, float angle, int radius, Color color) {
		int x = dim.cx + (int) (radius * cos(angle));
	    int y = dim.cy - (int) (radius * sin(angle));
	    g.setColor(color);
	    g.drawLine(dim.cx, dim.cy, x, y);
	}
}

public class DisplayClock extends JPanel {
	
	
	DrawClock dc = new DrawClock();
	Dimensions dim = new Dimensions();
	
	public DisplayClock() {
		Dimensions dim = new Dimensions();
		
		setPreferredSize(new Dimension(dim.size, dim.size));
	    setBackground(Color.BLUE);
	 
	      new Timer(1000, (ActionEvent e) -> {
	         repaint();
	      }).start();
	}
	
	@Override
	public void paintComponent(Graphics g2) {
	      super.paintComponent(g2);
	      Graphics2D g = (Graphics2D) g2;
	      g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
	              RenderingHints.VALUE_ANTIALIAS_ON);
	 
	      // call method drawClockFace
	      dc.drawClockFace(g);
	 
	      final LocalTime time = LocalTime.now();
	      int hour = time.getHour();
	      int minute = time.getMinute();
	      int second = time.getSecond();
	 
	      float angle = dim.degrees90 - (dim.degrees06 * second);
	      dc.drawHand(g, angle, dim.diameter / 2 - 30, Color.red);
	 
	      float minsecs = (minute + second / 60.0F);
	      angle = dim.degrees90 - (dim.degrees06 * minsecs);
	     dc.drawHand(g, angle, dim.diameter / 3 + 10, Color.black);
	 
	      float hourmins = (hour + minsecs / 60.0F);
	      angle = dim.degrees90 - (dim.degrees30 * hourmins);
	      dc.drawHand(g, angle, dim.diameter / 4 + 10, Color.black);
	      
	      //
	      Rectangle rec = SwingUtilities.calculateInnerArea(this, null);
	      float radius = Math.min(rec.width,  rec.height) / 2f - 10f;
	      g.translate(rec.getCenterX(), rec.getCenterY());
	      g.setFont(new Font("TimesRoman", Font.BOLD, 20));
	      
	      // Drawing time markers on clock
	      /*float hourMarkerLen = radius / 6f - 10f;
	      Shape hourMarker = new Line2D.Float(0f, hourMarkerLen - radius, 0f, -radius);
	      Shape minuteMarker = new Line2D.Float(0f, hourMarkerLen / 2f - radius, 0f, -radius);
	      AffineTransform at = AffineTransform.getRotateInstance(0d);
	      g.setStroke(new BasicStroke(2f));
	      g.setColor(Color.BLACK);
	      for (int i = 0; i < 60; i++) {
	        if (i % 5 == 0) {
	          g.draw(at.createTransformedShape(hourMarker));
	        } else {
	          g.draw(at.createTransformedShape(minuteMarker));
	        }
	        at.rotate(Math.PI / 30d);
	      }
	      
	      // draw the cardinal hour markers
	      g.drawString("9", (int)(rec.getCenterX()) - 275, (int)(rec.getCenterY()) - 145);  
	      g.drawString("3", (int)(rec.getCenterX()) - 40, (int)(rec.getCenterY()) - 145);  
	      g.drawString("12", (int)(rec.getCenterX()) - 160, (int)(rec.getCenterY()) - 260);  
	      g.drawString("6", (int)(rec.getCenterX()) - 155, (int)(rec.getCenterY()) - 25); */
	}

	public static void main(String[] args) {
	
		SwingUtilities.invokeLater(() -> {
	         JFrame f = new JFrame();
	         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	         f.setTitle("DisplayClock");
	         f.setResizable(false);
	         f.add(new DisplayClock(), BorderLayout.CENTER);
	         f.pack();
	         f.setLocationRelativeTo(null);
	         f.setVisible(true);
		         
		         });
		}
}
