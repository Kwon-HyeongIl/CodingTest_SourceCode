package baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class N_2750 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.valueOf(br.readLine());
		
		PriorityQueue<Integer> queue = new PriorityQueue<>(N);
		for (int i=0; i<N; i++) {
			queue.add(Integer.valueOf(br.readLine()));
		}
		
		for (int i=0; i<N; i++) {
			sb.append(queue.poll()).append("\n");
		}
		
		System.out.println(sb);
	}
}