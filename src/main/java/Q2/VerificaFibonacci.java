package Q2;

import java.util.Scanner;

public class VerificaFibonacci {

    // Lida com nº negativos e retorna true caso o numero pertença a sequencia
    public static boolean isFibonacci(int n) {
        if (n < 0) {
            return false;
        }
        int a = 0;
        int b = 1;
        if (n == 0 || n == 1) {
            return true;
        }
        while (b < n) {
            int temp = a + b;
            a = b;
            b = temp;
        }
       return b == n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o numero que deseja Verificar em Fibonacci: ");

        int num = scanner.nextInt();
        scanner.close();

        if (isFibonacci(num)) {
            System.out.println(num + " Faz parte da sequência de Fibonacci.");
        } else {
            System.out.println(num + " Não faz parte da sequência de Fibonacci.");
        }
    }
}
