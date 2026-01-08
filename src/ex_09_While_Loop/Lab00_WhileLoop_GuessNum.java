package ex_09_While_Loop;

import java.util.Random;
import java.util.Scanner;

public class Lab00_WhileLoop_GuessNum {

    static void main(String[] args) {

        Random random = new Random();
        int numToGuess = random.nextInt(100);
        //System.out.println("Guess Num is : "+ guessNum);
        System.out.println("Please guess a number");
        Scanner scanner = new Scanner(System.in);
        int guessedNum;
        int attempts = 0;

        while (true){
            //to handle if user enter anything else apart from an integer

            if(!scanner.hasNextInt()){
                System.out.println("Invalid entry !!, Please enter an integer only.");
                scanner.next(); //again asking for entry
                continue;
            }

            guessedNum = scanner.nextInt();
            attempts++;
            if(guessedNum > numToGuess){
                System.out.println("Entered number is too High");
            } else if (guessedNum < numToGuess) {
                System.out.println("Entered number is too Low");
            }else{
                System.out.println("Correct, you have taken :" + attempts);
            }

        }
    }
}
