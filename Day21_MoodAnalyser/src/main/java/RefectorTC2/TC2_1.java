package RefectorTC2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import Classes.UC2;

class TC2_1 {

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		UC2 uc2=new UC2();
		String str=uc2.analyseMood(null);
		assertEquals("HAPPY", str);
	}

}
