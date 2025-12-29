package ex_02_Java_Basics;

public class Prac {
    static void main() {

        int a = 10;
        a = a++ + a++ + a++;
        System.out.println(a);

        int ab = 3;
        int b = ab++ * ++ab;
        System.out.println(b);

        int ac = 5;
        System.out.println(ac++ + ac--);

    }
}
