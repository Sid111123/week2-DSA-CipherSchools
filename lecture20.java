import java.util.*;

class Lecture20
{
    public static void main(String ar[])
    {
        // Jagged Array 
        int arr [][] = new int [4][];
        arr[0] = new int[] {2, 4, 6}; // Randomly chosen values
        arr[1] = new int[] {3, 5, 7, 9}; // Randomly chosen values
        arr[2] = new int[] {1, 3, 5, 7, 9, 11}; // Randomly chosen values
        arr[3] = new int[] {4, 8}; // Randomly chosen values

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
