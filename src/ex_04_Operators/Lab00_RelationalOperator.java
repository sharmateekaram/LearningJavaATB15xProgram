package ex_04_Operators;

public class Lab00_RelationalOperator {
    static void main(String[] args) {
        // < Less Than
        // < =  -> Less than or equal to
        // > Greater
        // > = Greater or equal
        // == ->  Equal to (but checking)
        // != -> Not equal

        int a =10, b=20;

        Boolean elder = a > b;
        System.out.println(elder);

        Boolean younger = a<b;
        System.out.println(younger);

        System.out.println("less than equal : " + (a<=b));
        System.out.println("Greater than equal : " + (a>=b));
        System.out.println("Equal : " + (a==b));
        System.out.println("Not Equal : " + (a!=b));
        System.out.println("Not  : " + (!(a>b)));

        //interview
        //You can use == to compare two integers (byte, short, int, long) and char.
        // But do NOT use == to compare two floating-point numbers (float and double)
        // because they are NOT precise. To compare floating-point numbers,
        // set a threshold for their difference, e.g.,

        double d1 = 2.2 + 4.4;
        double d2 = 6.6;
        System.out.println(d1 == d2);  //false
        System.out.println(d1);        //6.6000000000000005
// Set a threshold for comparison with ==
        final double EPSILON = 1e-7;
        System.out.println(Math.abs(d1 - d2) < EPSILON);  //true



        boolean b1 = (10 ==11);
        System.out.println(b1);
        //interview
        long l = 100l;
        // How Bytes, Bits ?
        //  8 Bytes, 64 Bits.

    }

}
