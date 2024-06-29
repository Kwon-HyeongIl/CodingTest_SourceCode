package baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class N_18352 {
	
	static ArrayList<Integer>[] list;
	static int[] visited;
	static int N,M,K,X;
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	N = Integer.valueOf(st.nextToken());
    	M = Integer.valueOf(st.nextToken());
    	K = Integer.valueOf(st.nextToken());
    	X = Integer.valueOf(st.nextToken());
    	
    	visited = new int[N+1];
    	ArrayList<Integer> arrList = new ArrayList<>();
    	
    	list = new ArrayList[N+1];
    	for (int i=1; i<=N; i++) {
    		list[i] = new ArrayList<>();
    	}
    	
    	for (int i=0; i<M; i++) {
    		st = new StringTokenizer(br.readLine());
    		int A = Integer.valueOf(st.nextToken());
    		int B = Integer.valueOf(st.nextToken());
    		list[A].add(B);
    	}
    	
    	bfs(X);
    	
    	for (int i=1; i<=N; i++) {
    		if (visited[i] == K+1) {
    			arrList.add(i);
    		}
    	}
    	Collections.sort(arrList);
    	
    	if (arrList.isEmpty()) {
    		System.out.println(-1);
    	} else {
    		for (int d : arrList) {
    			sb.append(d).append("\n");
    		}
    		System.out.println(sb);
    	}
    }
    
    public static void bfs(int startNode) {
    	visited[startNode]++;
    	Queue<Integer> queue = new LinkedList<>();
    	queue.add(startNode);
    	
    	while (!queue.isEmpty()) {
    		int node = queue.poll();
    		for (int next : list[node]) {
    			if (visited[next] == 0) {
    				visited[next] = visited[node] + 1;
    				if (visited[next] != K+1) {
    					queue.add(next);
    				}
    			}
    		}
    	}
    }
}