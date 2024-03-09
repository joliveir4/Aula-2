import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe que dia da semana é hoje em numero: ");
        int sx = sc.nextInt();

        if (sx == 6){
            System.out.println("Hoje é sexta-feira");
        }
        else {
            System.out.println("Hoje não é sexta-feira");
        }

    }
}
