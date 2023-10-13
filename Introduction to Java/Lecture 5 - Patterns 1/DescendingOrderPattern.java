/*
Print the following pattern for the given N number of rows.
Note: Print spaces between the numbers.
Pattern for N = 5
5 
5 4 
5 4 3 
5 4 3 2 
5 4 3 2 1
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 50
Sample Input 1:
7
Sample Output 1:
7
7 6
7 6 5 
7 6 5 4 
7 6 5 4 3 
7 6 5 4 3 2 
7 6 5 4 3 2 1
Sample Input 2:
6
Sample Output 2:
6
6 5 
6 5 4 
6 5 4 3 
6 5 4 3 2 
6 5 4 3 2 1
*/
import java.util.*;


public class Solution
{
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 int N = scan.nextInt();
		 int i = 1;
		 while(i<=N){
			 int j = 1;
			 while(j<=i){
				 System.out.print(N - j +1 + " ");
				 j = j + 1;
			 }
			 System.out.println();
			 i = i + 1;
		 }
	}
}