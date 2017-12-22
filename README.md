# Language Detection using Apache OpenNLP
============================================================

This is a Java project for Language Detection in Apache OpenNLP.

The Apache OpenNLP library is a machine learning based toolkit for the processing of natural language text.

 
### Language Detector
The OpenNLP Language Detector can detect the language of the text. The Apache OpenNLP team announced the release of Language Detector Model 1.8.3 for Apache OpenNLP 1.8.3.
The Language Detector Model can detect 103 languages and outputs ISO 639-3 codes.

This model is trained for and works well with longer texts that have at least 2 sentences or more from the same language.

More information about this release can be found in the [README.txt](https://www.apache.org/dist/opennlp/models/langdetect/1.8.3/README.txt)


# Use
### How to build Language Detector

Following are the steps to learn how to use Language Detector from Apache Opennlp.
Language Detector Model is used and therefore the traning step is skipped

### How to load the model

```Java
// load the trained Language Detector Model file
File modelFile = new File(".\\resources\\langdetect-183.bin");
	    	
LanguageDetectorModel trainedModel = new LanguageDetectorModel(modelFile);
	    	
// load the model
LanguageDetector languageDetector = new LanguageDetectorME(trainedModel);
```


### How to predict the language

```Java
Language[] languages = languageDetector.predictLanguages("Puedo darte ejemplos de los métodos");
```