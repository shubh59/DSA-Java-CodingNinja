import java.util.Scanner;

public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int i = 1;
		while(i<=N){
			int j = 1;
			while(j <= N - i + 1){
				System.out.print(N-i + 1);
				j = j + 1;
			}
			System.out.println();
			i = i + 1;
		}
		
	}

}
