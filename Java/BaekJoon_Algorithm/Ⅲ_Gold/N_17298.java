package baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class N_17298 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.valueOf(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[N];
		for (int i=0; i<N; i++) {
			arr[i] = Integer.valueOf(st.nextToken());
		}
		
		Stack<Integer> stack = new Stack<>();
		for (int i=0; i<N; i++) {
			
			while (!stack.isEmpty() && arr[stack.peek()]<arr[i]) {
				arr[stack.pop()] = arr[i];
			}
			
			stack.push(i);
		}
		
		while (!stack.isEmpty()) {
			arr[stack.pop()] = -1;
		}
		
		for (int i=0; i<N; i++) {
			sb.append(arr[i]).append(" ");
		}
		
		System.out.print(sb);
		br.close();
	}
}