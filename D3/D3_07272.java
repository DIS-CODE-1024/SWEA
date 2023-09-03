import java.util.Scanner;

public class D3_07272 {
	static String str1, str2, result;
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
			
			str1 = str1.replace("B", "2").replaceAll("[ADOPQR]", "1").replaceAll("[^ABDOPQR21]", "0");
			str2 = str2.replace("B", "2").replaceAll("[ADOPQR]", "1").replaceAll("[^ABDOPQR21]", "0");
			
			result = str1.equals(str2) ? "SAME" : "DIFF";
			sb.append(result);
			System.out.println(sb);
		}
		
		sc.close();
	}
}
