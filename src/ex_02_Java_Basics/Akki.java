package ex_02_Java_Basics;
public class Akki {
    static void main(String[] args) {
    A a = new A("akash");
        A a1 = new A("teekaram","1234");
    //B b = new B("akash");
    System.out.println(a.name);
    System.out.println(a1.name +" " + a1.pswd);
    }
}
 class A{
    String name;
    String pswd;
    String btn;
    A(){
       // this.name =name;
    }
    A(String name, String pswd){
        this(name);
        this.pswd = pswd;
    }

     public A(String name) {
     }

     A(String name, String pswd, String btn){
         //this(name);
         this(name, pswd);

         this.btn = btn;
     }


 }
class B{
    String nameVal;
    B(String nameVal){

        nameVal =nameVal;
    }
}
