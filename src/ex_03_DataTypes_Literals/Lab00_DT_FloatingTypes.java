package ex_03_DataTypes_Literals;

public class Lab00_DT_FloatingTypes {
    static void main(String[] args) {
        System.out.println("-------float---------------");
        //float
        float f1 = 3.14f; // float literal needs suffix 'f' or 'F'
        float f2 = 3.1433333333333333333F;
        float f3 = 1.2e-3f;
        // float f4 = 3.14; // // error: RHS is a double. Need suffix 'f' for float error java: incompatible types: possible lossy conversion from double to float
        System.out.println("float value - f1 : " +  f1 + ", f2 : " + f2  + ", f3 : " + f3);

        System.out.println("-------double---------------");
        //double
        double d = 3.12345678987;
        String s1 = "Pramod"; // Non Primitive.
        // Pramod -> p,r,a,m,o,d - chars-  String is bunch of chars
    }
}
