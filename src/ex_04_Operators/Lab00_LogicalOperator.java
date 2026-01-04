package ex_04_Operators;

public class Lab00_LogicalOperator {

    static void main(String[] args) {
        // CHECK CONDITIONAL OPERATOR TERNARY OPERATOR
  //code =more
        //NOR Logical Operator
        boolean a = true;
        System.out.println("----- NOR ! Logical Operator -------------- ");
        System.out.println("a is True - " +a);
        System.out.println("Single Exclamation Mark in front of True - " +!a);
        System.out.println("Double Exclamation Mark in front of True - " + !!a);


        //OR and && Logical Operator
        System.out.println("----- OR  || Logical  Operator -------------- ");
        System.out.println("true || false -> " + (true || false));
        System.out.println("true || true -> " + (true || true));
        System.out.println("false || true -> " + (false || true));
        System.out.println("false || false -> " + (false || false));
        System.out.println("true || false || true -> " + (true || false || true));

        System.out.println("----- AND  && Logical Operator -------------- ");
        System.out.println("true && true -> " + (true && true));
        System.out.println("true && false -> " + (true && false));
        System.out.println("false && false -> " + (false && false));
        System.out.println("false && true -> " + (false && true));
        System.out.println("true && false && true -> " + (true && false && true));
        System.out.println("true && false && true && ture -> " + (true && false && true && true));




        int age = 18;
        double weight = 71.23;
        int height = 191;
        boolean married = false;
        boolean attached = false;
        char gender = 'm';

        System.out.println(!married && !attached && (gender == 'm'));  //true
        System.out.println(married && (gender == 'f'));  //false
        System.out.println((height >= 180) && (weight >= 65) && (weight <= 80));  //true
        System.out.println((height >= 180) || (weight >= 90));  //true

        //Exercise: Given the year, month (1-12), and day (1-31),
        // write a boolean expression which returns true for dates before October 15, 1582.
        int year =1582, month=10, day=17;
        boolean date =   (year<1582) || (year==1582 && month<10) || (year==1582 && month==10 && day<15);
        System.out.println("Date is before oct 15, 1582 : " + date);




        // Optional to learn - Digital Electronics
        // Bitwise - Not important for Automation
        //
        // ~ - Bitwise Not,
        // >> - Right shift,
        // << Left Shift,
        // ^ - XOR


    }
}
