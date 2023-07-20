import java.util.Scanner;

public class D3_09658 {
	static String N;
	static float num;
	static int len;
	
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		
		for (int test_case = 1; test_case <= T; test_case++) {
			N = sc.next();
			len = N.length();
			N = N.substring(0, 3);
			
			num = Float.parseFloat(N);
			num = Math.round(num/10);
			num /= 10;
			
			if (num >= 10.0) {
				num /= 10;
				len++;
			}
			
			System.out.printf("#%d %.1f*10^%d\n", test_case, num, len-1);
		}
		
		sc.close();
	}
}
