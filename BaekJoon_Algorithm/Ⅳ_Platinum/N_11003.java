package baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class N_11003 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int L = Integer.valueOf(st.nextToken());
		
		Deque<Node> deque = new ArrayDeque<>(); 
		st = new StringTokenizer(br.readLine());
		
		for (int i=0; i<N; i++) {
			int nextNum = Integer.valueOf(st.nextToken());  
			
			while (deque.isEmpty()!=true && deque.peekLast().value>nextNum) {
				deque.pollLast();
			}
			deque.offerLast(new Node(i, nextNum));  
			
			if (deque.peekFirst().index <= i-L) {
				deque.pollFirst();
			}
			sb.append(deque.peekFirst().value).append(" ");
		}
		bw.write(String.valueOf(sb));
		bw.flush();
		br.close();
	}
	
	static class Node {
		public int index;
		public int value;
		
		Node(int index, int value){
			this.index = index;
			this.value = value;
		}
	}
}
