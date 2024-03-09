import java.util.Scanner;

public class ex007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia = 0;
        boolean valorValido = false;

        while (!valorValido) {
            System.out.print("Digite um numero de 1 a 7: ");
            if (sc.hasNextInt()) {
                dia = sc.nextInt();
                 if (dia >=1 && dia<=7){
                     valorValido = true;
                 } else {
                     System.out.println("Valor fora do intervalo permitido. Por favor, digite um número entre 1 e 7.");
                 }
            }
            else {
                System.out.println("Valor inválido. Por favor, digite um número de 1 a 7: ");
                sc.next();
            }
        }
        switch (dia) {
            case 1:
                System.out.println("Hoje é domingo");
                break;
            case 2:
                System.out.println("Hoje é segunda");
                break;
            case 3:
                System.out.println("Hoje é terça");
                break;
            case 4:
                System.out.println("Hoje é quarta");
                break;
            case 5:
                System.out.println("Hoje é quinta");
                break;
            case 6:
                System.out.println("Hoje é sexta");
                break;
            case 7:
                System.out.println("Hoje é sabado");
                break;
        }
        }

    }

