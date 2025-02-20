import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    static int Escolha()
    {
        int opcao;

        do
        {
            System.out.println("Escolha uma opC'C#o:");
            System.out.println("+--------------------+");
            System.out.println("| 1- Soma            |");
            System.out.println("| 2- SubtraC'C#o       |");
            System.out.println("| 3- MultiplicaC'C#o   |");
            System.out.println("| 4- DivisC#o         |");
            System.out.println("| 5- Sair            |");
            System.out.println("+--------------------+");

            opcao = scanner.nextInt();

            if (opcao < 1 || opcao > 5)
            {
                System.out.println("OpiC'C#o invalida, tente outra vez.");
            }
        } while (opcao < 1 || opcao > 5);

        return opcao;
    }

    static Double Soma(double a, double b)
    {
        return a + b;
    }

    static Double Subtracao(double a, double b)
    {
        return a - b;
    }

    static Double Multiplicacao(double a, double b)
    {
        return a * b;
    }

    static Double Divisao(double a, double b)
    {
        return a / b;
    }

    public static void main(String[] args)
    {
        int opcao;
        double numero = 0, numero2 = 0, result;

        do
        {

            opcao = Escolha();

            if (opcao != 5) {
                System.out.println("Digite o primeiro numero: ");
                numero = scanner.nextDouble();
                System.out.println("Digite o segundo numero: ");
                numero2 = scanner.nextDouble();
            }
            switch(opcao)
            {
                case 1:
                    result = Soma(numero,numero2);
                    System.out.println(numero + " + " + numero2 + " = " + result);
                    break;
                case 2:
                    result = Subtracao(numero,numero2);
                    System.out.println(numero + " - " + numero2 + " = " + result);
                    break;
                case 3:
                    result = Multiplicacao(numero,numero2);
                    System.out.println(numero + " * " + numero2 + " = " + result);
                    break;
                case 4:
                    result = Divisao(numero,numero2);
                    System.out.println(numero + " / " + numero2 + " = " + result);
                    break;
                default:
                    break;
            }
        } while (opcao != 5 );

        System.out.println("Saindo...");
    }
}