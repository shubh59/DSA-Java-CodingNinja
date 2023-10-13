/*
Teacher is remarking students on the basis of their score. Criteria for remarking students are as follows:
If the score is greater than 75 to 100 then it will be remarked ‘Distinction’.
If the score is greater than 50 to 75 then it will remarked ‘Average’
If the score is between 35 - 50 then it will be remarked ‘Below Average’.

Input Format:
First line contains the score of the student.

Output Format:
First line contain the remark of the student.

Constraints:
35<=score[i]<=100

Sample Input1:
36

Sample Output 1:
Below Average

Sample Input2:
76

Sample Output 2:
Distinction
*/
import java.util.*;


public class Solution
{
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 int score = scan.nextInt();
		 if(75 < score){
			 System.out.println("Distinction");
		 }
		 else if(50 < score && score <= 75){
			 System.out.println("Average");
		 }
		 else{
			 System.out.println("Below Average");
		 }
	}
}