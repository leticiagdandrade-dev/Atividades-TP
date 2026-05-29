package br.edu.fatecpg.encapsulamento.view;
import br.edu.fatecpg.encapsulamento.model.*;

public class Main {

	public static void main(String[] args) {
		Carro carro = new Carro("zord", "dragonzord", 1993, 1000, 1000, true);
		ContaBancaria conta = new ContaBancaria("Pessoa");
		Produto prod = new Produto("bolinho", 3.50, 20);
		
		System.out.println(conta.consultar());
		conta.depositar(-50);
		System.out.println(conta.consultar());
		conta.depositar(50);
		System.out.println(conta.consultar());
		conta.sacar(-20);
		System.out.println(conta.consultar());
		conta.sacar(60);
		System.out.println(conta.consultar());
		conta.sacar(20);
		System.out.println(conta.consultar());
		
		System.out.println(prod.getPreco() + " " + prod.getQtdEstoque());
		prod.setPreco(-10);
		prod.setQtdEstoque(-50);
		System.out.println(prod.getPreco() + " " + prod.getQtdEstoque());
		prod.setPreco(10);
		prod.setQtdEstoque(50);
		System.out.println(prod.getPreco() + " " + prod.getQtdEstoque());

	}

}
