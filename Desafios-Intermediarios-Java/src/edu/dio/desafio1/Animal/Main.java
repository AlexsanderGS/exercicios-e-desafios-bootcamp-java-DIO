package edu.dio.desafio1.Animal;

import java.util.Scanner;

/*
  Neste problema, você deverá ler 3 palavras que definem o tipo de animal possível segundo o 
  esquema abaixo, da esquerda para a direita.  
  Em seguida conclua qual dos animais seguintes foi escolhido, através das três palavras fornecidas.
   
  https://resources.urionlinejudge.com.br/gallery/images/problems/UOJ_1049_b.png
   
  Entrada
  A entrada contém 3 palavras, uma em cada linha, necessárias para identificar 
  o animal segundo a figura acima, com todas as letras minúsculas.

  Saída
  Imprima o nome do animal correspondente à entrada fornecida.
  */

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String AN1, AN2, AN3;

		AN1 = sc.nextLine();
		AN2 = sc.nextLine();
		AN3 = sc.nextLine();

		if (AN1.equalsIgnoreCase("vertebrado")) {
			if (AN2.equalsIgnoreCase("ave")) {
				if (AN3.equalsIgnoreCase("carnivoro")) {
					System.out.println("aguia");
				} else {
					System.out.println("pomba");
				}
			} else {
				if (AN3.equalsIgnoreCase("onivoro")) {
					System.out.println("homem");
				} else {
					System.out.println("vaca");
				}
			}
		} else {
			if (AN2.equalsIgnoreCase("inseto")) {
				if (AN3.equalsIgnoreCase("hematofago")) {
					System.out.println("pulga");
				} else {
					System.out.println("lagarta");
				}
			} else {
				if (AN3.equalsIgnoreCase("hematofago")) {
					System.out.println("sanguessuga");
				} else {
					System.out.println("minhoca");
				}
			}

		}

		sc.close();
	}
}
