package ex_Tasks;

public class Lab_Task2025_28Dec_FizzBuzz {
    static void main() {
        /*Write a program that prints numbers from 1 to 100.
        However, for multiples of 3, print "Fizz" instead of the number, and
        for multiples of 5, print "Buzz."
        For numbers that are multiples of both 3 and 5, print "FizzBuzz."
           */
        System.out.println("----------------");
        System.out.println("Write a program that prints numbers from 1 to 100. \nHowever, for multiples of 3, print \"Fizz\" instead of the number, \nand for multiples of 5, print \"Buzz.\" \nFor numbers that are multiples of both 3 and 5, print \"FizzBuzz.\"");
        for(int i=1;i<=100;i++){
            if (i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }else if(i%3==0) {
                System.out.println("Fizz");
            } else if (i%5==0){
                System.out.println("Buzz");
            }else{
                System.out.println(i + " - Neither a multiple of 3 or 5");
            }
        }
    }
}
