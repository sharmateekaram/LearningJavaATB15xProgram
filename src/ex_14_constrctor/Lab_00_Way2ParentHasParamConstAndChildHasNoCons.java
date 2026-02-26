package ex_14_constrctor;

//The Conflict: If your parent class only has a parameterized constructor and no no-argument constructor
// (because you defined a constructor, the compiler didn't generate a default one), the implicit super() call
// inserted by the compiler in the subclass will fail to find a matching constructor in the parent class,
// resulting in a compile-time error.
//   Way 2 : Explicitly call the parameterized constructor in the subclass:
//          You must define a constructor in the subclass and explicitly call the parent's
//          parameterized constructor using super(arguments) as the very first statement in the
//          subclass's constructor body.
class Parent_Way2{
    Parent_Way2(String name){
        System.out.println(name);
        System.out.println("Parent class parameterized constructor");
    }
}

//There is no no-arg constructor available in 'ex_14_constrctor.Parent_Way2'
class Child_Way2 extends Parent_Way2{

    Child_Way2(){
       // super();  //Expected 1 argument but found 0
        super("abc");
        System.out.println("child class non-argument constructor");
    }

}

public class Lab_00_Way2ParentHasParamConstAndChildHasNoCons {
    static void main(String[] args) {
        System.out.println("--------Child_Way2 ch = new Child_Way2()---------");
        Child_Way2 ch = new Child_Way2();

        System.out.println("--------Parent_Way2 pch = new Child_Way2()--------");
        Parent_Way2 pch = new Child_Way2();

        System.out.println("--------Parent_Way2 p2 = new Parent_Way2(\"Akash\")--------");
        Parent_Way2 p2 = new Parent_Way2("Akash");

        System.out.println("--------Child_Way2 p2 = new Child_Way2(\"Akash\")--------");
        //Child_Way2 c2 = new Child_Way2("Akash");  //Expected no arguments but found 1
    }

}
