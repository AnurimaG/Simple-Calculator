import java.lang.*;
import java.util.Scanner;

public class Simple_CalculatorVersion2
{
    public static void main(String [] args)
    {
        System.out.println("This is a Simple Calculator");
        System.out.println("---------------------------");
        System.out.println(" ");
        int i,no;
        char operator,ask;
        do{
            Scanner s = new Scanner (System.in);
            System.out.println("How many numbers do you want to calculate ?");
            no=s.nextInt();
            double []numbers = new double[no];
            for(i=0;i<no;i++)
            {
                System.out.println("Please enter the "+(i+1)+" number : ");
                numbers[i]=s.nextDouble();
            }
            System.out.println(" ");
            System.out.println("      What you want to do? ");
            System.out.println("********************************");
            System.out.println(" ");
            System.out.println("* For Addition please select +");
            System.out.println("* For Subtraction please select -");
            System.out.println("* For Multiplication please select *");
            System.out.println("* For Division please select /");
            System.out.println("******************************");
            operator= s.next().charAt(0);
            System.out.println(" ");
            double result=numbers[0];

            while(operator != '+' && operator != '-' && operator != '*' && operator != '/' )
            {
                System.out.println("Sorry you enter wrong input!!");
                System.out.println("Kindly enter it again!!");
                System.out.println(" ");
                System.out.println("      What you want to do? ");
                System.out.println("********************************");
                System.out.println(" ");
                System.out.println("* For Addition please select +");
                System.out.println("* For Subtraction please select -");
                System.out.println("* For Multiplication please select *");
                System.out.println("* For Division please select /");
                System.out.println("******************************");
                operator= s.next().charAt(0);
                System.out.println(" ");
            }

            //According to the choice calculation
            for(i=1;i<no;i++){
                if(operator=='+')
                {
                    result = result + numbers[i];
                }
                else if(operator=='-')
                {
                    result = result - numbers[i];
                }
                else if(operator=='*')
                {
                    result=result * numbers[i];
                }
                else
                {
                    result= result/numbers[i];
                }
            }
            System.out.println("The Final Result = "+ result);
            Scanner sc = new Scanner (System.in);
            System.out.println("Would you like to calculate it again ?? Y/N");
            ask = sc.next().charAt(0);
            System.out.println(" ");
        }
        while(ask =='Y' || ask == 'y');
        System.out.println("***Thanks for using !! Visit again***");
    }

}

