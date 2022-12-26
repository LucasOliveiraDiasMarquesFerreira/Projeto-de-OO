package mypet;

import java.util.Date;

public class Vacina {
	String tipo;
	Date dataVacinacao;
	
	private Animal animal;
	
	public Vacina(String tipo, Date data) {
		this.tipo = tipo;
		dataVacinacao = data;
	}


	public Vacina(String tipo2, String string) {
		// TODO Auto-generated constructor stub
	}


	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Date getDataVacinacao() {
		return dataVacinacao;
	}

	public void setDataVacinacao(Date dataVacinacao) {
		this.dataVacinacao = dataVacinacao;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
	public String toString() {
		return tipo + " - " + dataVacinacao;
	}

}
