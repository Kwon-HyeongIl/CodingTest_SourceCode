package baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N_9498 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int score = Integer.valueOf(st.nextToken());
		
		if (90<=score && score<=100) {
			System.out.println('A');
		} else if (score>=80) {
			System.out.println('B');
		} else if (score>=70) {
			System.out.println('C');
		} else if (score>=60) {
			System.out.println('D');
		} else {
			System.out.println('F');
		}
	}
}