# NLP Tasks- Sentiment Analysis & Named Entity Recognition

The project is seperated in two individual components-

 (a) Sentiment Analysis and Named Entity Recognition – This project uses Stanford’s CoreNLP libraries to solve two Natural Language Processing Tasks namely, Sentiment Analysis and Named Entity Recognition. Sentiment Analysis provides five classes of Sentiment ranging from Very Negative (Score: 0) to Very Positive(Score : 4).

(b) Named Entity Recognition takes a document and outputs a classification based on Location, Person and Organization name.

## Requirements
Install JDK v11 and JavaFX prior to running this application.
Also you need to add the JavaFX VM options to each file which uses JavaFX. The Eclipse IDE would guide you about that.
The libraries are present in /lib folder, just add all the libraries to your Project's classpath.
Also, you need to dowload StanfordCoreNLP models file. The link is given here - [Stanford CoreNLP](http://nlp.stanford.edu/software/stanford-corenlp-full-2018-10-05.zip)
After you get the models file, copy it in /lib folder and add it to classpath of your project.
## Usage
To run the main program, Run the file named as NLPUI.java present in /net/penguincoders/ package.
You can also run individual components by-
Sentiment Analysis - Run file named as SentimentUI.java present in /net/penguincoders/Sentiment package.
Named Entity Recognition - Run file named as NERUI.java present in /net/penguincoders/NER package.

## Screenshots
### NLP Tasks Welcome Screen
![NLP Tasks Welcome Screen](https://github.com/mohitwildbeast/NLP-Tasks-Sentiment-NER/blob/master/images/NLP%20Taks%20Welcome%20Screen.png)

### Sentiment Analysis
![Sentiment Analysis](https://github.com/mohitwildbeast/NLP-Tasks-Sentiment-NER/blob/master/images/Sentiment%20Analysis.png)

### Keyword Extraction NER Text Input
![Keyword Extraction NER Text Input](https://github.com/mohitwildbeast/NLP-Tasks-Sentiment-NER/blob/master/images/Keyword%20Extraction%20NER%20Text%20Input.png)

### Keyword Extraction NER Text Results
![Keyword Extraction NER Text Results](https://github.com/mohitwildbeast/NLP-Tasks-Sentiment-NER/blob/master/images/Keyword%20Extraction%20NER%20Text%20Results.png)
