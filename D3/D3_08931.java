import java.util.Scanner;
import java.util.Stack;

public class D3_08931 {
	static int K, sum, temp;
	static Stack<Integer> stack;
	static StringBuilder sb;
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			sum = 0;
			stack = new Stack<>();
			sb = new StringBuilder("#" + test_case + " ");
			
			K = sc.nextInt();
			for (int i = 0; i < K; i++) {
				temp = sc.nextInt();
				if (temp == 0) sum -= stack.pop();
				else {
					sum += temp;
					stack.push(temp);
				}
			}
			
			sb.append(sum);
			System.out.println(sb);
		}
		
		sc.close();
	}
}
