import java.util.Scanner;

public class bubbleSort
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int[] arr = new int[100];
        int i,j;
        System.out.println("Enter array elements");
        for(i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+"\t");
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int t;
                    t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        System.out.println("\nSorted");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+"\t");
        }
    }
}
