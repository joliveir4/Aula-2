import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numeros: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite outro numero: ");
        double num2 = sc.nextDouble();

        if (num1> num2){
            System.out.println("O 1º numero é maior");
        }
        else {
            System.out.print("O 2º numero é maior");
        }
    }
}
