import java.util.Scanner;

public class D3_15758 {
	static String strS, strT;
	static StringBuilder sb;
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			sb = new StringBuilder("#" + test_case + " ");
			strS = sc.next();
			strT = sc.next();
			
			if ((strS + strT).equals(strT + strS)) sb.append("yes");
			else sb.append("no");
			
			System.out.println(sb);
		}
        
        sc.close();
	}
}
