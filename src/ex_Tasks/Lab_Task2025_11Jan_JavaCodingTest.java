package ex_Tasks;

import java.util.Scanner;

public class Lab_Task2025_11Jan_JavaCodingTest {

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // arithmeticOperationsOnTwoNumbers(scanner); //1) Arithmetic Operations on Two Numbers
        // evenOrOdd(scanner); //2) Even or Odd Number
        // explicitTypeCastingDoubletoInt(scanner); //3)Explicit Type Casting from double to int
        // MaxOfTwoNum(scanner); //4) Maximum of Two Numbers
        // NumIsPosNefZero(scanner); //5) Positive, Negative or Zero
        // dayOfTheWeek(scanner); //6) Day of the Week
        // simpleCalculator(scanner); //7) Simple Calculator
        // monthNameFinder(scanner);//8) Month Name Finder
        // printUsingWhileLloop1to10(); //9) Print Numbers Using do-while 1-10
        // printEvenNum1to50(); //10) Print Even Numbers
        reverseNumber(scanner);
        // breakStatementExample(); //12) Break Statement Example
        // continueStatementExample(); //13) Continue Statement Example
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
        static void MaxOfTwoNum(Scanner scanner){
            System.out.println("Java program to find the maximum of two numbers using the ternary operator.");
            int num1 = readInt(scanner, "Please enter first number : ");
            int num2 = readInt(scanner, "Please enter second number : ");

            String max = (num1>num2)? (num1 + " is Max num than "+num2): (num2 + " is Max num than "+num1) ;
            System.out.println(max);
        }



        //5) Positive, Negative or Zero
        //Description:Write a Java program to check whether a given number is positive, negative, or zero using the ternary operator.
        static void NumIsPosNefZero(Scanner scanner){
            System.out.println("Java program to find the maximum of two numbers using the ternary operator.");
            int number = readInt(scanner, "Please enter number : ");
            String numType = (number>0) ? ("Positive") : (( number==0)? ("Zero"):("Negative"));
           System.out.println(number+" is a "+numType + " Number");
        }

        //6) Day of the Week
        //Description: Write a Java program to print the name of the day based on a number (1–7) using a switch statement.
        static void dayOfTheWeek(Scanner scanner){
            System.out.println("Java program to print the name of the day based on a number (1–7) using a switch statement.");

            int dayNum =readInt(scanner, "Please enter day number between 1-7 only : ");
            switch(dayNum){
                case 1 :
                    System.out.println(dayNum + "st day of week is " + "MONDAY");
                    break;
                case 2 :
                    System.out.println(dayNum + "nd day of week is " + "TUESDAY");
                    break;
                case 3 :
                    System.out.println(dayNum + "rd day of week is " + "WEDNESDAY");
                    break;
                case 4 :
                    System.out.println(dayNum + "th day of week is " + "THURSHDAY");
                    break;
                case 5 :
                    System.out.println(dayNum + "th day of week is " + "FRIDAY");
                    break;
                case 6 :
                    System.out.println(dayNum + "th day of week is " + "SATDAY");
                    break;
                case 7 :
                    System.out.println(dayNum + "th day of week is " + "SUNDAY");
                    break;
                default :
                    System.out.println("Please enter day Number between 1-7");
                    break;
            }
        }




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
         static void monthNameFinder(Scanner scanner){
             System.out.println("Java program to print the month name based on the month number (1–12) using a switch statement..");

             int monthNum =readInt(scanner, "Please enter month number between 1-12 only : ");
             switch(monthNum){
                 case 1 :
                     System.out.println(monthNum + "st day of month is " + "JANUARY");
                     break;
                 case 2 :
                     System.out.println(monthNum + "nd day of month is " + "FEBRUARY");
                     break;
                 case 3 :
                     System.out.println(monthNum + "rd day of month is " + "MARCH");
                     break;
                 case 4 :
                     System.out.println(monthNum + "th day of month is " + "APRIL");
                     break;
                 case 5 :
                     System.out.println(monthNum + "th day of month is " + "MAY");
                     break;
                 case 6 :
                     System.out.println(monthNum + "th day of month is " + "JUNE");
                     break;
                 case 7 :
                     System.out.println(monthNum + "th day of month is " + "JULY");
                     break;
                 case 8 :
                     System.out.println(monthNum + "th day of month is " + "AUGUST");
                     break;
                 case 9 :
                     System.out.println(monthNum + "th day of month is " + "SEPTEMBER");
                     break;
                 case 10 :
                     System.out.println(monthNum + "th day of month is " + "OCTOBER");
                     break;
                 case 11 :
                     System.out.println(monthNum + "th day of month is " + "NOVEMBER");
                     break;
                 case 12 :
                     System.out.println(monthNum + "th day of month is " + "DECEMBER");
                     break;
                 default :
                     System.out.println("Please enter month Number between 1-12");
                     break;
             }
         }


        //9) Print Numbers Using do-while
        //Description: Write a Java program to print numbers from 1 to 10 using a do-while loop.
        static void printUsingWhileLloop1to10(){
           System.out.println("Java program to print numbers from 1 to 10 using a do-while loop");
           int num=1;
            do{
                System.out.println(num);
                num++;
            }while(num<=10);
        }

        //10) Print Even Numbers
        //Description: Write a Java program to print all even numbers between 1 and 50 using a do-while loop.
        static void printEvenNum1to50(){
            System.out.println("Java program to print all even numbers between 1 and 50 using a do-while loop");
            int num=1;
            do{
                if(num%2==0){
                    System.out.println(num);
                }
                num++;
            }while(num<=50);
        }

        //11) Reverse a Number
        //Description: Write a Java program to reverse a given number using a do-while loop.
        static void reverseNumber(Scanner scanner){
            System.out.println("Java program to reverse a given number using a do-while loop.");
            long num =readLong(scanner, "Please enter a integer/Long number : ");
           // long num=98712319;
            long reverseNum=0 ;
            do{
                reverseNum =  (reverseNum*10) + (num%10);
                num = num/10;
                }while(num>0);
            System.out.println(reverseNum);

        }

        //12) Break Statement Example
        //Description: Write a Java program to print numbers from 1 to 10, but stop the loop when the number becomes 5 using the break statement.
        static void breakStatementExample(){
            System.out.println("Java program to print numbers from 1 to 10, but stop the loop when the number becomes 5 using the break statement..");
            System.out.println("Break using for loop");
            for(int i=0;i<10;i++){
                if(i==5){
                    break;
                }
                System.out.println(i);
            }

            System.out.println("Break using do while loop");

        }

        //13) Continue Statement Example
        //Description:  Write a Java program to print numbers from 1 to 10, but skip printing the number 5 using the continue statement.
        static void continueStatementExample(){
            System.out.println("Java program to print numbers from 1 to 10, but skip printing the number 5 using the continue statement");
            System.out.println("Continue using for loop");
            for(int i=0;i<10;i++){
                   if(i==5){
                       continue;
                   }
                   System.out.println(i);
               }

            System.out.println("Continue using for do while");
            int num = 1;
            do {
                if (num == 5) {
                    continue;
                }
                System.out.println(num);
                num++;
            } while (num <= 10);

            System.out.println("-------------------");
            int num1=1;
            do{
                if(num1==5){
                    System.out.println("Do While loop Num=5 skip it");
                    continue;
                }
                System.out.println(num1);
                num1++;
            }while(num1<=10);
        }


    public static int readInt(Scanner scanner, String prompt){
        System.out.print(prompt);
        if(scanner.hasNextInt()){
            return scanner.nextInt();
        }else{
            System.out.println("please enter integer value only");
            System.exit(0);
            return 0;
        }
    }
    public static double readDouble(Scanner scanner, String prompt){
        System.out.print(prompt);
        if(scanner.hasNextDouble()){
            return scanner.nextDouble();
        }else{
            System.out.println("please enter double value only");
            System.exit(0);
            return 0;
        }
    }
    public  static  long readLong(Scanner scanner, String prompt){
        System.out.println(prompt);
        if (scanner.hasNextLong()){
            return  scanner.nextLong();
        }else {
            System.out.println("please enter integer or long value only");
            System.exit(0);
            return 0;
        }
    }



}
