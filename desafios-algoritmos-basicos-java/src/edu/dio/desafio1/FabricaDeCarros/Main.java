package edu.dio.desafio1.FabricaDeCarros;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int custoFabrica = scan.nextInt();
		int porcentagemDistribuidor = scan.nextInt();
		int percentualImpostos = scan.nextInt();

		int custoConsumidor;

		int distribuidor;
		int valorImpostos;

	    // TODO: Implemente uma condição que calcule a porcentagem do distribuidor e dos impostos:
		
		distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
		valorImpostos = (custoFabrica * percentualImpostos) / 100;
		
		custoConsumidor = custoFabrica + distribuidor + valorImpostos;
		
		System.out.println(custoConsumidor);
		
		scan.close();
	}
}
