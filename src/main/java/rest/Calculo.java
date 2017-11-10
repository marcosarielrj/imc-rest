package rest;

import java.util.Date;

public class Calculo {

	private double peso;
	
	private String altura;
	
	private double imc;
	
	private String dataDeProcessamento;
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}

	public double getImc() {
		return imc;
	}

	public void setImc(double imc) {
		this.imc = imc;
	}

	public String getDataDeProcessamento() {
		return dataDeProcessamento;
	}

	public void setDataDeProcessamento(String dataDeProcessamento) {
		this.dataDeProcessamento = dataDeProcessamento;
	}

	public Calculo() {
	}

	public Calculo(double peso, String altura) {
		this.peso = peso;
		this.altura = altura;
	}

	
	public void calcularimc(double peso, String altura) {
		
		double alturadouble = Double.parseDouble(altura);
		double imc = peso / (alturadouble * alturadouble);
		
		setImc(imc);
		setDataDeProcessamento(new Date().toString());
	}

	

}
