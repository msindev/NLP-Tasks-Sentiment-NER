import java.util.ArrayList;

public class WhatToThink 
{
	public static void main(String[] args) 
	{
		String topic = "Happy Birthday";
		int count = 0;
		ArrayList<String> tweets = TweetManager.getTweets(topic);
		System.out.println("tweets retrieved Done!!!");
		NLP.init();
		System.out.println(" init Done!!!");
		for(String tweet : tweets) 
		{
			System.out.println(tweet + " : " + NLP.findSentiment(tweet));
			count++;
		}
		System.out.println("Done!!! Total = "+count);
	}
}