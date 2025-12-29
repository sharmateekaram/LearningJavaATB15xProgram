package ex_02_Java_Basics;

public class Lab0014_LogicalOperators {

    static void main() {

         // CHECK CONDITIONAL OPERATOR TERNARY OPERATOR

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

        System.out.println("----- AND  && Logical Operator -------------- ");
        System.out.println("true && true -> " + (true && true));
        System.out.println("true && false -> " + (true && false));
        System.out.println("false && false -> " + (false && false));
        System.out.println("false && true -> " + (false && true));






        //(10==10)
        //(10==11)

        String F = "Akash";
        String L = "Bhardwaj";
        int m = 10;
        int n = 20;
        char aa ='A';
        char bb = 'B';

        System.out.println(F+L+aa+bb);

        System.out.println(F+L+m+n);   //here it is going from left to right then it will concatenate and then for m,n it will also do concatenation
        System.out.println(F+L+(m+n)); //BODMAS
        System.out.println(m+n+F+L);  //here for math  it will do addition but  for string  it will do concatenation  always
        System.out.println(m+n+(F+L));




    }
}
