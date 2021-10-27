package sample;

public class Mood {
	public static void main(String[] args)
	{
		
		MoodAnalyser moodAnalyser =new MoodAnalyser ("I am in Happy Mood ");
		String mood= moodAnalyser.analyseMood();
		System.out.println(mood);
		
	}

}
