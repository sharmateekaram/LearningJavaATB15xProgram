package ex_14_constrctor;


/*
    It is not mandatory to write a no-argument constructor in the subclass,
    but the subclass must explicitly call a superclass constructor using super() with the appropriate parameters.
    Failure to do so will result in a compilation error.
    Here is a breakdown of the rules in Java:
    * Compiler-Generated Constructor: If you don't define any constructors in a class,
            the Java compiler automatically provides a default no-argument constructor.
            This default constructor implicitly calls the no-argument constructor of its superclass.
    * Explicit Constructor Defined: If you define any constructor (parameterized or otherwise) in a class,
            the Java compiler will not automatically generate a no-argument constructor.
    *Subclass Requirement: Every subclass constructor must ensure the superclass is initialized.
            ->If the superclass has a no-argument constructor, the subclass can implicitly or explicitly call super().
            ->If the superclass only has a parameterized constructor, the subclass must explicitly call that
             parameterized constructor using super(parameters) in the first line of its own constructor,
              passing the required arguments. The subclass does not need to have a no-argument constructor itself,
               as long as it has some constructor that makes a valid super() call.
    Therefore, the statement that a subclass must write a no-argument constructor is incorrect.
    It must provide a mechanism (an explicit super() call in any of its constructors) to properly initialize the superclass.
*/

//scenario 1   //Compiler-Generated Constructor:
class Parent111{

}
class Child111 extends Parent111 {

}

//scenario 2 : Explicit Constructor Defined: If you define any constructor (parameterized or otherwise) in a class,
class Parent222{
   Parent222(String name){
        System.out.println(name);
       System.out.println("Hello");
    }
    Parent222(){

    }

}
class Child222 extends Parent222 {
    public Child222(String akash) {
        super(akash);
    }
}


//scenario 2.2 : Explicit Constructor Defined: If you define any constructor (parameterized or otherwise) in a class,
class Parent22{
    Parent22(String name){
        System.out.println(name);
        System.out.println("Hello");
    }
    Parent22(){
        //this will call default  constructor not the  initialised one
    }
}

class Child22 extends Parent22 {
    public Child22(String akash) {
        super(akash);
    }
}

//Scenario 3:Subclass Requirement: Every subclass constructor must ensure the superclass is initialized.
class Parent333{
    Parent333(String name){
        System.out.println(name);
    }
}

class Child333 extends Parent333 {

    Child333(String name) {
        super(name);
    }
}





//if a class has a parameterized constructor it is mandatory to write a no-argument constructor
// while extending this class




public class Lab_00_Constr_2 {
    static void main(String[] args) {
        Child222 ch = new Child222("akash");
        Child22 ch2 = new Child22("bhardwaj");

    }

}
