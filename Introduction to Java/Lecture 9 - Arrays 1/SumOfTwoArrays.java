/*
You are provided with two arrays, 'arr1' and 'arr2', both having a length of 'N'. Your task is to create a third array, 'arr3', also with a length of 'N'. Each element in 'arr3' should be the sum of the corresponding elements in 'arr1' and 'arr2'. For instance, if 'arr1[3] = 5' and 'arr2[3] = 4', then 'arr3[3] = arr1[3] + arr2[3]', resulting in 'arr3[3] = 9'.
Note:
You don't have to worry about input or output, just complete the function and return the required array.
Input Format:
First line of input contains the length 'N' of arrays.
Next 2 Lines contains N elements separated by space
Line 1: arr1
Line 2: arr2
Output Format:
N space integers denoting the elements in arr3.
constraints:
1<=N<=1000
1<=arr1[i],arr2[i]<=1000
Input 1:
4
1 2 3 4
6 2 4 5
Output 1:
7 4 7 9
Input 2:
6
9 8 5 6 2 1
3 6 7 3 2 5
Output 2:
12 14 12 9 4 6
*/

public class Solution{  
    
    
    public static int[] SumofTwoArrays(int arr1[], int arr2[]) {
        int n = arr1.length;
        int arr3[] = new int[n];
        for(int i = 0; i < n; i++){
            arr3[i] = arr1[i] + arr2[i];
        }
        return arr3;
    }
}