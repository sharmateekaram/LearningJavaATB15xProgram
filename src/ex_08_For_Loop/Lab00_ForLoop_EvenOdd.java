package ex_08_For_Loop;

public class Lab00_ForLoop_EvenOdd {

    static void main(String[] args) {

        for (int i=1;i<=50;i++){
            if (i%2==0){
                System.out.println("Even=>" + i);
            }else
                //if (i % 2 != 0) {
                System.out.println("Odd=>" + i);
        }
    }
}
