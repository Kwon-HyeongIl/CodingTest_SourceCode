package baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class N_2018 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.valueOf(br.readLine());
		int sum = 1;
		int count = 0;
		int start = 1;
		int end = 1;
		
		do {
			if (sum < N) {
				end++;
				sum += end;
			}
			if (sum > N) {
				sum -= start;
				start++;
			}
			if (sum == N) {
				count++;
				sum -= start;
				start++;
			}
		} while (end != N);
		
		bw.write(String.valueOf(count));
		br.close();
		bw.close();
	}
}