import java.util.Scanner;

public class D3_05356 {
	static int len;
	static String str;
	static char[][] result;
	static StringBuilder sb, temp;
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			sb = new StringBuilder("#" + test_case + " ");
			temp = new StringBuilder();
			result = new char[5][15];
			
			for (int i = 0; i < 5; i++) {
				str = sc.next();
				len = str.length();
				for (int j = 0; j < 15; j++) {
					if (j < len) result[i][j] = str.charAt(j);
					else result[i][j] = '*';
				}
			}
			
			for (int i = 0; i < 15; i++) {
				temp.append(result[0][i]).append(result[1][i]).append(result[2][i]).append(result[3][i]).append(result[4][i]);
			}
			
			str = temp.toString();
			str = str.replace("*", "");
			sb.append(str);
			System.out.println(sb);
		}
		
		sc.close();
	}
}
