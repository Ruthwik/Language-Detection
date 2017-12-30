# Language Detection using Apache OpenNLP

This is a Java project for Language Detection using Apache OpenNLP.

The [Apache OpenNLP](https://opennlp.apache.org/) library is a machine learning based toolkit for the processing of natural language text.

 
### Language Detector

The Apache OpenNLP team announced the release of Language Detector Model 1.8.3 for Apache OpenNLP 1.8.3.The Language Detector Model can detect 103 languages and outputs ISO 639-3 codes.

This model is trained for and works well with longer texts that have at least 2 sentences or more from the same language.

More information about Language Detector Model can be found in the [README.txt](https://www.apache.org/dist/opennlp/models/langdetect/1.8.3/README.txt).
The model effectiveness details can be found in the following [report](https://www.apache.org/dist/opennlp/models/langdetect/1.8.3/langdetect-183.bin.report.txt)

# Use
### How to build a Language Detector

Following are the steps to use Language Detector from Apache Opennlp.
Language Detector Model is used and therefore the traning step is not required.

The steps for traning an own model can be found [here](https://opennlp.apache.org/docs/1.8.3/manual/opennlp.html#tools.langdetect).

### How to load the model

```Java
// load the trained Language Detector Model file
File modelFile = new File(".\\resources\\langdetect-183.bin");
	    	
LanguageDetectorModel trainedModel = new LanguageDetectorModel(modelFile);
	    	
// load the model
LanguageDetector languageDetector = new LanguageDetectorME(trainedModel);
```


### How to predict the language

Input the sentence of a language.
```Java
Language[] languages = languageDetector.predictLanguages("Puedo darte ejemplos de los métodos");
System.out.println("Predicted language: "+ languages[0].getLang());
```

The list contains languages and respective confidences. The first element in the list gives the language with highest confidence which is the required one.

## Tools used

 * Java 1.8
 * opennlp-tools-1.8.3
 * Eclipse

LICENSE
-------------------------

The OpenNLP is released under an Apache Licence, version 2.0
(http://www.apache.org/licenses/LICENSE-2.0.html).
