import java.util.Scanner;

public class Q3
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

        int lb=0;
        int ub=ar.length-1;
        int mid;
        int count=0;

        while(lb<=ub)
        {
            mid = (lb+ub)/2;
            if(sea == ar[mid])
            {
                count++;
                break;
            }
            else if(sea <ar[mid])
            {
                ub=mid-1;
            }
            else if(sea > ar[mid])
            {
                lb=mid+1;
            }
        }//end while loop
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
        Q3 obj = new Q3();
        obj.func();
    }
}