import java.util.Scanner;

public class challenge6 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Loan amount: ");
        int p = obj.nextInt();
        System.out.println("Enter the Interest rate: ");
        float r = obj.nextFloat();
        System.out.println("Enter the Time period(in years): ");
        int t = obj.nextInt();
        double res = p;

        for(int i=0;i<t;i++){
            
            double mult= 1+(r/100);
            res =res*mult;
            System.out.println("The amount for year "+(i+1)+" is: "+res);
        }
        
    }
}
