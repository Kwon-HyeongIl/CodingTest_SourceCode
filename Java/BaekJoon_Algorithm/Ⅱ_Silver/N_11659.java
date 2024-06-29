package baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class N_11659 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int suNo = Integer.parseInt(st.nextToken());
		int quizNo = Integer.parseInt(st.nextToken());
		
		long[] S = new long[suNo+1];
		st = new StringTokenizer(br.readLine());
		
		for (int i=1; i<=suNo; i++) {
			S[i] = S[i-1]+Integer.valueOf(st.nextToken());
		}
		
		for (int q=0; q<quizNo; q++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.valueOf(st.nextToken());
			int j = Integer.valueOf(st.nextToken());
			bw.write(String.valueOf(S[j]-S[i-1]));
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
}