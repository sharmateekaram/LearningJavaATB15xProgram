package ex_Tasks;

import java.util.Scanner;

public class Lab_Task2025_27Dec_Triangles {
    static void main() {
        System.out.println("---Do you want to know about Types of Triangles ----");
        Scanner sc_userInput = new Scanner(System.in);
        System.out.print("Please enter first side's value : ");
        int side1 = sc_userInput.nextInt();
        System.out.print("Please enter second side's value : ");
        int side2 = sc_userInput.nextInt();
        System.out.print("Please enter third side's value : ");
        int side3 = sc_userInput.nextInt();

        System.out.println("Just wait --- Your Triangle type, based on the sides entered by you, is  ------");
        if((side1 == side2) && (side2 == side3)){
            System.out.println("         An equilateral Triangle - All three sides are equal.");
        } else if( (side1 == side2) || (side2 == side3) || (side1 == side3 ) ){
            System.out.println("         An Isosceles Triangle - Exactly 2 sides are equal.");
        }else{
            System.out.println("         A Scalene Triangle - It has three unequal sides.");
        }
    }
}
