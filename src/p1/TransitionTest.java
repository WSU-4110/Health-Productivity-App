package p1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TransitionTest {

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
	void testsetSize() {
		JunitTesting test= new JunitTesting();
		int output = test.size(700);
		assertEquals(700, output);
		
	}
	
	@Test
	void testadd() {
		JunitTesting test = new JunitTesting();
		int output = test.add(10);
		assertEquals(10, output);

	}
	

	@Test
	void testsetTitle() {
		JunitTesting test = new JunitTesting();
		String result = test.setTitle("Health","App");
		assertEquals("HealthApp", result);
		
	}
	
	@Test
	void testsetDefaultCloseOperation() {
		JunitTesting test = new JunitTesting();
		String output = test.setDefaultCloseOperation("EXIT_ON_CLOSE");
		assertEquals("EXIT_ON_CLOSE", output);
		
	}

	@Test
	void testsetLocationRelativeTo() {
		JunitTesting test = new JunitTesting();
		String output = test.setLocationRelativeTo("one");
		assertEquals("one", output);
		
	}


	@Test
	
	void testsetJMenuBar() {
		JunitTesting test = new JunitTesting();
		String output = test.setJMenuBar("R");
		assertEquals("R", output);
		
	}

	
}
