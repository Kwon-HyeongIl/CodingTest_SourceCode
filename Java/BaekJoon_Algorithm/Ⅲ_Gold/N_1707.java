package baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class N_1707 {

	static ArrayList<Integer>[] list;
	static boolean[] visited;
	static boolean check;
	static int[] numCheck;
	static int V, E;
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	StringTokenizer st;
    	int K = Integer.valueOf(br.readLine());
    	
    	for (int i=0; i<K; i++) {
    		st = new StringTokenizer(br.readLine());
    		V = Integer.valueOf(st.nextToken());
    		E = Integer.valueOf(st.nextToken());
    		
    		list = new ArrayList[V+1];
    		visited = new boolean[V+1];
    		numCheck = new int[V+1];
    		check = false;
    		for (int t=1; t<=V; t++) {
    			list[t] = new ArrayList<>();
    		}
    		
    		for (int t=0; t<E; t++) {
    			st = new StringTokenizer(br.readLine());
    			int a = Integer.valueOf(st.nextToken());
    			int b = Integer.valueOf(st.nextToken());
    			list[a].add(b);
    			list[b].add(a);
    		}
    		
    		for (int t=1; t<=V; t++) {
    			if (!check) {
    				dfs(t);
    				continue;
    			} else if (check) {
    				break;
    			}
    		}
    		
    		if (check == false) {
    			sb.append("YES").append("\n");
    		} else {
    			sb.append("NO").append("\n");
    		}
    	}
    	
    	System.out.println(sb);
    }
    
    public static void dfs(int node) {
    	visited[node] = true;
    	for (int i : list[node]) {
    		if (!visited[i]) {
    			numCheck[i] = (numCheck[node]+1)%2;
    			dfs(i);
    		} else if (numCheck[i] == numCheck[node]) {
    			check = true;
    		}
    	}
    }
}