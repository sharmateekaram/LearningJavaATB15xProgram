package ex_Tasks;

public class Lab_Task2026_16Jan_RevereseString {
    static void main(String[] args) {

        String str = "AkashBhardwaj";
        String reverseStr = "";
        System.out.println("Original String : "+str);
        for (int i=str.length()-1;i>=0;i--){
            // To use concat() with a char, convert char to String, concat():   Only accepts String as an argument.
           // If you pass a char, you must convert it to a String using String.valueOf(char) or Character.toString(char).
            reverseStr =  reverseStr.concat(String.valueOf(str.charAt(i)));
           // reverseStr =  reverseStr.concat(str.charAt(i));
            //reverseStr = reverseStr + str.charAt(i);
        }
        System.out.println("Reverse String : "+  reverseStr);

        StringBuilder stringBuilderReverese = new StringBuilder("");
        for (int i=str.length()-1;i>=0;i--){
            char c = str.charAt(i);
            stringBuilderReverese.append(c);
        }
        System.out.println("String builder Reverse String : "+  stringBuilderReverese);


    }
}
