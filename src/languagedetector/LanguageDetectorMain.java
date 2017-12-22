package languagedetector;

import java.io.File;
import java.io.IOException;

import opennlp.tools.langdetect.*;
import opennlp.tools.langdetect.LanguageDetector;

public class LanguageDetectorMain {
 
	    public static void main(String[] args) throws IOException{
	    	
	    	LanguageMapper languageMapper = new LanguageMapper();
	    	
	    	// load the trained Language Detector Model file
	    	File modelFile = new File(".\\resources\\langdetect-183.bin");
	    	
	    	LanguageDetectorModel trainedModel = new LanguageDetectorModel(modelFile);
	    	
	        // load the model
	    	LanguageDetector languageDetector = new LanguageDetectorME(trainedModel);
	    	
	        // use the model for predicting the language
	    	//Spanish
	        Language[] languages = languageDetector.predictLanguages("Puedo darte ejemplos de los métodos");
	    	
	        // French
	    	//Language[] languages = ld.predictLanguages("Je peux vous donner quelques exemples de méthodes qui ont fonctionné pour moi.");
	    	
	    	// English
	    	//Language[] languages = ld.predictLanguages("I can give you some examples of methods that have worked for me.");
	    		        
	        System.out.println("Predicted language: "+ languageMapper.getLanguage(languages[0].getLang()));
	        
	        // uncomment to know confidence for rest of the languages
	       /* for(Language language:languages){
	            System.out.println(language.getLang()+"  confidence:"+language.getConfidence());
	        }*/
	    }
}
