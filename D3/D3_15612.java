import java.util.Scanner;

public class D3_15612 {
	static String[] board = new String[8];
	static int[] rook;
	static int count;
	static String result;
	static StringBuilder sb;
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			sb = new StringBuilder("#" + test_case + " ");
			rook = new int[8];
			result = "yes";
			count = 0;
			for (int i = 0; i < 8; i++) {
				board[i] = sc.next();
				for (int j = 0; j < 8; j++) {
					if (rook[i] == 0 && board[i].charAt(j) == 'O') {
						rook[i] = j + 1;
						count++;
					}
					else if (board[i].charAt(j) == 'O') result = "no";
				}
			}
			
			if (result.equals("yes")) {
				if (count < 8) result = "no";
				else {
					for (int i = 0; i < 8; i++) {
						for (int j = i + 1; j < 8; j++) {
							if (rook[i] == rook[j]) {
								result = "no";
								break;
							}
						}
					}
				}
			}
			
			sb.append(result);
			System.out.println(sb);	
		}
		
		sc.close();
	}
}
