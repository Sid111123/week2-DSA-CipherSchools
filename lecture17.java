import java.util.*;

class Lecture17
{

    public int[] reverseArray(int arr[])
    {
        int start = 0;
        int end = arr.length-1;
        while(start<=end)
        {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
        return arr;
    }

    public static void main(String ar[])
    {
        int arr[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        Lecture17 obj = new Lecture17();
        arr = obj.reverseArray(arr);

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
