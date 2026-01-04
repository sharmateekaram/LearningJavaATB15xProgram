package ex_04_Operators;

public class Lab00_ArithmeticOperator {
    static void main(String[] args) {
        //interview
        //1.) Take note that NO arithmetic operations are carried out in byte, short or char.
        byte b1 = 126, b2=4, b3;
       // b3=b1 + b2;  //java: incompatible types: possible lossy conversion from int to byte
        System.out.println(((Object)b1).getClass().getSimpleName());
        System.out.println(b1);
        b1+=2;  //// Result in "int", but automatically converted back to "byte"
        System.out.println(((Object)b1).getClass().getSimpleName());
        System.out.println(b1);
        b3 = (byte) (b1 + b2);
        System.out.println("byte value : "+b3);

        short s1 = 3, s2=4, s3;
       // s3=s1 + s2;  //java: incompatible types: possible lossy conversion from int to short
        s1*=2;  //// Result in "int", but automatically converted back to "short"
        s3 = (short) (s1 + s2);
        System.out.println("short value : "+s3);

        char c1 ='A', c2 = 'B', c3, c4,c5;
        System.out.println("char value c1 = 'A' : " + c1);
       // c3 = c1 + c3;  //java: incompatible types: possible lossy conversion from int to char
       c3 = (char)(c1+c2);
       System.out.println("char value c3 = (char)(c1+c2) : " + c3);
       c4= c1;
       System.out.println("char value c4= c1 : " + c1);
       c5 = (char) (c1+1);
       System.out.println("char value c5 = (char) (c1+1) : " + c5);
       int i1 =10, i2;
       i2 = c1+i1;
        System.out.println("char  + int : " + i2);






        int a = 10;
        int b = 20;
        int c = 15;
        int sum = a + b;
        System.out.println(a+b);
        System.out.println("a+b");
        System.out.println("Addition of a=10 and b=20 way1 : " + sum);
        System.out.println("Addition of a=10 and b=20 way2 : " + (a+b));
        System.out.println("Addition of a=10 and b=20 way3 : " + a+b ); //here it is going from left to right then it will concatenate and then for a,b it will also do concatenation

        System.out.println("Subtraction of a=10 and b=20 a-b : " + (a-b));
        System.out.println("Subtraction of a=10 and b=20 b-a : " + (b-a));

        System.out.println("Multiplication of a=10 and b=20 a*b : " + (a*b));

        System.out.println("Division of a=10 and b=20 a/b : " + (a/b));
        System.out.println("Division of a=10 and b=20 b/a : " + (b/a));
        System.out.println("Division of a=10 and c=15 c/a : " + (c/a));

        System.out.println("Modulus of a=10 and b=20 a%b : " + (a%b));
        System.out.println("Modulus of a=10 and b=20 b%a : " + (b%a));
        System.out.println("Modulus of a=10 and c=15 c%a : " + (c%a));

        float f1 = 3.00f;
        float f2 = 3.14f;
        float f3 = 3;
        System.out.println("Int Float Division of c=15 and f1=3.00f c/f1 : " + (c/f1));
        System.out.println("Int Float Division of a=10 and f2=3.14f a/f2 : " + (a/f2));
        System.out.println("Int Float multiple of a=10 and d3=3 a/f3 : " + (a/f3));

        double d1 = 3.00;
        double d2 = 3.14;
        double d3 = 3;
        double d4 = 13.14;
        System.out.println("Int double Division of c=15 and d1=3.00 c/d1 : " + (c/d1));
        System.out.println("Int double Division of a=10 and d2=3.14 a/d2 : " + (a/d2));
        System.out.println("Int double multiple of a=10 and d3=3 a/d3 : " + (a/d3));
        System.out.println("division of d1 = 3.00 and d4 = 13.14 d4/d1 : " + (d4/d1));
        System.out.println("Modulus of d1 = 3.00 and d4 = 13.14 d4%d1 : " + (d4%d1));



        String F = "Akash";
        String L = "Bhardwaj";
        int m = 10;
        int n = 20;
        char aa ='A';
        char bb = 'B';

        System.out.println(F+L+aa+bb);
        //Interview
        System.out.println(F+L+m+n);   //here it is going from left to right then it will concatenate and then for m,n it will also do concatenation
        System.out.println(F+L+(m+n)); //BODMAS
        System.out.println(m+n+F+L);  //here for math  it will do addition but  for string  it will do concatenation  always
        System.out.println(m+n+(F+L));
        // First of all, whenever it sees strings,
        // it will do concatenation, and for the next
        // one also it will also do concatenation.
        // But when it sees integers first, it will do mathematical operation.
        // The second time it will see strings,
        // then it will do concatenation as well.

        System.out.println((9 * 3 / 9 + 1) * 3);
        // BODMAS
        //  // 9x3 -> 27
        // 27/9 -> 3
        // 3+1 -> 4
        // 4x3 -> 12


        System.out.println("2+2");
        System.out.println(2+2);
        //System.out.println('10/0');  //java: unclosed character literal
       // System.out.println(10/0); // / Exception in thread "main" java.lang.ArithmeticException: / by zero
        System.out.println(0/100); //
       // System.out.println(0/0);  //Exception in thread "main" java.lang.ArithmeticException: / by zero


    }
}
