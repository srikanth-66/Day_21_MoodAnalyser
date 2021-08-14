package TestCaseUC3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import Classes.MoodAnalyser;
import Classes.UC3;

class MoodAnalysisException extends Exception{
	public MoodAnalysisException(String str) {
		super(str);
	}
}

class TC3_1 {

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() throws MoodAnalysisException {
		try {
			UC3 uc3=new UC3();
			String str=uc3.analyseMood(null);
			if(str=="HAPPY") {
				throw new MoodAnalysisException("exception in string");
			}

		} catch (Exception e) {
			System.out.println("Found => :: "+e);
		}
	}

}
