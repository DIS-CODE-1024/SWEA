import java.util.Scanner;

public class D3_08556 {
	static String str;
	static int cnt, res, num, gcd;
	static StringBuilder sb;
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			sb = new StringBuilder("#" + test_case + " ");
			str = sc.next();
			str = str.replace("north", "0").replace("west", "1");
			cnt = str.length();
			res = 0;
			num = 1 << (cnt - 1);
			
			if(str.charAt(cnt - 1) == '1') res = 90 * num;
			for (int i = 2; i <= cnt; i++) {
				if (str.charAt(cnt - i) == '0') res -= 90 * (1 << cnt - i);
				else res += 90 * (1 << cnt - i);
			}
			
			if (res < 0) res = -res;
			if (res % num == 0) sb.append(res / num);
			else {
				gcd = getGCD(res, num);
				sb.append(res / gcd).append("/").append(num / gcd);
			}
			
			System.out.println(sb);
		}
		
		sc.close();
	}
	
	static int getGCD(int a, int b) {
		if (b == 0) return a;
		else return getGCD(b, a % b);
	}
}
