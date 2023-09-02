import java.util.Scanner;
import java.util.Collections;
import java.util.PriorityQueue;

public class D3_02930 {
	static PriorityQueue<Integer> maxheap;
	static int N, cmd, temp;
	static StringBuilder sb;
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			sb = new StringBuilder("#" + test_case);
			maxheap = new PriorityQueue<>(Collections.reverseOrder());
			N = sc.nextInt();
			
			for (int i = 0; i < N; i++) {
				cmd = sc.nextInt();
				if (cmd == 1) maxheap.add(sc.nextInt());
				else {
					if (maxheap.peek() == null) sb.append(" -1");
					else {
						sb.append(" ").append(maxheap.poll());
					}
				}
			}
			
			System.out.println(sb);
		}
		
		sc.close();
	}
}
