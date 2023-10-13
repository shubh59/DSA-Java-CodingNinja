/*
Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) and the grade (an uppercase character), and depending upon which the total salary is calculated as -
    totalSalary = basic + hra + da + allow – pf
where :
hra   = 20% of basic
da    = 50% of basic
allow = 1700 if grade = ‘A’
allow = 1500 if grade = ‘B’
allow = 1300 if grade = ‘C' or any other character
pf    = 11% of basic.
Round off the total salary and then print the integral part only.
Note: Try finding out a function on the internet to do so
Input format :
Basic salary & Grade (separated by space)
Output Format :
Total Salary
Constraints :
0 <= Basic Salary <= 7,500,000
Sample Input 1 :
10000 A
Sample Output 1 :
17600
Sample Input 2 :
4567 B
Sample Output 2 :
8762
Explanation of Input 2:
We have been given the basic salary as Rs. 4567. We need to calculate the hra, da and pf. 
Now when we calculate each of the, it turns out to be:
hra =  20% of Rs. 4567 = Rs. 913.4
da = 50% od Rs. 4567 = Rs. 2283.5
pf = 11% of Rs. 4567 = Rs. 502.37

Since, the grade is 'B', we take allowance as Rs. 1500.
On substituting these values to the formula of totalSalary, we get Rs. 8761.53 and now rounding it off will result in Rs. 8762 and hence the Answer.
*/


import java.util.Scanner;
import java.lang.Math;

public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner scan = new Scanner(System.in);
		float basicSalary = scan.nextFloat();
		char allow = scan.next().charAt(0);
		float hra = (basicSalary/100)*20;
		float da = (basicSalary/100)*50;
		float pf = (basicSalary/100)*11;
		int n;
		if(allow == 'A'){
			n =1700;
		}
		else if (allow == 'B') {
			n = 1500;
		} else{
			n = 1300;
		}
		float totalSalary = basicSalary + hra + da + n - pf;
		System.out.println(Math.round(totalSalary));
	}
}