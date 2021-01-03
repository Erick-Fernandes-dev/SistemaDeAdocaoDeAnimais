package ProjetoAdocao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SistemaAdocaoList {

	private List<Usuario> usuarios;
	private List<Animal> animais;

	public SistemaAdocaoList() {
		this.usuarios = new ArrayList<>();
		this.animais = new ArrayList<>();

	}
	
	
	public Usuario pesquisaUsuario(String cpf) {
		for (Usuario user : usuarios) {
			if (user.getCpf().equals(cpf)) {
				return user;
			}
		}

		return null;
	}

	public List<Usuario> pesquisaUsuariosComOPrefixo(String prefixo) {
		List<Usuario> retornoUsuarios = new ArrayList<>();
		for (Usuario user : usuarios) {
			if (user.getNome().startsWith(prefixo)) {
				retornoUsuarios.add(user);
			}
		}

		return retornoUsuarios;
	}

	public List <Animal> pesquisaAnimaisDoTipo (String tipo) {
		List<Animal> retornaAnimaisDoTipo = new ArrayList <>();
		for(Animal animal : animais) {
			if(animal.getTipo().equals(tipo)) {
				retornaAnimaisDoTipo.add(animal);
			}
		}
		
		return retornaAnimaisDoTipo;
		
	} 

	public boolean existeUsuario(Usuario user) {
		for (Usuario u : usuarios) {
			if (u.equals(user)) {
				return true;
			}
		}
		return false;
	}

	public void cadastrarUsuario(Usuario user) throws UsuarioJaExisteException{
		if (existeUsuario(user)) {
			throw new UsuarioJaExisteException ("Usúario já cadastrado no nosso sistema.");
			
		}
		this.usuarios.add(user);
	}

	public boolean existeAnimal(Animal animal) {
		for (Animal a : animais) {
			if (a.equals(animal)) {
				return true;
			}
		}
		return false;
	}

	public void cadastrarAnimal(Animal animal) throws AnimalJaExisteException{
		if (existeAnimal(animal)) {
			throw new AnimalJaExisteException("Animal já cadastrado no nosso sistema.");
		}
		this.animais.add(animal);
		
	}
	
	
	public void salvarDados() throws IOException {
		GravadorDeDados gravador = new GravadorDeDados();
		List<String> dadosAGravarCachorros = new LinkedList<>();
		List<String> dadosAGravarGatos = new LinkedList<>();
		List<String> dadosUsuarios = new LinkedList<>();
		
		
		for(Animal a : animais) {
			
		
				String linha = a.getNome() +"-"+a.getCodigo()+"-"+a.getTamanho()+"-"+a.getDataDeNascimento();
				dadosAGravarGatos.add(linha);
			
			}
		
		
		
		gravador.gravaTextoEmArquivo(dadosAGravarGatos, "adocoes.txt");
		
	}

}
