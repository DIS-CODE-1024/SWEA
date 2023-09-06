import java.util.Scanner;

public class D3_08673 {
	static int K, cnt, bored;
	static int[][] arr;
	static StringBuilder sb;
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            sb = new StringBuilder("#" + test_case + " ");
            K = sc.nextInt();
            cnt = 1 << K;
            arr = new int[K][cnt];
            for (int i = 0; i < cnt; i++) arr[0][i] = sc.nextInt();
            
            bored = 0;
            for (int i = 1; i < K; i++) {
            	for (int j = 0; j < (cnt / (1 << i)); j++) {
            		arr[i][j] = Math.max(arr[i - 1][j * 2], arr[i - 1][j * 2+ 1]);
            		bored += Math.abs(arr[i - 1][j * 2] - arr[i - 1][j * 2 + 1]);
            	}
            }
            bored += Math.abs(arr[K - 1][0] - arr[K - 1][1]);
            
            sb.append(bored);
            System.out.println(sb);
		}
		
		sc.close();
	}
}
