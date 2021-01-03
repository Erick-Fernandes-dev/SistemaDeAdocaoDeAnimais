package ProjetoAdocao;

public class Cachorro extends Animal {

	public final String TIPO_ANIMAL_CACHORRO = "cachorro";

	public Cachorro(String nome, String codigo, String dataDeNascimento, String tamanho, boolean ehBarulhento,
			boolean ehManso, String cor, String sexo, boolean temPedigree, boolean estahComVacinaEmDia,
			boolean estahCadastrado, String detalhes, String tipoAlimentacao) {

		super(nome, codigo, dataDeNascimento, tamanho, ehBarulhento, ehManso, cor, sexo, temPedigree,
				estahComVacinaEmDia, estahCadastrado, detalhes, tipoAlimentacao);

		this.tipo = TIPO_ANIMAL_CACHORRO;

	}

	public Cachorro() {
		this("", "", "", "", false, false, "", "", false, false, false, "", "");
	}

	public String getTIPO_ANIMAL_CACHORRO() {
		return TIPO_ANIMAL_CACHORRO;
	}

}