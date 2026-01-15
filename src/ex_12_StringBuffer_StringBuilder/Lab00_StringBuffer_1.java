package ex_12_StringBuffer_StringBuilder;

public class Lab00_StringBuffer_1 {
    static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Akash");
        System.out.println(sb);             //Akash

        System.out.println(sb.reverse());       //hsakA

        StringBuffer sb1 = new StringBuffer("Bhardwaj");
        System.out.println(sb1.toString());

        sb.append(sb1);
        System.out.println(sb);         //hsakABhardwaj


        StringBuffer sb2 = new StringBuffer("JavaLannnn");
        System.out.println(sb2);

        sb2.replace(0, 4, "C++");
        System.out.println(sb2);




    }
}
