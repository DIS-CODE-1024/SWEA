import java.util.Scanner;

public class D3_07227 {
	static int N;
	static int[][] worm;
	static long min, totalx, totaly;
	static boolean[] choice;
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
			worm = new int[N][2];
			choice = new boolean[N];
			
			totalx = 0;
			totaly = 0;
			for (int i = 0; i < N; i++) {
				worm[i][0] = sc.nextInt();
				worm[i][1] = sc.nextInt();
			}
			min = Long.MAX_VALUE;
			
			sol(0, 0);
			
			sb.append(min);
			System.out.println(sb);
		}
		
		sc.close();
	}
	
    private static void sol(int num, int cnt) {
    if (cnt == N / 2) {
        totalx = 0;
        totaly = 0;
         
        for (int i = 0; i < N; i++) {
            if (choice[i]) {
                totalx += worm[i][0];
                totaly += worm[i][1];
            }
            else {
                totalx -= worm[i][0];
                totaly -= worm[i][1];
            }
        }
         
        min = Math.min(min, totalx * totalx + totaly * totaly);
        return;
    }
     
    for (int i = num; i < N; i++) {
        choice[i] = true;
         
        sol(i + 1, cnt + 1);
         
        choice[i] = false;
    }
}
}
