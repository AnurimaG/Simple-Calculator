import java.lang.*;
import java.util.Scanner;

public class Simple_CalculatorVersion3
{
    public static void main(String [] args)
    {
        System.out.println("This is a Simple Calculator");
        System.out.println("---------------------------");
        System.out.println(" ");
        double num,result;
        char operator,ask;
        do
        {
            Scanner s = new Scanner (System.in);
            System.out.println("Enter the first number");
            result=s.nextDouble();
            while(true)
            {
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

                while(operator != '+' && operator != '-' && operator != '*' && operator != '/' && operator != '=' )
                {
                    System.out.println("Sorry you enter wrong input!!");
                    System.out.println("Kindly enter it again!!");
                    System.out.println(" ");
                    System.out.println("      What you want to do? ");
                    System.out.println("********************************");
                    System.out.println("* For Addition please select +");
                    System.out.println("* For Subtraction please select -");
                    System.out.println("* For Multiplication please select *");
                    System.out.println("* For Division please select /");
                    System.out.println("* For Result please select =");
                    System.out.println("********************************");
                    operator= s.next().charAt(0);
                    System.out.println(" ");
                }
                if(operator=='='){
                    break;
                }
                System.out.println("Enter the next number");
                num=s.nextDouble();
                //According to the choice calculation
                if(operator=='+')
                {
                    result = result + num;
                }
                else if(operator=='-')
                {
                    result = result - num;
                }
                else if(operator=='*')
                {
                    result=result * num;
                }
                else
                {
                    result= result/num;
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

