/*
Take the principal amount, rate of interest, and the time period as input and calculate the Simple Interest.
Note: Print the answer as integer value.
Input Format:
The first line of input contains a single integer Principal amount. 

The Second line of input contains a single decimal Rate of interest.

The Third line of input contains a single Integer Time period.
Output Format:
Calculate the Simple Interest and print it.

Sample Input 1:
2000
2.2
4

Sample Output 1:
176


Explanation:
principal=2000,rate=2.2 and time=4.
Simple interest = (Principal*rate*time) /100
Hence answer is (2000*2.2*4)/100 = 176
*/

import java.util.* ;
import java.io.*; 
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner scan = new Scanner(System.in);
		int principalAmount = scan.nextInt();
		float rate = scan.nextFloat();
		int timePeriod = scan.nextInt();
		int simpleIntrest =(int) (principalAmount * rate * timePeriod)/100;
		System.out.println(simpleIntrest);
	}
}