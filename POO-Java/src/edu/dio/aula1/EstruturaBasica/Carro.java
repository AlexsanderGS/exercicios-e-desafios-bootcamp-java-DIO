package edu.dio.aula1.EstruturaBasica;

//Classe
public class Carro {
	
	//Atributos da classe
	String cor;
	String modelo;
	int capacidadeTanque;
	
	//Construtor
	Carro(){
			
	}
	
	//Construtor com sobrecargar
	Carro(String cor, String modelo, int capacidadeTanque){
		this.cor = cor;
		this.modelo = modelo;
		this.capacidadeTanque = capacidadeTanque;
		
	}

	//Getters e Setters
	 String getCor() {
		return cor;
	}
	
	 void setCor(String cor) {
		this.cor = cor;
	}
	
	 String getModelo() {
		return modelo;
	}
	
	 void setModelo(String modelo) {
		this.modelo = modelo;
	}
	 
	void setCapacidadeTanque(int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}
	
	int getCapacidadeTanque() {
		return capacidadeTanque;
	}
	
	//Metódo
	double totalValorTanque(double valorCombustivel) {
		return capacidadeTanque * valorCombustivel;
	}
	
	
	
	
}
