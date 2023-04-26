package edu.dio.aula2.RelacoesHerancaAssociacaoInterface.UpcastDowncast;

public class Main {

	public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        //Upcasting
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Downcasting
        //Gerente gerente_ = new Funcionario();
        //Vendedor vendedor_ = (Vendedor) new Funcionario();

    }

}
