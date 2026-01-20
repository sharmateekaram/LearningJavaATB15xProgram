package ex_11_String;

import java.util.Locale;

public class Lab00_String_Immutable {
    static void main(String[] args) {

        String name = "Akash";
        System.out.println(name.contains("s"));
        System.out.println(name.contains("S"));
        System.out.println("name = Akash; identityHashCode: " + System.identityHashCode(name));

        //interview
        name.toUpperCase(); // computes a new value and ignores it, leaving the original variable unchanged
       //name.toUpperCase();  This line calls the toUpperCase() method on the string "Akash". The method returns a new string
        // object, "AKASH", but the original name variable still references the old "Akash" string. The newly created "AKASH"
        // string is generated and immediately discarded because its return value isn't stored anywhere.
        System.out.println(name);
        System.out.println("name.toUpperCase() identityHashCode: " + System.identityHashCode(name.toUpperCase()));


        name=name.toUpperCase(); // computes the new value and updates the variable to use it.
        // name=name.toUpperCase(); This line also calls toUpperCase(), generating the new string "AKASH".
        // The crucial difference is the assignment operator (=), which reassigns the name variable to now point to the newly
        // created "AKASH" string object. The original "Akash" string becomes eligible for garbage collection (unless something else is using it).
        System.out.println(name);
        System.out.println("name=name.toUpperCase() identityHashCode: " + System.identityHashCode(name));

        name = name.concat("bhardwaj");
        System.out.println(name);
        System.out.println("name = name.concat(\"bhardwaj\"); identityHashCode: " + System.identityHashCode(name));

        String s1 = new String("Hello");
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = "Hello";

        System.out.println("s1 identityHashCode: " + System.identityHashCode(s1));
        System.out.println("s2 identityHashCode: " + System.identityHashCode(s2));
        System.out.println("s3 identityHashCode: " + System.identityHashCode(s3));
        System.out.println("s4 identityHashCode: " + System.identityHashCode(s4));

        //interview
        StringBuffer s = new StringBuffer("Akash");
        String str =s.toString();   //change string  burrfer  to string  and become  immutable
        //The s.toString() method converts a mutable StringBuffer object ("Akash") into an immutable String object.
        // It creates a new String representation of the current buffer content, allowing it to be used in methods that
        // require a String, such as System.out.println(), without modifying the original StringBuffer.

        System.out.println(s.toString());
        System.out.println(s.toString().toLowerCase());
        System.out.println(s);

    }



}
