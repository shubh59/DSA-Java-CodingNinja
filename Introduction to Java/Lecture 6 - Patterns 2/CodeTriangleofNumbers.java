/*
Print the following pattern for the given number of rows.
Pattern for N = 4



The dots represent spaces.



Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
           1
         232
       34543
     4567654
   567898765
Sample Input 2:
4
Sample Output 2:
           1
         232
       34543
     4567654
     */


import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i = 1;
		while(i <= n){
			int print = i;
			int space = 1;
			while(space <= n - i){
				System.out.print(" ");
				space = space + 1;
			}
			int num = 1;
			while(num <= i){
				System.out.print(print);
				num = num + 1;
				print = print + 1;
			}
			int dec = i - 1;
			while(dec >= 1){
				print = print - 2;
				System.out.print(print);
				print = print + 1;
				dec = dec -1;
			}
			System.out.println();
			i = i + 1;
		}
	}
}
