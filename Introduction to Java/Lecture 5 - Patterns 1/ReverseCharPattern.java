/*
Print the following pattern for the given N number of rows.
Pattern for N = 5
E
ED
EDC
EDCB
EDCBA
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 50
Sample Input 1:
7

Sample Output 1:
G
GF
GFE
GFED
GFEDC
GFEDCB
GFEDCBA
Sample Input 1:
6
Sample Output 1:
F
FE
FED
FEDC
FEDCB
FEDCBA
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
			int ch = 65 + N - 1;
			 while(j<=i){
				 System.out.print((char)(ch));
				 j = j + 1;
				ch = ch - 1;
			 }
			 System.out.println();
			 i = i + 1;
		 }
	}
}