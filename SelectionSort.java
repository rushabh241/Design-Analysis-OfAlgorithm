import java.util.Scanner;

public class SelectionSort
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int[] arr = new int[100];
        int i,j=0;
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
            int k = i;
            for(j=i+1;j<n;j++)
            {
                if(arr[j] < arr[k])
                {
                    k = j;
                }
            }
            int t = arr[k];
            arr[k] = arr[i];
            arr[i] = t;
        }
        System.out.println("\nSorted");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+"\t");
        }

    }
}
