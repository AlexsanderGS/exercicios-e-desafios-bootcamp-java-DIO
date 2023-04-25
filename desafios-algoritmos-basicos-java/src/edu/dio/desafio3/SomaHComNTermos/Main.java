package edu.dio.desafio3.SomaHComNTermos;

import java.util.Scanner;

// SOBRE O DESAFIO
// Neste desafio, faça um programa que calcule o valor de H com N termos. 
// Sendo, H = 1 + 1/2 + 1/3 + 1/4 + ... + 1/N. 

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double h = 0;
		double n = sc.nextDouble();
		
		for(int i = 1; i <= n; i++) {
			h = h + 1.0 / i;	
		}
		
		System.out.println(Math.round(h));
		
		sc.close();
	}
}
