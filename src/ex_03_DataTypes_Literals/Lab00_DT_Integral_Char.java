package ex_03_DataTypes_Literals;

public class Lab00_DT_Integral_Char {
    static void main(String[] args) {
        System.out.println("-------character---------------");
        //Character
        // char ch = null;  //java: incompatible types: <nulltype> cannot be converted to char

        char c = 'A';
        char c1 = '@';
        char c2 = '_';
        char c3= 65;
        //char c4 = "a"; //error : java: incompatible types: java.lang.String cannot be converted to char
        System.out.println("char value - c : " +  c + ", c1 : " + c1 + ", c2 : " + c2 + ", c3 which is 65 : " + c3);
        // A to Z, a-z, !@#$%^&*()_+
        // char c = "A"; String - "" - bunch of chars.
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; // blank space
        System.out.println("char value - c4 : " +  c4 + ", c5 : " + c5 + ", c6 : " + c6 + ", c7: " + c7 + ", c8: " + c8);

        char ruppes = '₹';
        System.out.println("ruppes  " +  ruppes);
        char my_laugh_smily = '\u1f60'; // :)
        System.out.println("my_laugh_smily         :  "+ my_laugh_smily);


        System.out.println("-------escape sequence, which begins with a back-slash (\\) followed by a pattern ---------------");

        char letter = 'a';                 // Same as 97
        char anotherLetter = 98;           // Same as the letter 'b'
        // You can assign an integer in the range of [0, 65535] to char
        System.out.println(letter);        // 'a' printed
        System.out.println(anotherLetter); // 'b' printed instead of the number, because the type is char
        anotherLetter += 2;                // 100 or 'd'
        System.out.println(anotherLetter); // 'd' printed
        System.out.println("letter +2 : " + (letter +2)); /// char + int ⇒ int + int ⇒ int (need to cast back to char '2')

        //Special characters are represented by so-called escape sequence,
        // which begins with a back-slash (\) followed by a pattern,
        // e.g., \t for tab, \n for newline. The commonly-used escape sequences are:
        char tabChar = '\t';          // tab
        char anotherTabChar = 9;      // Code number 9 is tab
        char newlineChar = '\n';      // newline, code number 10
        char carriageReturnChar = '\r';      // Carriage-return, code number 13
        char backSlashChar = '\\';    // Since back-slash is given a special meaning,
        // to write a back-slash, use double back-slash
        char singleQuoteChar = '\'';  // Need to use escape sequence to resolve conflict
        char doubleQuoteChar = '"';   // No conflict. No need for escape sequence
        System.out.println("A tab " + tabChar + " before this; end with two newlines!" + newlineChar + newlineChar);




        // Escape Sequence
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("AkashBhardwaj");
        System.out.println("Akash"+new_line+"Bhardwaj");
        System.out.println("Akash\nBhardwaj");
        System.out.println("Akash"+tab_line+"Bhardwaj");
        System.out.println("Akash"+back_space+"Bhardwaj");
        System.out.println("Akash"+carriage_return+"Bhardwaj");

        System.out.println( " ----- ");

        System.out.println("Hi, This is a First line"+new_line+"This is second line\n This is Third line");

       //interview
        char a1 = 'A'; //  ASCII - 65
        char a2 = 'B'; //  ASCII - 66
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a1+a2);
        System.out.println(a1-a2);

    }
}
