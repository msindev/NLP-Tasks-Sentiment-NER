package net.penguincoders;

import java.util.Scanner;

public class SimpleNLP 
{
	public static void main(String args[])
	{
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter text for analysis: ");
		String s = ob.nextLine();
		NLP.initSentiment();
		System.out.println("Sentiment Score: "+NLP.findSentiment(s));
		NLP.initNER();
		NLP.namedEntityRecognition(s);
		ob.close();
	}
}
