package ex_06_If_Condition;

import java.util.Scanner;

public class Lab00_If_Scanner {
    static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        System.out.println("Enter your Name");
        String name = s.nextLine();
        System.out.println("Hello " + name + ", Please Enter your Age");
        int age = s.nextInt();
        if(age>=18){
            System.out.println(name+ ", You can Vote.");
        }else{
            System.out.println("Sorry " + name+ ", You can't Vote as you are not 18.");
        }



    }
}
