package ex_013_Polymorphism;

public class Lab_00_runtimePolymorphism {

    static void main(String[] args) {
        Father f = new Father();
        f.home();
        Son1 s1 = new Son1();
        s1.home();
        s1.homeAnother();

        //In Java, runtime polymorphism is known by several different names and related concepts:
        //Dynamic Polymorphism OR  Late Binding OR    Dynamic Method Dispatch
        // OR Method Overriding (this is the mechanism by which runtime polymorphism is achieved)
        // OR Run-Time Binding OR  Subtype Polymorphism (a more theoretical name for the concept)
        // is an object-oriented programming concept where a function call to an overridden method is resolved at runtime rather than compile time
        //Achieved through method overriding and virtual functions (in C++) or dynamic method dispatch (in Java)
        Father fa ;
        fa = new Son1();          fa.home();
        fa = new Son2();          fa.home();
       // fa.homeAnother(); it is not  possible  as home1 is not method of father(super) class
    }
}

class Father{
    void home(){        System.out.println("Father' Home");     }

}
class Son1 extends Father {
    //@Override //it  is optional as compiler will call put it automatically
    void home(){
        System.out.println("Son 1's home");
    }

    void homeAnother(){
        System.out.println("Son 1's anpther home");
    }
}

class Son2 extends Father {
    @Override
    void home(){        System.out.println("Son 2's home");     }
}

