import java.util.Scanner;

public class D3_13038 {
	static int N, cnt, day, min;
    static int[] schedule = new int[7];
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        
		for(int test_case = 1; test_case <= T; test_case++)
		{
            N = sc.nextInt();
            for (int i = 0; i < 7; i++) {
                schedule[i] = sc.nextInt();
            }
            min = Integer.MAX_VALUE;
            
            for (int i = 0; i < 7; i++) {
                if (schedule[i] == 0) continue;
                cnt = 0;
                day = i; // 시작 날짜
                while (N > cnt) {
                    if (schedule[day % 7] == 1) {
                        cnt++;
                    }
                    day++;
                }
                min = Math.min(day - i, min);
            }
            
            System.out.printf("#%d %d\n", test_case, min);
		}
		
		sc.close();
	}
}