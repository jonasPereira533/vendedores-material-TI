import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Functions {

    static Scanner scanner = new Scanner(System.in);

    static void menu() {
        while (true) {
            System.out.println("""
        -------------------
        Bem-vindo!
        1 - Cadastrar venda
        2 - Exibir relatório
        3 - Sair
        -------------------
        """);

            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            if (escolha == 1) {
                cadastrar_venda();
            } else if (escolha == 2) {
                exibir_relatorio();
            } else if (escolha == 3) {
                break;
            } else {
                System.out.println("Opção inválida, tente novamente");
            }
        }
    }


    static ArrayList<Vendedores> lista_primaria = new ArrayList<>();


    static void cadastrar_venda(){

            while (true){
                System.out.print("Nome do vendedor: ");
                String nome = scanner.nextLine();

                System.out.print("Valor da venda: ");
                double valorDaVenda = scanner.nextDouble();
                scanner.nextLine();

                System.out.print("Porcentagem da comissão: ");
                double comissao = scanner.nextDouble();
                scanner.nextLine();

                double valorComissao = comissao/100 * valorDaVenda;

                Vendedores v1 = new Vendedores(nome, valorDaVenda, valorComissao);
                lista_primaria.add(v1);


                System.out.println("deseja continuar S/N: ");
                String escolha = scanner.nextLine();
                if ("N".equalsIgnoreCase(escolha)){
                    break;
                }
            }
    }

    private static void exibir_relatorio() {

        double totalVendas = 0;
        double totalComissoes = 0;

        for(Vendedores v : lista_primaria ){
            System.out.println("-------------------------");
            System.out.println("Nome: " + v.getNome()
                    + " | Venda: " + v.getValorDaVenda()
                    + " | Comissão: " + v.getValorComissao());
            totalVendas += v.getValorDaVenda();
            totalComissoes += v.getValorComissao();
        }


        System.out.println("\n--- RESUMO ---");
        System.out.println("Total vendido: R$ " + totalVendas);
        System.out.println("Total de comissões: R$ " + totalComissoes);

    }
}



