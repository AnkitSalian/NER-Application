package com.ankit.nerapplication.core;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import edu.stanford.nlp.pipeline.StanfordCoreNLP;

@Service
public class Pipeline {
	
	private static Properties properties;
	private static String propertiesName = "tokenize, ssplit, pos, lemma, ner";
	private static StanfordCoreNLP stanfordCoreNLP;
	
	private Pipeline() {
		
	}
	
	static {
		properties = new Properties();
		properties.setProperty("annotators", propertiesName);
	}
	
	@Bean(name = "stanfordCoreNLP")
	public static StanfordCoreNLP getInstance() {
		if(stanfordCoreNLP==null) {
			stanfordCoreNLP = new StanfordCoreNLP(properties);
		}
		return stanfordCoreNLP;
	}

}
