import java.util.Scanner;

public class D3_04522 {
	static String word;
	static int len;
	static StringBuilder sb;
	static boolean exist;
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			sb = new StringBuilder("#" + test_case + " ");
			word = sc.next();
			len = word.length();
			exist = true;
			
			for (int i = 0; i < (len / 2); i++) {
				if (word.charAt(i) == word.charAt(len - i - 1)
						|| word.charAt(i) == '?'
						|| word.charAt(len - i - 1) == '?') {
					continue;
				}
				else {
					exist = false;
					break;
				}
			}

			if (exist) sb.append("Exist");
			else sb.append("Not exist");
			
			System.out.println(sb);
		}
        
		sc.close();
	}
}
