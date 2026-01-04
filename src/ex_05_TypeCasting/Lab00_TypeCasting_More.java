package ex_05_TypeCasting;

public class Lab00_TypeCasting_More {
    static void main(String[] args) {
        int sum = 0;
        double average;
        for (int number = 1; number <= 100; ++number) {
            sum += number;      // Final sum is int 5050
        }
        average = sum / 100;   // Won't work (average = 50.0 instead of 50.5)
        System.out.println("Average is " + average);  //Average is 50.0

        double average1 = (double)sum / 100;     // Cast sum from int to double before division, double / int -> double / double -> double
        System.out.println("(Average1 double)sum / 100 : " + average1);
        double average2 = sum / (double)100;     // Cast 100 from int to double before division, int / double -> double / double -> double
        System.out.println("Average2 sum / (double)100 : " + average2);
        double average3 = sum / 100.0;           // int / double -> double / double -> double
        System.out.println("Average3 sum / 100.0 : " + average3);
        double average4 = (double)(sum / 100);   // Won't work. why? as sum/100 is  already 50
        System.out.println("Average4 (double)(sum / 100) : " + average4);


        char c1 = '0';     // Code number 48
        char c2 = 'A';     // Code number 65
        char c3, c4;
        // char + char -> int + int -> int
        //c3 = c1 + c2;           // error: RHS evaluated to "int", cannot assign to LHS of "char"
        c3 = (char)(c1 + c2);     // Need explicit type casting, return char 'q' (code number 113)
        System.out.println(c3);       // Print 'q', as c3 is a char
        System.out.println(c1 + c2);  // Print int 113
        System.out.println((char)(c1 + c2));  // Print char 'q'

        // char + int -> int + int -> int
        //c4 = c1 + 5;            // error: RHS evaluated to "int", cannot assign to LHS of "char"
        c4 = (char)(c1 + 5);      // Need explicit type casting, return char '5' (code number 53)
        System.out.println(c4);      // Print '5', as c4 is a char
        System.out.println(c1 + 5);  // Print int 53

        //interview
        // Print the code number for 'a' to 'z'
        for (int codeNum = 'a'; codeNum <= 'z'; ++codeNum) {
            System.out.println((char)codeNum + ": " + codeNum);
        }
    }

}
