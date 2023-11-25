
import java.util.Scanner;
public class exception {
    public static void main(String args[])
    {
        try {
            int a=10;
            int b=0;
            
        } catch (ArithmeticException e) {
            System.out.println("Math Error!!!");
        }
        Scanner tr = new Scanner(System.in);
        try {
            int[] arr = {1,2,3,4};
            System.out.println(arr[5]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Error");
        }
    }

    
}
