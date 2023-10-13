/*
Print the following pattern for the given N number of rows.
Pattern for N = 3
A
A B
A B C
Input Format:
Integer N (Total no. of rows)
Output Format:
Pattern in N lines
Constraints:
10 <= N <= 50
Sample Input 1:
3
Sample Output 1:
A
A B
A B C
Sample Input 2:
5  
Sample Output 2:
A
A B
A B C
A B C D
A B C D E
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
				 System.out.print((char)('A' + j - 1));
				 System.out.print(" ");
				 j = j + 1;
			 }
			 System.out.println();
			 i = i + 1;
		 }
	}
}