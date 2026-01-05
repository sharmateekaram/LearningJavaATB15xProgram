package ex_07_Switch_conditions;

public class Lab00_Switch_Interview_Char {

    static void main(String[] args) {

        //first
        //it  will give output as "Match ASCII" as apart from print Char value  is ASCII code only
        char ch = 'A';
        switch (ch){
            case 65:
                System.out.println("Match ASCII");
                break;
            //case 'A':   //  java: duplicate case label as 65 is already there
                //System.out.println("A");
                //break;
            default:
                System.out.println("No Match");
        }


        //second
        char ch1 = 'A';
        switch (ch1){
            case 'A':   //  java: duplicate case label as 65 is already there
                System.out.println("A");
                break;
            default:
                System.out.println("No Match");
        }
    }
}
