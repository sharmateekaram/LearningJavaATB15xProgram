package ex_08_For_Loop;

public class Lab00_ForLoop_Interview_Ques {

    static void main(String[] args) {


        //interview

        //it  will print infinite
        //    for(int i=0;i<10;){
        //          System.out.println(i);
        //    }


        //it won't go inside the loop but just print "End"
        for (int i = 0; i > 1 ; i++) {
            System.out.println(i);
        }
        System.out.println("End");

        //valid - updation is missing - It won't print anything
        for (int i =0; i>10 ;) {
            System.out.println("Hello");
        }

        //if condition is missing
        for (int i = 0; ; i++) {
            System.out.println(i);
            // exit code 130 , (Stop by Yourself- Kill) Red Button - interrupted by signal
        }
        // exit code 0 - Successful




    }
}
