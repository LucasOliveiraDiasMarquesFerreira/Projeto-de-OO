package mypet;

import java.util.ArrayList;

public class Coelho extends Animal{
	
	private boolean VacinaMixomatose;
	private boolean VacinaHemorragica;
	
	public Coelho(String nome, String data, String sexo, String raca) {
		this.raca = raca;
		VacinaMixomatose = false;
		VacinaHemorragica = false;
		this.nome = nome;
		dataDeNascimento = data;
		this.sexo = sexo;
		especie = "Coelho";
		this.vacinas = new ArrayList<>();
		
	}
	
	

	public boolean isVacinaMixomatose() {
		return VacinaMixomatose;
	}

	public void setVacinaMixomatose(boolean vacinaMixomatose) {
		VacinaMixomatose = vacinaMixomatose;
	}

	public boolean isVacinaHemorragica() {
		return VacinaHemorragica;
	}

	public void setVacinaHemorragica(boolean vacinaHemorragica) {
		VacinaHemorragica = vacinaHemorragica;
	}
	
	
	

}
