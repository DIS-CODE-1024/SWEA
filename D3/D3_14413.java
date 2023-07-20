import java.util.Scanner;

public class D3_14413 {
	static int N, M;
	static String temp;
	static int[] check;
	
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		
		for (int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();
			M = sc.nextInt();
			check = new int[4];
			
			for (int i = 0; i < N; i++) {
				temp = sc.next();
				
				for (int j = 0; j < M; j++) {
					if (temp.charAt(j) == '#') {
						check[(i + j) % 2] += 1;
					}
					else if (temp.charAt(j) == '.') {
						check[(i + j) % 2 + 2] += 1;
					}
				}
			}
			
			
			//if ((check[0] && check[1]) || (check[2] && check[3]) || (check[0] && check[2]) || (check[1] && check[3])) {
			if (sol(check[0], check[1]) || sol(check[2], check[3]) || sol(check[0], check[2]) || sol(check[1], check[3])) {
				System.out.printf("#%d %s\n", test_case, "impossible");
			}
			else {
				System.out.printf("#%d %s\n", test_case, "possible");
			}
		}
		
		sc.close();
	}
	
	static boolean sol(int a, int b) {
        if (a != 0) return (b != 0);
        return false;
    }
}
