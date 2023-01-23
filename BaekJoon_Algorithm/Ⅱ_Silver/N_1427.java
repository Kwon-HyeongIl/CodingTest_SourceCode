package baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class N_1427 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> {return o2-o1;});
		StringBuilder sb = new StringBuilder();
		int N = Integer.valueOf(br.readLine());
		
		while (N > 0) {
			int k = N%10;
			queue.add(k);
			N /= 10;
		}
		
		while (!queue.isEmpty()) {
			sb.append(queue.poll());
		}
		
		System.out.println(sb);
	}
}