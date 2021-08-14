package TCFor1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import Classes.UC1;

class TC1_2 {

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		UC1 uc1=new UC1();
		String check= uc1.analyseMood("I am in Any Mood");
		assertEquals("HAPPY", check);
	}

}
