package mypet;

import java.util.ArrayList;

public class Gato extends Animal{
	private String pelagem;

	public String getPelagem() {
		return pelagem;
	}

	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}
	
	public Gato(String nome, String data, String sexo, String raca, String pelagem) {
		this.raca = raca;
		this.pelagem = pelagem;
		this.nome = nome;
		dataDeNascimento = data;
		this.sexo = sexo;
		especie = "Gato";
		this.vacinas = new ArrayList<>();
	}
	

}
