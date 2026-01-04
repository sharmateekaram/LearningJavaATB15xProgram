package ex_03_DataTypes_Literals;

public class Lab00_Constant {
    static void main(String[] args) {

        int a = 10;
        System.out.println(a);
        a = 11;
        System.out.println(a);


        final int AGE =  12;
        System.out.println(AGE);
        //AGE = 13;   //java: cannot assign a value to final variable AGE

        final float PI = 3.14f;
        //PI = 3.122f;
        System.out.println(PI);

    }
}
