package RefectorTC1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import Classes.MoodAnalyser;

class TC2_2 {

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		MoodAnalyser uc1=new MoodAnalyser("I am in Happy Mood");
		String check= uc1.analyseMood();
		assertEquals("HAPPY", check);	
		}

}
