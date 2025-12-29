package ex_06_TernaryOperator;

public class Labb_TO {

    static void main() {

        //        byte s = 120;
        //        > result = condition1 ? expression1 : (condition2 ? expression2 : expression3);

        int marks1 = 100;
        String result = (marks1 >= 40)? "PASS":"FAIL";
        System.out.println(result);


        int marks2 = 150;
        String result1 = (marks2 > 70) ? "PASS" : "FAIL";
        System.out.println(result1);
        int marks3 = 50;
        System.out.println((marks3 > 70) ? "PASS" : "FAIL");

        //max/min among 2 numbers
        int x = 10, y = 20;
        System.out.println( "Max number is "+ ((x > y) ? x : y ));
        System.out.println( "Min number is "+ ((x < y) ? x : y ) );

    }
}
