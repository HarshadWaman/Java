// java program array sum and array average..
import java.util.Scanner;

public class ArraySumAverage{
    public static void main(String []args) {
       System.out.println("Welcome to Array sum and Average");
       int[] numArray = Arrayutility.inputArray();
        long sum = sum(numArray);
        int avg = average(numArray);
        System.out.println("Sum of the number is: "+sum);
        System.out.println("Average of the numbers is: "+avg);
   
   
    }

    public static long sum(int[] numArray){
        long sum = 0;
        int i = 0;
        while(i < numArray.length){
            sum += numArray[i];
            i++;
        }
        return sum;

    }

    public static int average(int[] numArray){
        long sum = sum(numArray);
        return (int) (sum /numArray.length);
    }
}
