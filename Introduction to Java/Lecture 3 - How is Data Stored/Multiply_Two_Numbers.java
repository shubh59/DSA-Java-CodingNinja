/*
Write a code which takes two integers "F1" and "F2" as inputs and print their product.

Input Format
The first and only line contains two two integers, ‘F1’, and 'F2',

Output format:
Print the product of these numbers.

Constraints:
1<= F1, F2 <= 100000

Time Limit: 1-sec

Sample Input 1:
123456789  123456789

Sample Output 1:
15241578750190521

Sample Input 2:
123456 123456

Sample Output 2:
15241383936
*/
import java.util.Scanner;
public class Solution
{
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	int F1 = scan.nextInt();
	int F2 = scan.nextInt();
	long product =(long) F1 * F2;
	System.out.println(product);
	}
}