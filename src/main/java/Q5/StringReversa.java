package Q5;

import java.util.Scanner;

public class StringReversa {

    public static String reverter(String input) {
        //COnverter para um arraytochar
        char[] chars = input.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        // repetição para trocar os caracteres
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        //remontar a string
        return new String(chars);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a string para ser invertida: ");
        String normal = scanner.nextLine();
        scanner.close();

        String invertida = reverter(normal);
        System.out.println("String invertida: " + invertida);
    }
}
