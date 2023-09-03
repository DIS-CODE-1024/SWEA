import java.util.Scanner;

public class D3_10580 {
	static int N, cnt;
	static int[][] wire;
	static StringBuilder sb;
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++)
		{
			sb = new StringBuilder("#" + test_case + " ");
            N = sc.nextInt();
            wire = new int[N][2];
            cnt = 0;
            
            for (int i = 0; i < N; i++) {
            	wire[i][0] = sc.nextInt();
            	wire[i][1] = sc.nextInt();
            }
            
            for (int i = 0; i < N; i++) {
            	for (int j = i + 1; j < N; j++) {
            		if (wire[i][0] > wire[j][0] && wire[i][1] < wire[j][1]) cnt++;
            		else if (wire[i][0] < wire[j][0] && wire[i][1] > wire[j][1]) cnt++;
            	}
            }
            
            sb.append(cnt);
            System.out.println(sb);
		}
		
		sc.close();
	}
}
