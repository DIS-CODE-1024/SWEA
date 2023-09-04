import java.util.Scanner;
import java.util.LinkedList;

public class D3_01229 {
	static int N, cnt, x, y, s;
	static char cmd;
	static LinkedList<Integer> code;
	static StringBuilder sb;
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

		for(int test_case = 1; test_case <= 10; test_case++)
		{
            sb = new StringBuilder("#" + test_case);
            code = new LinkedList<>();
            N = sc.nextInt();
            for (int i = 0; i < N; i++) code.add(sc.nextInt());
            cnt = sc.nextInt();
            
            for (int i = 0; i < cnt; i++) {
            	cmd = sc.next().charAt(0);
            	if (cmd == 'I') {
            		x = sc.nextInt();
            		y = sc.nextInt();
            		for (int j = 0; j < y; j++) code.add(x + j, sc.nextInt());
            	}
            	else {
            		x = sc.nextInt();
            		y = sc.nextInt();
            		for (int j = 0; j < y; j++) code.remove(x);
            	}
            }
            
            for (int i = 0; i < 10; i++) sb.append(" ").append(code.get(i));
            System.out.println(sb);
		}
		
		sc.close();
	}
}
