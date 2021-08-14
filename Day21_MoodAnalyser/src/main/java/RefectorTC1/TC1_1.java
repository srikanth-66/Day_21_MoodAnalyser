package RefectorTC1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import Classes.MoodAnalyser;
import Classes.UC1;

class TC1_1 {

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		MoodAnalyser uc1=new MoodAnalyser("I am in Sad Mood");
		String check= uc1.analyseMood();
		assertEquals("SAD", check);
	}

}
