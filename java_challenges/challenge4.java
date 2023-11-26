import java.util.Scanner;

public class challenge4 {
    public static void main(String[] args) {
        
         Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Loan amount: ");
        int p = obj.nextInt();
        System.out.println("Enter the Interest rate: ");
        float r = obj.nextFloat();
        System.out.println("Enter the Time period(in years): ");
        int t = obj.nextInt();
        double res = p;

        System.out.println("Calculating Loan based on: ");
        System.out.println("Initial Amount: "+p);
        System.out.println("Number of Years: "+t);
        System.out.println("Interest Rate: "+r+"%");
        for(int i=0;i<t;i++){
            
            double mult= 1+(r/100);
            res =res*mult;
        }
        String ans1=Double.toString(res);
        int ans2 = ans1.indexOf(".");
        String ans= ans1.substring(0,ans2+3);
        System.out.println("The total amount due: "+ans);
    }
}
