package ex_03_DataTypes_Literals;

public class Lab00_DT_Integer {

    static void main(String[] args) {
        System.out.println("-------Byte and Short---------------");
        //byte
        byte smallNumber1 = 127;        // This is within the range of byte [-128, 127]
        byte smallNumber2 = -128;        // This is within the range of byte [-128, 127]
        //byte smallNumber3 = -1234;      // error: this value is out of range

        //short
        short midSizeNumber1 = 32767;  // This is within the range of short [-32768, 32767]
        short midSizeNumber2 = -32768;  // This is within the range of short [-32768, 32767]
        //short midSizeNumber3 = 123456;  // error: this value is out of range

        byte b = 10;
        short s = 10;
        System.out.println("byte value : " + b + " short value : " + s);


        System.out.println("-------int---------------");
        //int
        int number1 = 1234;   // The usual decimal
        int number2 = 01234;  // Octal 1234, Decimal 2322
        int number3 = 0017;   // Octal 17, Decimal 15
        int number4 = 0x1abc; // Hexadecimal 1ABC, decimal 15274
        int number5 = 0b01010000101000101101000010100010;
        int number6 = 0b0101_0000_1010_0010_1101_0000_1010_0010;  // break the bits with underscore
        int number7 = 2_123_456;  // break the decimal digits with underscore
        //int number8 = _123_456;   // error: cannot begin or end with underscore
        // int bbb =  null; //java: incompatible types: <nulltype> cannot be converted to int
        System.out.println( number1 + "," + number2 + "," + number3);
        System.out.println( "number4 = 0x1abc  is : " + number4);
        System.out.println( "number5 = 0b01010000101000101101000010100010  is : " + number5);
        System.out.println( "number6 = 0b0101_0000_1010_0010_1101_0000_1010_0010  is : " + number6);
        System.out.println( "number7 = 2_123_456  is : " + number7);



        System.out.println("-------long---------------");
        //long
        long long_1 = 1234;  //// Within the "int" range, no need for suffix 'L'
        long long_2 = 9876543210l;
        long long_3 = 9876543210333L;
        //int phone = 9876543210; //// Outside "int" range, suffix 'L' needed ==A long literal outside the int range requires a suffix 'L' or 'l' (avoid lowercase 'l', which could be confused with the number one '1'), e.g., 123456789012L, -9876543210l. For example,
        System.out.println("Long value - long_1 : " +  long_1 + ", long_2 : " + long_2 + ", long_3 : " + long_3);




    }

}
