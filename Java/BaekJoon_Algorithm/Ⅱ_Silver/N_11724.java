package baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class N_11724 {

	static ArrayList<Integer>[] list;
	static boolean[] visited;
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int N = Integer.valueOf(st.nextToken());
    	int M = Integer.valueOf(st.nextToken());
    	
    	list = new ArrayList[N+1];
    	visited = new boolean[N+1];
    	
    	for (int i=1; i<=N; i++) {
    		list[i] = new ArrayList<Integer>();
    	}
    	
    	for (int i=0; i<M; i++) {
    		st = new StringTokenizer(br.readLine());
    		int a = Integer.valueOf(st.nextToken());
    		int b = Integer.valueOf(st.nextToken());
    		
    		list[a].add(b);
    		list[b].add(a);
    	}
    	
    	int count = 0;
    	for (int i=1; i<=N; i++) {
    		if (!visited[i]) {
    			count++;
    			dfs(i);
    		}
    	}
    	System.out.println(count);
    }
    
    static void dfs(int k) {
    	if (visited[k]) {
    		return;
    	}
    	visited[k] = true;
    	for (int i : list[k]) {
    		if (!visited[i]) {
    			dfs(i);
    		}
    	}
    }
}