package ex_04_Operators;

public class Lab00_AssignmentOperator {

    static void main(String[] args) {
        // Assignment operator
        // int -> data type
        // age -> identifier
        // = -> Assignment operator
        // 10 -> Literal
        // RHV to the LH

        int a = 10;
        System.out.println("value of a " + a);
        a+=5;
        System.out.println("value of a after  a+=5  : " + a);
        System.out.println("value of a after  a+=5  : " + a);

        a-=6;
        System.out.println("value of a after  a-=6 : " + a);
        a*=10;
        System.out.println("value of a after a*=10 : " + a);
        a/=10;
        System.out.println("value of a after a/=10 : " + a);
        a%=2;
        System.out.println("value of a after  a%=2 : " + a);

        //One subtle difference between simple and compound operators is in byte, short, char binary operations. For examples,

        byte b1 = 5, b2 = 8, b3;
        b3 = (byte)(b1 + b2);    // byte + byte -> int + int -> int, need to explicitly cast back to "byte"
        //b3 = b1 + b2;            // error: RHS is int, cannot assign to byte
        b1 += b2;                // implicitly casted back to "byte"

        char c1 = '0', c2;
        c2 = (char)(c1 + 2);     // char + int -> int + int -> int, need to explicitly cast back to "char"
        //c2 = c1 + 2;             // error: RHS is int, cannot assign to char
        c1 += 2;                 // implicitly casted back to "char"

        //interview
        System.out.println('A' == 65);

        short s = 10;
        char c = 'A'; //65
        System.out.println(c + s); // 65+10

    }
}
