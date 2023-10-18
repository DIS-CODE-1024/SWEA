import java.util.Scanner;

public class D3_06781 {
	static String temp;
	static char[] number, color;
	static int set, min;
	static int[][] rgb;
	static StringBuilder sb;
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			sb = new StringBuilder("#" + test_case + " ");
			temp = sc.next();
			number = temp.toCharArray();
			temp = sc.next();
			color = temp.toCharArray();
			set = 0;
			rgb = new int[3][10];
			
			for (int i = 0; i < 9; i++) {
				if (color[i] == 'R') rgb[0][(number[i] - '0') - 1]++;
				else if (color[i] == 'G') rgb[1][(number[i] - '0') - 1]++;
				else rgb[2][(number[i] - '0') - 1]++;
			}
			
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 3; j++) {
					if (rgb[j][i] >= 3) {
						set += (rgb[j][i] / 3);
						rgb[j][i] = rgb[j][i] % 3;
					}
					
					if (i > 0 && i < 8 && rgb[j][i - 1] > 0 && rgb[j][i] > 0 && rgb[j][i + 1] > 0) {
						min = Math.min(rgb[j][i - 1], Math.min(rgb[j][i], rgb[j][i + 1]));
						set += min;
						rgb[j][i - 1] -= min;
						rgb[j][i] -= min;
						rgb[j][i + 1] -= min;
					}
				}
			}
			
			if (set >= 3) sb.append("Win");
			else sb.append("Continue");
			
			System.out.println(sb);
		}
        
        sc.close();
	}
}
