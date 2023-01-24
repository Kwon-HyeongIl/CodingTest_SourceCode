package baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class N_1260 {
	
	static ArrayList<Integer>[] list;
	static Queue<Integer> queue = new LinkedList<>();
	static boolean[] checked;
	static StringBuilder sb = new StringBuilder();
			
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int N = Integer.valueOf(st.nextToken());
    	int M = Integer.valueOf(st.nextToken());
    	int V = Integer.valueOf(st.nextToken());
    	
    	list = new ArrayList[N+1];
    	for (int i=1; i<N+1; i++) {
    		list[i] = new ArrayList<>();
    	}
    	for (int i=0; i<M; i++) {
    		st = new StringTokenizer(br.readLine());
    		int a = Integer.valueOf(st.nextToken());
    		int b = Integer.valueOf(st.nextToken());
    		
    		list[a].add(b);
    		list[b].add(a);
    	}
    	for (int i=1; i<N+1; i++) {
    		Collections.sort(list[i]);
    	}
    	checked = new boolean[N+1];
    	dfs(V);
    	sb.append("\n");
    	checked = new boolean[N+1];
    	bfs(V);
    	
    	System.out.println(sb);
    }
    static void dfs(int num) {
    	if (!checked[num]) {
    		checked[num] = true;
    		sb.append(num).append(" ");
    		
    		for (int i : list[num]) {
    			dfs(i);
    		}
    	}
    }
    static void bfs(int num) {
    	queue.add(num);
    	checked[num] = true;
    		
    	while (!queue.isEmpty()) {
    		int nowNode = queue.poll();
    		sb.append(nowNode).append(" ");
    		for (int i : list[nowNode]) {
    			if (!checked[i]) {
    				checked[i] = true;
    				queue.add(i);
    			}
    		}
    	}
    }
}
