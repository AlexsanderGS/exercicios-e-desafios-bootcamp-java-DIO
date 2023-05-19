package edu.dio.desafio4.EspacosEVogais;

import java.util.Scanner;

/*Jorginho é professor do primário de uma determinada escola. 
  Ele tem 100000 alunos e precisa criar um programa que verifica quantos espaços em branco 
  e quantas vogais existem em uma determinada string de entrada que os alunos entregaram 
  na avaliação final. Ajude-o a realizar essa tarefa antes que o tempo para entrega-la 
  no fim do semestre acabe!
 

 Entrada
 A entrada será uma frase no formato de string. 

 Saída
 A saída deverá retornar quantos espaços em branco e quantas vogais existem na determinada string, 
 conforme exemplo abaixo:
 
 */

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String frase = sc.nextLine();
		char[] letras = frase.toCharArray();
		String[] fraseSplit = frase.split(" ");
		char[] vogais = { 'a', 'e', 'i', 'o', 'u' };
		int espacosEmBranco = fraseSplit.length - 1, quantVogais = 0;

		for (int i = 0; i < letras.length; i++) {

			for (int v = 0; v < vogais.length; v++) {

				if (vogais[v] == Character.toLowerCase(letras[i])) {

					quantVogais++;
				}
			}
		}

		System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);

		sc.close();
	}
}
