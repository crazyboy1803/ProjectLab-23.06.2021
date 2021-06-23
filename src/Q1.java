import java.util.Scanner;
public class Q1
{
    void func()
    {
        Scanner sc = new Scanner(System.in);
        int ar[] = new int[10];
        System.out.println("Enter element in array");
        for(int i =0;i<ar.length;i++)
        {
            ar[i]=sc.nextInt();
        }
        System.out.println("Enter searching element ");
        int sea = sc.nextInt();
        int count=0;

        for(int i =0;i<ar.length-1;i++)
        {
            if(ar[i]==sea)
            {
                count++;
                break;
            }
        }
        //end while loop
        if(count>0)
        {
            System.out.println("Found");
        }
        else
        {
            System.out.println("Not Found ");
        }
    }
    public static void main(String args[])
    {
        Q1 obj = new Q1();
        obj.func();
    }
}