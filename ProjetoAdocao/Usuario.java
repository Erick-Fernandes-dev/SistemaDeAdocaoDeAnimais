package ProjetoAdocao;

import java.util.List;

public class Usuario {
	private String nome;
	private String cpf;
	private String dataNascimento;
	private List<Requisito> requisitos;
	
	
	public Usuario(String nome,String cpf,String dataNascimento, List<Requisito> requisitos) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.requisitos = requisitos;
	}
	
	public Usuario() {
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public List<Requisito> getRequisitos() {
		return requisitos;
	}
	public void setRequisitos(List<Requisito> requisitos) {
		this.requisitos = requisitos;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Nome: "+this.nome+"\nCPF: "+this.cpf+"\nData de nasimento: "+this.dataNascimento+"\nRequsitos"
				+ this.requisitos;
	}
	
	
	
	
	
	
	
	
	
	

}
