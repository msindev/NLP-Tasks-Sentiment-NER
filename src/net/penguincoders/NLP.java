package net.penguincoders;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.neural.rnn.RNNCoreAnnotations;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.sentiment.SentimentCoreAnnotations.SentimentAnnotatedTree;
import edu.stanford.nlp.trees.Tree;
import edu.stanford.nlp.util.CoreMap;

public class NLP 
{
	static StanfordCoreNLP pipeline;

	public static void init() 
	{
		pipeline = new StanfordCoreNLP("net/penguincoders/MyPropFile.properties");
	}

	public static int findSentiment(String input) 
	{
		int mainSentiment = 0;
		if (input != null && input.length() > 0)
		{
			int longest = 0;
			Annotation annotation = pipeline.process(input);
			for (CoreMap sentence : annotation.get(CoreAnnotations.SentencesAnnotation.class)) 
			{
				Tree tree = sentence.get(SentimentAnnotatedTree.class);
				int sentiment = RNNCoreAnnotations.getPredictedClass(tree);
				String partText = sentence.toString();
				if (partText.length() > longest)
				{
					mainSentiment = sentiment;
					longest = partText.length();
				}
			}
		}
		return mainSentiment;
	}
}