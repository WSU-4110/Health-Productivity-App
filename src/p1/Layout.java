package p1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;

public abstract class Layout {
	
	public static GridBagConstraints gbcSetValues(GridBagConstraints constraint, int gridx, int gridy, int ipady, double weightx, double weighty, String direction) {
		constraint.gridx = gridx;
		constraint.gridy = gridy;
		
		//Internal padding
		constraint.ipady = ipady;
		
		//Spacing
		constraint.weightx = weightx;
		constraint.weighty = weighty;
		
		//As window resizes, components stretch horizontally
		if (direction == "HORIZONTAL") {
			constraint.fill = GridBagConstraints.HORIZONTAL;
		}
		else if (direction == "BOTH") {
			constraint.fill = GridBagConstraints.BOTH;
		}
		else if (direction == "NONE") {
			constraint.fill = GridBagConstraints.NONE;
		}
		
		return constraint;
	}
	
	//Background color
	public static Color backgroundColor = new Color(239, 245, 243);
	
}
