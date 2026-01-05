package ex_05_TypeCasting;

public class Lab00_TypeCasting_Imp {
    static void main(String[] args) {

        //sir if we narrow from short to byte but memory is within 1 byte than JVM need not cry right?
        //YES , JVM will “not cry” at runtime if the value fits in 1 byte.
         //       But it WILL still cry at compile time unless you explicitly cast.

         //Case 1: No cast → COMPILATION ERROR

        short s1 = 100;
       // byte b1 = s1;   // ❌ Compile-time error
       // Why JVM/compiler “cries” here ❓
        //Because Java does NOT check the actual value, it checks the TYPE.
       //  Java is type-safe, not value-safe.



        // Case 2: Explicit cast → JVM allows it
        short s2 = 100;
        byte b2 = (byte) s2;   // ✅ OK
 //       Value 100 fits in byte range
//       Result is correct
//       JVM is happy 😌



 //       Case 3: Explicit cast but value OVERFLOWS
        short s3 = 200;
        byte b3 = (byte) s3;
        System.out.println(b3);  //        Output:         -56





    }
}
