package p1;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public abstract class Layout {
	
	public static GridBagConstraints gbcSetValues(GridBagConstraints constraint, int gridx, int gridy, int ipady, 
			double weightx, double weighty, String direction) throws Exception {
		
		if(gridx >= 0 
				&& gridy >= 0) {
			constraint.gridx = gridx;
			constraint.gridy = gridy;
		} else {
			throw new Exception("Grid X / Grid Y must be greater than 0");
		}
		
		if(ipady >= 0) {
			constraint.ipady = ipady;
		} else {
			throw new Exception("IPad Y must be greater than 0");
		}
		
		if (weightx >= 0 
				&& weighty >= 0) {
			constraint.weightx = weightx;
			constraint.weighty = weighty;
		} else {
			throw new Exception("Weight X / Weight Y must be greater than 0");
		}
					
		if (direction == "HORIZONTAL") {
			constraint.fill = GridBagConstraints.HORIZONTAL;
			return constraint;
		}
		else if (direction == "BOTH") {
			constraint.fill = GridBagConstraints.BOTH;
			return constraint;
		}
		else if (direction == "NONE") {
			constraint.fill = GridBagConstraints.NONE;
			return constraint;
		}
		else if (direction == "") {
			return constraint;
		}
		else {
			throw new Exception("Not a valid string");
		}
		
	}
	 
	//Background color
	public static Color backgroundColor = new Color(239, 245, 243);
	
	public static void setBackgroundColor(JFrame frame) {
		frame.getContentPane().setBackground(backgroundColor);
	}
	
	//Buttons
	public static void setButtonColors(JButton jb) {
		jb.setFont(new Font("Helvetica", Font.BOLD, 13));
		jb.setForeground(Color.WHITE);
		jb.setBackground(new Color(91,146,121));
	}
	
	//Panels
	public static void setPanelColors(JLabel jl, int r, int g, int b) {
		jl.setFont(new Font("Helvetica", Font.BOLD, 13));
		jl.setForeground(Color.BLACK);
		jl.setOpaque(true);
		jl.setBackground(new Color(r, g, b));
		//jl.setBackground(new Color(91,146,121));
	}
	
	public static void setDashTitle(JLabel jl) {
		jl.setFont(new Font("Helvetica", Font.BOLD, 15));
		jl.setForeground(new Color(30, 47, 39));
	}
	
	public static void setAccountMgmtColors (JButton jb) {
		jb.setFont(new Font("Helvetica", Font.BOLD, 13));
		jb.setForeground(Color.WHITE);
		jb.setBackground(new Color(69, 110, 91));
	}
	
}
