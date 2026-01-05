package ex_07_Switch_conditions;

public class Lab00_Switch_DefaultIsFirst {

    static void main(String[] args) {
             //Interview question if default is first case then also it will go the particular case
                 int a =11;
                 switch (-1){
                     default :
                         System.out.println("Default");
                     case (-1):
                         System.out.println("-1");
                         break;
                     case (9):
                         System.out.println("9");
                         break;
                     case (11):
                         System.out.println("11");
                         break;

                 }
    }

}
