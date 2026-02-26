package ex_15_Inheritence;


public class Lab_00_Relation {

    static void main(String[] args) {
        Father f = new Father();
        f.home();       //Father' Home
        Son s = new Son();
        s.home();       //Son's home
        Father fa ;
        fa = new Son();
        fa.home();          //Son's home
        fa= new Son22();
        fa.home();          //Son 2's home

    }
}

class Father{


    void home(){
        System.out.println("Father' Home");     }

}
class Son extends Father {
    @Override
    void home(){
        System.out.println("Son's home");     }
}

class Son22 extends Father {
    @Override
    void home(){
        System.out.println("Son 2's home");
       // super.home();
       // if parent and child has similar method then how can child use parent method in java

//        class Parent {
//            public void display() {
//                System.out.println("This is the parent's display method.");
//            }
//        }
//
//        class Child extends Parent {
//            // Overriding the display method
//            @Override
//            public void display() {
//                System.out.println("This is the child's display method.");
//
//                // Calling the parent's display method using super
//                super.display();
//            }
//        }
//
//// Main class to run the example
//        public class Main {
//            public static void main(String[] args) {
//                Child myChild = new Child();
//                myChild.display();
//            }
//        }


    }

}

