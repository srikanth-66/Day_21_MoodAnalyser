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

class TC3_2 {


	@Test
	void test() throws MoodAnalysisException {
		try {
			UC3 uc3=new UC3();
			String str=uc3.analyseMood(" ");
			if(str=="HAPPY") {
				throw new MoodAnalysisException("empty string");
			}

		} catch (Exception e) {
			System.out.println("Found => :: "+e);
		}
	}

}
