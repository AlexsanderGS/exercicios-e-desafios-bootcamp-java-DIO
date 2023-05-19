package edu.dio.desafio5.TaxaDeIR;

import java.util.Locale;
import java.util.Scanner;

/*Você terá o desafio de ler um valor com duas casas decimais, 
  equivalente ao salário de uma pessoa de Loli. Em seguida, 
  calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
  Renda:
  De 0.00 a R$ 2000.00         --> Isento
  De R$ 2000.01 até R$ 3000.00 --> 8%
  De R$ 3000.01 até R$ 4500.00 --> 18%
  Acima de R$ 4500.00          --> 28%
  
  Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, 
  pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. 
  No exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, 
  o que resulta em R$ 80.36 no total. O valor deve ser impresso com duas casas decimais.
  */

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
	    double renda = leitor.nextDouble();
	        
	    if (renda >= 0 && renda <= 2000) {
        	System.out.println("Isento");
        } else if (renda > 2000 && renda <= 3000) {
        	System.out.println(String.format("R$ %.2f", (renda - 2000) * 0.08));
        } else if (renda > 3000 && renda <= 4500) {
        	System.out.println(String.format("R$ %.2f", ((renda - 3000)  * 0.18) + 80));
        } else {
        	System.out.println(String.format("R$ %.2f", ((renda - 4500) * 0.28) + 350));
        }
	    
	    leitor.close();
    }
}

