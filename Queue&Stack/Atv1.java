package Queue;
//Escreva um programa Java contendo uma Collection Queue (Fila) de Objetos da
//Classe String, para organizar a ordem de chegada dos Clientes de um Banco. O
//programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
//1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.
//2: Listar todos os Clientes na fila
//3: Chamar (retirar) uma pessoa da fila 
//0: O programa deve ser finalizado. 
//Caso a fila esteja vazia, o programa deverá informar que a fila está vazia ao tentar retirar (chamar) um cliente da fila..



import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atv1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> fila = new LinkedList<>();
        Scanner leia = new Scanner(System.in);
        int opcao;
        String nome;

        do {
            System.out.println("\n\t\tMenu:");
            System.out.println("\n1: Adicionar um novo Cliente na fila");
            System.out.println("\n2: Listar todos os Clientes na fila");
            System.out.println("\n3: Chamar (retirar) uma pessoa da fila");
            System.out.println("\n0: Sair");
            System.out.print("\n\t\tEscolha uma opção: ");
            opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                	leia.nextLine();
                    System.out.print("\nDigite o nome do Cliente: ");
                    nome = leia.nextLine();
                    fila.add(nome);
                    System.out.println("\nCliente adicionado à fila.");
                    break;
                case 2:
                    if (fila.isEmpty()) {
                        System.out.println("\nA fila está vazia.");
                    } else {
                    	System.out.println("\nClientes na fila:");
                        for (String cliente : fila) {
                            System.out.println(cliente);
                        }
                    }
                    break;
                case 3:
                    if (fila.isEmpty()) {
                        System.out.println("\nA fila está vazia.");
                    } else {
                        String clienteChamado = fila.poll();
                        System.out.println("\nCliente chamado: " + clienteChamado);
                    }
                    break;
                case 0:
                    System.out.println("\nPrograma finalizado.");
                    break;
                default:
                    System.out.println("\nOpção inválida.");
                    break;
            }
        } while (opcao != 0);

	}

}
