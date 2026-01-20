package ex_Tasks;

import java.util.Scanner;

public class Lab_Task2025_30Dec_GradeCalculator {
    static void main() {
       /* Write a program that calculates and displays the letter grade
        for a given numerical score (e.g., A, B, C, D, or E) based on the following grading scale:
        A: 90-100    B: 80-89   C: 70-79     D: 60-69    E: 0-59
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your numerical score between 1-100 : ");
        int score = sc.nextInt();

        if (score>=90 && score<=100){
            System.out.println("Grade - A");
        } else if (score>=80 && score<=89){
            System.out.println("Grade - B");
        } else if (score>=70 && score<=79){
            System.out.println("Grade - C");
        } else if (score>=60 && score<=69){
            System.out.println("Grade - D");
        } else if (score>=0 && score<=59){
            System.out.println("Grade - E  : Fail");
        } else {
            System.out.println("Please enter score between 1- 100");
        }
    }
}
