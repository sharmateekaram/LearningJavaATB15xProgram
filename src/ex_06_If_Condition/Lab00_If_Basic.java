package ex_06_If_Condition;

public class Lab00_If_Basic {
    static void main(String[] args) {

        System.out.println("-----simple If------------");
        int a = 10;
        if (a==10){
            System.out.println("Yes");
        }

        System.out.println("-----simple If else------------");
        int age = 20;
        if (age > 25) {
            System.out.println("Yes you can go to GOA!");
        } else {
            System.out.println("You can't Go to GOA!!");
        }

        System.out.println("----- If elseif else------------");
        int mark = 90;
        if (mark > 90) {
            System.out.println("Grade A");
        } else if(mark>70) {
            System.out.println("Grade B");
        }else if(mark>50) {
            System.out.println("Grade C");
        }else {
            System.out.println("Try next year");
        }

        System.out.println("-----Nested If else------------");

        int age1 = 20;
        if (age1 > 18) {
                if (age1>60){
                    System.out.println("Senior Citizen");
                }else
                    System.out.println("Adult");
        }else {
            System.out.println("Minor");
        }

    }
}
