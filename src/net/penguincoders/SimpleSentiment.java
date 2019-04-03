import java.util.Scanner;

public class SimpleSentiment 
{
	public static void main(String args[])
	{
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter text for analysis: ");
		String s = ob.nextLine();
		NLP.init();
		System.out.println("Sentiment Score: "+NLP.findSentiment(s));
	}
}
