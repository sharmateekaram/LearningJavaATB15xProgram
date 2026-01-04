package ex_04_Operators;

public class Lab00_UnaryOperator {

    static void main(String[] args) {

        int a = 10;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);

        // ++a ->  a= a+1
        //  Exp and Result Table
        // Line No | a | Result b
        //  8 |  10 | NA |
        //  9 |  11 | 11 |
        // 10 |  11 - a
        // 11 |  11 | 11 - print


        // POST increment  = Print first and then increase.
        int a_post = 10;
        int bval = a_post++;
        System.out.println(a_post);
        System.out.println(bval);

        // ERT ( Exp and Result Table)
        // LNo |  a_post | bval
        // 11 |  10 | NA
        // 12 |  11   |  10


        int aval = 10;
        System.out.println(aval++ + aval);
        //  A -> aval++ ->  A=10, aval = 11
        // +
        // B -> aval ->  11
        // A+B
        // 10 + 11


        // ERT
        // LNo. |  aval  | Exp (print)
        //  5  | 10 | NA
        //  6 |  11 |  21

        //code more
        int m = 10;
        System.out.println("m : " + a);   //10
        System.out.println("m++ : " + m++); //10 as it is post-increment // Assign x to  (=5), then increment x (=6). (x++ returns the oldX)

        int n= m;
        System.out.println("++m : " + ++m);    // 12 as it is already increment m++ ++m // Increment x (=6), then assign x to y (=6). (++x returns x+1)
        System.out.println("m : "+ n);    //12
        System.out.println("n : " + n);   //11 as ++m was not assigned to n
        int c=10;
        System.out.println( " c++ + c  : " + c++ + c  + ", "+ (c++ + c));
        System.out.println("c  : "+ c++ + c);


        int d=10;
        System.out.println( "++d + d : "+ ++d + d  + "," + (++d + d));

        int e=10;
        System.out.println( e++ + ++e);

        int a1 = 10;
        a = a1++ + a1++ + a1++;
        System.out.println(a1);
        System.out.println(a);    //10+11+12

        int a2 = 10;
        System.out.println("a2 : " + (a2++ + a2++ + a2++));    //10+11+12

        int ab = 3;
        int b1 = ab++ * ++ab;   //3+1 * 4+1
        System.out.println(b1);

        int ac = 5;
        System.out.println(ac++ + ac--);  //5+1 + 6-1


        int x = 10;
        System.out.println(x++ + ++x);   // 10+12
        System.out.println(x);   //12

        int y = 10;
        System.out.println(++y + ++y); //11+12
        System.out.println(y);  //12

        int xx = 10;
        int result_post = xx--;
        System.out.println(result_post); // 10
        System.out.println(xx); //9


        int yy= 10;
        int result = --yy;
        System.out.println(result); //9
        System.out.println(yy); //9

    }


}
