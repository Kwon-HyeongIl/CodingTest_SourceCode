package baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N_1940 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		int M = Integer.valueOf(br.readLine());
		
		int[] arr = new int[N];
		int sum = 0;
		int count = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i=0; i<N; i++) {
			arr[i] = Integer.valueOf(st.nextToken());
		}
		
		for (int i=0; i<N; i++) {
			for (int k=i+1; k<N; k++) {
				sum = arr[i] + arr[k];
				
				if (sum == M) {
					count++;
				}
			}
		}
		
		System.out.print(count);
		br.close();
	}
}
