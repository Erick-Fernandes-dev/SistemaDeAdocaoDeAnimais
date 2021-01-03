package ProjetoAdocao;

public class Animal {

	private String nome;
	private String codigo;
	private String dataDeNascimento;
	private String tamanho;
	private boolean ehBarulhento = false;
	private boolean ehManso = false;
	private String cor;
	private String sexo;
	private boolean temPedigree = false;
	private boolean estahComVacinaEmDia = false;
	private boolean estahCadastrado = false;
	private String detalhes;
	private String tipoAlimentacao;
	
	
	public String tipo;
	
	public Animal(String nome, String codigo, String dataDeNascimento, String tamanho, boolean ehBarulhento,
			boolean ehManso, String cor, String sexo, boolean temPedigree, boolean estahComVacinaEmDia,
			boolean estahCadastrado, String detalhes, String tipoAlimentacao) {
	
		this.nome = nome;
		this.codigo = codigo;
		this.dataDeNascimento = dataDeNascimento;
		this.tamanho = tamanho;
		this.ehBarulhento = ehBarulhento;
		this.ehManso = ehManso;
		this.cor = cor;
		this.sexo = sexo;
		this.temPedigree = temPedigree;
		this.estahComVacinaEmDia = estahComVacinaEmDia;
		this.estahCadastrado = estahCadastrado;
		this.detalhes = detalhes;
		this.tipoAlimentacao = tipoAlimentacao;
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public boolean isEhBarulhento() {
		return ehBarulhento;
	}

	public void setEhBarulhento(boolean ehBarulhento) {
		this.ehBarulhento = ehBarulhento;
	}

	public boolean isEhManso() {
		return ehManso;
	}

	public void setEhManso(boolean ehManso) {
		this.ehManso = ehManso;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public boolean isTemPedigree() {
		return temPedigree;
	}

	public void setTemPedigree(boolean temPedigree) {
		this.temPedigree = temPedigree;
	}

	public boolean isEstahComVacinaEmDia() {
		return estahComVacinaEmDia;
	}

	public void setEstahComVacinaEmDia(boolean estahComVacinaEmDia) {
		this.estahComVacinaEmDia = estahComVacinaEmDia;
	}

	public boolean isEstahCadastrado() {
		return estahCadastrado;
	}

	public void setEstahCadastrado(boolean estahCadastrado) {
		this.estahCadastrado = estahCadastrado;
	}

	public String getDetalhes() {
		return detalhes;
	}

	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}

	public String getTipoAlimentacao() {
		return tipoAlimentacao;
	}

	public void setTipoAlimentacao(String tipoAlimentacao) {
		this.tipoAlimentacao = tipoAlimentacao;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
		Animal other = (Animal) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return " nome=" + nome + ", codigo=" + codigo + ", dataDeNascimento=" + dataDeNascimento + ", tamanho="
				+ tamanho + ", ehBarulhento=" + ehBarulhento + ", ehManso=" + ehManso + ", cor=" + cor + ", sexo="
				+ sexo + ", temPedigree=" + temPedigree + ", estahComVacinaEmDia=" + estahComVacinaEmDia
				+ ", estahCadastrado=" + estahCadastrado + ", detalhes=" + detalhes + ", tipoAlimentacao="
				+ tipoAlimentacao + "";
	}
	
	
}