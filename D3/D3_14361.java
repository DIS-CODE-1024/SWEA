import java.util.Scanner;
import java.util.Arrays;

public class D3_14361 {
	static int N;
	static String result;
	static char[] num, temp;
	
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		
		for (int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();
			num = String.valueOf(N).toCharArray();
			Arrays.sort(num);
			for (int i = 2; i < 10; i++) {
				temp = String.valueOf(N * i).toCharArray();
				if (num.length != temp.length) {
					result = "impossible";
					continue;
				}
				
				Arrays.sort(temp);
				if (check()) {
					result = "possible";
					break;
				}
				result = "impossible";
			}
			
			System.out.printf("#%d %s\n", test_case, result);
		}
		
		sc.close();
	}
	
	static boolean check() {
		for (int j = 0; j < num.length; j++) {
			if (num[j] != temp[j]) {
				return false;
			}
		}
		
		return true;
	}
}
