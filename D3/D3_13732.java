import java.util.Scanner;

public class D3_13732 {
	static int N, cnt, x, y, sqr;
    static boolean check;
    static String[] plate;
    static int[][] table;
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
            
            plate = new String[N];
            table = new int[N + 1][N + 1];
            cnt = 0;
            x = y = Integer.MAX_VALUE;
            sqr = 0;
            
            for (int i = 0; i < N; i++) {
                plate[i] = sc.next();
                for (int j = 0; j < N; j++) {
                    if (plate[i].charAt(j) == '#') {
                        cnt++;
                        table[i + 1][j + 1] = 1;
                        x = Math.min(x, i);
                        y = Math.min(y, j);
                    }
                }
            }
            
            sqr = (int)Math.sqrt(cnt);
            
            if (sqr * sqr != cnt) check = false;
            else {
            	check = true;
            	
	            for (int i = 1; i <= sqr; i++) {
	                for (int j = 1; j <= sqr; j++) {
	                    if (table[x + i][y + j] == 0) {
	                        check = false;
	                        break;
	                    }
	                }
	            }
            }
            
            if (check) sb.append("yes");
            else sb.append("no");
            
            System.out.println(sb);
		}
		
		sc.close();
	}
}
