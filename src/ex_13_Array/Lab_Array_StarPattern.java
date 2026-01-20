package ex_13_Array;

public class Lab_Array_StarPattern {
    static void main(String[] args) {

        /**
        **
        ***
        ****
        ******/
        int n = 5;
        for (int i=0;i<n;i++){
            for (int star=0;star<=i;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
