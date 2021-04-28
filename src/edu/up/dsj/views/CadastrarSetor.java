package edu.up.dsj.views;

import java.util.Scanner;
import edu.up.dsj.controller.SetorController;
import edu.up.dsj.models.Setor;

/**
 * Classe para cadastrar novos setores da empresa. O código de setor é gerado automaticamente em sequência.
 * Não é possível cadastrar setores com o mesmo nome, mesmo se estiverem com letras maiúsculas.
 * @author Leandro Zeni
 */
public class CadastrarSetor {

	public static void cadastrar() {
		
		Scanner sc = new Scanner(System.in);
		Setor novoSetor = new Setor();
		
		System.out.print("\nNome do setor: ");
		novoSetor.setNome(sc.nextLine());
		
		novoSetor.setCodigoSetor(SetorController.GerarCodSetor());
		
		if(SetorController.cadastrar(novoSetor) == true) {
			System.out.println("\nNovo setor cadastrado!");
		}else {
			System.out.println("\nEsse setor já existe. Por favor, cadastre outro");
		}
	}
}