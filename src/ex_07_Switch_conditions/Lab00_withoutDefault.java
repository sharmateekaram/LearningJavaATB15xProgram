package ex_07_Switch_conditions;

public class Lab00_withoutDefault {
    static void main(String[] args) {

        //If no default and day is not matching then it won't print anything
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day num(1 to 7)");
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
        }
    }
}
