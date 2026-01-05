package ex_07_Switch_conditions;

import java.util.Scanner;

public class Lab0_Switch_Without_Break {

    static void main(String[] args) {

        //if there is no break statement then it will print all cases form  matching  one to default
        System.out.println("Enter the number from 1-7");
        Scanner sc = new Scanner(System.in);

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
            case 4 :
                System.out.println("Thursday");
            case 5 :
                System.out.println("Friday");
            case 6 :
                System.out.println("Saturday");
            case 7 :
                System.out.println("Sunday");
            default:
                System.out.println("Please enter valid number from 1-7");
        }
    }
}
