package ProjetoAdocao;

public class Gato extends Animal {
	public String TIPO_ANIMAL_GATO = "gato";
	String a = "AA";
	public Gato(String nome, String codigo, String dataDeNascimento, String tamanho, boolean ehBarulhento,
			boolean ehManso, String cor, String sexo, boolean temPedigree, boolean estahComVacinaEmDia,
			boolean estahCadastrado, String tipoAlimentacao, String detalhes) {
		super(nome, codigo, dataDeNascimento, tamanho, ehBarulhento, ehManso, cor, sexo, temPedigree,
				estahComVacinaEmDia, estahCadastrado, tipoAlimentacao, detalhes);
		
		this.tipo = TIPO_ANIMAL_GATO;
		
	}
	
	
	

	public String getTIPO_ANIMAL_GATO() {
		return TIPO_ANIMAL_GATO;
	}

	
	
	
	
	
	
	
	
}
