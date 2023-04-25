package edu.dio.desafio4.Fibonacci;

import java.util.Scanner;

// SOBRE O DESAFIO
// A seguinte sequência de números 0 1 1 2 3 5 8 13 21... é conhecida como série de Fibonacci. 
// Nessa sequência, cada número, depois dos 2 primeiros, é igual à soma dos 2 anteriores. 
// Escreva um algoritmo que leia um inteiro N (N < 46) e mostre os N primeiros números dessa série.

public class Main {

	public static void main(String[] args) {
	      
        Scanner leitor = new Scanner(System.in);
        
        int N = leitor.nextInt();
        
        int aux, b = 0, a = 1;
        
        for (int i = 1; i <= N; i++) {
          if (i == N) {
        	  System.out.println(b);
          } else {    
        	  System.out.print(b + " "); 
        	  aux = a;
        	  a = a + b;
        	  b = aux;
          } 

        
        }
        
        leitor.close();
    }

}
