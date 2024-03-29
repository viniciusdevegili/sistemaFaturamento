import java.util.*;

public class Gerenciar {
    public static void main(String[] args) {
        List<Item> listaItens = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        String nomeItem = "";
        int op = 0;

        while (op != 4) {
            System.out.println("Escolha a opção desejada: ");
            System.out.println(" 1  - Adicionar novo item");
            System.out.println(" 2  - Alterar quantidade do item");
            System.out.println(" 3  - Alterar valor do item");
            System.out.println(" 4  - Valor total em estoque");

            op = sc.nextInt();
            switch (op) {
                case 1:
                    sc.nextLine();
                    System.out.println("Digite o nome do novo item: ");
                    nomeItem = sc.nextLine();

                    System.out.println("Digite a quantidade do novo item: ");
                    int quantidade = sc.nextInt();

                    System.out.println("Digite o valor do novo item: ");
                    double valor = sc.nextDouble();

                    Item novoItem = new Item(nomeItem, quantidade, valor);
                    listaItens.add(novoItem);

                    System.out.println("Item adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("Digite o nome do item que deseja alterar a quantidade: ");
                    sc.nextLine();
                    String nomeItemAlterar = sc.nextLine();

                    boolean itemEncontrado = false;
                    for (Item item : listaItens) {
                        if (item.getNomeItem().equalsIgnoreCase(nomeItemAlterar)) {
                            itemEncontrado = true;

                            System.out.println("Digite a nova quantidade para o item '" + nomeItemAlterar + "': ");
                            int novaQuantidade = sc.nextInt();

                            item.setQuantidade(novaQuantidade);

                            System.out.println(
                                    "Quantidade do item '" + nomeItemAlterar + "' alterada para " + novaQuantidade);
                            break;
                        }
                    }

                    if (!itemEncontrado) {
                        System.out.println("Item não encontrado.");
                    }
                    break;

                case 3:
                    System.out.println("Digite o nome do item que deseja alterar o valor: ");
                    sc.nextLine();
                    String nomeItemAlterarValor = sc.nextLine();

                    boolean itemEncontradoValor = false;
                    for (Item item : listaItens) {
                        if (item.getNomeItem().equalsIgnoreCase(nomeItemAlterarValor)) {
                            itemEncontradoValor = true;

                            System.out.println("Digite o novo valor para o item '" + nomeItemAlterarValor + "': ");
                            double novoValor = sc.nextDouble();

                            item.setValor(novoValor);

                            System.out
                                    .println("Valor do item '" + nomeItemAlterarValor + "' alterado para " + novoValor);
                            break;
                        }
                    }

                    if (!itemEncontradoValor) {
                        System.out.println("Item não encontrado.");
                    }
                    break;
                case 4:
                    double totalEmEstoque = 0.0;
                    for (Item item : listaItens) {
                        totalEmEstoque += item.getQuantidade() * item.getValor();
                    }
                    System.out.println("O valor total em estoque é: R$" + totalEmEstoque);
                    break;

                default:
                    System.out.println("Você inseriu uma opção inválida.");
            }
        }
    }
}
