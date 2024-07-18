import java.util.Scanner;
public class swapping{
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.print("Enter num A: ");
     int a = input.nextInt();
     System.out.print("Enter num B: ");
     int b = input.nextInt();
     System.out.print("Before Swapping of num is \nA ="+a);
     System.out.print("\nB ="+b);
    int c = a;
     a = b;
     b = c;
    System.out.print("\nAfter Swapping of num is \nA ="+a);
    System.out.print("\nB ="+b);
        
    }
}
