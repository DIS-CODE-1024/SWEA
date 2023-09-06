import java.util.Scanner;

public class D3_06692 {
	static int N, x;
	static float total, p;
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
            total = 0;
            
            for (int i = 0; i < N; i++) {
            	p = sc.nextFloat();
            	x = sc.nextInt();
            	total += (p * x);
            }
            
            sb.append(total);
            System.out.println(sb);
		}
		
		sc.close();
	}
}
