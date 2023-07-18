import java.util.Scanner;
import java.util.Arrays;

public class D2_01859 {
    static int N, sell, cnt, bpoint, selled;
    static Long benefit;
    static int[] price, sorted, sellpoint;
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
            price = new int[N];
            sorted = new int[N];
            sellpoint = new int[N];
            for (int i = 0; i < N; i++) {
                price[i] = sorted[i] = sc.nextInt();
            }
            benefit = 0L;
            cnt = 0;
            selled = 0;
            sell = N - 1;
            bpoint = 0;
            Arrays.sort(sorted);

            for (int i = 0; i < N; i++) {
                if (price[i] == sorted[sell]) {
                	sellpoint[cnt] = sorted[sell];
                	cnt++;
                	sell--;
                	bpoint = i;
                }
                else if (price[i] > sorted[sell]) {
                	i = bpoint;
                	sell--;
                }
                else if (i == N - 1 && bpoint != N - 1) {
                	i = bpoint;
                	sell--;
                }
            }
            
            for (int i = 0; i < N; i++) {
            	if (price[i] == sellpoint[selled]) {
            		selled++;
            	}
            	else if (selled <= cnt){
            		benefit += sellpoint[selled] - price[i];
            	}
            }
            
            sb.append(benefit);
            System.out.println(sb);
		}
		
		sc.close();
	}
}