import java.util.Scanner;

public class D3_05293 {

	static String temp;
	static int[] cnt;
	static StringBuilder sb;
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			sb = new StringBuilder("#" + test_case + " ");
			cnt = new int[4];
			for (int i = 0; i < 4; i++) {
				cnt[i] = sc.nextInt();
			}
			
			temp = null;
			sol("0", cnt[0], cnt[1], cnt[2], cnt[3]);
			if (temp == null) sol("1", cnt[0], cnt[1], cnt[2], cnt[3]);
			
			if (temp == null) sb.append("impossible");
			else sb.append(temp);
			
			System.out.println(sb);
		}
        
        sc.close();
	}
	
	static void sol(String ans, int oo, int ol, int lo, int ll) {
		if(temp != null) return;
        if(ol - lo > 1 || lo - ol > 1 ) return;
        if(oo < 0 || ol < 0 || lo < 0 || ll < 0 ) return;
        if(oo == 0 && ol == 0 && lo == 0 && ll == 0 ) {
            temp = ans;
            return;
        }
        if(ans.substring(ans.length() - 1).equals("0")) {
            sol(ans + "0", oo - 1, ol, lo, ll);
            sol(ans + "1", oo, ol - 1, lo, ll);
            return;
        }
        
        sol(ans + "0", oo, ol, lo - 1, ll);
        sol(ans + "1", oo, ol, lo, ll - 1);
	}
}
