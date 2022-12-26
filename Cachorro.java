package mypet;

import java.util.ArrayList;

public class Cachorro extends Animal {
	private String porte;

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}
	
	public Cachorro(String nome, String data, String sexo, String raca, String porte) {
		this.raca = raca;
		this.porte = porte;
		this.nome = nome;
		dataDeNascimento = data;
		this.sexo = sexo;
		especie = "Cachorro";
		this.vacinas = new ArrayList<>();
	}
}
