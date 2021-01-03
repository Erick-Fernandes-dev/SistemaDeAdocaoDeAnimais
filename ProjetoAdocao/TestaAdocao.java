package ProjetoAdocao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class TestaAdocao {

	public static void main(String[] args) {
		boolean continuar = true;

		SistemaAdocaoList a = new SistemaAdocaoList();

		while (continuar) {

			int option = Integer.parseInt(JOptionPane.showInputDialog("1.Pesquisar usúario pelo cpf:"
					+ "\n2.Procurar usuario pelo prefixo:" + "\n3.Pesquisa animal do tipo: " + "\n4.Cadastrar usuario"
					+ "\n5.Cadastrar cachorros" + "\n6.Cadastrar gatos" + "\n7.Sair"));

			switch (option) {

			case 1:
				String buscaCPF = JOptionPane.showInputDialog("CPF:");

				Usuario clienteEncontrado = a.pesquisaUsuario(buscaCPF);
				if (clienteEncontrado != null) {
					JOptionPane.showMessageDialog(null, clienteEncontrado);
				} else {
					JOptionPane.showMessageDialog(null, "Nada encontrado");
				}
				break;

			case 2:
				String prefixo = JOptionPane.showInputDialog("Prefixo: ");

				List<Usuario> prefixos = a.pesquisaUsuariosComOPrefixo(prefixo);
				if (prefixos.size() > 0) {
					for (Usuario u : prefixos) {
						JOptionPane.showMessageDialog(null, u);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Nada encontrado.");
				}

				break;

			case 3:
				String tipo = JOptionPane.showInputDialog("Tipo: ");
				List<Animal> animaisTipo = a.pesquisaAnimaisDoTipo(tipo);

				if (animaisTipo.size() > 0) {
					for (Animal animais : animaisTipo) {
						JOptionPane.showMessageDialog(null, animais);
					}

				} else {
					JOptionPane.showMessageDialog(null, "Nada encontrado.");
				}
				break;
			case 4:

				String nomeUser = JOptionPane.showInputDialog("Nome: ");
				String cpf = JOptionPane.showInputDialog("CPF: ");
				String dataNascimento = JOptionPane.showInputDialog("Data Nascimento: ");
				String nomeRequisito = JOptionPane.showInputDialog("Requisito");
				String valorEsperadoRequisito = JOptionPane.showInputDialog("Valor esperado do requisito: ");
				Requisito requisitos = new Requisito(nomeRequisito, valorEsperadoRequisito);
				List<Requisito> Lrequisitos = new ArrayList<>();
				Lrequisitos.add(requisitos);

				Usuario novoUser = new Usuario(nomeUser, cpf, dataNascimento, Lrequisitos);
				try {
					a.cadastrarUsuario(novoUser);
					JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso.");
				} catch (UsuarioJaExisteException e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
				break;

			case 5:
				
				boolean ehManso = false;
				boolean ehBarulhento = false;
				boolean temPedigree = false;
				boolean estahComVacinaEmDia = false;
				boolean estahCadastrado = false;
				
				
				
				String nome = JOptionPane.showInputDialog("Nome: ");
				String codigo = JOptionPane.showInputDialog("Codigo: ");
				String dataDeNascimento = JOptionPane.showInputDialog("Data de nascimento: ");

				String tamanho = JOptionPane.showInputDialog("Tamanho: ");

				int barulhento = JOptionPane.showConfirmDialog(null, "é barulhento?", "", JOptionPane.YES_NO_OPTION);
				if(barulhento == JOptionPane.YES_OPTION) ehBarulhento = true;
				
				int manso = JOptionPane.showConfirmDialog(null, "é manso?", "", JOptionPane.YES_NO_OPTION);
				if(manso == JOptionPane.YES_OPTION) ehManso = true;
				
				
				String cor = JOptionPane.showInputDialog("Cor: ");
				String sexo = JOptionPane.showInputDialog("Sexo: ");
				int pedigree = JOptionPane.showConfirmDialog(null, "tem pedrigree?", "", JOptionPane.YES_NO_OPTION);
				if(pedigree == JOptionPane.YES_OPTION) temPedigree = true;
				
				int vacina = JOptionPane.showConfirmDialog(null, "está com a vacina em dia?", "", JOptionPane.YES_NO_OPTION);
				if(vacina == JOptionPane.YES_OPTION) estahComVacinaEmDia = true;
				
				int cadastro = JOptionPane.showConfirmDialog(null, "está cadastrado?", "", JOptionPane.YES_NO_OPTION);
				if(cadastro == JOptionPane.YES_OPTION) estahCadastrado= true;
				
				String detalhes = JOptionPane.showInputDialog("Detalhes: ");
				String tipoAlimentacao = JOptionPane.showInputDialog("Tipo de alimentação: ");

				Animal novoCachorro = new Cachorro(nome, codigo, dataDeNascimento, tamanho, ehBarulhento, ehManso, cor,
						sexo, temPedigree, estahComVacinaEmDia, estahCadastrado, detalhes, tipoAlimentacao);
				try {
					a.cadastrarAnimal(novoCachorro);
					JOptionPane.showMessageDialog(null, "Animal cadastrado com sucesso");

				} catch (AnimalJaExisteException e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
				
				
				break;

			case 6:
				boolean ehMansoGato = false;
				boolean ehBarulhentoGato = false;
				boolean temPedigreeGato = false;
				boolean estahComVacinaEmDiaGato = false;
				boolean estahCadastradoGato = false;
				
				
				String nomeGato = JOptionPane.showInputDialog("Nome: ");
				String codigoGato = JOptionPane.showInputDialog("Codigo: ");
				String dataDeNascimentoGato = JOptionPane.showInputDialog("Data de nascimento: ");

				String tamanhoGato = JOptionPane.showInputDialog("Tamanho: ");
				
				int barulhentoGato = JOptionPane.showConfirmDialog(null, "é barulhento?", "", JOptionPane.YES_NO_OPTION);
				if(barulhentoGato == JOptionPane.YES_OPTION) ehBarulhentoGato = true;
				
				int mansoGato = JOptionPane.showConfirmDialog(null, "é manso?", "", JOptionPane.YES_NO_OPTION);
				if(mansoGato == JOptionPane.YES_OPTION) ehMansoGato = true;
				
				String corGato = JOptionPane.showInputDialog("Cor: ");
				String sexoGato = JOptionPane.showInputDialog("Sexo: ");
				
				int pedigreeGato = JOptionPane.showConfirmDialog(null, "tem pedrigree?", "", JOptionPane.YES_NO_OPTION);
				if(pedigreeGato == JOptionPane.YES_OPTION) temPedigreeGato = true;
				
				int vacinaGato = JOptionPane.showConfirmDialog(null, "está com a vacina em dia?", "", JOptionPane.YES_NO_OPTION);
				if(vacinaGato == JOptionPane.YES_OPTION) estahComVacinaEmDiaGato = true;
				
				int cadastroGato = JOptionPane.showConfirmDialog(null, "está cadastrado?", "", JOptionPane.YES_NO_OPTION);
				if(cadastroGato == JOptionPane.YES_OPTION) estahCadastradoGato = true;
				
				String detalhesGato = JOptionPane.showInputDialog("Detalhes: ");
				String tipoAlimentacaoGato = JOptionPane.showInputDialog("Tipo de alimentação: ");

				Animal novoGato = new Gato(nomeGato, codigoGato, dataDeNascimentoGato, tamanhoGato, ehBarulhentoGato,
						ehMansoGato, corGato, sexoGato, temPedigreeGato, estahComVacinaEmDiaGato, estahCadastradoGato,
						detalhesGato, tipoAlimentacaoGato);

				try {
					a.cadastrarAnimal(novoGato);
					JOptionPane.showMessageDialog(null, "Animal cadastrado com sucesso");
				} catch (AnimalJaExisteException e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
				break;

			case 7:
				
				try {
					a.salvarDados();
					JOptionPane.showMessageDialog(null, "Certo");
				}catch(IOException e){
					JOptionPane.showMessageDialog(null, "Erro ao salvar.");
				}
				
				
				continuar = false;
				JOptionPane.showMessageDialog(null, "Fim do programa.");
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opção inválida");

			}
		}

	}

}
