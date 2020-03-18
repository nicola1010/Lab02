package it.polito.tdp.alien;

import java.util.Map;
import java.util.TreeMap;

public class AlienDictionary {

	Map<String, Word> map_diz=new TreeMap<String, Word>();
	//LinkedList<Word> list_diz=new LinkedList<>();
	
	public void addWord(String alienWord, String translation) {
		
		this.map_diz.put(alienWord, new Word(alienWord, translation));
	//	this.list_diz.add(new Word(alienWord, translation));
		
	}
	
	public String translateWord(String alienWord) {
		
		if(this.map_diz.get(alienWord)!=null)
			return this.map_diz.get(alienWord).getTranslation();

		return null;
	}
}
