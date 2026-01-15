package ex_11_String;

public class Lab00_String_Functions {

    static void main(String[] args) {
        char c = 'A';
        System.out.println(c);
        System.out.println(c+2);

        String s1 = "ABCD";
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.concat("E"));
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));

        CharSequence s = "Akash";   //In Java, the primary distinction is that CharSequence is an interface,
        // while String is a concrete class that implements that interface. This means String objects can be used anywhere
        // a CharSequence is expected, but not all CharSequence objects are String objects.
        System.out.println(s);
        System.out.println(s.subSequence(1,4)); //// Extracts characters from index 1 up to (but not including) index 4


        String str = "Java".substring(2);
        System.out.println(str);

        String str5 =  "unhappy";
        System.out.println(str5.substring(2)); // returns "happy" "
        System.out.println(str5.substring(3)); // returns appy
        System.out.println(str5.substring(6)); //returns y
        System.out.println(str5.substring(7)); // returns "" (an empty string)
        //System.out.println(str5.substring(9)); // Exception in thread "main" java.lang.StringIndexOutOfBoundsException: Range [9, 7) out of bounds for length 7

        char[] arr = "Java".toCharArray();
        System.out.println(arr); // ['J', 'a', 'v', 'a']
        System.out.println("   ".isBlank());    //true
        System.out.println("".isEmpty());       //true
        System.out.println("    ".isEmpty());       //false

        System.out.println("ab".repeat(3));       //false
        System.out.println("India  ".repeat(3));       //false


        boolean b11 = "Java".equalsIgnoreCase("java");
        System.out.println(b11);

        long count = "a\nb\nc".lines().count();
        System.out.println(count);

        System.out.println("=".repeat(10));
        System.out.println("Here we got!!");
        System.out.println("=".repeat(10));



        String str6= "Java";
        char ch = str6.charAt(2);
        System.out.println(ch);

        System.out.println("ABC".compareTo("abc"));
        System.out.println("abc".compareTo("abc"));
        System.out.println("abc".compareTo("ABC"));


        int idx = "Java".indexOf("a"); // 1
        System.out.println(idx);

        int idx2 = "Java".lastIndexOf("a"); // 3
        System.out.println(idx2);

        boolean b = "".isEmpty(); // true
        System.out.println(b);

        String s11 = String.join("*", "Java", "Python");
        System.out.println(s11);

        String s12 = "Java".replace('a', 'o'); // "Jovo"
        System.out.println(s12);

        boolean b1 = "Java".startsWith("Ja"); // true
        System.out.println(b1);

        String b2 = "Java".concat("Mava"); // true
        System.out.println(b2);











    }
}
