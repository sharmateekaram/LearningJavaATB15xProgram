package ex_02_Java_Basics;

import java.util.HashSet;
import java.util.*;

public class Akki {
    static void main(String[] args) {
//    A a = new A("akash");
//        A a1 = new A("teekaram","1234");
//    //B b = new B("akash");
//    System.out.println(a.name);
//    System.out.println(a1.name +" " + a1.pswd);
//
//    B n = new B();


    Set ss = new HashSet();
    ss.add(123);
    ss.add("abc");
        ss.add("sabc");
        ss.add("seabc");
        ss.add("qsaebc");
        ss.add("fsabc");
    ss.add(true);
        ss.add('a');
        System.out.println(ss);
        System.out.println(ss.size());


//        Set ss1 = new TreeSet();
//        //ss.add(123);
//        ss1.add("abc");
//        //ss.add(true);
//        ss1.add('a');
//       // System.out.println(ss1);
        //System.out.println(ss1.size());

    }
}
 class A{
    String name;
    String pswd;
    String btn;
    A(){
       // this.name =name;
        System.out.println("abc");
    }
    A(String name, String pswd){
        this(name);
        this.pswd = pswd;
    }

     public A(String name) {
         System.out.println("afffffF");
     }

     A(String name, String pswd, String btn){
         //this(name);
         this(name, pswd);

         this.btn = btn;
     }


 }
class B extends A {
    String nameVal;
    B(){

    }

    B(String nameVal){
        super();
        nameVal =nameVal;
    }
}
