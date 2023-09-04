import java.util.Scanner;

public class D3_04047 {
	static String s;
	static int len, num, spd, dia, hrt, clv;
	static boolean[][] card;
	static StringBuilder sb;
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			sb = new StringBuilder("#" + test_case + " ");
			card = new boolean[4][14];
			s = sc.next();
			len = s.length();
			spd = dia = hrt = clv = 13;
			
			for (int i = 0; i < len; i++) {
				switch(s.charAt(i)) {
				case 'S':
					num = Integer.parseInt(s.charAt(i + 1) + "" + s.charAt(i + 2));
					if (card[0][num]) card[0][0] = true;
					else card[0][num] = true;
					break;
				case 'D':
					num = Integer.parseInt(s.charAt(i + 1) + "" + s.charAt(i + 2));
					if (card[1][num]) card[0][0] = true;
					else card[1][num] = true;
					break;
				case 'H':
					num = Integer.parseInt(s.charAt(i + 1) + "" + s.charAt(i + 2));
					if (card[2][num]) card[0][0] = true;
					else card[2][num] = true;
					break;
				case 'C':
					num = Integer.parseInt(s.charAt(i + 1) + "" + s.charAt(i + 2));
					if (card[3][num]) card[0][0] = true;
					else card[3][num] = true;
					break;
				}
				
				if (card[0][0]) break;
			}
			
			if (card[0][0]) sb.append("ERROR");
			else {
				for (int j = 1; j < 14; j++) {
					if (card[0][j]) spd--;
					if (card[1][j]) dia--;
					if (card[2][j]) hrt--;
					if (card[3][j]) clv--;
				}
				
				sb.append(spd).append(" ").append(dia).append(" ").append(hrt).append(" ").append(clv);
			}
			
			System.out.println(sb);
		}
		
		sc.close();
	}
}
