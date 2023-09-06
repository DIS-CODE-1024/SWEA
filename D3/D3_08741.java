import java.util.Scanner;

public class D3_08741 {
	static String temp;
	static StringBuilder sb;
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            sb = new StringBuilder("#" + test_case + " ");
            for (int i = 0; i < 3; i++) {
            	temp = sc.next();
            	sb.append(temp.toUpperCase().charAt(0));
            }
            
            System.out.println(sb);
		}
		
		sc.close();
	}
}
