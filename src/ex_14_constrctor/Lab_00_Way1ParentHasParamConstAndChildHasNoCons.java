package ex_14_constrctor;

//The Conflict: If your parent class only has a parameterized constructor and no no-argument constructor
// (because you defined a constructor, the compiler didn't generate a default one), the implicit super() call
// inserted by the compiler in the subclass will fail to find a matching constructor in the parent class,
// resulting in a compile-time error.
//   Way 1 : Provide a no-argument constructor in the parent class:
//          You can explicitly add a no-argument constructor to the parent class (e.g., ParentClass() { }),
//          which the subclass's implicit super() call can then use.
class Parent_Way1{

    Parent_Way1(String name){
        System.out.println(name);
        System.out.println("Parent class parameterized constructor");
    }

    //below constructor is dded because the child class doesn;t hold a constructor then
    // error was There is no no-arg constructor available in 'ex_14_constrctor.Parent_Way1'
    Parent_Way1(){
        System.out.println("Parent class non-argumented constructor");
    }

}

//There is no no-arg constructor available in 'ex_14_constrctor.Parent_Way1'
class Child_Way1 extends Parent_Way1{
    void  home(){
        System.out.println("Child's home method");
    }

}

public class Lab_00_Way1ParentHasParamConstAndChildHasNoCons {
    static void main(String[] args) {
        System.out.println("--------Child_Way1 ch = new Child_Way1()---------");
        Child_Way1 ch = new Child_Way1();
        System.out.println("--------Parent_Way1 pch = new Child_Way1()--------");
        Parent_Way1 pch = new Child_Way1();
        System.out.println("--------Parent_Way1 p1 = new Parent_Way1()--------;");
        Parent_Way1 p1 = new Parent_Way1();
        System.out.println("--------Parent_Way1 p2 = new Parent_Way1(\"Akash\")--------");
        Parent_Way1 p2 = new Parent_Way1("Akash");

        System.out.println("--------Parent_Way1 p2 = new Parent_Way1(\"Akash\")--------");
       // Child_Way1 c2 = new Child_Way1("Akash");  ///Default constructor is invoked with arguments
    }
    
}
