package ProjetoAdocao;

import java.util.List;

public interface InterfaceSistemaAdocao {
	// Métodos usúario
	public Usuario pesquisaUsuario(String cpf);
	
	public List<Usuario> pesquisaUsuariosComOPrefixo(String prefixo);
	
	
	public void cadastrarUsuario(Usuario user) throws UsuarioJaExisteException;
	
	public boolean existeUsuario(Usuario user);
	
	// Métodos animais
	
	
	public void cadastrarAnimal(Animal animal) throws AnimalJaExisteException;
	
	public List <Animal> pesquisaAnimaisDoTipo (String tipo);

}
