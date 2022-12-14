package model.entity;

import controller.dto.MoradorSecundarioDTO;

public class MoradorSecundario {
	
	private int id;
	private String nome;
	private String parentesco;
	private String dataNasc;
	private int idMoradorP;
	private int apartamento;
	
	public MoradorSecundario() {}
	
	public MoradorSecundario(int id, String nome, String parentesco, String dataNasc) {
		setId(id);
		setNome(nome);
		setParentesco(parentesco);
		setDataNasc(dataNasc);
	}
	
	public MoradorSecundario(String nome, String parentesco, String dataNasc) {
		setNome(nome);
		setParentesco(parentesco);
		setDataNasc(dataNasc);
	}
	
	public MoradorSecundario(int id, String parentesco, String dataNasc) {
		setId(id);
		setNome(parentesco+" de Fulano");
		setParentesco(parentesco);
		setDataNasc(dataNasc);
	}
	
	// Getters e Setters
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(id <= 0) {
			System.out.println("ID "+ id +" não é válido.");
		} else this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome == null || nome == " " || nome == "0") {
			System.out.println("Nome "+ nome +" não é válido.");
		} else this.nome = nome;
	}
	
	public String getParentesco() {
		return parentesco;
	}
	public void setParentesco(String parentesco) {
		if(parentesco == null || parentesco == " " || parentesco == "0") {
			System.out.println("Parentesco "+ parentesco +" não é válido.");
		} else this.parentesco = parentesco;
	}
	
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		if(dataNasc == null || dataNasc == " " || dataNasc == "0") {
			System.out.println("Data de Nascimento "+ dataNasc +" não é válida.");
		} else this.dataNasc = dataNasc;
	}

	public int getApartamento() {
		return apartamento;
	}

	public void setApartamento(int apartamento) {
		this.apartamento = apartamento;
	}

	public int getIdMoradorP() {
		return idMoradorP;
	}

	public void setIdMoradorP(int idMoradorP) {
		this.idMoradorP = idMoradorP;
	}
	
	public static MoradorSecundario converter(MoradorSecundarioDTO msDTO) {
		
		MoradorSecundario ms = new MoradorSecundario();
		
		ms.setId(msDTO.getId());
		ms.setNome(msDTO.getNome());
		ms.setApartamento(msDTO.getApartamento());
		ms.setDataNasc(msDTO.getDataNasc());
		ms.setParentesco(msDTO.getParentesco());
		ms.setIdMoradorP(msDTO.getIdMoradorP());
		
		return ms;
		
	}
	
	
}