import java.util.Scanner;

public abstract class D3_06730 {
	static int N, up, down;
	static int[] block;
	static StringBuilder sb;
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            sb = new StringBuilder("#" + test_case + " ");
            N = sc.nextInt();
            block = new int[N];
            up = 0;
            down = 0;
            
            for (int i = 0; i < N; i++) {
            	block[i] = sc.nextInt();
            	
            	if (i > 0 && block[i - 1] > block[i])
            		down = Math.max(down,  block[i - 1] - block[i]);
            	else if (i > 0 && block[i - 1] < block[i])
            		up = Math.max(up, block[i] - block[i - 1]);
            }
            
            sb.append(up).append(" ").append(down);
            System.out.println(sb);
		}
		
		sc.close();
	}
}
