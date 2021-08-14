package Classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MoodAnalyser {
	String message=null;

	public MoodAnalyser() {

	}


	public  MoodAnalyser(String message) {
		this.message = message;
		int flag1 = 0, flag2 = 0;

		Pattern pattern = Pattern.compile("happy|Happy");
		Matcher matcher = pattern.matcher(message);
		while (matcher.find()) {
			flag1 = 1;
		}

		pattern = Pattern.compile("sad|Sad");
		matcher = pattern.matcher(message);
		while (matcher.find()) {
			flag2 = 1;
		}

		if (flag1 == 1) {
			System.out.println( "HAPPY");
		}
		if (flag2 == 1) {
			System.out.println("SAD");
		} 

		if(flag1==0&&flag2==0){
			System.out.println( "HAPPY");
		}
	}

	public String analyseMood() {
		int flag1=0,flag2=0;
		Pattern pattern =Pattern.compile("happy|Happy");
		Matcher matcher=pattern.matcher(message);
		while(matcher.find()) {
			flag1=1;
		}

		pattern =Pattern.compile("sad|Sad");
		matcher=pattern.matcher(message);
		while(matcher.find()) {
			flag2=1;
		}

		if(flag1==1) {
			return "HAPPY";
		}
		if(flag2==1) {
			return "SAD";
		}else {
			return "HAPPY";
		}


	}

} 