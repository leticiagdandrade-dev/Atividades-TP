package br.edu.fatecpg.encapsulamento.model;

public class ContaBancaria {
	private String titular;
	private double saldo;
	
	public ContaBancaria(String titular) {
		this.titular = titular;
		this.saldo = 0;
	}
	
	public double consultar() {
		return this.saldo;
	}
	
	public void depositar(double v) {
		if(v > 0) {
			this.saldo +=v;
		}
	}
	
	public void sacar(double v){
		if(v > 0 && v <= this.saldo) {
			this.saldo -= v;
		}
	}
	
}
