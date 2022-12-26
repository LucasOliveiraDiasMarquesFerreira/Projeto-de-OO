package mypet;

import java.util.ArrayList;

public abstract class Animal {
	protected String nome;
	protected String dataDeNascimento;
	protected String especie;
	protected String raca;
	protected String sexo;

	protected Responsavel responsavel;
	protected ArrayList<Vacina> vacinas;
	
	


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataDeNascimento() {

		return dataDeNascimento;
		
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Responsavel getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Responsavel responsavel) {
		this.responsavel = responsavel;
	}

	public ArrayList<Vacina> getVacinas() {
		return vacinas;
	}

	public void setVacinas(ArrayList<Vacina> vacinas) {
		this.vacinas = vacinas;
	}
	
	
	public String toString() {
		return nome;
	}
	
	public void cadastrarVacina(Vacina vacina) {
		vacinas.add(vacina);
	}
	
}
