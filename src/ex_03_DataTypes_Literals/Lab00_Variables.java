package ex_03_DataTypes_Literals;

public class Lab00_Variables {
    static void main(String[] args){
        // data_type variable_name =  variable_value

        // Variable - Local Variable
        byte age_pramod = 45;           // byte -> data type - type of container
        //  age_sunil ->  variable_name |  identifier
        // = -> Assignment Operator ?  (after some time)
        // 45 -> Variable Value |  Literal
        System.out.println(age_pramod);

        int _ = 1;
        //System.out.println(_); //error Using '_' as a reference is not allowed
        // _  can be name of variable but printing it will give error after java 8
        int $ = 2;
        int abc = 4;
        int _123 = 5;
        int Enum = 6;

        System.out.println( $ + " " + abc + " " + _123 + " " + Enum);
       //  int @ =22;  //@ is not  allowed
       //  int 1a = 33;  //variable  can't start wit h digit\
       //  int enum =6;   // Not allowed as enum is keyword

        int this_is_a_vari_long_name_in_the_class_hello_$_akakak = 3;
        int age = 1_2_3_________6;
        System.out.println(age);

        //decimal type
        double da = 10.99876544567876544;
        double db = 10;
        float fa = 10.34F;
        float fb = 2.3f;
        float fc= 12.345678987654567f;
        float fd= 127;
        //float fe = 1.2; // decimal in float can't be used without f
                         //error : java: incompatible types: possible lossy conversion from double to float

        //Octal example
        int octal_1 = 0567;
        int octal_2 = 076____45_1_0;
        int octal_3 = 0_______________11;
        int octal_4 = -0111_________11;
       //int octal_5 = 0_8;  //error illegal digit in an octal literal
        System.out.println("Octal numbers  are : " + octal_1 + " " + octal_2 + " " + octal_3 + " " + octal_4);


        //hexa example
        long hexa_1 =  0X98765432L;
        int hexa_2 = 0x654FE____23;
        int hexa_3 = 0X0__________F;
        int hexa_4 = 0x1___4321____11;
        long hexa_5 = 0X4_98765_11;
        long hexa_6 = - 0xabcdef_1;
        long hexa_7 = 0X1_ABCDEF1;
       // int hexa_8 = 0X_777;   //java: illegal underscore
      //  int hexa_9 = 0X1_ffg; //not allowed
        System.out.println("Hexa numbers  are : " + hexa_1 + " " + hexa_2 + " " + hexa_3 + "  " + hexa_4);
        System.out.println("Hexa numbers  are : " + hexa_5 + " " + hexa_6 + " " + hexa_7);

        //binary number
        int binary_1 = 0b10101;
        int binary_2 = 0B111_11_0;
        int binary_3 = 0B0_________1;
        int binary_4  = 0b1_110;
        //int binary_5  = 0b_110;  //error java: illegal underscore
        //int binary_6  = 0b0_12;  //error java: illegal digit in a binary literal
        System.out.println("Binary numbers  are : " + binary_1 + " " + binary_2 + " " + binary_3 + " " +binary_4);


    }

}
