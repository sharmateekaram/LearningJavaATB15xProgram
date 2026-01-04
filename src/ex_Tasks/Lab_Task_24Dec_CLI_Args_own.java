package ex_Tasks;

public class Lab_Task_24Dec_CLI_Args_own {
    static void main(String[] args) {


        //user  will give  you input via command line

        System.out.println("args.length : "+ args.length);
        for (int i=0;i< args.length;i++){
            System.out.print(args[i] + " ");
        }
        System.out.println();

        String age_input_Str = args[0];
        System.out.println(age_input_Str instanceof String);


        for(int i=0;i< args.length;i++){
            String age_input_String = args[i];
            int age_user_input = Integer.parseInt(age_input_String);
            String result = age_user_input < 18 ? "Minor" : (age_user_input<=60? "Adult" :"Senior Citizen");
            System.out.println(result);
        }





    }


}
