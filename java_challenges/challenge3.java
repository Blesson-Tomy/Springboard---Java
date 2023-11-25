
import java.util.Scanner;

public class challenge3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Loan amount: ");
        int p = obj.nextInt();
        System.out.println("Enter the Interest rate: ");
        float r = obj.nextFloat();
        System.out.println("Enter the Time period(in years): ");
        int t = obj.nextInt();

        for(int i=0;i<=t;i++){
            System.out.println("The Simple Interest for year "+(i+1)+" is: "+(p*r)/100);
        }

        double ans = (p*r*t)/100;
        System.out.println("The Total Simple Interest is: "+ans);
    }
}
