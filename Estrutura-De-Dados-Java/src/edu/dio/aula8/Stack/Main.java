package edu.dio.aula8.Stack;

import java.util.Stack;

public class Main {

	public static void main(String args[]){

        Stack<Carro> stackCarros = new Stack<>();

        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Chevrolet"));
        stackCarros.push(new Carro("Fiat"));
        
        System.out.println(stackCarros);
        
        System.out.println();
        System.out.println("------- Metodo POP -------");
        System.out.println(stackCarros.pop());
        System.out.println(stackCarros);

        System.out.println();
        System.out.println("------- Metodo PEEK -------");
        System.out.println(stackCarros.peek());
        System.out.println(stackCarros);

        System.out.println();
        System.out.println("------- Metodo EMPTY -------");
        System.out.println(stackCarros.empty());

    }

}
