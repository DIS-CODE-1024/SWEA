import java.util.Scanner;

public class D3_09480 {
	static int N, cnt, len;
	static String[] word;
	static StringBuilder sb, set, check;
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			sb = new StringBuilder("#" + test_case + " ");
			set = new StringBuilder();
			N = sc.nextInt();
			word = new String[N];
			
			for (int i = 0; i < N; i++) word[i] = sc.next();
			cnt = 0;
			sol(0);
			
			sb.append(cnt);
			System.out.println(sb);
		}
			
		sc.close();
	}
	
	static void sol(int num) {
		if (num > N) return;
		
		for (int i = num; i < N; i++) {
			set.append(word[i]);
			if (allAlphabet(set.toString())) cnt++;
			sol(i + 1);
			set.setLength(set.length() - word[i].length());
		}
	}
	
	static boolean allAlphabet(String str) {
		check = new StringBuilder();
		len = 0;
		
		for (char C : str.toCharArray()) {
			if (check.indexOf(String.valueOf(C)) == -1) {
				check.append(C);
				len++;
			}
		}
		
		if (len == 26) return true;
		return false;
	}
}
