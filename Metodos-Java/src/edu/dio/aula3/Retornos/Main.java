package edu.dio.aula3.Retornos;

public class Main {

    public static void main(String[] args) {

        // Quadrilátero
        System.out.println("Exercício Retornos");
        
        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Área do quadrado: " + areaQuadrado);
        
        double areaRetangulo = Quadrilatero.area(5d,5d);
        System.out.println("Área do retângulo: " + areaRetangulo);
        
        double areaTrapezio = Quadrilatero.area(7,8,9);
        System.out.println("Área do trapézio: " + areaTrapezio);

    }
}
