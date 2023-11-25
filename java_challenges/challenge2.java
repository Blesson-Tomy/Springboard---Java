
import java.util.Scanner;

public class challenge2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Loan amount: ");
        int p = obj.nextInt();
        System.out.println("Enter the Interest rate: ");
        float r = obj.nextFloat();
        System.out.println("Enter the Time period(in years): ");
        int t = obj.nextInt();

        double ans = (p*r*t)/100;
        System.out.println("The Simple Interest is: "+ans);
    }
}
