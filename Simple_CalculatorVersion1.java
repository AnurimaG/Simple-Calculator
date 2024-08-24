import java.lang.*;
import java.util.Scanner;

public class Simple_CalculatorVersion1
{
    public static void main(String [] args)
    {
        System.out.println("This is a Simple Calculator");
        System.out.println("---------------------------");
        System.out.println(" ");
        double num1,num2,cal;
        char operator,ask;
        do{
            Scanner s = new Scanner (System.in);
            System.out.println("Please enter the 1st number : ");
            num1=s.nextDouble();
            System.out.println(" ");
            System.out.println("Please enter the 2nd number : ");
            num2=s.nextDouble();
            System.out.println(" ");
            System.out.println("      What you want to do? ");
            System.out.println("********************************");
            System.out.println(" ");
            System.out.println("* For Addition please select +");
            System.out.println("* For Subtraction please select -");
            System.out.println("* For Multiplication please select *");
            System.out.println("* For Division please select /");
            System.out.println("* For Percentage please select %");
            System.out.println("********************************");
            operator= s.next().charAt(0);
            System.out.println(" ");

            while(operator != '+' && operator != '-' && operator != '*' && operator != '/' && operator != '%' )
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
                System.out.println("* For Percentage please select %");
                System.out.println("********************************");
                operator= s.next().charAt(0);
                System.out.println(" ");
            }

            //According to the choice calculation
            if(operator=='+')
            {
                cal = num1 + num2;
                System.out.println("The result = "+num1+" "+operator+" "+num2+" "+"="+" "+cal);
            }
            else if(operator=='-')
            {
                if(num1>num2){
                    cal = num1-num2;
                    System.out.println("The result = "+num1+" "+operator+" "+num2+" "+"="+" "+cal);
                }
                else{
                    cal = num2-num1;
                    System.out.println("The result = "+num1+" "+operator+" "+num2+" "+"="+" "+cal);
                }
            }
            else if(operator=='*')
            {
                cal = num1*num2;
                System.out.println("The result = "+num1+" "+operator+" "+num2+" "+"="+" "+cal);
            }
            else if (operator=='/')
            {
                cal = num1/num2;
                System.out.println("The result = "+num1+" "+operator+" "+num2+" "+"="+" "+cal);
            }
            else
            {
                cal = (num1/num2)*100;
                System.out.println("The result = "+num1+" "+operator+" "+num2+" "+"="+" "+cal);
            }
            Scanner sc = new Scanner (System.in);
            System.out.println("Would you like to calculate it again ?? Y/N");
            ask = sc.next().charAt(0);
            System.out.println(" ");
        }
        while(ask =='Y' || ask == 'y');
        System.out.println("***Thanks for using !! Visit again***");
    }

}
