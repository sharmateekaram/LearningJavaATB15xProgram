package ex_02_Java_Basics;
public class Akki {
    static void main(String[] args) {
    A a = new A("akash");
    B b = new B("akash");
    System.out.println(a.name);
    System.out.println(b.nameVal);
    }
}
 class A{
    String name;
    A(String name){
        this.name =name;
    }
}
class B{
    String nameVal;
    B(String nameVal){
        nameVal =nameVal;
    }
}
