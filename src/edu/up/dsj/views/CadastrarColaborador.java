
import java.util.Scanner;


/**
 * Classe para cadastrar um novo colaborador. N�o permite cadastrar pessoas com
 * o mesmo CPF.
 * 
 * @author Leandro Zeni
 */
public class CadastrarColaborador {

	public static void cadastrar() {

		Scanner sc = new Scanner(System.in);
		String escolha;

		do {
			Colaborador novoColaborador = new Colaborador();
			Integer codSetor;

			System.out.println("\n ---- NOVO COLABORADOR ----\n");
			System.out.print("Nome: ");
			novoColaborador.setNome(sc.nextLine());
			System.out.print("CPF: ");
			novoColaborador.setCpf(sc.nextLine());
			if (ValidarCpf.isCPF(novoColaborador.getCpf()) == true) {
				System.out.print("Telefone para contato: ");
				novoColaborador.setTelefone(sc.nextLong());
				sc.nextLine();
				System.out.print("Endere�o: ");
				novoColaborador.setEndereco(sc.nextLine());
				System.out.print("Sal�rio Bruto: ");
				novoColaborador.setSalarioBruto(sc.nextFloat());
				System.out.println("\nCadastre o funcion�rio em um dos setores abaixo: ");
				ListarSetores.renderizar();
				System.out.print("\nC�digo do Setor: ");
				codSetor = (sc.nextInt());
				novoColaborador.setSetor(SetorController.retornarSetor(codSetor));
				if (ColaboradorController.cadastrar(novoColaborador) == true) {
					System.out.println("\nColaborador Cadastrado!\n");
				} else {
					System.out.println("\nN�o foi poss�vel cadastrar\n");
				}
			}
			else
				System.out.println("\nCPF inv�lido. Tente novamente.");

			System.out.println("Deseja cadastrar mais colaboradores?");
			System.out.print("Aperte S para cadastrar mais ou qualquer tecla para sair: ");
			sc.nextLine();
			escolha = sc.nextLine();

		} while (escolha.equalsIgnoreCase("S"));

	}
}