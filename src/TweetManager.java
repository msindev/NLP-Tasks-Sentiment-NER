import java.util.ArrayList;
import java.util.List;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class TweetManager 
{
	public static ArrayList<String> getTweets(String topic) 
	{
		int count = 0;
		Twitter twitter = new TwitterFactory().getInstance();
		ArrayList<String> tweetList = new ArrayList<String>();
		try 
		{
			Query query = new Query(topic);
			QueryResult result;
			do 
			{
				result = twitter.search(query);
				List<Status> tweets = result.getTweets();
				count+=1;
				for (Status tweet : tweets) 
				{
					tweetList.add(tweet.getText());
				}
			} 
			while (count != 1);
		} 
		catch (TwitterException te) 
		{
			te.printStackTrace();
			System.out.println("Failed to search tweets: " + te.getMessage());
		}
		return tweetList;
	}
}