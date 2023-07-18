import java.util.Scanner;

public class D3_03307 {
	static int N, cnt, max, temp;
    static int[] arr;
    
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            N = sc.nextInt();
            arr = new int[N];
            for (int i = 0; i < N; i++)
                arr[i] = sc.nextInt();
            max = 0;
            for (int i = 0; i < N; i++) {
                if (i > N - max) break;
                cnt = 1;
                temp = arr[i];
                for (int j = i + 1; j < N; j++) {
                    if (arr[j] > temp) {
                        cnt++;
                        temp = arr[j];
                    }
                }
                max = Math.max(max, cnt);
            }
            
            System.out.println("#" + test_case + " " + max);
		}
		
		sc.close();
	}
}