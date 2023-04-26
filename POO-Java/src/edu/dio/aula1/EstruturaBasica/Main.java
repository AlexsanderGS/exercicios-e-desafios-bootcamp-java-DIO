package edu.dio.aula1.EstruturaBasica;

public class Main {

	public static void main(String[] args) {

        Carro carro1 = new Carro();

        System.out.println("Primeiro Carro: ");
        carro1.setCor("Azul");
        carro1.setModelo("BMW Série 3");
        carro1.setCapacidadeTanque(59);

        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Cor: " + carro1.getCor());
        System.out.println("Capacidade total do tanque: " + carro1.getCapacidadeTanque() +" Litros");
        System.out.println("Valor total p/ tanque cheio: R$" + carro1.totalValorTanque(6.39));
        System.out.println();
        
        Carro carro2 = new Carro("Cinza", "Mercedes-Benz Classe C ", 66);
        
        System.out.println("Segundo carro: ");
        System.out.println("Modelo: " + carro2.getModelo());
        System.out.println("Cor: " + carro2.getCor());
        System.out.println("Capacidade total do tanque: " + carro2.getCapacidadeTanque() +" Litros");
        System.out.println("Valor total p/ tanque cheio: R$" + carro2.totalValorTanque(6.46));

    }

}
