import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        int key = 0, opt;
        int num1, num2;
        Scanner reader = new Scanner(System.in);
        System.out.println("Basic Calculator");
        while(key == 0)
        {
            System.out.println("Operations");
            System.out.println("-----------");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Quit");
            System.out.print("Enter preferred operation: ");
            opt = reader.nextInt();
            if(opt == 5)
            {
                key = 1;
            }
            else
            {
                if(opt == 1)
                {
                    System.out.println("..Addition..");
                    System.out.print("Enter number 1: ");
                    num1 = reader.nextInt();
                    System.out.print("Enter number 2: ");
                    num2 = reader.nextInt();
                    System.out.println(num1+num2);
                }
                else if(opt == 2)
                {
                    System.out.println("..Subtraction..");
                    System.out.print("Enter number 1: ");
                    num1 = reader.nextInt();
                    System.out.print("Enter number 2: ");
                    num2 = reader.nextInt();
                    System.out.println(num1-num2);
                }
                else if(opt == 3)
                {
                    System.out.println("..Multiplication..");
                    System.out.print("Enter number 1: ");
                    num1 = reader.nextInt();
                    System.out.print("Enter number 2: ");
                    num2 = reader.nextInt();
                    System.out.println(num1*num2);
                }
                else if(opt == 4)
                {
                    System.out.println("..Division..");
                    System.out.print("Enter number 1: ");
                    num1 = reader.nextInt();
                    System.out.print("Enter number 2: ");
                    num2 = reader.nextInt();
                    System.out.println(num1/num2);
                }
                else
                {
                    System.out.println("Invalid input");
                    key = 1;
                }
            }
            System.out.println("\n");
        }
    }
}
