package edu.dio.desafio3.Triangulo;

import java.util.Locale;
import java.util.Scanner;

/* 	Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. 
	Em caso positivo, calcule o perímetro do triângulo (soma de todos os lados) e apresente a mensagem:
	Perimetro = XX.X

	Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, 
	mostrando a mensagem:
	Area = XX.X

	Fórmula da área de um trapézio: AREA = ((A + B) x C) / 2

	Entrada
	A entrada contém três valores reais.

	Saída
	O resultado deve ser apresentado com uma casa decimal. */

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		double A = leitor.nextDouble();
		double B = leitor.nextDouble();
		double C = leitor.nextDouble();
		
		double maior = 0.0;
		double soma = 0.0;
		
		if(A + B > C && A + C > B && B + C > A) {
			soma = A + B + C;
			System.out.printf("Perimetro = %.1f", soma);
		}else {
			maior = (A + B) * C / 2.0;
			System.out.printf("Area = %.1f", maior);
		}
		
		leitor.close();
	}
}
