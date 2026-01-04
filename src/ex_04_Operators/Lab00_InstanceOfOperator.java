package ex_04_Operators;

public class Lab00_InstanceOfOperator {

    static void main(String[] args) {
        String str = new String("Akash");
        int a =10;
        System.out.println("str instanceof String : ");
        System.out.println("str instanceof String : " + str instanceof String);
        //System.out.println(a instanceof Integer);
        System.out.println("((Object)a).getClass().getSimpleName() : " + ((Object)a).getClass().getSimpleName());
    }
}
