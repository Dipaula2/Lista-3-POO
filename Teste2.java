package questao2;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste2 {
    public static void main(String args[]) {
        ArrayList<Veiculo> cadastro = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> adicionarMoto(cadastro, scanner);
                case 2 -> adicionarCarro(cadastro, scanner);
                case 3 -> exibirVeiculos(cadastro);
                case 4 -> System.out.println("Saindo");
                default -> System.out.println("Invalido");
            }

            System.out.println();
        } while (opcao != 4);
    }

    public static void exibirMenu() {
        System.out.println("1. Adicionar Moto");
        System.out.println("2. Adicionar Carro");
        System.out.println("3. Exibir Veiculos");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opcao: ");
    }

    public static void adicionarMoto(ArrayList<Veiculo> cadastro, Scanner scanner) {
        System.out.print("Digite o Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Digite o preco da Moto: ");
        double preco = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Digite o Ano da Moto: ");
        int ano = scanner.nextInt();

        Moto moto = new Moto(modelo, preco, ano);
        cadastro.add(moto);
        System.out.println("Moto cadastrada com sucesso");
    }

    public static void adicionarCarro(ArrayList<Veiculo> cadastro, Scanner scanner) {
        System.out.print("Digite o Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Digite o preco do Carro: ");
        double preco = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Digite o Kms Rodados do Carro: ");
        double km = scanner.nextDouble();

        Carro carro = new Carro(modelo, preco, km);
        cadastro.add(carro);
        System.out.println("Carro cadastrado com sucesso");
    }

    public static void exibirVeiculos(ArrayList<Veiculo> cadastro) {
        System.out.println("");
        double totalPrecos = 0.0;

        for (Veiculo veiculo : cadastro) {
            veiculo.printDados();
            totalPrecos += veiculo.getPreco();

            if (veiculo instanceof Moto moto) {
                if (moto.getAno() >= 2008) {
                    double novoPreco = moto.getPreco() * 1.1;
                    moto.setPreco(novoPreco);
                }
            } else if (veiculo instanceof Carro carro) {
                if (carro.getKm() > 100000) {
                    double novoPreco = carro.getPreco() * 0.92;
                    carro.setPreco(novoPreco);
                }
            }
        }

        System.out.println("Total de precos dos veiculos: R$" + totalPrecos);

        double novoTotalPrecos = 0.0;
        for (Veiculo veiculo : cadastro) {
            novoTotalPrecos += veiculo.getPreco();
        }

        System.out.println("Novo total de precos dos veiculos: R$" + novoTotalPrecos);
    }
}
