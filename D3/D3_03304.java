import java.util.Scanner;

public class D3_03304 {
	static String str1, str2;
	static int[][] temp;
	static int len1, len2, result;
	static StringBuilder sb;
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			sb = new StringBuilder("#" + test_case + " ");
			str1 = sc.next();
			str2 = sc.next();
			len1 = str1.length();
			len2 = str2.length();
			temp = new int[len1 + 1][len2 + 2];
			
			for (int i = 1; i <= len1; i++) {
				for (int j = 1; j <= len2; j++) {
					if (str1.charAt(i - 1) == str2.charAt(j - 1)) temp[i][j] = temp[i - 1][j - 1] + 1;
					else temp[i][j] = Math.max(temp[i - 1][j], temp[i][j - 1]);
				}
			}
			
			sb.append(temp[len1][len2]);
			System.out.println(sb);
		}
		
		sc.close();
	}
}
