package sample;

public class MoodAnalyser {

	public String analyseMood(String msg) {
		if(msg.contains("sad")) 
		{
			return "sad";
		}
		else {
		return "Happy";
		}
		
	}

}
