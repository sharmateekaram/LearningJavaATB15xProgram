package ex_14_constrctor;


class Parent1{
    void home(){
        System.out.println("Hi I am parent's Home");
    }

}
class Mother{
    void home(){
        System.out.println("Hi I am Mother's Home");
    }
}
class Child1 extends Parent1{
    void home(){
        System.out.println("Hi I am child's Home");
    }
}


public class Lab_00_CompilerGeneratedDefaultConstructor {
    static void main(String[] args) {
        Child1 ch = new Child1();
        ch.home();

        Mother m1 = new Mother();
        m1.home();

        Parent1 p = new Parent1();
        p.home();

        Parent1 pc = new Child1();
        pc.home();
    }

}
