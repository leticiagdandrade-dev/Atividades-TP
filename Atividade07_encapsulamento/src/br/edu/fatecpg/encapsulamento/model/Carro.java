package br.edu.fatecpg.encapsulamento.model;

public class Carro {
	private String marca;
	private String modelo;
	private int ano;
	private double cc;
	private double capacidadeTanque;
	private boolean ac;

    public Carro(String marca, String modelo, int ano, double cc, double capacidadeTanque, boolean ac) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.cc = cc;
		this.capacidadeTanque = capacidadeTanque;
		this.ac = ac;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getAno() {
		return ano;
	}

	public double getCc() {
		return cc;
	}

	public void setCc(double cc) {
		this.cc = cc;
	}

	public double getCapacidadeTanque() {
		return capacidadeTanque;
	}

	public void setCapacidadeTanque(double capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}

	public boolean isAc() {
		return ac;
	}

	public void setAc(boolean ac) {
		this.ac = ac;
	}

	public void ligar() {
        System.out.println("ligado");
    }

    public void desligar() {
        System.out.println("desligado");
    }

    public void buzinar() {
        System.out.println("bibiiiii");
    }
    
    public double encherTanque(double v) {
    	return this.capacidadeTanque * v;
    }

    public void apresentar() {
        System.out.println("Carro {\n" +
            "Marca: " + this.marca + ",\n" +
            "Modelo: " + this.modelo + ",\n" +
            "Ano: " + this.ano + ",\n" +
            "Motor: " + this.cc + ",\n" +
            "AC: " + this.ac + "\n" +
            "}");
    }
}
