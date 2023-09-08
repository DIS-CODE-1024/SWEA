import java.util.Scanner;

public class D3_07732 {
	static int now, set, result;
	static String time;
	static String[] time1, time2;
	static StringBuilder sb;
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			sb = new StringBuilder("#" + test_case + " ");
			time = sc.next();
			time1 = time.split(":");
			time = sc.next();
			time2 = time.split(":");
			
			now = Integer.parseInt(time1[0]) * 3600
					+ Integer.parseInt(time1[1]) * 60
					+ Integer.parseInt(time1[2]);
			set = Integer.parseInt(time2[0]) * 3600
					+ Integer.parseInt(time2[1]) * 60
					+ Integer.parseInt(time2[2]);
			
			result = set - now;
			if (result < 0) result += 86400;
			
			sb.append(String.format("%02d", result / 3600))
				.append(":")
				.append(String.format("%02d", (result % 3600) / 60))
				.append(":")
				.append(String.format("%02d", result % 60));
			System.out.println(sb);
		}
			
		sc.close();
	}
}
