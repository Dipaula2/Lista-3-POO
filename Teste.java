


import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        ArrayList<Midia> cadastro = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1 -> adicionarCD(cadastro, scanner);
                case 2 -> adicionarDVD(cadastro, scanner);
                case 3 -> exibirMidias(cadastro);
                case 4 -> System.out.println("Saindo");
                default -> System.out.println("Invalido");
            }

            System.out.println();
        } while (opcao != 4);
    }

    public static void exibirMenu() {
        System.out.println("1. Adicionar CD");
        System.out.println("2. Adicionar DVD");
        System.out.println("3. Exibir Midias");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opcao: ");
    }

    public static void adicionarCD(ArrayList<Midia> cadastro, Scanner scanner) {
        System.out.print("Digite o codigo do CD: ");
        int codigo = scanner.nextInt();
        System.out.print("Digite o preco do CD: ");
        double preco = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.print("Digite o nome do Album de CD: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o numero de musicas do CD: ");
        int nMusicas = scanner.nextInt();

        CD cd = new CD(codigo, preco, nome, nMusicas);
        cadastro.add(cd);
        System.out.println("CD adicionado com sucesso!");
    }

    public static void adicionarDVD(ArrayList<Midia> cadastro, Scanner scanner) {
        System.out.print("Digite o codigo do DVD: ");
        int codigo = scanner.nextInt();
        System.out.print("Digite o preco do DVD: ");
        double preco = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.print("Digite o nome do DVD: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o numero de faixas do DVD: ");
        int nFaixas = scanner.nextInt();

        DVD dvd = new DVD(codigo, preco, nome, nFaixas);
        cadastro.add(dvd);
        System.out.println("DVD adicionado com sucesso!");
    }

    public static void exibirMidias(ArrayList<Midia> cadastro) {
        System.out.println("");
        for (Midia midia : cadastro) {
            midia.printDados();
        }
        
    }
}
