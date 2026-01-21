package ex_Tasks;

import java.util.Scanner;

public class Lab_Task2025_11Jan_JavaCodingTest {

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //arithmeticOperationsOnTwoNumbers(scanner); //1) Arithmetic Operations on Two Numbers
       // evenOrOdd(scanner); //2) Even or Odd Number
       // explicitTypeCastingDoubletoInt(scanner); //3)Explicit Type Casting from double to int


        // simpleCalculator(scanner); //7) Simple Calculator
        scanner.close();
    }




        //1) Arithmetic Operations on Two Numbers
        //Description:      Write a Java program that takes two integer numbers and prints their sum,
        // difference, multiplication, division, and remainder.
        static void arithmeticOperationsOnTwoNumbers(Scanner scanner){
            System.out.println("Java program that takes two integer numbers and prints their sum, difference, multiplication, division, and remainder");
            int num1 = readInt(scanner, "Enter first num : ");
            int num2 = readInt(scanner, "Enter second num : ");

            System.out.println("Sum of "+ num1 + "+" + num2 + " is - " + (num1+num2));
            System.out.println("Difference of "+ num1 + "-" + num2 + " is - " + (num1-num2));
            System.out.println("Multiplication of "+ num1 + "*" + num2 + " is - " + (num1*num2));
            System.out.println("Dvision of "+ num1 + "/" + num2 + " is - " + (num1/num2));
            System.out.println("Remainder of "+ num1 + "%" + num2 + " is - " + (num1%num2));

        }





        //2) Even or Odd Number
        // Description: Write a Java program to check whether a given number is even or odd using arithmetic operators.
        static void  evenOrOdd(Scanner scanner){
            System.out.println("program to check whether a given number is even or odd using arithmetic operators.");
            int number = readInt(scanner, "Enter a number :");
            if(number % 2 == 0){
                System.out.println(number + " is an even number.");
            }else
                System.out.println(number + " is an odd number.");
        }


        //3) Explicit Type Casting
        //Description: Write a Java program to convert a double value into an int using explicit type casting and print both values.
        static void explicitTypeCastingDoubletoInt(Scanner scanner){
            System.out.println("Java program to convert a double value into an int using explicit type casting and print both values.");
            double number = readDouble(scanner, "Enter a number of double data type : ");
            System.out.println("Original double number is - " + number);

            int intNum = (int) number;
            System.out.println("Converted int value is - " + intNum);


        }


        //4) Maximum of Two Numbers
        //Description: Write a Java program to find the maximum of two numbers using the ternary operator.


        //5) Positive, Negative or Zero
        //Description:Write a Java program to check whether a given number is positive, negative, or zero using the ternary operator.


        //6) Day of the Week
        //Description: Write a Java program to print the name of the day based on a number (1–7) using a switch statement.


        //7) Simple Calculator
        //Description: Write a Java program to perform addition, subtraction, multiplication, or division based on user choice using a switch statement.
        static void simpleCalculator(Scanner scanner){
            int num1 = readInt(scanner, "enter First num : ");
            int num2 = readInt(scanner, "enter Second num : ");

            System.out.print("Please enter Operation name : ");
            String opeName = scanner.next();
            if(opeName.matches("^[a-zA-Z]+$")){
                int opeFinalResult = allArithmeticOperation(num1, num2, opeName);
                System.out.println(opeName + " of " + num1 + ", and " +num2 + " is - "+  opeFinalResult);
            }else{
                System.out.println("Dear User!! Method name should be a string!!!");
            }
        }
        public static int allArithmeticOperation(int num1, int num2, String opeName){
            int opeResult =0;
            switch(opeName.toLowerCase())
            {
                case "addition", "sum":
                    opeResult = num1+num2;
                    break;
                case "subtraction", "minus" :
                    opeResult = num1-num2;
                    break;
                case "multiply" :
                    opeResult = num1*num2;
                    break;
                case "division", "divide" :
                    opeResult = num1/num2;
                    break;
                case "modulus", "remainder" :
                    opeResult = num1%num2;
                    break;

                default:
                    System.out.println("Please enter valid operation name");
                    System.exit(0);

            }
            return opeResult;
        }

        //8) Month Name Finder
        //Description: Write a Java program to print the month name based on the month number (1–12) using a switch statement.



        //9) Print Numbers Using do-while
        //Description: Write a Java program to print numbers from 1 to 10 using a do-while loop.

        //10) Print Even Numbers
        //Description: Write a Java program to print all even numbers between 1 and 50 using a do-while loop.

        //11) Reverse a Number
        //Description: Write a Java program to reverse a given number using a do-while loop.

        //12) Break Statement Example
        //Description: Write a Java program to print numbers from 1 to 10, but stop the loop when the number becomes 5 using the break statement.

        //13) Continue Statement Example
        //Description:  Write a Java program to print numbers from 1 to 10, but skip printing the number 5 using the continue statement.



    public static int readInt(Scanner scanner, String prompt){
        System.out.print(prompt);
        if(scanner.hasNextInt())
        {
            return scanner.nextInt();
        }else{
            System.out.println("please enter integer value only");
            System.exit(0);
            return 0;
        }
    }
    public static double readDouble(Scanner scanner, String prompt){
        System.out.print(prompt);
        if(scanner.hasNextDouble())
        {
            return scanner.nextDouble();
        }else{
            System.out.println("please enter double value only");
            System.exit(0);
            return 0;
        }
    }



}
