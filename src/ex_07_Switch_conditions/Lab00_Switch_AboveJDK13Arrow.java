package ex_07_Switch_conditions;

public class Lab00_Switch_AboveJDK13Arrow {

    static void main(String[] args) {
        //with arrow function -> the breaks keyword not required
        //multiple lines are not allowed with arrow function
        int a =004;
        switch (a){
            case 001-> System.out.println("001");
            case 002-> System.out.println("002");
            case 003-> System.out.println("003");
            case 004-> System.out.println("004");
            case 005-> System.out.println("005");
            default -> System.out.println("Default");
        }

    }
}
