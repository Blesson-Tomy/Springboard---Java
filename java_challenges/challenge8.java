import java.util.Scanner;


public class challenge8 {
    public static void main(String[] args) 
    {
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter 1 to run and 0 to Exit: ");
        int in = obj1.nextInt();

        calculation answer = new calculation();
        answer.passed(in);
    }

}


class calculation
{

    static void disp(int p, float t, int r)
    {
        System.out.println("Calculating Loan based on: ");
        System.out.println("Initial Amount: "+p);
        System.out.println("Number of Years: "+t);
        System.out.println("Interest Rate: "+r+"%");

    }


    void passed(int in)
    {
        while(in!=0)
        {
            Scanner obj = new Scanner(System.in);
            System.out.println("Enter the Loan amount: ");
            int p = obj.nextInt();
            System.out.println("Enter the Interest rate: ");
            float r = obj.nextFloat();
            System.out.println("Enter the Time period(in years): ");
            int t = obj.nextInt();
            double res = p;
                

            if(p>0 && r>0 && t>0)
            {
                disp(p,  r,  t);
                
                for(int i=0;i<t;i++)
                {
                    double mult= 1+(r/100);
                    res =res*mult;
                }

            
                String ans1=Double.toString(res);
                int ans2 = ans1.indexOf(".");
                String ans= ans1.substring(0,ans2+3);
                System.out.println("The total amount due: "+ans);
            }
            else
            {
                System.out.println("Input number is 0. Please try again.");
            }
        }
    }
}