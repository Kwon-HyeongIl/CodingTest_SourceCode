package baekjoon_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class N_13023 {

	static ArrayList<Integer>[] list;
	static boolean[] checked;
			
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int N = Integer.valueOf(st.nextToken());
    	int M = Integer.valueOf(st.nextToken());
    	list = new ArrayList[N];
    	
    	for (int i=0; i<N; i++) {
    		list[i] = new ArrayList<>();
    	}
    	for (int i=0; i<M; i++) {
    		st = new StringTokenizer(br.readLine());
    		int a = Integer.valueOf(st.nextToken());
    		int b= Integer.valueOf(st.nextToken());
    		list[a].add(b);
    		list[b].add(a);
    	}
    	for (int i=0; i<N; i++) {
    		checked = new boolean[N];
    		dfs(i, 1);
    	}
    	System.out.println(0);
    }
    static void dfs(int num, int count) {
    	if (count == 5) {
    		System.out.println(1);
    		System.exit(0);
    	}
    	checked[num] = true;
    	for (int i : list[num]) {
    		if (!checked[i]) {
    			dfs(i, count+1);
    		}
    	}
    	checked[num] = false;
    }
}