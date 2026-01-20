package ex_Tasks;

public class Lab_Task2026_19Jan_StarPyramid {
    static void main(String[] args) {

        int n = 5;
        for (int i=0;i<n;i++){
            for (int space=i;space<=n/2+1;space++){
                System.out.print(" ");
            }
            for (int star=0;star<=i;star++){
                System.out.print("* ");
            }
            System.out.println();
        }



            /*below loop will print n rows and last row will contain n*2-1 stars

               *
              ***
              *****
             *******
            *********

            */

        for (int i=0;i<n;i++){
            for (int space=0; space<n-i-1; space++){
                System.out.print(" ");
            }
            for (int star=0;star<i*2+1;star++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
