package ex_03_DataTypes_Literals;

public class Lab00_DT_Boolean {
    static void main(String[] args) {
        //Boolean
        System.out.println("-------Boolean---------------");
        boolean boolean1 = true;
        boolean boolean2 = false;
        boolean boolean3 = 5/2==0;
        boolean boolean4 = true || false;
        boolean boolean5 = true || false || true;
        boolean boolean6 = true && false && true;
        //boolean boolean7= 123; //error  : java: incompatible types: int cannot be converted to boolean
        System.out.println("boolean1 : " + boolean1 + ", boolean2 : " + boolean2 + ", boolean3 : " + boolean3 );
        System.out.println("boolean4 : " + boolean4 + ", boolean5 : " + boolean5 + ", boolean6 : " + boolean6 );

    }



}
