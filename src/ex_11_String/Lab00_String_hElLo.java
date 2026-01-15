package ex_11_String;

public class Lab00_String_hElLo {
    static void main(String[] args) {

        String str = "Akash";   //aKaSh
        String newStr = "";
        for(int i=0; i < str.length(); i++){
            if(i%2==0){
                newStr =newStr + (Character.toLowerCase(str.charAt(i)));
            }else{
                newStr =newStr + (Character.toUpperCase(str.charAt(i)));
            }
        }
        System.out.println(newStr);



        StringBuilder stringBuilder = new StringBuilder("Bhardwaj");   //bHaRdWaJ
        StringBuilder newStr1 = new StringBuilder("");
        for(int i=0; i < stringBuilder.length(); i++){
            if(i%2==0){
                newStr1.append(Character.toLowerCase(stringBuilder.charAt(i)));
            }else{
                newStr1.append(Character.toUpperCase(stringBuilder.charAt(i)));
            }
        }
        System.out.println(newStr1);


    }
}
