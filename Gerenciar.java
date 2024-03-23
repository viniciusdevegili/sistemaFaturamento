import java.util.Scanner;

public class Gerenciar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op;

        System.out.println("Escolha a opção desejada: ");
        System.out.println(" 1  - Adicionar novo item");
        System.out.println(" 2  - Alterar quantidade do item");
        System.out.println(" 3  - Alterar valor do item");
        System.out.println(" 4  - Valor total em estoque");

        op = sc.nextInt();

        switch (op) {
            case 1:
                System.out.println("Digite o nome do novo item: ");
                String item = sc.nextLine();
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
