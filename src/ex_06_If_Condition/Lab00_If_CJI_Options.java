package ex_06_If_Condition;

public class Lab00_If_CJI_Options {
    static void main(String[] args) {

        System.out.println("-----Enter age via CJI options--------");

        int age = Integer.parseInt(args[0]);
        if (age >=18){
            System.out.println("You are eligible to VOTE");
        }else{
            System.out.println("Sorry !! you need to wait to VOTE till You are 18");
        }


    }
}
