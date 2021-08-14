package Classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC2 {

	public String analyseMood(String str) {
		try {
			int flag1 = 0, flag2 = 0;
			Pattern pattern = Pattern.compile("happy|Happy");
			Matcher matcher = pattern.matcher(str);
			while (matcher.find()) {
				flag1 = 1;
			}

			pattern = Pattern.compile("sad|Sad");
			matcher = pattern.matcher(str);
			while (matcher.find()) {
				flag2 = 1;
			}

			if (flag1 == 1) {
				return "HAPPY";
			}
			if (flag2 == 1) {
				return "SAD";
			} else {
				return "HAPPY";
			}

		}catch (Exception e) {
			System.out.println("exception found :: "+e);
			return "HAPPY";
		}

	}

}
