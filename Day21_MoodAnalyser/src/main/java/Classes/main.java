package Classes;

public class main {
	public static void main(String[] args) {
		//creating object for uc1
		UC1 moodAnalyser = new UC1();
		System.out.println(moodAnalyser.analyseMood("sad"));
		System.out.println(moodAnalyser.analyseMood("happy"));
		//creating refector object
		MoodAnalyser analyser=new MoodAnalyser("Sad");
		System.out.println(analyser.analyseMood());

		UC2 uc2 =new UC2();

		uc2.analyseMood(null);
		UC3 uc3=new UC3();
		System.out.println(uc3.analyseMood("i am sad"));


	}
}
