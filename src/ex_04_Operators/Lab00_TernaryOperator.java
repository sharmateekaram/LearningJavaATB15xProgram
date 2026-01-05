package ex_04_Operators;

public class Lab00_TernaryOperator {
    static void main(String[] args) {
        //        byte s = 120;
        //        > result = condition1 ? expression1 : (condition2 ? expression2 : expression3);
//code =more
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


      int age = 20;
      String elegibleForVote = age>18 ? "Yes" : "No";
      System.out.println(elegibleForVote);

      int a = 10;
      boolean result2 = a > 10 ? true :false;
        System.out.println(result2);

        int number = -5;
        String result3 = number > 0 ? "+ve" : "-ve";
        System.out.println(result3);

        //interview
        int my_age = 21;
        String resultAge = my_age > 18 ? ( my_age> 25? "Allowed to go GOA and allow to drink" :"NOT Drink only allowed to go GOA"): ("Not Allowed to  GO");
        System.out.println(resultAge);

        int num = 13;
        String result4 = (num%2 ==0) ? "even" : "odd";
        System.out.println(result4);

        //make number to 18
        int num1 =21;
        int ans = (num1>18) ? num1-(num1-18): num1+(18-num1);
        System.out.println(ans);

        int myAge =10;
        boolean bl = myAge>18? true : false;
        if(bl){
            System.out.println("Greater than 18");
        }else
            System.out.println("Less than 18");



    }
}
