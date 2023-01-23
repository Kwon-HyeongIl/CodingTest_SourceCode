package baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class N_10986 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		long sum = 0;
		long[] sumCount = new long[M];
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<N; i++) {
			sum = (sum + Integer.valueOf(st.nextToken()))%M;

			sumCount[(int)sum]++;
		}
		
		long count = sumCount[0];
		for (int i=0; i<M; i++) {
			count += sumCount[i]*(sumCount[i]-1)/2;
		}
		
		bw.write(String.valueOf(count));
		br.close();
		bw.close();
	}
}