package ex_11_String;

public class Lab00_String_Interivew {
    static void main(String[] args) {

        //interview

        String name = "Akash";     // this point diff memory location in String Constant Pool(SCP)
        System.out.println("name = \"Akash\"); identityHashCode: " + System.identityHashCode(name));
        name = name.toUpperCase();   // this point diff memory location in SCP
        System.out.println("name = name.toUpperCase(); identityHashCode: " + System.identityHashCode(name));


        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        String s5 = new String("hello");

        // == Comparsion - String check the ref in String.
        System.out.println("s1 == s2 : " + s1 == s2);  //false
        System.out.println(s1 == s2);  //true
        System.out.println("s1 == s2 : " + (s1 == s2));  //true
        System.out.println("s1 == s3 : " + (s1 == s3));  //false
        System.out.println("s3 == s4 : " + (s3 == s4));  //false
        System.out.println("s4 == s5 : " + (s4 == s5));  //false

        // equals ( content) -> value    // equal operator assignment the value
        System.out.println("s1.equals(s2) : " + s1.equals(s2));  //true
        System.out.println("s1.equals(s3) : " + s1.equals(s3));  //true
        System.out.println("s3.equals(s4) : " + s3.equals(s4));  //true
        System.out.println("s4.equals(s5) : " + s4.equals(s5));  //false
        System.out.println("s4.equalsIgnoreCase(s5) : " + s4.equalsIgnoreCase(s5));  //true


        System.out.println("s1 == s2 : " + s1 == s2);  //false
        /*
         System.out.println("s1 == s2 : " + s1 == s2);  //false
        String Concatenation First: Java's + operator has higher precedence than the == operator when used for string concatenation. The expression is interpreted as:
        ("s1 == s2 : " + s1) == s2
        Type Mismatch:
        ("s1 == s2 : " + s1) results in a new string: "s1 == s2 : Hello".
        The expression then becomes "s1 == s2 : Hello" == "Hello".
        Compilation Error: The == operator is used to compare references for object equality.
         The left side is a complex expression resulting in a String object, while the right side is a String literal.
          Attempting to directly use the result of a string concatenation expression (which results in a new String object)
          on the left side of a top-level == comparison in a way that doesn't resolve to a simple reference comparison
           often leads to compiler issues or unexpected behavior if it were allowed.

         */
    }
}
