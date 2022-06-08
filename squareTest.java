package testpro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class squareTest {

	@Test
	void test() {
		JUnitTesting obj=new JUnitTesting();
		int output=obj.square(2);
		assertEquals(4,output);
	}

}
