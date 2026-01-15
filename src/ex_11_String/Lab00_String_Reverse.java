package ex_11_String;

import java.util.Scanner;

public class Lab00_String_Reverse {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter you num : ");
        String input = scanner.next();
        String reverse = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }
        System.out.println(reverse);

    }
}
