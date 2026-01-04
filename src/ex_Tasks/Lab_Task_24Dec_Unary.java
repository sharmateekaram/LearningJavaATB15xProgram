package ex_Tasks;

public class Lab_Task_24Dec_Unary {
    static void main() {
        //max/min among 3 numbers  way 1
        System.out.println("---------------Way 1 -----------------");
        int n1= 2, n2= 9, n3= -11;
        int max = (n1 > n2 && n1 > n3) ? n1: (n2 > n3 ? n2 : n3);
        System.out.println("Way 1 : Max number among "+ n1 + ", " + n2 + ", and " + n3 + " is : " + max);
        int min = (n1 < n2 && n1 < n3) ? n1: (n2 < n3 ? n2 : n3);
        System.out.println("Way 1 : Min number among "+ n1 + ", " + n2 + ", and " + n3 + " is : " + min);

        //max/min among 3 numbers  way 2
        System.out.println("---------------Way 2 -----------------");
        int max1 = (n1 > n2) ? n1 : n2;
        int maxFinal = (max1 > n3) ? max1 : n3;
        System.out.println("Way 2: Max number among "+ n1 + ", " + n2 + ", and " + n3 + " is : " + maxFinal);
        int min1 = (n1 < n2) ? n1 : n2;
        int minFinal = (min1 < n3) ? min1 : n3;
        System.out.println("Way 2: min number among "+ n1 + ", " + n2 + ", and " + n3 + " is : " + minFinal);

        //max/min among 3 numbers  way 3
        System.out.println("---------------Way 3 -----------------");
        int max3 = (n1 > n2)
                   ? ((n1 > n3) ? n1 : n3)
                   : ((n2 > n3) ? n2 : n3);
        System.out.println("Way 3: Max number among "+ n1 + ", " + n2 + ", and " + n3 + " is : " + max3);

        int min3 = (n1 < n2)
                   ? ((n1 < n3) ? n1 : n3)
                   : ((n2 < n3) ? n2 : n3);
        System.out.println("Way 3: Min number among "+ n1 + ", " + n2 + ", and " + n3 + " is : " + min3);
    }
}
