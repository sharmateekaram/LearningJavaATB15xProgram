package ex_Tasks;

public class Lab_Task_26Dec_IncreDecreOperators {
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
