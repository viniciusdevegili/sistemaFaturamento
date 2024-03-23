import java.util.Scanner;

public class Gerenciar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op;
        String nomeItem = "";

        System.out.println("Escolha a opção desejada: ");
        System.out.println(" 1  - Adicionar novo item");
        System.out.println(" 2  - Alterar quantidade do item");
        System.out.println(" 3  - Alterar valor do item");
        System.out.println(" 4  - Valor total em estoque");

        op = sc.nextInt();

        switch (op) {
            case 1:
                System.out.println("Digite o nome do novo item: ");
                sc.nextLine();
                nomeItem = sc.nextLine();

                System.out.println("Digite a quantidade do novo item: ");
                int quantidade = sc.nextInt();

                System.out.println("Digite o valor do novo item: ");
                double valor = sc.nextDouble();

                Item novoItem = new Item(nomeItem, quantidade, valor);

                System.out.println("Nome do novo item: " + novoItem.getNomeItem());
                System.out.println("Quantidade do novo item: " + novoItem.getQuantidade());
                System.out.println("Valor do novo item: " + novoItem.getValor());

                break;

            case 2:

                break;

            case 3:

                break;

            case 4:

                break;

            default:
                System.out.println("Você inseriu uma opção inválida.");
        }
    }
}
