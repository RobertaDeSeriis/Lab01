package it.polito.tdp.parole.model;

import java.util.*; 

public class Parole {
	private List <String> parole; 
	
	//l'arrayList ci mette più tempo rispetto alla linkedList, quindi la LinkedList è più efficiente
	public Parole() {
		parole= new ArrayList<String>(); 
	}
	
	public void addParola(String p) {
		parole.add(p); 
	}
	
	public List<String> getElenco() {
		List <String> paroleOrd= new LinkedList <String>(parole); 
		Collections.sort((paroleOrd),String.CASE_INSENSITIVE_ORDER); //per rende case insesitive la stringa 
		return paroleOrd;
	}
	
	public void reset() {
		parole.clear();
	}

	public void cancella(String p) {
		parole.remove(p);
	}
	
	public void tempo() {
		
	}
}
