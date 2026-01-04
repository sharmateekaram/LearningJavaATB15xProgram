package ex_05_TypeCasting;

public class Lab00_TypeCasting {

    static void main() {

        //interview all
        //  Widening  -  >small to big
        //  Implicit Widening - manage internally by java/jvm : NO Data loss
        //  Explicit Widening - Need to mention by user using datatype  : NO Data loss

        //  Narrowing  -  > big to small
        //  Implicit Narrowing - NOT ALLOWED : //java: incompatible types: possible lossy conversion from float to int
        //  Explicit Narrowing - Need to mention by user using datatype  : Data loss is possible
            //|_> If bigger datatype has literal which is out of range lower datatype then  data loss will happen


        byte b1  = 10;
        int a = b1;  //  Valid syntax - Implicit - Casting Widening - JVM/ JAVA  // widening ->  implcit
        int a1 = (int)b1;  //  Valid syntax - Explicit - Widening  //// widening ->  explicit
        System.out.println("Explicit - Widening - int a1 = (int)b1 "  + a1);


        int val = 300;
        //  0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 1 0 1 1 0 0
//        byte b = val; // Implicit Narrowing
        byte b2 = (byte)val; // Explicit Narrowing
        System.out.println("Explicit Narrowing - byte b2 = (byte)val :" + b2);
        // 0 0 1 0 1 1 0 0         // 0 + 0 + 32 + 0 + 8 + 4 + 0 + 0 = **44.**
        //**(00101100)₂ = (0 × 2⁷) + (0 × 2⁶) + (1 × 2⁵) + (0 × 2⁴) + (1 × 2³) + (1 × 2²) + (0 × 2¹) + (0 × 2⁰) = (44)₁₀**

        int val2 = 127;
        byte b3 = (byte)val2;
        System.out.println("Explicit Narrowing - byte b3 = (byte)val2 : " + b3);

        long phone = 987654321l;
       // short s = phone; // Narrowing - implicit. NOT Allowed
        short s1 = (short) phone; // Narrowing - Explicit.
        System.out.println("Narrowing Explicit. - short s1 = (short) phone : " + s1);

        int course = 100;
        float NSRT_GST = 18.45f;
        //int total = course+ NSRT_GST; // Narrowing - Implicit.  //java: incompatible types: possible lossy conversion from float to int
        int total = course+ (int)NSRT_GST; // Narrowing - Explicit.
       System.out.println(" Narrowing Explicit  - int total = course+ (int)NSRT_GST: " + total);

        float total2 = course+ NSRT_GST; // widening  - Implicit
        float total3 = (float) course+ NSRT_GST; // widening  - Explicit
        System.out.println("Widening Explicit - float total3 = (float) course+ NSRT_GST : " + total2);

        char ch = 'A';
        System.out.println("char ch = 'A' : " + ch);
        int ascii = ch; // Widening
        System.out.println("int ascii = ch : " + ascii);

        int num = 66; // Narrow
        System.out.println("int num = 66 : " + num);
        char letter = (char) num;
        System.out.println("char letter = (char) num; : " + letter);

        // byte b =127;
        int a2=300;
        //short s1=a;
        //short s2=b;
        byte s3 = (byte)a2;  //explicit narrowing
        //short s4 = (short)b;  //explicit narrowing
       // System.out.println(s1);
       // System.out.println(s2);
        System.out.println(s3);
       // System.out.println(s4);





    }


}
