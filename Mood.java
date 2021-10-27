package sample;

public class Mood {
	public static void main(String[] args) {
		MoodAnalyser moodAnalyser =new MoodAnalyser ();
		String mood= moodAnalyser.analyseMood("I am in sad Mood ");
		String expectedValue="sad";
		System.out.println(mood);
		
	}

}
