package it.polito.tdp.alien;

import java.util.Map;
import java.util.TreeMap;

public class Word {
	
	//Map<String, String> dizionario=new TreeMap<>();

	private String alienWord;
	private String translation;
	
	public Word(String alienWord, String translation) {
		this.alienWord=alienWord;
		this.translation=translation;
	}
	public String getAlienWord() {
		return alienWord;
	}
	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}
	public String getTranslation() {
		return translation;
	}
	public void setTranslation(String translation) {
		this.translation = translation;
	}
	
	/*public boolean equals (Object obj) {
		
		if(this.dizionario.get((String)obj)!=null)
			return true;
		
		return false;
	}*/
	
	
}
