package ex_02_Java_Basics;

public class akki1 {

    static void main(String[] args) {
        def f = new def();
        f.a();

        Abb aa = new def();
        aa.a();



    }
}


abstract class Abb{
    abstract void a();
}

class def extends Abb{

    @Override
    void a() {
        System.out.println("child  method");
    }
}
