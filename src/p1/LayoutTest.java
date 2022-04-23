package p1;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.*;
import javax.swing.*;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LayoutTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGbcSetValues() throws Exception {

		GridBagConstraints constraint = new GridBagConstraints();	
		
		Assertions.assertThrows(Exception.class, () -> {
			Layout.gbcSetValues(constraint, 4, 2, 6, 1.0, 2.0, "asdf");
		  });
		 
			Assertions.assertThrows(Exception.class, () -> {
				Layout.gbcSetValues(constraint, -4, 2, 6, 1.0, 2.0, "string");
			  });
			
			Assertions.assertThrows(Exception.class, () -> {
				Layout.gbcSetValues(constraint, 2, -1, 4, 3.0, 4.0, "BOTH");
			  });
			
			Assertions.assertThrows(Exception.class, () -> {
				Layout.gbcSetValues(constraint, 3, 2, -4, 5.0, 4.0, "HORIZONTAL");
			  });
			
			Assertions.assertThrows(Exception.class, () -> {
				Layout.gbcSetValues(constraint, 1, 1, 1, -1.0, -1.0, "");
			  });
			
			Assertions.assertThrows(Exception.class, () -> {
				Layout.gbcSetValues(constraint, 1, 1, 1, 1.0, -1.0, "NONE");
			  });
		
			
			Layout.gbcSetValues(constraint, 2, 1, 4, 3.0, 4.0, "BOTH");
			Layout.gbcSetValues(constraint, 2, 1, 4, 3.0, 4.0, "NONE");
			Layout.gbcSetValues(constraint, 0, 0, 0, 0, 0, "");
			GridBagConstraints c = Layout.gbcSetValues(constraint, 2, 1, 4, 3.0, 4.0, "HORIZONTAL");
			assertEquals(constraint, c);
			
	}

	@Test
	void testSetBackgroundColor() {
		
		JFrame testFrame = new JFrame("Test");
		Layout.setBackgroundColor(testFrame);
		Color c = testFrame.getContentPane().getBackground();
		Color expected = new javax.swing.plaf.ColorUIResource(239, 245, 243);
		assertEquals(expected, c);
		
	}

	@Test
	void testSetButtonColors() {
		JButton testButton = new JButton("Test Button");
		 
		Layout.setButtonColors(testButton);
		
		Font f = testButton.getFont();
		String font = f.toString();
		String expected1 = "java.awt.Font[family=SansSerif,name=Helvetica,style=bold,size=13]";
		assertEquals(expected1, font);
		
		Color c1 = testButton.getForeground();
		String color1 = c1.toString();
		String expected2 = "java.awt.Color[r=255,g=255,b=255]";
		assertEquals(expected2, color1);
		
		Color c2 = testButton.getBackground();
		String color2 = c2.toString();
		String expected3 = "java.awt.Color[r=91,g=146,b=121]";
		assertEquals(expected3, color2);
		
		
	}

	@Test
	void testSetPanelColors() {
		JLabel testLabel = new JLabel("Test Label");
		 
		Layout.setPanelColors(testLabel, 91, 146, 121);
		
		Font f = testLabel.getFont();
		String font = f.toString();
		String expected1 = "java.awt.Font[family=SansSerif,name=Helvetica,style=bold,size=13]";
		assertEquals(expected1, font);
		
		Color c1 = testLabel.getForeground();
		String color1 = c1.toString();
		String expected2 = "java.awt.Color[r=0,g=0,b=0]";
		assertEquals(expected2, color1);
		
		Color c2 = testLabel.getBackground();
		String color2 = c2.toString();
		String expected3 = "java.awt.Color[r=91,g=146,b=121]";
		assertEquals(expected3, color2);
		
	}

	@Test
	void testSetDashTitle() {
		
		JLabel testLabel = new JLabel("Test Label");
		 
		Layout.setDashTitle(testLabel);
		
		Font f = testLabel.getFont();
		String font = f.toString();
		String expected1 = "java.awt.Font[family=SansSerif,name=Helvetica,style=bold,size=15]";
		assertEquals(expected1, font);
		
		Color c1 = testLabel.getForeground();
		String color1 = c1.toString();
		String expected2 = "java.awt.Color[r=30,g=47,b=39]";
		assertEquals(expected2, color1);

	
	}

	@Test
	void testSetAccountMgmtColors() {
		JButton testButton = new JButton("Test Button");
		 
		Layout.setAccountMgmtColors(testButton);
		
		Font f = testButton.getFont();
		String font = f.toString();
		String expected1 = "java.awt.Font[family=SansSerif,name=Helvetica,style=bold,size=13]";
		assertEquals(expected1, font);
		
		Color c1 = testButton.getForeground();
		String color1 = c1.toString();
		String expected2 = "java.awt.Color[r=255,g=255,b=255]";
		assertEquals(expected2, color1);
		
		Color c2 = testButton.getBackground();
		String color2 = c2.toString();
		String expected3 = "java.awt.Color[r=69,g=110,b=91]";
		assertEquals(expected3, color2);
	}

}
