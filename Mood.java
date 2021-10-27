package sample;

public class Mood {
	public static void main(String[] args)
	{
		MoodAnalyser moodAnalyser =new MoodAnalyser ("I am in sad Mood ");
		String mood= moodAnalyser.analyseMood();
		System.out.println(mood);
		
	}

}
