import java.util.Scanner;
 class Demo
{
    public static void main(String[] args) 
    {
        int number;
        Scanner scan = new Scanner(System.in);
        
        number = scan.nextInt();
        scan.close();
        if(number > 0)
        {
            System.out.println("Positive");
        }
        else if(number==0)
        {
            System.out.println("Zero");
        }
        else
        {
            System.out.println("Negative");
        }
    }
}
