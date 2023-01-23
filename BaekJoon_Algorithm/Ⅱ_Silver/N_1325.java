package baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class N_1325 {

	static ArrayList<Integer>[] list;
	static int[] count;
	static boolean[] visited;
	static int N, M;
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	N = Integer.valueOf(st.nextToken());
    	M = Integer.valueOf(st.nextToken());
    	
    	list = new ArrayList[N+1];
    	count = new int[N+1];
    	
    	for (int i=1; i<=N; i++) {
    		list[i] = new ArrayList<>();
    	}
    	
    	for (int i=0; i<M; i++) {
    		st = new StringTokenizer(br.readLine());
    		int A = Integer.valueOf(st.nextToken());
    		int B = Integer.valueOf(st.nextToken());
    		list[A].add(B);
    	}
    	
    	for (int i=1; i<=N; i++) {
    		visited = new boolean[N+1];
    		bfs(i);
    	}
    	
    	int max = 0;
    	for (int i=1; i<=N; i++) {
    		max = Math.max(max, count[i]);
    	}
    	
    	for (int i=1; i<=N; i++) {
    		if (max == count[i]) {
    			sb.append(i).append(" ");
    		}
    	}
    	
    	System.out.println(sb);
    }
    
    public static void bfs(int node) {
    	Queue<Integer> queue = new LinkedList<>();
    	visited[node] = true;
        count[node]++;
    	queue.add(node);
    	
    	while (!queue.isEmpty()) {
    		int nowNode = queue.poll();
    		for (int i : list[nowNode]) {
    			if (visited[i] == false) {
    				count[i]++;
    				visited[i] = true;
    				queue.add(i);
    			}
    		}
    	}
    }
}