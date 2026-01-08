package ex_08_For_Loop;

import java.util.Scanner;

public class Lab00_ForLoop_zFactorialHandlingStringNegitive {

    static void main(String[] args) {
        System.out.println("Welcome");
        Scanner scanner = new Scanner(System.in);

        if(scanner.hasNextInt()){
            int factNum = scanner.nextInt();
            if(factNum>=0){
                System.out.println("Factorial num is : " + factNum);
                int fact =1;
                for(int i=1;i<=factNum;i++){
                    fact =  fact*i;
                }
                System.out.println(fact);
            }else
                System.out.println("Please enter a positive number");

        }else
            System.out.println("Pls enter a digit value");

        scanner.close();
    }
}
