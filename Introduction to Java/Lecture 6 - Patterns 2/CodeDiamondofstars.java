/*
Print the following pattern for the given number of rows.
Note: N is always odd.


Pattern for N = 5



The dots represent spaces.



Input format :
N (Total no. of rows and can only be odd)
Output format :
Pattern in N lines
Constraints :
1 <= N <= 49
Sample Input 1:
5
Sample Output 1:
  *
 ***
*****
 ***
  *
Sample Input 2:
3
Sample Output 2:
  *
 ***
  *
  
  */


import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int firstHalf = (n+1)/2;
        int secondHalf = n - firstHalf;
        int i = 1;
        while(i<=firstHalf){
            int space = 1;
            while(space <= firstHalf - i){
                System.out.print(" ");
                space++;
            }

            int j = 1;
            while(j <= 2*i-1){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        i=secondHalf;
        while(i >= 1){
            int space = 1;
            while(space <= secondHalf - i + 1){
                System.out.print(" ");
                space++;
            }
            int j = 1;
            while(j <= 2 * i - 1){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
    }
}