
//import java.time.LocalDate;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Verificação de elegibilidade para votação,utilizando estruturas condicionais
         * compostas if..else if..else
         * 
         * System.out.println("Verificação de elegibilidade para votação");
         * System.out.println("=========================================");
         * Scanner scanner = new Scanner(System.in);
         * LocalDate dataAtual = LocalDate.now();
         * System.out.print("Digite seu nome:");
         * String nome = scanner.nextLine();
         * System.out.println("=========================================");
         * System.out.print("Digite o ano de nascimento (AAAA):");
         * int anoNascimento = scanner.nextInt();
         * System.out.println("=========================================");
         * int idade = dataAtual.getYear() - anoNascimento;
         * System.out.println("Olá, " + nome + ".Você tem " + idade + " anos.");
         * System.out.println("=========================================");
         * System.out.println("Verificando sua elegibilidade para votação...");
         * System.out.println("=========================================");
         * if (idade < 16) {
         * System.out.println(nome + ",você não pode votar !!!");
         * System.out.println("===================================");
         * } else if ((idade >= 16 && idade < 18) || (idade > 70)) {
         * System.out.println(nome + ",o voto é opcional !!!");
         * System.out.println("===================================");
         * } else {
         * System.out.println(nome + ",o voto é obrigatório !!!");
         * System.out.println("===================================");
         * }
         * scanner.close();
         */
        /*Verificação da quantidade de pernas, condição composta switch case */
        System.out.println("Verificação de quantidade de pernas");
        System.out.println("===================================");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de pernas do animal:");
        int pernas = scanner.nextInt();
        System.out.println("===================================");
        System.out.println("Analisando o animal com " + pernas + " perna(s)...");
        System.out.println("===================================");
        switch (pernas) {
            case 0:
                System.out.println("Animal do tipo peixe ou serpente");
                System.out.println("===================================");
                break;
            case 2:
                System.out.println("Animal do tipo ave ou mamífero bípede");
                System.out.println("===================================");
                break;
            case 4:
                System.out.println("Animal do tipo mamífero quadrúpede");
                System.out.println("===================================");
                break;
            case 6:
                System.out.println("Animal do tipo inseto");
                System.out.println("===================================");
                break;
            case 8:
                System.out.println("Animal do tipo aracnídeo");
                System.out.println("===================================");
                break;
            default:
                System.out.println("Animal desconhecido");
                System.out.println("===================================");
        }
        scanner.close();
    }
}
