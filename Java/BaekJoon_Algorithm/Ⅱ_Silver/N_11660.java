package baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class N_11660 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int count = Integer.valueOf(st.nextToken());
		int[][] arr = new int[N][N];
		
		for (int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int k=0; k<N; k++) {
				arr[i][k] = (i!=0 ? arr[i-1][k] : 0) + Integer.valueOf(st.nextToken());
			}
		}

		for (int i=0; i<count; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.valueOf(st.nextToken())-1;
			int y1 = Integer.valueOf(st.nextToken())-1;
			int x2 = Integer.valueOf(st.nextToken())-1;
			int y2 = Integer.valueOf(st.nextToken())-1;
			int sum = 0;
			
			for (int k=y1; k<=y2; k++) {
				sum += arr[x2][k]-(x1!=0 ? arr[x1-1][k] : 0);
			}
			
			bw.write(String.valueOf(sum));
			bw.newLine();
		}
		br.close();
		bw.close();
	}
}