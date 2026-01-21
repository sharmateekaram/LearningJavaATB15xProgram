package ex_10_Methods;

import java.util.Scanner;

public class Lab00_Method_Calculator_UserEnterMethodName {

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = readInt(scanner, "Enter The First Num");
        int b = readInt(scanner, "Enter The Second Num");

        System.out.println("Enter Calculation Method Name");
        String methodName = scanner.next();
        if(methodName.toLowerCase().matches("^[a-zA-Z]+$")){
            int ans= allInOne(a,b,methodName);
            System.out.println(methodName + " Of Two Num Is : "+ ans);
        }else {
            System.out.println("Bro Method name should be string!!!");
        }
        scanner.close();

    }

    private static int readInt(Scanner scanner, String prompt) {
        System.out.println(prompt);
        if (scanner.hasNextInt()){
            return scanner.nextInt();
        }else{
            System.out.println("Please enter integer number only");
            System.exit(0);
            return  0;
        }
    }


    static  int  allInOne(int a, int  b, String methodName){

        int anstoReturn=0;
        switch (methodName.toLowerCase()){
            case "sum":
                anstoReturn=  a+b;
                break;
            case "subtract":
                anstoReturn= a-b;
                break;
            case "multiply":
                anstoReturn= a*b;
                break;
            case "division":
                anstoReturn= a/b;
                break;
            case "modulus":
                anstoReturn= a%b;
                break;
            default:
                System.out.println("Enter valid method name");
                System.exit(0);
                break;
        }
        return anstoReturn;
    }
}
