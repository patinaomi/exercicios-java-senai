package listaexercicios01;

import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = input.nextInt();

        if(num > 0) {
            System.out.printf("O número %d é POSITIVO.", num);
        } else if (num == 0) {
            System.out.printf("Número neutro %d", num);
        } else {
            System.out.printf("O número %d é NEGATIVO.", num);
        }
    }
}
