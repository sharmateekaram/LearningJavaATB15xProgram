package ex_07_Switch_conditions;

import java.util.Scanner;

public class Lab00_Switch_WithScanner {

    static void main() {

        //switch(expression) {`
        //     case value1 : expression = value 1 -> `
        //        break; // break is optional
        //    `default:`
        //        `break;`
        //    `}`


        System.out.println("Enter the number from 1-7");
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()){
        int day = sc.nextInt();
            switch (day){
                case 1 :
                    System.out.println("Monday");
                    break;
                case 2 :
                    System.out.println("Tuesday");
                    break;
                case 3 :
                    System.out.println("Wednesday");
                    break;
                case 4 :
                    System.out.println("Thursday");
                    break;
                case 5 :
                    System.out.println("Friday");
                    break;
                case 6 :
                    System.out.println("Saturday");
                    break;
                case 7 :
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Please enter valid number from 1-7");
            }
        }else
            System.out.println("Please enter only digit");


    }
}
