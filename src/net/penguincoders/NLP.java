package net.penguincoders;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.neural.rnn.RNNCoreAnnotations;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreEntityMention;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.sentiment.SentimentCoreAnnotations.SentimentAnnotatedTree;
import edu.stanford.nlp.trees.Tree;
import edu.stanford.nlp.util.CoreMap;

public class NLP 
{
	static StanfordCoreNLP pipeline;

	public static void initSentiment() 
	{
		pipeline = new StanfordCoreNLP("net/penguincoders/Sentiment/Sentiment.properties");
	}

	public static void initNER()
	{
		pipeline = new StanfordCoreNLP("net/penguincoders/NER/NER.properties");
	}
	public static String findSentiment(String input) 
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
		String sentiment[] = {"Very Negative", "Negative", "Neutral", "Positive", "Very Positive"};
		return sentiment[mainSentiment];
	}
	
	public static CoreDocument namedEntityRecognition(String input)
	{
		CoreDocument doc = new CoreDocument(input);
		pipeline.annotate(doc);
		for (CoreEntityMention em : doc.entityMentions())
		{
		      System.out.println("\t"+em.text()+"\t"+em.entityType()+"\t"+em.entityTypeConfidences());
		}
		
		return doc;
	}
}