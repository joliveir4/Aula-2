import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numeros: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite outro numero: ");
        double num2 = sc.nextDouble();

        if (num1 > num2){
            System.out.printf("A ordem crescente desses numeros é: %.1f,%.1f",num1,num2);
        }
        else{
            System.out.printf("A ordem crescente desses numeros é: %.1f,%.1f"+num2+num1);
        }
        }
    }

