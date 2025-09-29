package SiteExemplo;
import java.util.Scanner;

public class Main {

    public static int idade (int anoAtual, int anoNascimento){
        return anoAtual - anoNascimento;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ano que estamos:");
        int anoAtual = sc.nextInt();
        System.out.println("Digite o ano do seu nascimento: ");
        int anoNascimento = sc.nextInt();

        int idade = idade(anoAtual, anoNascimento);
        System.out.println("Sua idade é: " + idade);
    }
}
