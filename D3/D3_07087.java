import java.util.Scanner;

public class D3_07087 {
	static int N, result;
	static String[] title;
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
			title = new String[N];
			
			for (int i = 0; i < N; i++) title[i] = sc.next();
			result = 0;
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (title[j].charAt(0) == (char)('A' + i)) {
						result = i + 1;
						break;
					}
				}
				
				if (result < i + 1) break;
			}
			
			sb.append(result);
			System.out.println(sb);
		}
		
		sc.close();
	}
}
