package ex_08_For_Loop;

import java.util.Scanner;

public class Lab00_ForLoop_zFactorialSimple {

    static void main(String[] args) {
        System.out.println("Welcome");
        Scanner scanner = new Scanner(System.in);
        int factNum = scanner.nextInt();
        System.out.println("Factorial num is : " + factNum);
        int fact =1;
        for(int i=1;i<=factNum;i++){
            fact =  fact*i;
        }
        System.out.println(fact);
    }
}
