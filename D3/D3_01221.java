import java.util.Scanner;

public class D3_01221 {
	static int N;
	static int[] cnt;
	static String temp;
	static String[] enums = {"ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN"};
	static StringBuilder sb;
	
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		
		for (int test_case = 1; test_case <= T; test_case++) {
			sb = new StringBuilder();
			sc.next();
			N = sc.nextInt();
			cnt = new int[10];

			for (int i = 0; i < N; i++) {
				temp = sc.next();
				switch(temp) {
				case "ZRO":
					cnt[0]++;
					break;
				case "ONE":
					cnt[1]++;
					break;
				case "TWO":
					cnt[2]++;
					break;
				case "THR":
					cnt[3]++;
					break;
				case "FOR":
					cnt[4]++;
					break;
				case "FIV":
					cnt[5]++;
					break;
				case "SIX":
					cnt[6]++;
					break;
				case "SVN":
					cnt[7]++;
					break;
				case "EGT":
					cnt[8]++;
					break;
				case "NIN":
					cnt[9]++;
					break;
				}
			}
			
			System.out.println("#" + test_case);
			for (int i = 0; i < 10; i++) {
				for(int j = 0; j < cnt[i]; j++) {
					sb.append(enums[i]).append(" ");
				}
			}
			System.out.println(sb);
		}
		
		sc.close();
	}
}
