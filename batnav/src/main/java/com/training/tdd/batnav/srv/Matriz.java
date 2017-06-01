package com.training.tdd.batnav.srv;
import java.util.Scanner; //el programa usa la clase escaner 
public class Matriz { 

	public Matriz() { 
	} 
	public static void main (String[] args) {	 
		Scanner entrada=new Scanner(System.in); 

		int matriz[][]=new int [10][10]; //definir y crear matriz de 10x10 
		int num; 
		for(int n=0;n<matriz.length;n++) 
		{ 
			for(int n1=0;n1<matriz.length;n1++) 
			{ 
				System.out.println("Dame el numero de la "+(n+1)+" fila y "+(n1+1)+" columna"); 
				matriz[n][n1]=entrada.nextInt(); 
			} 


		} 
		System.out.println ("Los valores de la matriz son:\n"); 
		for(int n=0;n<matriz.length;n++) 
		{ 
			for(int n1=0;n1<matriz.length;n1++) 
			{ 
				System.out.println (matriz[n][n1]); 

			} 


		} 

	} 

}