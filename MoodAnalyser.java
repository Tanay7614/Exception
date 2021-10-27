package sample;

public class MoodAnalyser {
    String msg;
	
    public MoodAnalyser(String msg)
    {
		this.msg=msg;
	}
	
	public String analyseMood() {
		try {
		if(msg.contains("sad")) 
		{
			return "sad";
		}
		else
		{
		return "Happy";
		}
		}catch(NullPointerException e) {
		  return "Happy";	
		}
		
		
	}

}
