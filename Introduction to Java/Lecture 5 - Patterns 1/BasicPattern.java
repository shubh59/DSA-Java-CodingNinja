/*
Print the following pattern for the given N number of rows.
Pattern for N = 3
###
###
###
Input Format:
Integer N (Total no. of rows)
Output Format:
Pattern in N lines
Constraints:
0 <= N <= 50
Sample Input1:
5
Sample Output 1:
#####
#####
#####
#####
#####
Sample Input 2:
4
Sample Output 2:
####
####
####
####
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
			 while(j<=N){
				 System.out.print("#");
				 j = j + 1;
			 }
			 System.out.println();
			 i = i + 1;
		 }
	}
}