package org.ciclabile.java;

import java.util.ArrayList;

public class IntegerList {

	
	private ArrayList<Integer> integerList = new ArrayList<Integer>();
	private int counter = 0;
	
	public IntegerList(int[] integerArray){
		for(int number : integerArray) {
			this.integerList.add(number);
		}
		//La classe deve avere un costruttore che prende come parametro un array di interi (che sarà l’elenco che viene gestito internamente)
	}
	
	public int getElementoSuccessivo() {
		// (che restituisce il prossimo elemento rispetto all’ultima volta che è stato invocato. Cioè la prima volta restituisce il primo elemento, la seconda volta il secondo, …)
		counter ++;
		return this.integerList.get(counter-1);
	}
	public boolean hasAncoraElementi() {
		// (che deve restituire true se ci sono ancora elementi da restituire)
		boolean result = true;
		if (this.counter >= this.integerList.size()) {
			result = false;
		}
		return result;
	}

	public ArrayList<Integer> getList() {
		return this.integerList;
	}
	
	
	public static void main(String[] args) {
		
		
		int[] intArray = {1,2,3,4,5,6,7,8,9};
		
		IntegerList intList = new IntegerList(intArray);
		
		for (Integer integer : intList.getList()) {
			System.out.println(intList.getElementoSuccessivo());
			System.out.println("ci sonno altri elementi da scorrere? = "+intList.hasAncoraElementi());
		}
		
	}
	
}
