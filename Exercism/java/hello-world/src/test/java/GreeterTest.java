import org.junit.Test;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class GreeterTest {

	@Test
	public void testThatGreeterReturnsTheCorrectGreeting() {
		assertEquals("Hello, World!", new Greeter().getGreeting());
	}

}
