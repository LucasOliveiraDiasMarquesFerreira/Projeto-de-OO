package mypet;

import java.util.ArrayList;

public class Responsavel {
	private String nomeResponsavel;
	private String emailResponsavel;
	private String endereço;
	private double telefone;
	private ArrayList<Animal> animais;
	
	public Responsavel(String nome, String email, String endereço, double telefone) {
		nomeResponsavel = nome;
		emailResponsavel = email;
		this.endereço = endereço;
		this.telefone = telefone;
		this.animais = new ArrayList<>();
		
	
	}
	
	public String getNomeResponsavel() {
		return nomeResponsavel;
	}
	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}
	public String getEmailResponsavel() {
		return emailResponsavel;
	}
	public void setEmailResponsavel(String emailResponsavel) {
		this.emailResponsavel = emailResponsavel;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public double getTelefone() {
		return telefone;
	}
	public void setTelefone(double telefone) {
		this.telefone = telefone;
	}
	public ArrayList<Animal> getAnimais() {
		return animais;
	}
	public void setAnimais(ArrayList<Animal> animais) {
		this.animais = animais;
	}
	


		public void cadastrarAnimal(Animal animal) {
			animais.add(animal);
		}
	
	
	
}
