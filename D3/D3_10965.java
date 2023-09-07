import java.util.Scanner;

public class D3_10965 {
	static int A, B, temp, idx, cnt;
	static int[] list = new int[3201];
	static boolean[] prime = new boolean[10_000_001];
	static StringBuilder sb;
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		temp = 0;
		for (int i = 2; i < 3200; i++) {
			if(prime[i]) continue;
			else list[temp++] = i;
			for (int j = i * 2; j < 10_000_001; j += i) prime[j] = true;
		}
		
		sb = new StringBuilder();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			sb.append("#" + test_case + " ");
			A = sc.nextInt();
			B = 1;
			idx = 0;
			cnt = 0;
			
			if (A == 1 || !prime[A]) B = A;
			else {
				while(A > 1)
				{
					if(A % list[idx] == 0){
						cnt++;
						A /= list[idx];
						
					}
					
					if(A % list[idx] != 0){
						if(cnt %2 != 0) B *= list[idx];
						if(!prime[A]){
							B *= A;
							break;	
						}
						
						idx++;
						
						if(idx == temp){
							B *= A;
							break;
						}
						cnt = 0;
					}
				}
			}
			
			sb.append(B).append("\n");
		}
		
		System.out.println(sb);
		sc.close();
	}
}
