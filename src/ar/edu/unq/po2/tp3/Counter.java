package ar.edu.unq.po2.tp3;

import java.util.List;
import java.util.ArrayList;

public class Counter {
	
	private List<Integer>numeros;
	
	public Counter() {
		this.numeros= new ArrayList <Integer>();
		
	}
	
	public void addNumber(int n) {
		this.numeros.add(n);
	}
	
	public int lemght() {
		return this.numeros.size();
	}
	
	public int getEvenOcurrences() {
		int contador=0; 
		for(int n:this.numeros) {
			if(n%2==0) {
				contador=contador+1;
			}
		}
		return contador;
	}
	
	public int getOddOcurrences() {
		int contador=0; 
		for(int n:this.numeros) {
			if(n%2!=0) {
				contador=contador+1;
			}
		}
		return contador;
	}
	
	public int getMultiplesOcurrences(int x) {
		int contador=0; 
		for(int n:this.numeros) {
			if(n%x==0) {
				contador=contador+1;
			}
		}
		return contador;
	}
	
	public int getNumeroConMasPares(ArrayList<Integer>listaDeNumeros) {
		int conMasPares = listaDeNumeros.getFirst();
		
		return 0;
		
	}
	
}