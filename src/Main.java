import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nota do aluno: ");
        float nota = sc.nextFloat();

        if (nota >= 7) {
            System.out.println("Aprovado");
        }
         else {
            System.out.println("Reprovado");
        }


    }


    }

