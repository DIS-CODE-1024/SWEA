import java.util.Scanner;

public class D3_03809 {
	static int N, min;
	static char[] arr;
	static String str;
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			N = sc.nextInt();
			arr = new char[N];
			for (int i = 0; i < N; i++) arr[i] = sc.next().charAt(0);
			str = new String(arr);
			min = 0;
			
			while(str.contains(String.valueOf(min))) min++;
			System.out.printf("#%d %d\n", test_case, min);
		}
		
		sc.close();
	}
}
