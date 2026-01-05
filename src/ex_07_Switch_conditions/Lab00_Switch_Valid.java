package ex_07_Switch_conditions;

public class Lab00_Switch_Valid {

    static void main(String[] args) {

        //Interview - Valid - If no case/default  statement then also it won't give  any error
        long a11 = 30l;
        switch ((int) a11) {
        }

        //Interview  - duplicate case statement is  not allowed
        int a = 98;
        switch (a) {
            case 98:
                System.out.println("98");
//            case 98:
//                System.out.println("98");
        }

        //Interview  -allowed- multiple case within same line
        int itemcode = 006;
        switch (itemcode){
            case 001,002,005:
                System.out.println("All of the them are Electronic Gadget");
                break;
            case 004,006,007:
                System.out.println("This is Mech");
                break;
            default:
                System.out.println("None");
        }

    }
}
