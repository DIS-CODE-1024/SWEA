import java.util.Scanner;

public class D3_10761 {
	static int N, Bpos, Bmov, Opos, Omov, cnt, target;
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
            N = sc.nextInt();
            
            Bpos = 1;
            Bmov = 0;
            Opos = 1;
            Omov = 0;
            cnt = 0;
            
            for (int i = 0; i < N; i++) {
            	temp = sc.next();
            	target = sc.nextInt();
            	
            	if (temp.equals("B")) {
            		if (Omov >= Math.abs(Bpos - target)) {
            			Bmov++;
            			cnt++;
            		}
            		else {
            			Bmov += (Math.abs(Bpos - target + Omov) + 1);
            			cnt += (Math.abs(Bpos - target + Omov) + 1);
            			Omov = 0;
            		}
            	}
            	else {
            		if (Bmov >= Math.abs(Opos - target)) {
            			Omov++;
            			cnt++;
            		}
            		else {
            			Omov += (Math.abs(Opos - target + Bmov) + 1);
            			cnt += (Math.abs(Opos - target + Bmov) + 1);
            			Bmov = 0;
            		}
            	}
            	
            	System.out.println(Bpos + " " + Opos + " " + cnt);
            }
            
            sb.append(cnt);
            System.out.println(sb);
		}
		
		sc.close();
	}
}
