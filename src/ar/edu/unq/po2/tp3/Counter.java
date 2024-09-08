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
	
	public int getNumeroConMasPares() {
		int conMasPares = numeros.getFirst();
		for(int n:numeros) {
			while(n!=0) {
				if(this.cantParesDe(n) > this.cantParesDe(conMasPares) ) {
					conMasPares = n;
				}
			}
		}
		return conMasPares;
	}
	
	public int desarmaUndigito(int x) {
		return x/10 ;
	}
	
	public int cantParesDe(int x) {
		int paresHastaAhora = 0;
		while(x!=0) {
			if(x%10==0) {
				paresHastaAhora = paresHastaAhora + 1;
			}
			this.desarmaUndigito(x);
		}
		return paresHastaAhora ;
	}
	
}