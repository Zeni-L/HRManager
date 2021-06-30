package edu.up.dsj.views;
import edu.up.dsj.controller.SetorController;
import edu.up.dsj.models.Setor;
import edu.up.dsj.utils.Console;

public class DeletarSetor {

        public static void Deletar() {
    
            Setor setor = new Setor();
            int codigoSetor;
    
            System.out.println("\n====== REMOVER SETORES ======\n");
            codigoSetor = Console.lerInteiro("Insira o Código do setor: ");
    
            setor = SetorController.retornarSetor(codigoSetor);
    
            if (setor != null) {
                if (SetorController.Deletar(setor) == true) {
                    System.out.println("\n Setor removido!\n");
                } else
                    System.out.println("\nNão foi possível remover o setor, tente novamente.\n");
            } else
                System.out.println("\nSetor não localizado, tente novamente\n");
        }
    }
