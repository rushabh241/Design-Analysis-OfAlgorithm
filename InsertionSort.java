import java.util.Scanner;

public class InsertionSort
{
    public static void main(String[] args) {
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
        for(i=1;i<n;i++)
        {
            int k = arr[i];
             j = i-1;
            while(j>-1 && arr[j]>k)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = k;
        }
        System.out.println("\nSorted");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+"\t");
        }
    }
}
