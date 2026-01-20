package ex_Tasks;

public class Lab_Task2026_16Jan_2HighestNum {
    static void main(String[] args) {

       // int[] array = {-1001,-999,-1,-87,-34,-22,-876,-877,-23,-56,-22,-889,-1000,-12};
        int[] array = {1001,999,1,87,34,22,76,877,23,56,22,877,889,1000,12};
       // int[] array = {10001,999,1,87,34,22,76,877,23,56,22,877,889,10091};
        //int[] array = {10001,999,1,87,34,22,76,877,23,56,22,877,889,1009};

        int highestNum = Integer.MIN_VALUE;
        int secondHighestNum= Integer.MIN_VALUE;
        for (int i=0; i<array.length; i++){
            if(array[i] > highestNum){
                secondHighestNum = highestNum;
                highestNum = array[i];
            }
            if ( (array[i]>secondHighestNum) && (highestNum > array[i]) ){
                secondHighestNum = array[i];
            }
        }
        System.out.println("Highest Number is : "+ highestNum);
        System.out.println("second Highest Number is : "+ secondHighestNum);


        //another way- but it will not give accurate result if  array contains negative value
    /*    int maxNum=0;
        int secondMaxNum= 0;
        for (int i=0; i<array.length; i++){
            if(maxNum < array[i]){
                maxNum = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > secondMaxNum) {
                if(array[i] != maxNum)
                    secondMaxNum = array[i];
            }
        }
        System.out.println("MAxNum Number is : "+ maxNum);
        System.out.println("SecondMAxNum Highest Number is : "+ secondMaxNum);
*/

    }
}
