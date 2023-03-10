import java.util.*;
class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here
        int total=n+m;
        long[] arr3=new long[total];
        int i,j=0;
        
        for(i=0;i<n;i++)
        {
            arr3[j++]=arr1[i];
        }
        for(i=0;i<m;i++)
        {
            arr3[j++]=arr2[i];
        }
        Arrays.sort(arr3);
        j=0;
        
        for(i=0;i<n;i++)
        {
            arr1[i]=arr3[j++];
        }
        for(i=0;i<m;i++)
        {
            arr2[i]=arr3[j++];
        }
    }
}