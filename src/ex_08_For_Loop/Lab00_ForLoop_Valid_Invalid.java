package ex_08_For_Loop;

public class Lab00_ForLoop_Valid_Invalid {

    static void main(String[] args) {

        //interview
        //valid way for ( I ; C ; U )
        for(int i=0;i<10;i++){

        }

        //valid way
        for (int _1 = 0; _1 < 10; _1++) {
            System.out.println(_1);
        }

        //valid way
        for (int somya = 0; somya < 10; somya++) {
            System.out.println(somya);
        }

        //valid way
        for (int tejas = 0; tejas < 18; tejas++) {
            if( tejas > 15){
                System.out.println("Gift from Papa, Iphone 99");
            }else{
                System.out.println("No Gift, you are a KID");
            }
        }


        //It won't print anything
        for (int i =0; i>10 ;) {
            System.out.println("Hello");
        }

        //valid - it will print indefine
        for(int i=0;i<10;){
            System.out.println(i);
        }


        //Valid way- allowed
        int i = 10;
        for (; i > 0; i--) {
            System.out.println(i);
        }


    }
}
