package p1.testing;

import p1.CheckTime;
import p1.DisplayClock;
import p1.EditReminder;
import java.awt.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;



class ClockTesting {

	DisplayClock dc;
	EditReminder er;
	
	@BeforeEach
	void setUp() throws Exception {
		dc = new DisplayClock();
		er = new EditReminder();
	}

	@AfterEach
	void tearDown() throws Exception {
		dc = null;
		er = null;
	}

	@Test
	void testGetTime() {
		CheckTime ct = new CheckTime();
		String time = ct.getTime();
		System.out.println(time);
		//fail("Not yet implemented");
	}
	
	@Test
	void testCalcDimensions() {
		
		float[] arr = dc.calcDimensions();
		float[] val = {0.10471976f,0.5235988f,1.5707964f}; //
		
		Assertions.assertArrayEquals(arr, val, 0.0f);
		System.out.println("testCalcDimensions successful");
		/*try {
		Assertions.assertArrayEquals(val, arr, 0.0f);
		System.out.println("testCalcDimensions successful");
		} catch(Exception e) {
			System.out.println("Test failed");
		}*/
		//Assertions.assert(val, arr, 0.0f);
		Throwable exception = Assertions.assertThrows(AssertionFailedError.class, () ->
		{
			float[] res = {0.10471976f,0.5235988f, 2f};
			Assertions.assertArrayEquals(res, arr, 0.0f);
		});
		//System.out.println(exception.getMessage());
		Assertions.assertEquals("array contents differ at index [2], expected: <2.0> but was: <1.5707964>", exception.getMessage());
		System.out.println("End of test");
		
	}
	
	@Test
	void Title() {
		GridBagConstraints gbc = new GridBagConstraints();
		gbc = er.Title(gbc);
		int f = gbc.ipady;
		int expected = 5;
		if(expected == f) {
			System.out.println("Test successful");
		}
		else {
			System.out.println("Test failed");
		}
		//assertEquals(expected, f);
	}
	
	@Test
	void drawClockFace() {
		Graphics2D g = null;
		g = dc.drawClockFace(g);
		
	}

}
