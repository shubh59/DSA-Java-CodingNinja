/*
Print the following pattern for the given number of rows.
Pattern for N = 5
E
DE
CDE
BCDE
ABCDE
Input format :
N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 26
Sample Input 1:
8
Sample Output 1:
H
GH
FGH
EFGH
DEFGH
CDEFGH
BCDEFGH
ABCDEFGH
Sample Input 2:
7
Sample Output 2:
G
FG
EFG
DEFG
CDEFG
BCDEFG
ABCDEFG
*/


import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		//Your code goes here
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int ch = 65 + N;
		int i = 1;
		while(i<=N){
			int j = 1;
			ch = ch - i;
			while(j<=i){
				System.out.print((char)(ch));
				j = j + 1;
				ch = ch + 1;
			}
			System.out.println();
			i = i + 1;
		}
	}
}