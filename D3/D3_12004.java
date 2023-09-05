import java.util.Scanner;

public class D3_12004 {
	static int N;
	static boolean result;
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
            result = false;
            
            for (int i = 1; i < 10; i++) {
            	if (N % i == 0 && N / i < 10) {
            		result = true;
            		break;
            	}
            }
            
            sb.append(result ? "Yes" : "No");
            System.out.println(sb);
		}
		
		sc.close();
	}
}
