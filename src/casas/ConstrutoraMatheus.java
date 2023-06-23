package casas;

import java.util.Scanner;


public class ConstrutoraMatheus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner scanner = new Scanner(System.in);
        boolean sair = false;

        while (!sair) {
            exibirMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine();
            Casa casa = null;
            switch (opcao) {
                case 1:
                    System.out.println("Você selecionou a faixa um");
                    casa = new CasaFaixaUm();
                    System.out.println("Tamanho:");
                    casa.tamanho();
                    System.out.println("Subsídio:");
                    casa.preco();
                    break;
                case 2:
                    System.out.println("Você selecionou a faixa dois");
                    casa = new CasaFaixaDois();
                    System.out.println("Tamanho:");
                    casa.tamanho();
                    System.out.println("Subsídio:");
                    casa.preco();
                    break;
                case 3:
                    System.out.println("Você selecionou a faixa três");
                    casa = new CasaFaixaTres();
                    System.out.println("Tamanho:");
                    casa.tamanho();
                    System.out.println("Subsídio:");
                    casa.preco();
                    break;                    
                case 4:
                    System.out.println("Saindo do sistema...");
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        }
    }
    
    public static void exibirMenu() {
        System.out.println("Menu:");
        System.out.println("1 - Faixa Um");
        System.out.println("2 - Faixa Dois");
        System.out.println("3 - Faixa Três");
        System.out.println("4 - Sair do sistema");
        System.out.print("Escolha uma opção: ");
    }

}
