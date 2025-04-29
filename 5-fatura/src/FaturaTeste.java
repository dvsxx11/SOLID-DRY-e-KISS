import java.util.Scanner;

public class FaturaTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Fatura fatura = criarFatura(scanner);
        exibirFatura(fatura);

        scanner.close();
    }

    private static Fatura criarFatura(Scanner scanner) {
        System.out.print("Número do item: ");
        String numero = scanner.nextLine();
        System.out.print("Descrição do item: ");
        String descricao = scanner.nextLine();
        System.out.print("Quantidade comprada: ");
        int quantidade = scanner.nextInt();
        System.out.print("Preço por item: ");
        double preco = scanner.nextDouble();

        return new Fatura(numero, descricao, quantidade, preco);
    }

    private static void exibirFatura(Fatura fatura) {
        System.out.printf("\nResumo da Fatura:\nNúmero: %s\nDescrição: %s\nQuantidade: %d\nPreço por item: R$ %.2f\nTotal: R$ %.2f\n",
                fatura.getNumero(), fatura.getDescricao(), fatura.getQuantidade(),
                fatura.getPrecoPorItem(), fatura.getTotalFatura());
    }
}