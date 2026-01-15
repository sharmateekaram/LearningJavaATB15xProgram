package ex_02_Java_Basics;

import java.util.Random;
import java.util.Scanner;

public class Akki {

    static void main(String[] args) {

        String str1 = "Akash";
        String str2 = new String("Bhardwaj");

        System.out.println(str1.concat(str2));

        StringBuffer s = new StringBuffer("Akash");
        StringBuffer s1 = s.reverse();
        System.out.println(s==s1);
    }


}
