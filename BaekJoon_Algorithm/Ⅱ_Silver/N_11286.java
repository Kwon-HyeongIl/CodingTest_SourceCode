package baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class N_11286 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> queue = new PriorityQueue<>(new MyC());
		StringBuilder sb = new StringBuilder();
		int N = Integer.valueOf(br.readLine());
		
		for (int i=0; i<N; i++) {
			int nextNum = Integer.valueOf(br.readLine());
			
			if (nextNum == 0) {
				try {
				sb.append(queue.remove()).append("\n");
				} catch (Exception e) {sb.append(0).append("\n");}
			} else {
				queue.add(nextNum);
			}
		}
		
		System.out.println(sb);
	}
	
	static class MyC implements Comparator<Integer> {

		@Override
		public int compare(Integer o1, Integer o2) {
			if (Math.abs(o1) == Math.abs(o2)) {
				return o1-o2;
			} else {
				return Math.abs(o1)-Math.abs(o2);
			}
		}
	}
}