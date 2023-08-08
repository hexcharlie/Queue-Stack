package Queue;

import java.util.Scanner;
import java.util.Stack;

public class Atv2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> pilha = new Stack<>();
        Scanner leia = new Scanner(System.in);
        int opcao;
        String nome;
        
        do {
        	System.out.println("\n\t\tMenu:");
            System.out.println("\n1: Adicionar um novo livro na pilha");
            System.out.println("\n2: Listar todos os livros da pilha");
            System.out.println("\n3: Retirar um livro da pilha");
            System.out.println("\n0: Sair");
            System.out.print("\n\t\tEscolha uma opção: ");
            opcao = leia.nextInt();
            leia.nextLine();
            
            switch (opcao) {
            case 1:
                System.out.print("\nDigite o nome do livro: ");
                nome = leia.nextLine();
                pilha.push(nome);
                System.out.println("\nLivro adicionado à pilha.");
                break;
            case 2:
                if (pilha.isEmpty()) {
                    System.out.println("\nA pilha está vazia.");
                } else {
                    System.out.println("\nLivros na pilha:");
                    for (String livro : pilha) {
                        System.out.println(livro);
                    }
                }break;
            case 3:
                if (pilha.isEmpty()) {
                    System.out.println("A pilha está vazia.");
                } else {
                    String livroRetirado = pilha.pop();
                    System.out.println("Livro retirado: " + livroRetirado);
                }
                break;  
            case 0:
                System.out.println("Programa finalizado.");
                break;
            default:
                System.out.println("Opção inválida.");
                break;    
        }

		

	}while (opcao != 0);

}
}
