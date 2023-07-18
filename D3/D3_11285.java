import java.util.Scanner;

public class D3_11285 {
	static int N, x, y, score;
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            N = sc.nextInt();
            score = 0;
            for (int i = 0; i < N; i++) {
                x = sc.nextInt();
                y = sc.nextInt();
                if (x == 0 && y == 0) score += 10;
                else if (x * x + y * y <= 40_000)
                	score += (220 - Math.sqrt(x * x + y * y)) / 20;
                System.out.println(score);
            }
            
            
            System.out.printf("#%d %d\n", test_case, score);
		}
		
		sc.close();
	}
}