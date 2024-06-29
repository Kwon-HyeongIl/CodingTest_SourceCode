package baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N_1253 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		long[] arr = new long[N];
		int count = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i=0; i<N; i++) {
			arr[i] = Long.valueOf(st.nextToken());
		}
		Arrays.sort(arr);
		
		for (int i=0; i<N; i++) {
			int first = 0;
			int last = N-1;
			
			while (first < last) {
				if (i == first) {
					first++;
				} else if (i == last) {
					last--;
				} else if (arr[i] == arr[first]+arr[last]) {
					count++;
					break;
				} else if (arr[i] < arr[first]+arr[last]) {
					last--;
				} else {
					first++;
				}
				
			}                                                          
		}
		
		System.out.print(count);
		br.close();
	}
}