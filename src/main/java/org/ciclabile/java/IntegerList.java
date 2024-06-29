package org.ciclabile.java;


//Vogliamo realizzare una classe che contenga un elenco di interi e che ci permetta di ciclarli (dal primo all’ultimo).
public class IntegerList {

	// Internamente alla classe vogliamo mantenere l’elenco di interi come array, no ArrayList o simili.
	private int[] intArray;
	private int counter = 0;
	
	// BONUS: Prevedere anche un costruttore che non prenda parametri
	public IntegerList() {
		
	}
	
	public IntegerList(int[] integerArray){
		//La classe deve avere un costruttore che prende come parametro un array di interi (che sarà l’elenco che viene gestito internamente)
		this.intArray = integerArray;
	
	}
	
	public int getElementoSuccessivo() {
		// (che restituisce il prossimo elemento rispetto all’ultima volta che è stato invocato. Cioè la prima volta restituisce il primo elemento, la seconda volta il secondo, …)
		counter ++;
		return this.intArray[counter-1];
	}
	public boolean hasAncoraElementi() {
		// (che deve restituire true se ci sono ancora elementi da restituire)
		boolean result = true;
		if (this.counter >= this.intArray.length) {
			result = false;
		}
		return result;
	}

	public int[] getIntArray() {
		return this.intArray;
	}
	
	// BONUS: un metodo addElemento che permetta di aggiungere un nuovo intero all’elenco da ciclare.
	
	public void addElemento(int element) {
		
		int[] copy = new int[this.intArray.length + 1];
		int i=0;
		
		for (int number : intArray) {
			copy[i] = number;
			i++;
		}
		this.intArray = copy;
		this.intArray[this.intArray.length-1]=element;
	}
	
	public static void main(String[] args) {
				
		int[] intArray = {1,2,3,4,5,6,7,8,9};
		
		IntegerList intList = new IntegerList(intArray);
		
		for (Integer integer : intList.getIntArray()) {
			System.out.println(intList.getElementoSuccessivo());
			System.out.println("ci sonno altri elementi da scorrere? = "+intList.hasAncoraElementi());
		}
		
		System.out.println("-----------------------------------------");
		
		intList.addElemento(15);
		System.out.println("ci sonno altri elementi da scorrere? = "+intList.hasAncoraElementi());
		System.out.println(intList.getElementoSuccessivo());
		System.out.println("ci sonno altri elementi da scorrere? = "+intList.hasAncoraElementi());
	}
	
}
